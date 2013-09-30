/**
 * Designed by Ivan Ruiz
 */
package es.uca.spifm.spdt.deployment.spcm.impl;

import es.uca.spifm.spdt.deployment.spcm.DependencyType;
import es.uca.spifm.spdt.deployment.spcm.Milestone;
import es.uca.spifm.spdt.deployment.spcm.Project;
import es.uca.spifm.spdt.deployment.spcm.Role;
import es.uca.spifm.spdt.deployment.spcm.SpcmFactory;
import es.uca.spifm.spdt.deployment.spcm.SpcmPackage;
import es.uca.spifm.spdt.deployment.spcm.Task;
import es.uca.spifm.spdt.deployment.spcm.TaskCategory;
import es.uca.spifm.spdt.deployment.spcm.TaskDependency;
import es.uca.spifm.spdt.deployment.spcm.TaskStatus;

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
public class SpcmPackageImpl extends EPackageImpl implements SpcmPackage {
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
	private EClass milestoneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskCategoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskDependencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dependencyTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum taskStatusEEnum = null;

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
	 * @see es.uca.spifm.spdt.deployment.spcm.SpcmPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SpcmPackageImpl() {
		super(eNS_URI, SpcmFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SpcmPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SpcmPackage init() {
		if (isInited) return (SpcmPackage)EPackage.Registry.INSTANCE.getEPackage(SpcmPackage.eNS_URI);

		// Obtain or create and register package
		SpcmPackageImpl theSpcmPackage = (SpcmPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SpcmPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SpcmPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theSpcmPackage.createPackageContents();

		// Initialize created meta-data
		theSpcmPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSpcmPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SpcmPackage.eNS_URI, theSpcmPackage);
		return theSpcmPackage;
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
	public EAttribute getProject_Description() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(0);
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
	public EReference getProject_Milestones() {
		return (EReference)projectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProject_Members() {
		return (EReference)projectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProject_TaskCategories() {
		return (EReference)projectEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMilestone() {
		return milestoneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMilestone_Description() {
		return (EAttribute)milestoneEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMilestone_Name() {
		return (EAttribute)milestoneEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMilestone_Tasks() {
		return (EReference)milestoneEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRole() {
		return roleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRole_Name() {
		return (EAttribute)roleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRole_Skills() {
		return (EAttribute)roleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTask() {
		return taskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_Name() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_Description() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_Priority() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_Status() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_Responsible() {
		return (EReference)taskEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_Category() {
		return (EReference)taskEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_Dependencies() {
		return (EReference)taskEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTaskCategory() {
		return taskCategoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskCategory_Name() {
		return (EAttribute)taskCategoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskCategory_IsDefault() {
		return (EAttribute)taskCategoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTaskDependency() {
		return taskDependencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskDependency_Type() {
		return (EAttribute)taskDependencyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskDependency_DependentTask() {
		return (EReference)taskDependencyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDependencyType() {
		return dependencyTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTaskStatus() {
		return taskStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpcmFactory getSpcmFactory() {
		return (SpcmFactory)getEFactoryInstance();
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
		createEAttribute(projectEClass, PROJECT__DESCRIPTION);
		createEAttribute(projectEClass, PROJECT__NAME);
		createEReference(projectEClass, PROJECT__MILESTONES);
		createEReference(projectEClass, PROJECT__MEMBERS);
		createEReference(projectEClass, PROJECT__TASK_CATEGORIES);

		milestoneEClass = createEClass(MILESTONE);
		createEAttribute(milestoneEClass, MILESTONE__DESCRIPTION);
		createEAttribute(milestoneEClass, MILESTONE__NAME);
		createEReference(milestoneEClass, MILESTONE__TASKS);

		roleEClass = createEClass(ROLE);
		createEAttribute(roleEClass, ROLE__NAME);
		createEAttribute(roleEClass, ROLE__SKILLS);

		taskEClass = createEClass(TASK);
		createEAttribute(taskEClass, TASK__NAME);
		createEAttribute(taskEClass, TASK__DESCRIPTION);
		createEAttribute(taskEClass, TASK__PRIORITY);
		createEAttribute(taskEClass, TASK__STATUS);
		createEReference(taskEClass, TASK__RESPONSIBLE);
		createEReference(taskEClass, TASK__CATEGORY);
		createEReference(taskEClass, TASK__DEPENDENCIES);

		taskCategoryEClass = createEClass(TASK_CATEGORY);
		createEAttribute(taskCategoryEClass, TASK_CATEGORY__NAME);
		createEAttribute(taskCategoryEClass, TASK_CATEGORY__IS_DEFAULT);

		taskDependencyEClass = createEClass(TASK_DEPENDENCY);
		createEAttribute(taskDependencyEClass, TASK_DEPENDENCY__TYPE);
		createEReference(taskDependencyEClass, TASK_DEPENDENCY__DEPENDENT_TASK);

		// Create enums
		dependencyTypeEEnum = createEEnum(DEPENDENCY_TYPE);
		taskStatusEEnum = createEEnum(TASK_STATUS);
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

		// Initialize classes, features, and operations; add parameters
		initEClass(projectEClass, Project.class, "Project", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProject_Description(), ecorePackage.getEString(), "description", null, 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProject_Name(), ecorePackage.getEString(), "name", null, 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProject_Milestones(), this.getMilestone(), null, "milestones", null, 1, -1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProject_Members(), this.getRole(), null, "members", null, 0, -1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProject_TaskCategories(), this.getTaskCategory(), null, "taskCategories", null, 0, -1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(milestoneEClass, Milestone.class, "Milestone", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMilestone_Description(), ecorePackage.getEString(), "description", null, 0, 1, Milestone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMilestone_Name(), ecorePackage.getEString(), "name", null, 0, 1, Milestone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMilestone_Tasks(), this.getTask(), null, "tasks", null, 0, -1, Milestone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roleEClass, Role.class, "Role", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRole_Name(), ecorePackage.getEString(), "name", null, 0, 1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRole_Skills(), ecorePackage.getEString(), "skills", null, 0, 1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskEClass, Task.class, "Task", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTask_Name(), ecorePackage.getEString(), "name", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_Description(), ecorePackage.getEString(), "description", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_Priority(), ecorePackage.getEInt(), "priority", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_Status(), this.getTaskStatus(), "status", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_Responsible(), this.getRole(), null, "responsible", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_Category(), this.getTaskCategory(), null, "category", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_Dependencies(), this.getTaskDependency(), null, "dependencies", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskCategoryEClass, TaskCategory.class, "TaskCategory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTaskCategory_Name(), ecorePackage.getEString(), "name", null, 0, 1, TaskCategory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaskCategory_IsDefault(), ecorePackage.getEBoolean(), "isDefault", null, 0, 1, TaskCategory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskDependencyEClass, TaskDependency.class, "TaskDependency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTaskDependency_Type(), this.getDependencyType(), "type", null, 0, 1, TaskDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaskDependency_DependentTask(), this.getTask(), null, "dependentTask", null, 1, 1, TaskDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(dependencyTypeEEnum, DependencyType.class, "DependencyType");
		addEEnumLiteral(dependencyTypeEEnum, DependencyType.START_START);
		addEEnumLiteral(dependencyTypeEEnum, DependencyType.START_END);
		addEEnumLiteral(dependencyTypeEEnum, DependencyType.END_START);
		addEEnumLiteral(dependencyTypeEEnum, DependencyType.END_END);

		initEEnum(taskStatusEEnum, TaskStatus.class, "TaskStatus");
		addEEnumLiteral(taskStatusEEnum, TaskStatus.OPEN);
		addEEnumLiteral(taskStatusEEnum, TaskStatus.CLOSED);
		addEEnumLiteral(taskStatusEEnum, TaskStatus.ASSIGNED);
		addEEnumLiteral(taskStatusEEnum, TaskStatus.RESOLVED);

		// Create resource
		createResource(eNS_URI);
	}

} //SpcmPackageImpl
