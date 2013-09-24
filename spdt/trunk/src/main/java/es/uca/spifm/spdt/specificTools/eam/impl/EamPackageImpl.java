/**
 * Created by Ivan Ruiz
 */
package es.uca.spifm.spdt.specificTools.eam.impl;

import es.uca.spifm.spdt.genericTools.vmm.VmmPackage;

import es.uca.spifm.spdt.specificTools.eam.EamFactory;
import es.uca.spifm.spdt.specificTools.eam.EamPackage;
import es.uca.spifm.spdt.specificTools.eam.EnterpriseArchitectDatabase;

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
public class EamPackageImpl extends EPackageImpl implements EamPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enterpriseArchitectDatabaseEClass = null;

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
	 * @see es.uca.spifm.spdt.specificTools.eam.EamPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EamPackageImpl() {
		super(eNS_URI, EamFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link EamPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EamPackage init() {
		if (isInited) return (EamPackage)EPackage.Registry.INSTANCE.getEPackage(EamPackage.eNS_URI);

		// Obtain or create and register package
		EamPackageImpl theEamPackage = (EamPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EamPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EamPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		VmmPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theEamPackage.createPackageContents();

		// Initialize created meta-data
		theEamPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEamPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EamPackage.eNS_URI, theEamPackage);
		return theEamPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnterpriseArchitectDatabase() {
		return enterpriseArchitectDatabaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnterpriseArchitectDatabase_ModelRepository() {
		return (EReference)enterpriseArchitectDatabaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnterpriseArchitectDatabase_FileName() {
		return (EAttribute)enterpriseArchitectDatabaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EamFactory getEamFactory() {
		return (EamFactory)getEFactoryInstance();
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
		enterpriseArchitectDatabaseEClass = createEClass(ENTERPRISE_ARCHITECT_DATABASE);
		createEReference(enterpriseArchitectDatabaseEClass, ENTERPRISE_ARCHITECT_DATABASE__MODEL_REPOSITORY);
		createEAttribute(enterpriseArchitectDatabaseEClass, ENTERPRISE_ARCHITECT_DATABASE__FILE_NAME);
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
		VmmPackage theVmmPackage = (VmmPackage)EPackage.Registry.INSTANCE.getEPackage(VmmPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(enterpriseArchitectDatabaseEClass, EnterpriseArchitectDatabase.class, "EnterpriseArchitectDatabase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnterpriseArchitectDatabase_ModelRepository(), theVmmPackage.getModelRepository(), null, "modelRepository", null, 0, 1, EnterpriseArchitectDatabase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnterpriseArchitectDatabase_FileName(), ecorePackage.getEString(), "fileName", null, 0, 1, EnterpriseArchitectDatabase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //EamPackageImpl
