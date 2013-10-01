/**
 * Designed by Ivan Ruiz
 */
package es.uca.spifm.spdt.deployment.spcm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Milestone</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uca.spifm.spdt.deployment.spcm.Milestone#getDescription <em>Description</em>}</li>
 *   <li>{@link es.uca.spifm.spdt.deployment.spcm.Milestone#getName <em>Name</em>}</li>
 *   <li>{@link es.uca.spifm.spdt.deployment.spcm.Milestone#getTasks <em>Tasks</em>}</li>
 *   <li>{@link es.uca.spifm.spdt.deployment.spcm.Milestone#getStatus <em>Status</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uca.spifm.spdt.deployment.spcm.SpcmPackage#getMilestone()
 * @model
 * @generated
 */
public interface Milestone extends EObject {
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
	 * @see es.uca.spifm.spdt.deployment.spcm.SpcmPackage#getMilestone_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link es.uca.spifm.spdt.deployment.spcm.Milestone#getDescription <em>Description</em>}' attribute.
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
	 * @see es.uca.spifm.spdt.deployment.spcm.SpcmPackage#getMilestone_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link es.uca.spifm.spdt.deployment.spcm.Milestone#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Tasks</b></em>' containment reference list.
	 * The list contents are of type {@link es.uca.spifm.spdt.deployment.spcm.Task}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tasks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tasks</em>' containment reference list.
	 * @see es.uca.spifm.spdt.deployment.spcm.SpcmPackage#getMilestone_Tasks()
	 * @model containment="true"
	 * @generated
	 */
	EList<Task> getTasks();

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link es.uca.spifm.spdt.deployment.spcm.MilestoneStatus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see es.uca.spifm.spdt.deployment.spcm.MilestoneStatus
	 * @see #setStatus(MilestoneStatus)
	 * @see es.uca.spifm.spdt.deployment.spcm.SpcmPackage#getMilestone_Status()
	 * @model
	 * @generated
	 */
	MilestoneStatus getStatus();

	/**
	 * Sets the value of the '{@link es.uca.spifm.spdt.deployment.spcm.Milestone#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see es.uca.spifm.spdt.deployment.spcm.MilestoneStatus
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(MilestoneStatus value);

} // Milestone
