/**
 * Created by Ivan Ruiz
 */
package es.uca.spifm.spdt.specificTools.redm.impl;

import es.uca.spifm.spdt.genericTools.itm.ItmPackage;

import es.uca.spifm.spdt.genericTools.wikim.WikimPackage;

import es.uca.spifm.spdt.specificTools.redm.RedmFactory;
import es.uca.spifm.spdt.specificTools.redm.RedmPackage;
import es.uca.spifm.spdt.specificTools.redm.RedmineDatabase;

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
public class RedmPackageImpl extends EPackageImpl implements RedmPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass redmineDatabaseEClass = null;

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
	 * @see es.uca.spifm.spdt.specificTools.redm.RedmPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RedmPackageImpl() {
		super(eNS_URI, RedmFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RedmPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RedmPackage init() {
		if (isInited) return (RedmPackage)EPackage.Registry.INSTANCE.getEPackage(RedmPackage.eNS_URI);

		// Obtain or create and register package
		RedmPackageImpl theRedmPackage = (RedmPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RedmPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RedmPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ItmPackage.eINSTANCE.eClass();
		WikimPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theRedmPackage.createPackageContents();

		// Initialize created meta-data
		theRedmPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRedmPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RedmPackage.eNS_URI, theRedmPackage);
		return theRedmPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRedmineDatabase() {
		return redmineDatabaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRedmineDatabase_WikiDatabase() {
		return (EReference)redmineDatabaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRedmineDatabase_ApiAccessKey() {
		return (EAttribute)redmineDatabaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRedmineDatabase_Url() {
		return (EAttribute)redmineDatabaseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRedmineDatabase_IssueTrackingDatabase() {
		return (EReference)redmineDatabaseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RedmFactory getRedmFactory() {
		return (RedmFactory)getEFactoryInstance();
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
		redmineDatabaseEClass = createEClass(REDMINE_DATABASE);
		createEReference(redmineDatabaseEClass, REDMINE_DATABASE__WIKI_DATABASE);
		createEAttribute(redmineDatabaseEClass, REDMINE_DATABASE__API_ACCESS_KEY);
		createEAttribute(redmineDatabaseEClass, REDMINE_DATABASE__URL);
		createEReference(redmineDatabaseEClass, REDMINE_DATABASE__ISSUE_TRACKING_DATABASE);
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
		ItmPackage theItmPackage = (ItmPackage)EPackage.Registry.INSTANCE.getEPackage(ItmPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(redmineDatabaseEClass, RedmineDatabase.class, "RedmineDatabase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRedmineDatabase_WikiDatabase(), theWikimPackage.getWikiDatabase(), null, "wikiDatabase", null, 0, 1, RedmineDatabase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRedmineDatabase_ApiAccessKey(), ecorePackage.getEString(), "apiAccessKey", null, 0, 1, RedmineDatabase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRedmineDatabase_Url(), ecorePackage.getEString(), "url", null, 0, 1, RedmineDatabase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRedmineDatabase_IssueTrackingDatabase(), theItmPackage.getIssueTrackingDatabase(), null, "issueTrackingDatabase", null, 0, 1, RedmineDatabase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //RedmPackageImpl
