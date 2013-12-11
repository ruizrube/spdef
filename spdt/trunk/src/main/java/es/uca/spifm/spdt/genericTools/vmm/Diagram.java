/**
 * Created by Ivan Ruiz
 */
package es.uca.spifm.spdt.genericTools.vmm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uca.spifm.spdt.genericTools.vmm.Diagram#getName <em>Name</em>}</li>
 *   <li>{@link es.uca.spifm.spdt.genericTools.vmm.Diagram#getType <em>Type</em>}</li>
 *   <li>{@link es.uca.spifm.spdt.genericTools.vmm.Diagram#getDescription <em>Description</em>}</li>
 *   <li>{@link es.uca.spifm.spdt.genericTools.vmm.Diagram#getContainedElements <em>Contained Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uca.spifm.spdt.genericTools.vmm.VmmPackage#getDiagram()
 * @model annotation="comment comment='Clase que representa a un determinado diagrama modelado con alg\372n lenguaje visual.'"
 * @generated
 */
public interface Diagram extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see es.uca.spifm.spdt.genericTools.vmm.VmmPackage#getDiagram_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link es.uca.spifm.spdt.genericTools.vmm.Diagram#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link es.uca.spifm.spdt.genericTools.vmm.DiagramType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see es.uca.spifm.spdt.genericTools.vmm.DiagramType
	 * @see #setType(DiagramType)
	 * @see es.uca.spifm.spdt.genericTools.vmm.VmmPackage#getDiagram_Type()
	 * @model
	 * @generated
	 */
	DiagramType getType();

	/**
	 * Sets the value of the '{@link es.uca.spifm.spdt.genericTools.vmm.Diagram#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see es.uca.spifm.spdt.genericTools.vmm.DiagramType
	 * @see #getType()
	 * @generated
	 */
	void setType(DiagramType value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see es.uca.spifm.spdt.genericTools.vmm.VmmPackage#getDiagram_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link es.uca.spifm.spdt.genericTools.vmm.Diagram#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Contained Elements</b></em>' reference list.
	 * The list contents are of type {@link es.uca.spifm.spdt.genericTools.vmm.Element}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained Elements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained Elements</em>' reference list.
	 * @see es.uca.spifm.spdt.genericTools.vmm.VmmPackage#getDiagram_ContainedElements()
	 * @model
	 * @generated
	 */
	EList<Element> getContainedElements();

} // Diagram
