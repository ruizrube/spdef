/**
 * Created by Ivan Ruiz
 */
package es.uca.spifm.spdt.genericTools.itm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Member</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uca.spifm.spdt.genericTools.itm.Member#getUser <em>User</em>}</li>
 *   <li>{@link es.uca.spifm.spdt.genericTools.itm.Member#getRole <em>Role</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uca.spifm.spdt.genericTools.itm.ItmPackage#getMember()
 * @model annotation="comment comment='Clase utilizada para asociar un determinado usuario a un proyecto, haciendo uso de un rol determinado.'"
 * @generated
 */
public interface Member extends EObject {
	/**
	 * Returns the value of the '<em><b>User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User</em>' reference.
	 * @see #setUser(User)
	 * @see es.uca.spifm.spdt.genericTools.itm.ItmPackage#getMember_User()
	 * @model required="true"
	 * @generated
	 */
	User getUser();

	/**
	 * Sets the value of the '{@link es.uca.spifm.spdt.genericTools.itm.Member#getUser <em>User</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User</em>' reference.
	 * @see #getUser()
	 * @generated
	 */
	void setUser(User value);

	/**
	 * Returns the value of the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' reference.
	 * @see #setRole(Role)
	 * @see es.uca.spifm.spdt.genericTools.itm.ItmPackage#getMember_Role()
	 * @model required="true"
	 * @generated
	 */
	Role getRole();

	/**
	 * Sets the value of the '{@link es.uca.spifm.spdt.genericTools.itm.Member#getRole <em>Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' reference.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(Role value);

} // Member
