/**
 * Designed by Ivan Ruiz
 */
package es.uca.spifm.spdt.deployment.spcm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Category</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uca.spifm.spdt.deployment.spcm.TaskCategory#getName <em>Name</em>}</li>
 *   <li>{@link es.uca.spifm.spdt.deployment.spcm.TaskCategory#isIsDefault <em>Is Default</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uca.spifm.spdt.deployment.spcm.SpcmPackage#getTaskCategory()
 * @model
 * @generated
 */
public interface TaskCategory extends EObject {
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
	 * @see es.uca.spifm.spdt.deployment.spcm.SpcmPackage#getTaskCategory_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link es.uca.spifm.spdt.deployment.spcm.TaskCategory#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Is Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Default</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Default</em>' attribute.
	 * @see #setIsDefault(boolean)
	 * @see es.uca.spifm.spdt.deployment.spcm.SpcmPackage#getTaskCategory_IsDefault()
	 * @model
	 * @generated
	 */
	boolean isIsDefault();

	/**
	 * Sets the value of the '{@link es.uca.spifm.spdt.deployment.spcm.TaskCategory#isIsDefault <em>Is Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Default</em>' attribute.
	 * @see #isIsDefault()
	 * @generated
	 */
	void setIsDefault(boolean value);

} // TaskCategory
