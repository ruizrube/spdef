/**
 * Created by Ivan Ruiz
 */
package es.uca.spifm.spdt.genericTools.vmm.impl;

import es.uca.spifm.spdt.genericTools.vmm.Connector;
import es.uca.spifm.spdt.genericTools.vmm.ConnectorType;
import es.uca.spifm.spdt.genericTools.vmm.Diagram;
import es.uca.spifm.spdt.genericTools.vmm.DiagramType;
import es.uca.spifm.spdt.genericTools.vmm.Element;
import es.uca.spifm.spdt.genericTools.vmm.ElementType;
import es.uca.spifm.spdt.genericTools.vmm.ModelRepository;
import es.uca.spifm.spdt.genericTools.vmm.Project;
import es.uca.spifm.spdt.genericTools.vmm.VmmFactory;
import es.uca.spifm.spdt.genericTools.vmm.VmmPackage;

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
public class VmmFactoryImpl extends EFactoryImpl implements VmmFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static VmmFactory init() {
		try {
			VmmFactory theVmmFactory = (VmmFactory)EPackage.Registry.INSTANCE.getEFactory(VmmPackage.eNS_URI);
			if (theVmmFactory != null) {
				return theVmmFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new VmmFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VmmFactoryImpl() {
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
			case VmmPackage.MODEL_REPOSITORY: return createModelRepository();
			case VmmPackage.PACKAGE: return createPackage();
			case VmmPackage.DIAGRAM: return createDiagram();
			case VmmPackage.ELEMENT: return createElement();
			case VmmPackage.CONNECTOR: return createConnector();
			case VmmPackage.PROJECT: return createProject();
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
			case VmmPackage.ELEMENT_TYPE:
				return createElementTypeFromString(eDataType, initialValue);
			case VmmPackage.CONNECTOR_TYPE:
				return createConnectorTypeFromString(eDataType, initialValue);
			case VmmPackage.DIAGRAM_TYPE:
				return createDiagramTypeFromString(eDataType, initialValue);
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
			case VmmPackage.ELEMENT_TYPE:
				return convertElementTypeToString(eDataType, instanceValue);
			case VmmPackage.CONNECTOR_TYPE:
				return convertConnectorTypeToString(eDataType, instanceValue);
			case VmmPackage.DIAGRAM_TYPE:
				return convertDiagramTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelRepository createModelRepository() {
		ModelRepositoryImpl modelRepository = new ModelRepositoryImpl();
		return modelRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public es.uca.spifm.spdt.genericTools.vmm.Package createPackage() {
		PackageImpl package_ = new PackageImpl();
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Diagram createDiagram() {
		DiagramImpl diagram = new DiagramImpl();
		return diagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element createElement() {
		ElementImpl element = new ElementImpl();
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector createConnector() {
		ConnectorImpl connector = new ConnectorImpl();
		return connector;
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
	public ElementType createElementTypeFromString(EDataType eDataType, String initialValue) {
		ElementType result = ElementType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertElementTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectorType createConnectorTypeFromString(EDataType eDataType, String initialValue) {
		ConnectorType result = ConnectorType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConnectorTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagramType createDiagramTypeFromString(EDataType eDataType, String initialValue) {
		DiagramType result = DiagramType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDiagramTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VmmPackage getVmmPackage() {
		return (VmmPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static VmmPackage getPackage() {
		return VmmPackage.eINSTANCE;
	}

} //VmmFactoryImpl
