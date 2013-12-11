/**
 * Designed by Ivan Ruiz
 */
package es.uca.spifm.spdt.deployment.swpm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uca.spifm.spdt.deployment.swpm.Specification#getName <em>Name</em>}</li>
 *   <li>{@link es.uca.spifm.spdt.deployment.swpm.Specification#getDescription <em>Description</em>}</li>
 *   <li>{@link es.uca.spifm.spdt.deployment.swpm.Specification#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uca.spifm.spdt.deployment.swpm.SwpmPackage#getSpecification()
 * @model annotation="comment comment='Clase que representa una especificaci\363n textual de alg\372n aspecto del proyecto software.'"
 * @generated
 */
public interface Specification extends EObject {
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
	 * @see es.uca.spifm.spdt.deployment.swpm.SwpmPackage#getSpecification_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link es.uca.spifm.spdt.deployment.swpm.Specification#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see es.uca.spifm.spdt.deployment.swpm.SwpmPackage#getSpecification_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link es.uca.spifm.spdt.deployment.swpm.Specification#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link es.uca.spifm.spdt.deployment.swpm.SpecificationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see es.uca.spifm.spdt.deployment.swpm.SpecificationType
	 * @see #setType(SpecificationType)
	 * @see es.uca.spifm.spdt.deployment.swpm.SwpmPackage#getSpecification_Type()
	 * @model
	 * @generated
	 */
	SpecificationType getType();

	/**
	 * Sets the value of the '{@link es.uca.spifm.spdt.deployment.swpm.Specification#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see es.uca.spifm.spdt.deployment.swpm.SpecificationType
	 * @see #getType()
	 * @generated
	 */
	void setType(SpecificationType value);

} // Specification
