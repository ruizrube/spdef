/**
 * Created by Ivan Ruiz
 */
package es.uca.spifm.spdt.genericTools.itm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Issue Tracking Database</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uca.spifm.spdt.genericTools.itm.IssueTrackingDatabase#getProjects <em>Projects</em>}</li>
 *   <li>{@link es.uca.spifm.spdt.genericTools.itm.IssueTrackingDatabase#getTrackers <em>Trackers</em>}</li>
 *   <li>{@link es.uca.spifm.spdt.genericTools.itm.IssueTrackingDatabase#getRoles <em>Roles</em>}</li>
 *   <li>{@link es.uca.spifm.spdt.genericTools.itm.IssueTrackingDatabase#getUsers <em>Users</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uca.spifm.spdt.genericTools.itm.ItmPackage#getIssueTrackingDatabase()
 * @model
 * @generated
 */
public interface IssueTrackingDatabase extends EObject {
	/**
	 * Returns the value of the '<em><b>Projects</b></em>' containment reference list.
	 * The list contents are of type {@link es.uca.spifm.spdt.genericTools.itm.Project}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Projects</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Projects</em>' containment reference list.
	 * @see es.uca.spifm.spdt.genericTools.itm.ItmPackage#getIssueTrackingDatabase_Projects()
	 * @model containment="true"
	 * @generated
	 */
	EList<Project> getProjects();

	/**
	 * Returns the value of the '<em><b>Trackers</b></em>' containment reference list.
	 * The list contents are of type {@link es.uca.spifm.spdt.genericTools.itm.Tracker}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trackers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trackers</em>' containment reference list.
	 * @see es.uca.spifm.spdt.genericTools.itm.ItmPackage#getIssueTrackingDatabase_Trackers()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Tracker> getTrackers();

	/**
	 * Returns the value of the '<em><b>Roles</b></em>' containment reference list.
	 * The list contents are of type {@link es.uca.spifm.spdt.genericTools.itm.Role}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roles</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roles</em>' containment reference list.
	 * @see es.uca.spifm.spdt.genericTools.itm.ItmPackage#getIssueTrackingDatabase_Roles()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Role> getRoles();

	/**
	 * Returns the value of the '<em><b>Users</b></em>' containment reference list.
	 * The list contents are of type {@link es.uca.spifm.spdt.genericTools.itm.User}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Users</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Users</em>' containment reference list.
	 * @see es.uca.spifm.spdt.genericTools.itm.ItmPackage#getIssueTrackingDatabase_Users()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<User> getUsers();

} // IssueTrackingDatabase
