/**
 * Created by Ivan Ruiz
 */
package es.uca.spifm.spdt.genericTools.itm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uca.spifm.spdt.genericTools.itm.Project#getName <em>Name</em>}</li>
 *   <li>{@link es.uca.spifm.spdt.genericTools.itm.Project#getDescription <em>Description</em>}</li>
 *   <li>{@link es.uca.spifm.spdt.genericTools.itm.Project#getVersions <em>Versions</em>}</li>
 *   <li>{@link es.uca.spifm.spdt.genericTools.itm.Project#getIssueCategories <em>Issue Categories</em>}</li>
 *   <li>{@link es.uca.spifm.spdt.genericTools.itm.Project#getMembers <em>Members</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uca.spifm.spdt.genericTools.itm.ItmPackage#getProject()
 * @model annotation="comment comment='Clase que representa a un proyecto software controlado desde la herramienta.'"
 * @generated
 */
public interface Project extends EObject {
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
	 * @see es.uca.spifm.spdt.genericTools.itm.ItmPackage#getProject_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link es.uca.spifm.spdt.genericTools.itm.Project#getName <em>Name</em>}' attribute.
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
	 * @see es.uca.spifm.spdt.genericTools.itm.ItmPackage#getProject_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link es.uca.spifm.spdt.genericTools.itm.Project#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Versions</b></em>' containment reference list.
	 * The list contents are of type {@link es.uca.spifm.spdt.genericTools.itm.Version}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Versions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Versions</em>' containment reference list.
	 * @see es.uca.spifm.spdt.genericTools.itm.ItmPackage#getProject_Versions()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Version> getVersions();

	/**
	 * Returns the value of the '<em><b>Issue Categories</b></em>' containment reference list.
	 * The list contents are of type {@link es.uca.spifm.spdt.genericTools.itm.IssueCategory}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Issue Categories</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Issue Categories</em>' containment reference list.
	 * @see es.uca.spifm.spdt.genericTools.itm.ItmPackage#getProject_IssueCategories()
	 * @model containment="true"
	 * @generated
	 */
	EList<IssueCategory> getIssueCategories();

	/**
	 * Returns the value of the '<em><b>Members</b></em>' containment reference list.
	 * The list contents are of type {@link es.uca.spifm.spdt.genericTools.itm.Member}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Members</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Members</em>' containment reference list.
	 * @see es.uca.spifm.spdt.genericTools.itm.ItmPackage#getProject_Members()
	 * @model containment="true"
	 * @generated
	 */
	EList<Member> getMembers();

} // Project
