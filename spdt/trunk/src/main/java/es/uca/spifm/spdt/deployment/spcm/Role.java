/**
 * Designed by Ivan Ruiz
 */
package es.uca.spifm.spdt.deployment.spcm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uca.spifm.spdt.deployment.spcm.Role#getName <em>Name</em>}</li>
 *   <li>{@link es.uca.spifm.spdt.deployment.spcm.Role#getSkills <em>Skills</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uca.spifm.spdt.deployment.spcm.SpcmPackage#getRole()
 * @model
 * @generated
 */
public interface Role extends EObject {
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
	 * @see es.uca.spifm.spdt.deployment.spcm.SpcmPackage#getRole_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link es.uca.spifm.spdt.deployment.spcm.Role#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Skills</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Skills</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Skills</em>' attribute.
	 * @see #setSkills(String)
	 * @see es.uca.spifm.spdt.deployment.spcm.SpcmPackage#getRole_Skills()
	 * @model
	 * @generated
	 */
	String getSkills();

	/**
	 * Sets the value of the '{@link es.uca.spifm.spdt.deployment.spcm.Role#getSkills <em>Skills</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Skills</em>' attribute.
	 * @see #getSkills()
	 * @generated
	 */
	void setSkills(String value);

} // Role
