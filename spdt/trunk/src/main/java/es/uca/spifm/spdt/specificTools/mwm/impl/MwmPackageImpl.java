/**
 * Created by Ivan Ruiz
 */
package es.uca.spifm.spdt.specificTools.mwm.impl;

import es.uca.spifm.spdt.genericTools.wikim.WikimPackage;

import es.uca.spifm.spdt.specificTools.mwm.MediaWikiDatabase;
import es.uca.spifm.spdt.specificTools.mwm.MwmFactory;
import es.uca.spifm.spdt.specificTools.mwm.MwmPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MwmPackageImpl extends EPackageImpl implements MwmPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mediaWikiDatabaseEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see es.uca.spifm.spdt.specificTools.mwm.MwmPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MwmPackageImpl() {
		super(eNS_URI, MwmFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link MwmPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MwmPackage init() {
		if (isInited) return (MwmPackage)EPackage.Registry.INSTANCE.getEPackage(MwmPackage.eNS_URI);

		// Obtain or create and register package
		MwmPackageImpl theMwmPackage = (MwmPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MwmPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MwmPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		WikimPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theMwmPackage.createPackageContents();

		// Initialize created meta-data
		theMwmPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMwmPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MwmPackage.eNS_URI, theMwmPackage);
		return theMwmPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMediaWikiDatabase() {
		return mediaWikiDatabaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMediaWikiDatabase_WikiDatabase() {
		return (EReference)mediaWikiDatabaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMediaWikiDatabase_Url() {
		return (EAttribute)mediaWikiDatabaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMediaWikiDatabase_Login() {
		return (EAttribute)mediaWikiDatabaseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMediaWikiDatabase_Password() {
		return (EAttribute)mediaWikiDatabaseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MwmFactory getMwmFactory() {
		return (MwmFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		mediaWikiDatabaseEClass = createEClass(MEDIA_WIKI_DATABASE);
		createEReference(mediaWikiDatabaseEClass, MEDIA_WIKI_DATABASE__WIKI_DATABASE);
		createEAttribute(mediaWikiDatabaseEClass, MEDIA_WIKI_DATABASE__URL);
		createEAttribute(mediaWikiDatabaseEClass, MEDIA_WIKI_DATABASE__LOGIN);
		createEAttribute(mediaWikiDatabaseEClass, MEDIA_WIKI_DATABASE__PASSWORD);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		WikimPackage theWikimPackage = (WikimPackage)EPackage.Registry.INSTANCE.getEPackage(WikimPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(mediaWikiDatabaseEClass, MediaWikiDatabase.class, "MediaWikiDatabase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMediaWikiDatabase_WikiDatabase(), theWikimPackage.getWikiDatabase(), null, "wikiDatabase", null, 0, 1, MediaWikiDatabase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMediaWikiDatabase_Url(), ecorePackage.getEString(), "url", null, 0, 1, MediaWikiDatabase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMediaWikiDatabase_Login(), ecorePackage.getEString(), "login", null, 0, 1, MediaWikiDatabase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMediaWikiDatabase_Password(), ecorePackage.getEString(), "password", null, 0, 1, MediaWikiDatabase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //MwmPackageImpl
