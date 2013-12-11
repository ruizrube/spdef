/**
 * Designed by Ivan Ruiz
 */
package es.uca.spifm.spdt.deployment.swpm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uca.spifm.spdt.deployment.swpm.Model#getType <em>Type</em>}</li>
 *   <li>{@link es.uca.spifm.spdt.deployment.swpm.Model#getName <em>Name</em>}</li>
 *   <li>{@link es.uca.spifm.spdt.deployment.swpm.Model#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uca.spifm.spdt.deployment.swpm.SwpmPackage#getModel()
 * @model annotation="comment comment='Clase que representa un modelo dise\361ado haciendo uso un lenguaje de modelado.'"
 * @generated
 */
public interface Model extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link es.uca.spifm.spdt.deployment.swpm.ModelType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see es.uca.spifm.spdt.deployment.swpm.ModelType
	 * @see #setType(ModelType)
	 * @see es.uca.spifm.spdt.deployment.swpm.SwpmPackage#getModel_Type()
	 * @model
	 * @generated
	 */
	ModelType getType();

	/**
	 * Sets the value of the '{@link es.uca.spifm.spdt.deployment.swpm.Model#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see es.uca.spifm.spdt.deployment.swpm.ModelType
	 * @see #getType()
	 * @generated
	 */
	void setType(ModelType value);

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
	 * @see es.uca.spifm.spdt.deployment.swpm.SwpmPackage#getModel_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link es.uca.spifm.spdt.deployment.swpm.Model#getName <em>Name</em>}' attribute.
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
	 * @see es.uca.spifm.spdt.deployment.swpm.SwpmPackage#getModel_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link es.uca.spifm.spdt.deployment.swpm.Model#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // Model
