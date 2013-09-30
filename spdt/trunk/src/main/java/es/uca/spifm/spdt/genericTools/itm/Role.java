/**
 * Created by Ivan Ruiz
 */
package es.uca.spifm.spdt.genericTools.itm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uca.spifm.spdt.genericTools.itm.Role#getName <em>Name</em>}</li>
 *   <li>{@link es.uca.spifm.spdt.genericTools.itm.Role#getPermissions <em>Permissions</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uca.spifm.spdt.genericTools.itm.ItmPackage#getRole()
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
	 * @see es.uca.spifm.spdt.genericTools.itm.ItmPackage#getRole_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link es.uca.spifm.spdt.genericTools.itm.Role#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Permissions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Permissions</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Permissions</em>' attribute.
	 * @see #setPermissions(String)
	 * @see es.uca.spifm.spdt.genericTools.itm.ItmPackage#getRole_Permissions()
	 * @model
	 * @generated
	 */
	String getPermissions();

	/**
	 * Sets the value of the '{@link es.uca.spifm.spdt.genericTools.itm.Role#getPermissions <em>Permissions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Permissions</em>' attribute.
	 * @see #getPermissions()
	 * @generated
	 */
	void setPermissions(String value);

} // Role
