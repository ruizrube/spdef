/**
 * Created by Ivan Ruiz
 */
package es.uca.spifm.spdt.specificTools.mwm;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see es.uca.spifm.spdt.specificTools.mwm.MwmFactory
 * @model kind="package"
 * @generated
 */
public interface MwmPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "mwm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://spi-fm.uca.es/spdef/models/specificTools/mwm/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mwm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MwmPackage eINSTANCE = es.uca.spifm.spdt.specificTools.mwm.impl.MwmPackageImpl.init();

	/**
	 * The meta object id for the '{@link es.uca.spifm.spdt.specificTools.mwm.impl.MediaWikiDatabaseImpl <em>Media Wiki Database</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uca.spifm.spdt.specificTools.mwm.impl.MediaWikiDatabaseImpl
	 * @see es.uca.spifm.spdt.specificTools.mwm.impl.MwmPackageImpl#getMediaWikiDatabase()
	 * @generated
	 */
	int MEDIA_WIKI_DATABASE = 0;

	/**
	 * The feature id for the '<em><b>Wiki Database</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_WIKI_DATABASE__WIKI_DATABASE = 0;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_WIKI_DATABASE__URL = 1;

	/**
	 * The feature id for the '<em><b>Login</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_WIKI_DATABASE__LOGIN = 2;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_WIKI_DATABASE__PASSWORD = 3;

	/**
	 * The number of structural features of the '<em>Media Wiki Database</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_WIKI_DATABASE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Media Wiki Database</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_WIKI_DATABASE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link es.uca.spifm.spdt.specificTools.mwm.MediaWikiDatabase <em>Media Wiki Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Media Wiki Database</em>'.
	 * @see es.uca.spifm.spdt.specificTools.mwm.MediaWikiDatabase
	 * @generated
	 */
	EClass getMediaWikiDatabase();

	/**
	 * Returns the meta object for the reference '{@link es.uca.spifm.spdt.specificTools.mwm.MediaWikiDatabase#getWikiDatabase <em>Wiki Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Wiki Database</em>'.
	 * @see es.uca.spifm.spdt.specificTools.mwm.MediaWikiDatabase#getWikiDatabase()
	 * @see #getMediaWikiDatabase()
	 * @generated
	 */
	EReference getMediaWikiDatabase_WikiDatabase();

	/**
	 * Returns the meta object for the attribute '{@link es.uca.spifm.spdt.specificTools.mwm.MediaWikiDatabase#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see es.uca.spifm.spdt.specificTools.mwm.MediaWikiDatabase#getUrl()
	 * @see #getMediaWikiDatabase()
	 * @generated
	 */
	EAttribute getMediaWikiDatabase_Url();

	/**
	 * Returns the meta object for the attribute '{@link es.uca.spifm.spdt.specificTools.mwm.MediaWikiDatabase#getLogin <em>Login</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Login</em>'.
	 * @see es.uca.spifm.spdt.specificTools.mwm.MediaWikiDatabase#getLogin()
	 * @see #getMediaWikiDatabase()
	 * @generated
	 */
	EAttribute getMediaWikiDatabase_Login();

	/**
	 * Returns the meta object for the attribute '{@link es.uca.spifm.spdt.specificTools.mwm.MediaWikiDatabase#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see es.uca.spifm.spdt.specificTools.mwm.MediaWikiDatabase#getPassword()
	 * @see #getMediaWikiDatabase()
	 * @generated
	 */
	EAttribute getMediaWikiDatabase_Password();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MwmFactory getMwmFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link es.uca.spifm.spdt.specificTools.mwm.impl.MediaWikiDatabaseImpl <em>Media Wiki Database</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uca.spifm.spdt.specificTools.mwm.impl.MediaWikiDatabaseImpl
		 * @see es.uca.spifm.spdt.specificTools.mwm.impl.MwmPackageImpl#getMediaWikiDatabase()
		 * @generated
		 */
		EClass MEDIA_WIKI_DATABASE = eINSTANCE.getMediaWikiDatabase();

		/**
		 * The meta object literal for the '<em><b>Wiki Database</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEDIA_WIKI_DATABASE__WIKI_DATABASE = eINSTANCE.getMediaWikiDatabase_WikiDatabase();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDIA_WIKI_DATABASE__URL = eINSTANCE.getMediaWikiDatabase_Url();

		/**
		 * The meta object literal for the '<em><b>Login</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDIA_WIKI_DATABASE__LOGIN = eINSTANCE.getMediaWikiDatabase_Login();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDIA_WIKI_DATABASE__PASSWORD = eINSTANCE.getMediaWikiDatabase_Password();

	}

} //MwmPackage
