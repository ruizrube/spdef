/**
 * Designed by Ivan Ruiz
 */
package es.uca.spifm.spdt.deployment.swpm.impl;

import es.uca.spifm.spdt.deployment.swpm.Archetype;
import es.uca.spifm.spdt.deployment.swpm.CodeWorkProduct;
import es.uca.spifm.spdt.deployment.swpm.DeliverableProduct;
import es.uca.spifm.spdt.deployment.swpm.DeliverableType;
import es.uca.spifm.spdt.deployment.swpm.DocumentaryWorkProduct;
import es.uca.spifm.spdt.deployment.swpm.InternalProduct;
import es.uca.spifm.spdt.deployment.swpm.Model;
import es.uca.spifm.spdt.deployment.swpm.ModelType;
import es.uca.spifm.spdt.deployment.swpm.Project;
import es.uca.spifm.spdt.deployment.swpm.Section;
import es.uca.spifm.spdt.deployment.swpm.SourcePackage;
import es.uca.spifm.spdt.deployment.swpm.Specification;
import es.uca.spifm.spdt.deployment.swpm.SpecificationType;
import es.uca.spifm.spdt.deployment.swpm.SwpmFactory;
import es.uca.spifm.spdt.deployment.swpm.SwpmPackage;
import es.uca.spifm.spdt.deployment.swpm.WorkProduct;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SwpmPackageImpl extends EPackageImpl implements SwpmPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass projectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workProductEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeWorkProductEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentaryWorkProductEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deliverableProductEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalProductEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sourcePackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum modelTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum deliverableTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum archetypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum specificationTypeEEnum = null;

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
	 * @see es.uca.spifm.spdt.deployment.swpm.SwpmPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SwpmPackageImpl() {
		super(eNS_URI, SwpmFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SwpmPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SwpmPackage init() {
		if (isInited) return (SwpmPackage)EPackage.Registry.INSTANCE.getEPackage(SwpmPackage.eNS_URI);

		// Obtain or create and register package
		SwpmPackageImpl theSwpmPackage = (SwpmPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SwpmPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SwpmPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theSwpmPackage.createPackageContents();

		// Initialize created meta-data
		theSwpmPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSwpmPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SwpmPackage.eNS_URI, theSwpmPackage);
		return theSwpmPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProject() {
		return projectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProject_Workproducts() {
		return (EReference)projectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProject_Name() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProject_Description() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkProduct() {
		return workProductEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkProduct_Name() {
		return (EAttribute)workProductEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkProduct_Description() {
		return (EAttribute)workProductEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSection() {
		return sectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSection_Name() {
		return (EAttribute)sectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSection_Description() {
		return (EAttribute)sectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSection_Order() {
		return (EAttribute)sectionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSection_EmbeddedSections() {
		return (EReference)sectionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSection_Models() {
		return (EReference)sectionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSection_Specifications() {
		return (EReference)sectionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModel() {
		return modelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModel_Type() {
		return (EAttribute)modelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModel_Name() {
		return (EAttribute)modelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModel_Description() {
		return (EAttribute)modelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecification() {
		return specificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpecification_Name() {
		return (EAttribute)specificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpecification_Description() {
		return (EAttribute)specificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpecification_Type() {
		return (EAttribute)specificationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCodeWorkProduct() {
		return codeWorkProductEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCodeWorkProduct_Packages() {
		return (EReference)codeWorkProductEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentaryWorkProduct() {
		return documentaryWorkProductEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentaryWorkProduct_Sections() {
		return (EReference)documentaryWorkProductEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeliverableProduct() {
		return deliverableProductEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeliverableProduct_EmbeddedWorkproducts() {
		return (EReference)deliverableProductEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeliverableProduct_Type() {
		return (EAttribute)deliverableProductEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInternalProduct() {
		return internalProductEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSourcePackage() {
		return sourcePackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSourcePackage_Description() {
		return (EAttribute)sourcePackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSourcePackage_Type() {
		return (EAttribute)sourcePackageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSourcePackage_Name() {
		return (EAttribute)sourcePackageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getModelType() {
		return modelTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDeliverableType() {
		return deliverableTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getArchetype() {
		return archetypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSpecificationType() {
		return specificationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwpmFactory getSwpmFactory() {
		return (SwpmFactory)getEFactoryInstance();
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
		projectEClass = createEClass(PROJECT);
		createEReference(projectEClass, PROJECT__WORKPRODUCTS);
		createEAttribute(projectEClass, PROJECT__NAME);
		createEAttribute(projectEClass, PROJECT__DESCRIPTION);

		workProductEClass = createEClass(WORK_PRODUCT);
		createEAttribute(workProductEClass, WORK_PRODUCT__NAME);
		createEAttribute(workProductEClass, WORK_PRODUCT__DESCRIPTION);

		sectionEClass = createEClass(SECTION);
		createEAttribute(sectionEClass, SECTION__NAME);
		createEAttribute(sectionEClass, SECTION__DESCRIPTION);
		createEAttribute(sectionEClass, SECTION__ORDER);
		createEReference(sectionEClass, SECTION__EMBEDDED_SECTIONS);
		createEReference(sectionEClass, SECTION__MODELS);
		createEReference(sectionEClass, SECTION__SPECIFICATIONS);

		modelEClass = createEClass(MODEL);
		createEAttribute(modelEClass, MODEL__TYPE);
		createEAttribute(modelEClass, MODEL__NAME);
		createEAttribute(modelEClass, MODEL__DESCRIPTION);

		specificationEClass = createEClass(SPECIFICATION);
		createEAttribute(specificationEClass, SPECIFICATION__NAME);
		createEAttribute(specificationEClass, SPECIFICATION__DESCRIPTION);
		createEAttribute(specificationEClass, SPECIFICATION__TYPE);

		codeWorkProductEClass = createEClass(CODE_WORK_PRODUCT);
		createEReference(codeWorkProductEClass, CODE_WORK_PRODUCT__PACKAGES);

		documentaryWorkProductEClass = createEClass(DOCUMENTARY_WORK_PRODUCT);
		createEReference(documentaryWorkProductEClass, DOCUMENTARY_WORK_PRODUCT__SECTIONS);

		deliverableProductEClass = createEClass(DELIVERABLE_PRODUCT);
		createEReference(deliverableProductEClass, DELIVERABLE_PRODUCT__EMBEDDED_WORKPRODUCTS);
		createEAttribute(deliverableProductEClass, DELIVERABLE_PRODUCT__TYPE);

		internalProductEClass = createEClass(INTERNAL_PRODUCT);

		sourcePackageEClass = createEClass(SOURCE_PACKAGE);
		createEAttribute(sourcePackageEClass, SOURCE_PACKAGE__DESCRIPTION);
		createEAttribute(sourcePackageEClass, SOURCE_PACKAGE__TYPE);
		createEAttribute(sourcePackageEClass, SOURCE_PACKAGE__NAME);

		// Create enums
		modelTypeEEnum = createEEnum(MODEL_TYPE);
		deliverableTypeEEnum = createEEnum(DELIVERABLE_TYPE);
		archetypeEEnum = createEEnum(ARCHETYPE);
		specificationTypeEEnum = createEEnum(SPECIFICATION_TYPE);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		codeWorkProductEClass.getESuperTypes().add(this.getInternalProduct());
		documentaryWorkProductEClass.getESuperTypes().add(this.getInternalProduct());
		deliverableProductEClass.getESuperTypes().add(this.getWorkProduct());
		internalProductEClass.getESuperTypes().add(this.getWorkProduct());

		// Initialize classes, features, and operations; add parameters
		initEClass(projectEClass, Project.class, "Project", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProject_Workproducts(), this.getWorkProduct(), null, "workproducts", null, 0, -1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProject_Name(), ecorePackage.getEString(), "name", null, 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProject_Description(), ecorePackage.getEString(), "description", null, 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workProductEClass, WorkProduct.class, "WorkProduct", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWorkProduct_Name(), ecorePackage.getEString(), "name", null, 0, 1, WorkProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkProduct_Description(), ecorePackage.getEString(), "description", null, 0, 1, WorkProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sectionEClass, Section.class, "Section", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSection_Name(), ecorePackage.getEString(), "name", null, 0, 1, Section.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSection_Description(), ecorePackage.getEString(), "description", null, 0, 1, Section.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSection_Order(), ecorePackage.getEInt(), "order", null, 0, 1, Section.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSection_EmbeddedSections(), this.getSection(), null, "embeddedSections", null, 0, -1, Section.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSection_Models(), this.getModel(), null, "models", null, 0, -1, Section.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSection_Specifications(), this.getSpecification(), null, "specifications", null, 0, -1, Section.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModel_Type(), this.getModelType(), "type", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModel_Name(), ecorePackage.getEString(), "name", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModel_Description(), ecorePackage.getEString(), "description", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(specificationEClass, Specification.class, "Specification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSpecification_Name(), ecorePackage.getEString(), "name", null, 0, 1, Specification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpecification_Description(), ecorePackage.getEString(), "description", null, 0, 1, Specification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpecification_Type(), this.getSpecificationType(), "type", null, 0, 1, Specification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(codeWorkProductEClass, CodeWorkProduct.class, "CodeWorkProduct", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCodeWorkProduct_Packages(), this.getSourcePackage(), null, "packages", null, 0, -1, CodeWorkProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentaryWorkProductEClass, DocumentaryWorkProduct.class, "DocumentaryWorkProduct", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDocumentaryWorkProduct_Sections(), this.getSection(), null, "sections", null, 0, -1, DocumentaryWorkProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deliverableProductEClass, DeliverableProduct.class, "DeliverableProduct", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeliverableProduct_EmbeddedWorkproducts(), this.getWorkProduct(), null, "embeddedWorkproducts", null, 0, -1, DeliverableProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeliverableProduct_Type(), this.getDeliverableType(), "type", null, 0, 1, DeliverableProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(internalProductEClass, InternalProduct.class, "InternalProduct", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sourcePackageEClass, SourcePackage.class, "SourcePackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSourcePackage_Description(), ecorePackage.getEString(), "description", null, 0, 1, SourcePackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSourcePackage_Type(), this.getArchetype(), "type", null, 0, 1, SourcePackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSourcePackage_Name(), ecorePackage.getEString(), "name", null, 0, 1, SourcePackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(modelTypeEEnum, ModelType.class, "ModelType");
		addEEnumLiteral(modelTypeEEnum, ModelType.USECASE);
		addEEnumLiteral(modelTypeEEnum, ModelType.CLASS);
		addEEnumLiteral(modelTypeEEnum, ModelType.ACTIVITY);
		addEEnumLiteral(modelTypeEEnum, ModelType.COMPONENT);
		addEEnumLiteral(modelTypeEEnum, ModelType.DEPLOYMENT);
		addEEnumLiteral(modelTypeEEnum, ModelType.SEQUENCE);
		addEEnumLiteral(modelTypeEEnum, ModelType.STATECHART);
		addEEnumLiteral(modelTypeEEnum, ModelType.COLLABORATION);
		addEEnumLiteral(modelTypeEEnum, ModelType.OTHER);

		initEEnum(deliverableTypeEEnum, DeliverableType.class, "DeliverableType");
		addEEnumLiteral(deliverableTypeEEnum, DeliverableType.DOC);
		addEEnumLiteral(deliverableTypeEEnum, DeliverableType.SOURCE);
		addEEnumLiteral(deliverableTypeEEnum, DeliverableType.ARCHIVE);
		addEEnumLiteral(deliverableTypeEEnum, DeliverableType.INSTALLER);
		addEEnumLiteral(deliverableTypeEEnum, DeliverableType.PACKAGE);
		addEEnumLiteral(deliverableTypeEEnum, DeliverableType.OTHER);

		initEEnum(archetypeEEnum, Archetype.class, "Archetype");
		addEEnumLiteral(archetypeEEnum, Archetype.J2EE);
		addEEnumLiteral(archetypeEEnum, Archetype.STRUTS2);
		addEEnumLiteral(archetypeEEnum, Archetype.SPRING_OSGI);
		addEEnumLiteral(archetypeEEnum, Archetype.JSF);

		initEEnum(specificationTypeEEnum, SpecificationType.class, "SpecificationType");
		addEEnumLiteral(specificationTypeEEnum, SpecificationType.TEXTUAL);
		addEEnumLiteral(specificationTypeEEnum, SpecificationType.EXTERNALCONTENT);
		addEEnumLiteral(specificationTypeEEnum, SpecificationType.ITEMLIST);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// comment
		createCommentAnnotations();
	}

	/**
	 * Initializes the annotations for <b>comment</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createCommentAnnotations() {
		String source = "comment";		
		addAnnotation
		  (projectEClass, 
		   source, 
		   new String[] {
			 "comment", "Clase contenedora de todos los productos de trabajo de un proyecto."
		   });		
		addAnnotation
		  (workProductEClass, 
		   source, 
		   new String[] {
			 "comment", "Clase abstracta y similar al concepto de WorkProduct en \\gls{SPEM} que representa un determinado producto generado o mantenido durante el proceso software. Se distinguen entre productos entregables o internos."
		   });		
		addAnnotation
		  (sectionEClass, 
		   source, 
		   new String[] {
			 "comment", "Clase que representa una secci\u00f3n dentro de un determinado documento generado durante el proyecto."
		   });		
		addAnnotation
		  (modelEClass, 
		   source, 
		   new String[] {
			 "comment", "Clase que representa un modelo dise\u00f1ado haciendo uso un lenguaje de modelado."
		   });		
		addAnnotation
		  (modelTypeEEnum, 
		   source, 
		   new String[] {
			 "comment", "Enumeraci\u00f3n con los posibles tipos de modelos. Comprende los tipos propuestos con el lenguaje UML, aunque podr\u00eda englobar otros tipos de modelos visuales o textuales desarrollados con otros lenguajes, ya sean gen\u00e9ricos o de prop\u00f3sitos espec\u00edficos (DSL)."
		   });		
		addAnnotation
		  (specificationEClass, 
		   source, 
		   new String[] {
			 "comment", "Clase que representa una especificaci\u00f3n textual de alg\u00fan aspecto del proyecto software."
		   });		
		addAnnotation
		  (codeWorkProductEClass, 
		   source, 
		   new String[] {
			 "comment", "Clase que representa la base de c\u00f3digo de un proyecto software."
		   });		
		addAnnotation
		  (documentaryWorkProductEClass, 
		   source, 
		   new String[] {
			 "comment", "Clase que representa un documento t\u00e9cnico de trabajo."
		   });		
		addAnnotation
		  (deliverableProductEClass, 
		   source, 
		   new String[] {
			 "comment", "Clase abstracta que representa un producto de trabajo desarrollado durante el transcurso de un proyecto software y con valor para terceros."
		   });		
		addAnnotation
		  (internalProductEClass, 
		   source, 
		   new String[] {
			 "comment", "Clase abstracta que representa un producto interno al desarrollo o mantenimiento de software. Puede ser de tipo documental o de c\u00f3digo."
		   });		
		addAnnotation
		  (deliverableTypeEEnum, 
		   source, 
		   new String[] {
			 "comment", "Enumeraci\u00f3n con los posibles tipos de entregables de un proyecto. Pueden ser ficheros empaquetados, instaladores o documentos, entre otros tipos."
		   });		
		addAnnotation
		  (sourcePackageEClass, 
		   source, 
		   new String[] {
			 "comment", "Clase que representa un determinado paquete de c\u00f3digo fuente basado en alg\u00fan lenguaje de programaci\u00f3n."
		   });		
		addAnnotation
		  (archetypeEEnum, 
		   source, 
		   new String[] {
			 "comment", "Enumeraci\u00f3n con los posibles tipos de paquetes de c\u00f3digo fuente. Engloba a aquellas plantillas predefinidas de c\u00f3digo, siguiendo los arquetipos disponibles en sistemas de gesti\u00f3n de la construcci\u00f3n como Maven u otros."
		   });		
		addAnnotation
		  (specificationTypeEEnum, 
		   source, 
		   new String[] {
			 "comment", "Enumeraci\u00f3n con los posibles tipos de especificaciones no basadas en modelos. Pueden consistir en una descripci\u00f3n textual, una lista de elementos o contenido binario gestionado por alguna herramienta externa."
		   });
	}

} //SwpmPackageImpl
