/**
 * Designed by Ivan Ruiz
 */
package es.uca.spifm.spdt.deployment.swpm.impl;

import es.uca.spifm.spdt.deployment.swpm.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SwpmFactoryImpl extends EFactoryImpl implements SwpmFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SwpmFactory init() {
		try {
			SwpmFactory theSwpmFactory = (SwpmFactory)EPackage.Registry.INSTANCE.getEFactory(SwpmPackage.eNS_URI);
			if (theSwpmFactory != null) {
				return theSwpmFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SwpmFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwpmFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SwpmPackage.PROJECT: return createProject();
			case SwpmPackage.SECTION: return createSection();
			case SwpmPackage.MODEL: return createModel();
			case SwpmPackage.SPECIFICATION: return createSpecification();
			case SwpmPackage.CODE_WORK_PRODUCT: return createCodeWorkProduct();
			case SwpmPackage.DOCUMENTARY_WORK_PRODUCT: return createDocumentaryWorkProduct();
			case SwpmPackage.DELIVERABLE_PRODUCT: return createDeliverableProduct();
			case SwpmPackage.INTERNAL_PRODUCT: return createInternalProduct();
			case SwpmPackage.SOURCE_PACKAGE: return createSourcePackage();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case SwpmPackage.MODEL_TYPE:
				return createModelTypeFromString(eDataType, initialValue);
			case SwpmPackage.DELIVERABLE_TYPE:
				return createDeliverableTypeFromString(eDataType, initialValue);
			case SwpmPackage.ARCHETYPE:
				return createArchetypeFromString(eDataType, initialValue);
			case SwpmPackage.SPECIFICATION_TYPE:
				return createSpecificationTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case SwpmPackage.MODEL_TYPE:
				return convertModelTypeToString(eDataType, instanceValue);
			case SwpmPackage.DELIVERABLE_TYPE:
				return convertDeliverableTypeToString(eDataType, instanceValue);
			case SwpmPackage.ARCHETYPE:
				return convertArchetypeToString(eDataType, instanceValue);
			case SwpmPackage.SPECIFICATION_TYPE:
				return convertSpecificationTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Project createProject() {
		ProjectImpl project = new ProjectImpl();
		return project;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Section createSection() {
		SectionImpl section = new SectionImpl();
		return section;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model createModel() {
		ModelImpl model = new ModelImpl();
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Specification createSpecification() {
		SpecificationImpl specification = new SpecificationImpl();
		return specification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeWorkProduct createCodeWorkProduct() {
		CodeWorkProductImpl codeWorkProduct = new CodeWorkProductImpl();
		return codeWorkProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentaryWorkProduct createDocumentaryWorkProduct() {
		DocumentaryWorkProductImpl documentaryWorkProduct = new DocumentaryWorkProductImpl();
		return documentaryWorkProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeliverableProduct createDeliverableProduct() {
		DeliverableProductImpl deliverableProduct = new DeliverableProductImpl();
		return deliverableProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalProduct createInternalProduct() {
		InternalProductImpl internalProduct = new InternalProductImpl();
		return internalProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourcePackage createSourcePackage() {
		SourcePackageImpl sourcePackage = new SourcePackageImpl();
		return sourcePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelType createModelTypeFromString(EDataType eDataType, String initialValue) {
		ModelType result = ModelType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertModelTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeliverableType createDeliverableTypeFromString(EDataType eDataType, String initialValue) {
		DeliverableType result = DeliverableType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeliverableTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Archetype createArchetypeFromString(EDataType eDataType, String initialValue) {
		Archetype result = Archetype.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertArchetypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecificationType createSpecificationTypeFromString(EDataType eDataType, String initialValue) {
		SpecificationType result = SpecificationType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSpecificationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwpmPackage getSwpmPackage() {
		return (SwpmPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SwpmPackage getPackage() {
		return SwpmPackage.eINSTANCE;
	}

} //SwpmFactoryImpl
