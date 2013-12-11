/**
 * Designed by Ivan Ruiz
 */
package es.uca.spifm.spdt.deployment.spcm;

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
 *   <li>{@link es.uca.spifm.spdt.deployment.spcm.Project#getDescription <em>Description</em>}</li>
 *   <li>{@link es.uca.spifm.spdt.deployment.spcm.Project#getName <em>Name</em>}</li>
 *   <li>{@link es.uca.spifm.spdt.deployment.spcm.Project#getMilestones <em>Milestones</em>}</li>
 *   <li>{@link es.uca.spifm.spdt.deployment.spcm.Project#getMembers <em>Members</em>}</li>
 *   <li>{@link es.uca.spifm.spdt.deployment.spcm.Project#getTaskCategories <em>Task Categories</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uca.spifm.spdt.deployment.spcm.SpcmPackage#getProject()
 * @model annotation="comment comment='Clase contenedora de todos las tareas y milestones establecidos para la planificaci\363n y monitorizaci\363n de un proyecto software.'"
 * @generated
 */
public interface Project extends EObject {
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
	 * @see es.uca.spifm.spdt.deployment.spcm.SpcmPackage#getProject_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link es.uca.spifm.spdt.deployment.spcm.Project#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

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
	 * @see es.uca.spifm.spdt.deployment.spcm.SpcmPackage#getProject_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link es.uca.spifm.spdt.deployment.spcm.Project#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Milestones</b></em>' containment reference list.
	 * The list contents are of type {@link es.uca.spifm.spdt.deployment.spcm.Milestone}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Milestones</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Milestones</em>' containment reference list.
	 * @see es.uca.spifm.spdt.deployment.spcm.SpcmPackage#getProject_Milestones()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Milestone> getMilestones();

	/**
	 * Returns the value of the '<em><b>Members</b></em>' containment reference list.
	 * The list contents are of type {@link es.uca.spifm.spdt.deployment.spcm.Role}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Members</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Members</em>' containment reference list.
	 * @see es.uca.spifm.spdt.deployment.spcm.SpcmPackage#getProject_Members()
	 * @model containment="true"
	 * @generated
	 */
	EList<Role> getMembers();

	/**
	 * Returns the value of the '<em><b>Task Categories</b></em>' containment reference list.
	 * The list contents are of type {@link es.uca.spifm.spdt.deployment.spcm.TaskCategory}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task Categories</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task Categories</em>' containment reference list.
	 * @see es.uca.spifm.spdt.deployment.spcm.SpcmPackage#getProject_TaskCategories()
	 * @model containment="true"
	 * @generated
	 */
	EList<TaskCategory> getTaskCategories();

} // Project
