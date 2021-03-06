<?php

/**
 * This file contains functions used by the install script (config/index.php)
 * and maintenance scripts. It is not loaded in normal web requests.
 *
 * @file
 */

function install_version_checks() {
	# We dare not turn output buffer _off_ since this will break completely
	# if PHP is globally configured to run through a gzip filter.
	@ob_implicit_flush( true );

	if( !function_exists( 'version_compare' ) ) {
		# version_compare was introduced in 4.1.0
		echo "Your PHP version is much too old; 4.0.x will _not_ work. 5.0.0 or higher is required. ABORTING.\n";
		die( -1 );
	}
	if( version_compare( phpversion(), '5.0.0' ) < 0 ) {
		echo "PHP 5.0.0 or higher is required. If PHP 5 is available only when \n".
   "PHP files have a .php5 extension, please navigate to <a href=\"index.php5\">index.php5</a> \n".
   "to continue installation. ABORTING.\n";
		die( -1 );
	}
	
	// Test for PHP bug which breaks PHP 5.0.x on 64-bit...
	// As of 1.8 this breaks lots of common operations instead
	// of just some rare ones like export.
	$borked = str_replace( 'a', 'b', array( -1 => -1 ) );
	if( !isset( $borked[-1] ) ) {
		echo "PHP 5.0.x is buggy on your 64-bit system; you must upgrade to PHP 5.1.x\n" .
			"or higher. ABORTING. (http://bugs.php.net/bug.php?id=34879 for details)\n";
		die( -1 );
	}
	
	$test = new PhpXmlBugTester();
	if( !$test->ok ) {
		echo "Your system has a combination of PHP and libxml2 versions which is buggy\n" .
			"and can cause hidden data corruption in MediaWiki and other web apps.\n" .
			"Upgrade to PHP 5.2.9 or later and libxml2 2.7.3 or later!\n" .
			"ABORTING (http://bugs.php.net/bug.php?id=45996 for details).\n";
		die( -1 );
	}
	

	$test = new PhpRefCallBugTester;
	$test->execute();
	if ( !$test->ok ) {
		echo "PHP 5.3.1 is not compatible with MediaWiki due to a bug involving\n" .
			"reference parameters to __call. Upgrade to PHP 5.3.2 or higher, or \n" .
			"downgrade to PHP 5.3.0 to fix this.\n" .
			"ABORTING (see http://bugs.php.net/bug.php?id=50394 for details)\n";
		die( -1 );
	}

	global $wgCommandLineMode;
	$wgCommandLineMode = true;
	umask( 000 );
	@set_time_limit( 0 );
}

function copyfile( $sdir, $name, $ddir, $perms = 0664 ) {
	copyfileto( $sdir, $name, $ddir, $name, $perms );
}

function copyfileto( $sdir, $sname, $ddir, $dname, $perms = 0664 ) {
	global $wgInstallOwner, $wgInstallGroup;

	$d = "{$ddir}/{$dname}";
	if ( copy( "{$sdir}/{$sname}", $d ) ) {
		if ( isset( $wgInstallOwner ) ) { chown( $d, $wgInstallOwner ); }
		if ( isset( $wgInstallGroup ) ) { chgrp( $d, $wgInstallGroup ); }
		chmod( $d, $perms );
		# print "Copied \"{$sname}\" to \"{$d}\".\n";
	} else {
		print "Failed to copy file \"{$sname}\" to \"{$ddir}/{$dname}\".\n";
		exit();
	}
}

function copydirectory( $source, $dest ) {
	$handle = opendir( $source );
	while ( false !== ( $f = readdir( $handle ) ) ) {
		$fullname = "$source/$f";
		if ( $f{0} != '.' && is_file( $fullname ) ) {
			copyfile( $source, $f, $dest );
		}
	}
}

/**
 * Test for PHP+libxml2 bug which breaks XML input subtly with certain versions.
 * http://bugs.php.net/bug.php?id=45996
 * Known fixed with PHP 5.2.9 + libxml2-2.7.3
 */
class PhpXmlBugTester {
	var $parsedData = '';
	var $ok = false;
	function __construct() {
		$charData = '<b>c</b>';
		$xml = '<a>' . htmlspecialchars( $charData ) . '</a>';
		
		$parser = xml_parser_create();
		xml_set_character_data_handler( $parser, array( $this, 'chardata' ) );
		$parsedOk = xml_parse($parser, $xml, true);
		$this->ok = $parsedOk && ($this->parsedData == $charData);
	}
	function chardata($parser, $data) {
		$this->parsedData .= $data;
	}
}

/**
 * Test for PHP bug #50394 (PHP 5.3.x conversion to null only, not 5.2.x)
 */
class PhpRefCallBugTester {
	public $ok = false;

	function __call( $name, $args ) {
		$old = error_reporting( E_ALL & ~E_WARNING );
		call_user_func_array( array( $this, 'checkForBrokenRef' ), $args );
		error_reporting( $old );
	}

	function checkForBrokenRef( &$var ) {
		if ( $var ) {
			$this->ok = true;
		}
	}

	function execute() {
		$var = true;
		call_user_func_array( array( $this, 'foo' ), array( &$var ) );
	}
}

function readconsole( $prompt = '' ) {
	static $isatty = null;
	if ( is_null( $isatty ) ) {
		if ( !function_exists( 'posix_isatty' ) || posix_isatty( 0 /*STDIN*/ ) ) {
			$isatty = true;
		} else {
			$isatty = false;
		}
	}

	if ( $isatty && function_exists( 'readline' ) ) {
		return readline( $prompt );
	} else {
		if ( $isatty ) {
			print $prompt;
		}
		if ( feof( STDIN ) ) {
			return false;
		}
		$st = fgets(STDIN, 1024);
		if ($st === false) return false;
		$resp = trim( $st );
		return $resp;
	}
}

#
# Read and execute SQL commands from a file
#
function dbsource( $fname, $db = false ) {
	if ( !$db ) {
		// Try $wgDatabase, which is used in the install and update scripts
		global $wgDatabase;
		if ( isset( $wgDatabase ) ) {
			$db = $wgDatabase;
		} else {
			// No? Well, we must be outside of those scripts, so use the standard method
			$db = wfGetDB( DB_MASTER );
		}
	}
	$error = $db->sourceFile( $fname );
	if ( $error !== true ) {
		print $error;
		exit(1);
	}
}

/**
 * Get the value of session.save_path
 *
 * Per http://www.php.net/manual/en/ref.session.php#ini.session.save-path,
 * this might have some additional preceding parts which need to be
 * ditched
 *
 * @return string
 */
function mw_get_session_save_path() {
	$path = ini_get( 'session.save_path' );
	$path = substr( $path, strrpos( $path, ';' ) );
	return $path;
}

/**
 * Is dl() available to us?
 *
 * According to http://www.php.net/manual/en/function.dl.php, dl()
 * is *not* available when `enable_dl` is off, or under `safe_mode`
 *
 * @return bool
 */
function mw_have_dl() {
	return function_exists( 'dl' )
		&& is_callable( 'dl' )
		&& wfIniGetBool( 'enable_dl' )
		&& !wfIniGetBool( 'safe_mode' );
}
