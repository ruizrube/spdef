/**
 * Designed by Ivan Ruiz
 */
package es.uca.spifm.spdt.deployment.swpm;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see es.uca.spifm.spdt.deployment.swpm.SwpmFactory
 * @model kind="package"
 * @generated
 */
public interface SwpmPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "swpm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://spi-fm.uca.es/spdef/models/deployment/swpm/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "swpm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SwpmPackage eINSTANCE = es.uca.spifm.spdt.deployment.swpm.impl.SwpmPackageImpl.init();

	/**
	 * The meta object id for the '{@link es.uca.spifm.spdt.deployment.swpm.impl.ProjectImpl <em>Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uca.spifm.spdt.deployment.swpm.impl.ProjectImpl
	 * @see es.uca.spifm.spdt.deployment.swpm.impl.SwpmPackageImpl#getProject()
	 * @generated
	 */
	int PROJECT = 0;

	/**
	 * The feature id for the '<em><b>Workproducts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__WORKPRODUCTS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__DESCRIPTION = 2;

	/**
	 * The number of structural features of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uca.spifm.spdt.deployment.swpm.impl.WorkProductImpl <em>Work Product</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uca.spifm.spdt.deployment.swpm.impl.WorkProductImpl
	 * @see es.uca.spifm.spdt.deployment.swpm.impl.SwpmPackageImpl#getWorkProduct()
	 * @generated
	 */
	int WORK_PRODUCT = 1;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT__DESCRIPTION = 1;

	/**
	 * The number of structural features of the '<em>Work Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Work Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uca.spifm.spdt.deployment.swpm.impl.SectionImpl <em>Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uca.spifm.spdt.deployment.swpm.impl.SectionImpl
	 * @see es.uca.spifm.spdt.deployment.swpm.impl.SwpmPackageImpl#getSection()
	 * @generated
	 */
	int SECTION = 2;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__ORDER = 2;

	/**
	 * The feature id for the '<em><b>Embedded Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__EMBEDDED_SECTIONS = 3;

	/**
	 * The feature id for the '<em><b>Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__MODELS = 4;

	/**
	 * The feature id for the '<em><b>Specifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__SPECIFICATIONS = 5;

	/**
	 * The number of structural features of the '<em>Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uca.spifm.spdt.deployment.swpm.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uca.spifm.spdt.deployment.swpm.impl.ModelImpl
	 * @see es.uca.spifm.spdt.deployment.swpm.impl.SwpmPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__NAME = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__DESCRIPTION = 2;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uca.spifm.spdt.deployment.swpm.impl.SpecificationImpl <em>Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uca.spifm.spdt.deployment.swpm.impl.SpecificationImpl
	 * @see es.uca.spifm.spdt.deployment.swpm.impl.SwpmPackageImpl#getSpecification()
	 * @generated
	 */
	int SPECIFICATION = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Details</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__DETAILS = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__TYPE = 2;

	/**
	 * The number of structural features of the '<em>Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uca.spifm.spdt.deployment.swpm.impl.InternalProductImpl <em>Internal Product</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uca.spifm.spdt.deployment.swpm.impl.InternalProductImpl
	 * @see es.uca.spifm.spdt.deployment.swpm.impl.SwpmPackageImpl#getInternalProduct()
	 * @generated
	 */
	int INTERNAL_PRODUCT = 8;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_PRODUCT__TITLE = WORK_PRODUCT__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_PRODUCT__DESCRIPTION = WORK_PRODUCT__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Internal Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_PRODUCT_FEATURE_COUNT = WORK_PRODUCT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Internal Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_PRODUCT_OPERATION_COUNT = WORK_PRODUCT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uca.spifm.spdt.deployment.swpm.impl.CodeWorkProductImpl <em>Code Work Product</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uca.spifm.spdt.deployment.swpm.impl.CodeWorkProductImpl
	 * @see es.uca.spifm.spdt.deployment.swpm.impl.SwpmPackageImpl#getCodeWorkProduct()
	 * @generated
	 */
	int CODE_WORK_PRODUCT = 5;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_WORK_PRODUCT__TITLE = INTERNAL_PRODUCT__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_WORK_PRODUCT__DESCRIPTION = INTERNAL_PRODUCT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_WORK_PRODUCT__PACKAGES = INTERNAL_PRODUCT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Code Work Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_WORK_PRODUCT_FEATURE_COUNT = INTERNAL_PRODUCT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Code Work Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_WORK_PRODUCT_OPERATION_COUNT = INTERNAL_PRODUCT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uca.spifm.spdt.deployment.swpm.impl.DocumentaryWorkProductImpl <em>Documentary Work Product</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uca.spifm.spdt.deployment.swpm.impl.DocumentaryWorkProductImpl
	 * @see es.uca.spifm.spdt.deployment.swpm.impl.SwpmPackageImpl#getDocumentaryWorkProduct()
	 * @generated
	 */
	int DOCUMENTARY_WORK_PRODUCT = 6;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTARY_WORK_PRODUCT__TITLE = INTERNAL_PRODUCT__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTARY_WORK_PRODUCT__DESCRIPTION = INTERNAL_PRODUCT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTARY_WORK_PRODUCT__SECTIONS = INTERNAL_PRODUCT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Documentary Work Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTARY_WORK_PRODUCT_FEATURE_COUNT = INTERNAL_PRODUCT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Documentary Work Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTARY_WORK_PRODUCT_OPERATION_COUNT = INTERNAL_PRODUCT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uca.spifm.spdt.deployment.swpm.impl.DeliverableProductImpl <em>Deliverable Product</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uca.spifm.spdt.deployment.swpm.impl.DeliverableProductImpl
	 * @see es.uca.spifm.spdt.deployment.swpm.impl.SwpmPackageImpl#getDeliverableProduct()
	 * @generated
	 */
	int DELIVERABLE_PRODUCT = 7;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERABLE_PRODUCT__TITLE = WORK_PRODUCT__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERABLE_PRODUCT__DESCRIPTION = WORK_PRODUCT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Embedded Workproducts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERABLE_PRODUCT__EMBEDDED_WORKPRODUCTS = WORK_PRODUCT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERABLE_PRODUCT__TYPE = WORK_PRODUCT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Deliverable Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERABLE_PRODUCT_FEATURE_COUNT = WORK_PRODUCT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Deliverable Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERABLE_PRODUCT_OPERATION_COUNT = WORK_PRODUCT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uca.spifm.spdt.deployment.swpm.impl.SourcePackageImpl <em>Source Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uca.spifm.spdt.deployment.swpm.impl.SourcePackageImpl
	 * @see es.uca.spifm.spdt.deployment.swpm.impl.SwpmPackageImpl#getSourcePackage()
	 * @generated
	 */
	int SOURCE_PACKAGE = 9;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_PACKAGE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_PACKAGE__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_PACKAGE__NAME = 2;

	/**
	 * The number of structural features of the '<em>Source Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_PACKAGE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Source Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_PACKAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uca.spifm.spdt.deployment.swpm.ModelType <em>Model Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uca.spifm.spdt.deployment.swpm.ModelType
	 * @see es.uca.spifm.spdt.deployment.swpm.impl.SwpmPackageImpl#getModelType()
	 * @generated
	 */
	int MODEL_TYPE = 10;

	/**
	 * The meta object id for the '{@link es.uca.spifm.spdt.deployment.swpm.DeliverableType <em>Deliverable Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uca.spifm.spdt.deployment.swpm.DeliverableType
	 * @see es.uca.spifm.spdt.deployment.swpm.impl.SwpmPackageImpl#getDeliverableType()
	 * @generated
	 */
	int DELIVERABLE_TYPE = 11;

	/**
	 * The meta object id for the '{@link es.uca.spifm.spdt.deployment.swpm.Archetype <em>Archetype</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uca.spifm.spdt.deployment.swpm.Archetype
	 * @see es.uca.spifm.spdt.deployment.swpm.impl.SwpmPackageImpl#getArchetype()
	 * @generated
	 */
	int ARCHETYPE = 12;

	/**
	 * The meta object id for the '{@link es.uca.spifm.spdt.deployment.swpm.SpecificationType <em>Specification Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uca.spifm.spdt.deployment.swpm.SpecificationType
	 * @see es.uca.spifm.spdt.deployment.swpm.impl.SwpmPackageImpl#getSpecificationType()
	 * @generated
	 */
	int SPECIFICATION_TYPE = 13;


	/**
	 * Returns the meta object for class '{@link es.uca.spifm.spdt.deployment.swpm.Project <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project</em>'.
	 * @see es.uca.spifm.spdt.deployment.swpm.Project
	 * @generated
	 */
	EClass getProject();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uca.spifm.spdt.deployment.swpm.Project#getWorkproducts <em>Workproducts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Workproducts</em>'.
	 * @see es.uca.spifm.spdt.deployment.swpm.Project#getWorkproducts()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Workproducts();

	/**
	 * Returns the meta object for the attribute '{@link es.uca.spifm.spdt.deployment.swpm.Project#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.uca.spifm.spdt.deployment.swpm.Project#getName()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_Name();

	/**
	 * Returns the meta object for the attribute '{@link es.uca.spifm.spdt.deployment.swpm.Project#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see es.uca.spifm.spdt.deployment.swpm.Project#getDescription()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_Description();

	/**
	 * Returns the meta object for class '{@link es.uca.spifm.spdt.deployment.swpm.WorkProduct <em>Work Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Work Product</em>'.
	 * @see es.uca.spifm.spdt.deployment.swpm.WorkProduct
	 * @generated
	 */
	EClass getWorkProduct();

	/**
	 * Returns the meta object for the attribute '{@link es.uca.spifm.spdt.deployment.swpm.WorkProduct#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see es.uca.spifm.spdt.deployment.swpm.WorkProduct#getTitle()
	 * @see #getWorkProduct()
	 * @generated
	 */
	EAttribute getWorkProduct_Title();

	/**
	 * Returns the meta object for the attribute '{@link es.uca.spifm.spdt.deployment.swpm.WorkProduct#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see es.uca.spifm.spdt.deployment.swpm.WorkProduct#getDescription()
	 * @see #getWorkProduct()
	 * @generated
	 */
	EAttribute getWorkProduct_Description();

	/**
	 * Returns the meta object for class '{@link es.uca.spifm.spdt.deployment.swpm.Section <em>Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Section</em>'.
	 * @see es.uca.spifm.spdt.deployment.swpm.Section
	 * @generated
	 */
	EClass getSection();

	/**
	 * Returns the meta object for the attribute '{@link es.uca.spifm.spdt.deployment.swpm.Section#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see es.uca.spifm.spdt.deployment.swpm.Section#getTitle()
	 * @see #getSection()
	 * @generated
	 */
	EAttribute getSection_Title();

	/**
	 * Returns the meta object for the attribute '{@link es.uca.spifm.spdt.deployment.swpm.Section#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see es.uca.spifm.spdt.deployment.swpm.Section#getDescription()
	 * @see #getSection()
	 * @generated
	 */
	EAttribute getSection_Description();

	/**
	 * Returns the meta object for the attribute '{@link es.uca.spifm.spdt.deployment.swpm.Section#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order</em>'.
	 * @see es.uca.spifm.spdt.deployment.swpm.Section#getOrder()
	 * @see #getSection()
	 * @generated
	 */
	EAttribute getSection_Order();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uca.spifm.spdt.deployment.swpm.Section#getEmbeddedSections <em>Embedded Sections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Embedded Sections</em>'.
	 * @see es.uca.spifm.spdt.deployment.swpm.Section#getEmbeddedSections()
	 * @see #getSection()
	 * @generated
	 */
	EReference getSection_EmbeddedSections();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uca.spifm.spdt.deployment.swpm.Section#getModels <em>Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Models</em>'.
	 * @see es.uca.spifm.spdt.deployment.swpm.Section#getModels()
	 * @see #getSection()
	 * @generated
	 */
	EReference getSection_Models();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uca.spifm.spdt.deployment.swpm.Section#getSpecifications <em>Specifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Specifications</em>'.
	 * @see es.uca.spifm.spdt.deployment.swpm.Section#getSpecifications()
	 * @see #getSection()
	 * @generated
	 */
	EReference getSection_Specifications();

	/**
	 * Returns the meta object for class '{@link es.uca.spifm.spdt.deployment.swpm.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see es.uca.spifm.spdt.deployment.swpm.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the attribute '{@link es.uca.spifm.spdt.deployment.swpm.Model#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see es.uca.spifm.spdt.deployment.swpm.Model#getType()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_Type();

	/**
	 * Returns the meta object for the attribute '{@link es.uca.spifm.spdt.deployment.swpm.Model#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.uca.spifm.spdt.deployment.swpm.Model#getName()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_Name();

	/**
	 * Returns the meta object for the attribute '{@link es.uca.spifm.spdt.deployment.swpm.Model#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see es.uca.spifm.spdt.deployment.swpm.Model#getDescription()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_Description();

	/**
	 * Returns the meta object for class '{@link es.uca.spifm.spdt.deployment.swpm.Specification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specification</em>'.
	 * @see es.uca.spifm.spdt.deployment.swpm.Specification
	 * @generated
	 */
	EClass getSpecification();

	/**
	 * Returns the meta object for the attribute '{@link es.uca.spifm.spdt.deployment.swpm.Specification#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.uca.spifm.spdt.deployment.swpm.Specification#getName()
	 * @see #getSpecification()
	 * @generated
	 */
	EAttribute getSpecification_Name();

	/**
	 * Returns the meta object for the attribute '{@link es.uca.spifm.spdt.deployment.swpm.Specification#getDetails <em>Details</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Details</em>'.
	 * @see es.uca.spifm.spdt.deployment.swpm.Specification#getDetails()
	 * @see #getSpecification()
	 * @generated
	 */
	EAttribute getSpecification_Details();

	/**
	 * Returns the meta object for the attribute '{@link es.uca.spifm.spdt.deployment.swpm.Specification#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see es.uca.spifm.spdt.deployment.swpm.Specification#getType()
	 * @see #getSpecification()
	 * @generated
	 */
	EAttribute getSpecification_Type();

	/**
	 * Returns the meta object for class '{@link es.uca.spifm.spdt.deployment.swpm.CodeWorkProduct <em>Code Work Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code Work Product</em>'.
	 * @see es.uca.spifm.spdt.deployment.swpm.CodeWorkProduct
	 * @generated
	 */
	EClass getCodeWorkProduct();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uca.spifm.spdt.deployment.swpm.CodeWorkProduct#getPackages <em>Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Packages</em>'.
	 * @see es.uca.spifm.spdt.deployment.swpm.CodeWorkProduct#getPackages()
	 * @see #getCodeWorkProduct()
	 * @generated
	 */
	EReference getCodeWorkProduct_Packages();

	/**
	 * Returns the meta object for class '{@link es.uca.spifm.spdt.deployment.swpm.DocumentaryWorkProduct <em>Documentary Work Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Documentary Work Product</em>'.
	 * @see es.uca.spifm.spdt.deployment.swpm.DocumentaryWorkProduct
	 * @generated
	 */
	EClass getDocumentaryWorkProduct();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uca.spifm.spdt.deployment.swpm.DocumentaryWorkProduct#getSections <em>Sections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sections</em>'.
	 * @see es.uca.spifm.spdt.deployment.swpm.DocumentaryWorkProduct#getSections()
	 * @see #getDocumentaryWorkProduct()
	 * @generated
	 */
	EReference getDocumentaryWorkProduct_Sections();

	/**
	 * Returns the meta object for class '{@link es.uca.spifm.spdt.deployment.swpm.DeliverableProduct <em>Deliverable Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deliverable Product</em>'.
	 * @see es.uca.spifm.spdt.deployment.swpm.DeliverableProduct
	 * @generated
	 */
	EClass getDeliverableProduct();

	/**
	 * Returns the meta object for the reference list '{@link es.uca.spifm.spdt.deployment.swpm.DeliverableProduct#getEmbeddedWorkproducts <em>Embedded Workproducts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Embedded Workproducts</em>'.
	 * @see es.uca.spifm.spdt.deployment.swpm.DeliverableProduct#getEmbeddedWorkproducts()
	 * @see #getDeliverableProduct()
	 * @generated
	 */
	EReference getDeliverableProduct_EmbeddedWorkproducts();

	/**
	 * Returns the meta object for the attribute '{@link es.uca.spifm.spdt.deployment.swpm.DeliverableProduct#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see es.uca.spifm.spdt.deployment.swpm.DeliverableProduct#getType()
	 * @see #getDeliverableProduct()
	 * @generated
	 */
	EAttribute getDeliverableProduct_Type();

	/**
	 * Returns the meta object for class '{@link es.uca.spifm.spdt.deployment.swpm.InternalProduct <em>Internal Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Internal Product</em>'.
	 * @see es.uca.spifm.spdt.deployment.swpm.InternalProduct
	 * @generated
	 */
	EClass getInternalProduct();

	/**
	 * Returns the meta object for class '{@link es.uca.spifm.spdt.deployment.swpm.SourcePackage <em>Source Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source Package</em>'.
	 * @see es.uca.spifm.spdt.deployment.swpm.SourcePackage
	 * @generated
	 */
	EClass getSourcePackage();

	/**
	 * Returns the meta object for the attribute '{@link es.uca.spifm.spdt.deployment.swpm.SourcePackage#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see es.uca.spifm.spdt.deployment.swpm.SourcePackage#getDescription()
	 * @see #getSourcePackage()
	 * @generated
	 */
	EAttribute getSourcePackage_Description();

	/**
	 * Returns the meta object for the attribute '{@link es.uca.spifm.spdt.deployment.swpm.SourcePackage#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see es.uca.spifm.spdt.deployment.swpm.SourcePackage#getType()
	 * @see #getSourcePackage()
	 * @generated
	 */
	EAttribute getSourcePackage_Type();

	/**
	 * Returns the meta object for the attribute '{@link es.uca.spifm.spdt.deployment.swpm.SourcePackage#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.uca.spifm.spdt.deployment.swpm.SourcePackage#getName()
	 * @see #getSourcePackage()
	 * @generated
	 */
	EAttribute getSourcePackage_Name();

	/**
	 * Returns the meta object for enum '{@link es.uca.spifm.spdt.deployment.swpm.ModelType <em>Model Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Model Type</em>'.
	 * @see es.uca.spifm.spdt.deployment.swpm.ModelType
	 * @generated
	 */
	EEnum getModelType();

	/**
	 * Returns the meta object for enum '{@link es.uca.spifm.spdt.deployment.swpm.DeliverableType <em>Deliverable Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Deliverable Type</em>'.
	 * @see es.uca.spifm.spdt.deployment.swpm.DeliverableType
	 * @generated
	 */
	EEnum getDeliverableType();

	/**
	 * Returns the meta object for enum '{@link es.uca.spifm.spdt.deployment.swpm.Archetype <em>Archetype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Archetype</em>'.
	 * @see es.uca.spifm.spdt.deployment.swpm.Archetype
	 * @generated
	 */
	EEnum getArchetype();

	/**
	 * Returns the meta object for enum '{@link es.uca.spifm.spdt.deployment.swpm.SpecificationType <em>Specification Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Specification Type</em>'.
	 * @see es.uca.spifm.spdt.deployment.swpm.SpecificationType
	 * @generated
	 */
	EEnum getSpecificationType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SwpmFactory getSwpmFactory();

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
		 * The meta object literal for the '{@link es.uca.spifm.spdt.deployment.swpm.impl.ProjectImpl <em>Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uca.spifm.spdt.deployment.swpm.impl.ProjectImpl
		 * @see es.uca.spifm.spdt.deployment.swpm.impl.SwpmPackageImpl#getProject()
		 * @generated
		 */
		EClass PROJECT = eINSTANCE.getProject();

		/**
		 * The meta object literal for the '<em><b>Workproducts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__WORKPRODUCTS = eINSTANCE.getProject_Workproducts();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__NAME = eINSTANCE.getProject_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__DESCRIPTION = eINSTANCE.getProject_Description();

		/**
		 * The meta object literal for the '{@link es.uca.spifm.spdt.deployment.swpm.impl.WorkProductImpl <em>Work Product</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uca.spifm.spdt.deployment.swpm.impl.WorkProductImpl
		 * @see es.uca.spifm.spdt.deployment.swpm.impl.SwpmPackageImpl#getWorkProduct()
		 * @generated
		 */
		EClass WORK_PRODUCT = eINSTANCE.getWorkProduct();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_PRODUCT__TITLE = eINSTANCE.getWorkProduct_Title();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_PRODUCT__DESCRIPTION = eINSTANCE.getWorkProduct_Description();

		/**
		 * The meta object literal for the '{@link es.uca.spifm.spdt.deployment.swpm.impl.SectionImpl <em>Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uca.spifm.spdt.deployment.swpm.impl.SectionImpl
		 * @see es.uca.spifm.spdt.deployment.swpm.impl.SwpmPackageImpl#getSection()
		 * @generated
		 */
		EClass SECTION = eINSTANCE.getSection();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECTION__TITLE = eINSTANCE.getSection_Title();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECTION__DESCRIPTION = eINSTANCE.getSection_Description();

		/**
		 * The meta object literal for the '<em><b>Order</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECTION__ORDER = eINSTANCE.getSection_Order();

		/**
		 * The meta object literal for the '<em><b>Embedded Sections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECTION__EMBEDDED_SECTIONS = eINSTANCE.getSection_EmbeddedSections();

		/**
		 * The meta object literal for the '<em><b>Models</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECTION__MODELS = eINSTANCE.getSection_Models();

		/**
		 * The meta object literal for the '<em><b>Specifications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECTION__SPECIFICATIONS = eINSTANCE.getSection_Specifications();

		/**
		 * The meta object literal for the '{@link es.uca.spifm.spdt.deployment.swpm.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uca.spifm.spdt.deployment.swpm.impl.ModelImpl
		 * @see es.uca.spifm.spdt.deployment.swpm.impl.SwpmPackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__TYPE = eINSTANCE.getModel_Type();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__NAME = eINSTANCE.getModel_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__DESCRIPTION = eINSTANCE.getModel_Description();

		/**
		 * The meta object literal for the '{@link es.uca.spifm.spdt.deployment.swpm.impl.SpecificationImpl <em>Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uca.spifm.spdt.deployment.swpm.impl.SpecificationImpl
		 * @see es.uca.spifm.spdt.deployment.swpm.impl.SwpmPackageImpl#getSpecification()
		 * @generated
		 */
		EClass SPECIFICATION = eINSTANCE.getSpecification();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIFICATION__NAME = eINSTANCE.getSpecification_Name();

		/**
		 * The meta object literal for the '<em><b>Details</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIFICATION__DETAILS = eINSTANCE.getSpecification_Details();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIFICATION__TYPE = eINSTANCE.getSpecification_Type();

		/**
		 * The meta object literal for the '{@link es.uca.spifm.spdt.deployment.swpm.impl.CodeWorkProductImpl <em>Code Work Product</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uca.spifm.spdt.deployment.swpm.impl.CodeWorkProductImpl
		 * @see es.uca.spifm.spdt.deployment.swpm.impl.SwpmPackageImpl#getCodeWorkProduct()
		 * @generated
		 */
		EClass CODE_WORK_PRODUCT = eINSTANCE.getCodeWorkProduct();

		/**
		 * The meta object literal for the '<em><b>Packages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODE_WORK_PRODUCT__PACKAGES = eINSTANCE.getCodeWorkProduct_Packages();

		/**
		 * The meta object literal for the '{@link es.uca.spifm.spdt.deployment.swpm.impl.DocumentaryWorkProductImpl <em>Documentary Work Product</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uca.spifm.spdt.deployment.swpm.impl.DocumentaryWorkProductImpl
		 * @see es.uca.spifm.spdt.deployment.swpm.impl.SwpmPackageImpl#getDocumentaryWorkProduct()
		 * @generated
		 */
		EClass DOCUMENTARY_WORK_PRODUCT = eINSTANCE.getDocumentaryWorkProduct();

		/**
		 * The meta object literal for the '<em><b>Sections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENTARY_WORK_PRODUCT__SECTIONS = eINSTANCE.getDocumentaryWorkProduct_Sections();

		/**
		 * The meta object literal for the '{@link es.uca.spifm.spdt.deployment.swpm.impl.DeliverableProductImpl <em>Deliverable Product</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uca.spifm.spdt.deployment.swpm.impl.DeliverableProductImpl
		 * @see es.uca.spifm.spdt.deployment.swpm.impl.SwpmPackageImpl#getDeliverableProduct()
		 * @generated
		 */
		EClass DELIVERABLE_PRODUCT = eINSTANCE.getDeliverableProduct();

		/**
		 * The meta object literal for the '<em><b>Embedded Workproducts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELIVERABLE_PRODUCT__EMBEDDED_WORKPRODUCTS = eINSTANCE.getDeliverableProduct_EmbeddedWorkproducts();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELIVERABLE_PRODUCT__TYPE = eINSTANCE.getDeliverableProduct_Type();

		/**
		 * The meta object literal for the '{@link es.uca.spifm.spdt.deployment.swpm.impl.InternalProductImpl <em>Internal Product</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uca.spifm.spdt.deployment.swpm.impl.InternalProductImpl
		 * @see es.uca.spifm.spdt.deployment.swpm.impl.SwpmPackageImpl#getInternalProduct()
		 * @generated
		 */
		EClass INTERNAL_PRODUCT = eINSTANCE.getInternalProduct();

		/**
		 * The meta object literal for the '{@link es.uca.spifm.spdt.deployment.swpm.impl.SourcePackageImpl <em>Source Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uca.spifm.spdt.deployment.swpm.impl.SourcePackageImpl
		 * @see es.uca.spifm.spdt.deployment.swpm.impl.SwpmPackageImpl#getSourcePackage()
		 * @generated
		 */
		EClass SOURCE_PACKAGE = eINSTANCE.getSourcePackage();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE_PACKAGE__DESCRIPTION = eINSTANCE.getSourcePackage_Description();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE_PACKAGE__TYPE = eINSTANCE.getSourcePackage_Type();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE_PACKAGE__NAME = eINSTANCE.getSourcePackage_Name();

		/**
		 * The meta object literal for the '{@link es.uca.spifm.spdt.deployment.swpm.ModelType <em>Model Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uca.spifm.spdt.deployment.swpm.ModelType
		 * @see es.uca.spifm.spdt.deployment.swpm.impl.SwpmPackageImpl#getModelType()
		 * @generated
		 */
		EEnum MODEL_TYPE = eINSTANCE.getModelType();

		/**
		 * The meta object literal for the '{@link es.uca.spifm.spdt.deployment.swpm.DeliverableType <em>Deliverable Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uca.spifm.spdt.deployment.swpm.DeliverableType
		 * @see es.uca.spifm.spdt.deployment.swpm.impl.SwpmPackageImpl#getDeliverableType()
		 * @generated
		 */
		EEnum DELIVERABLE_TYPE = eINSTANCE.getDeliverableType();

		/**
		 * The meta object literal for the '{@link es.uca.spifm.spdt.deployment.swpm.Archetype <em>Archetype</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uca.spifm.spdt.deployment.swpm.Archetype
		 * @see es.uca.spifm.spdt.deployment.swpm.impl.SwpmPackageImpl#getArchetype()
		 * @generated
		 */
		EEnum ARCHETYPE = eINSTANCE.getArchetype();

		/**
		 * The meta object literal for the '{@link es.uca.spifm.spdt.deployment.swpm.SpecificationType <em>Specification Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uca.spifm.spdt.deployment.swpm.SpecificationType
		 * @see es.uca.spifm.spdt.deployment.swpm.impl.SwpmPackageImpl#getSpecificationType()
		 * @generated
		 */
		EEnum SPECIFICATION_TYPE = eINSTANCE.getSpecificationType();

	}

} //SwpmPackage
