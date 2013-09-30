/**
 * Designed by Ivan Ruiz
 */
package es.uca.spifm.spdt.deployment.spcm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uca.spifm.spdt.deployment.spcm.TaskDependency#getType <em>Type</em>}</li>
 *   <li>{@link es.uca.spifm.spdt.deployment.spcm.TaskDependency#getDependentTask <em>Dependent Task</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uca.spifm.spdt.deployment.spcm.SpcmPackage#getTaskDependency()
 * @model
 * @generated
 */
public interface TaskDependency extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link es.uca.spifm.spdt.deployment.spcm.DependencyType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see es.uca.spifm.spdt.deployment.spcm.DependencyType
	 * @see #setType(DependencyType)
	 * @see es.uca.spifm.spdt.deployment.spcm.SpcmPackage#getTaskDependency_Type()
	 * @model
	 * @generated
	 */
	DependencyType getType();

	/**
	 * Sets the value of the '{@link es.uca.spifm.spdt.deployment.spcm.TaskDependency#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see es.uca.spifm.spdt.deployment.spcm.DependencyType
	 * @see #getType()
	 * @generated
	 */
	void setType(DependencyType value);

	/**
	 * Returns the value of the '<em><b>Dependent Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependent Task</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependent Task</em>' reference.
	 * @see #setDependentTask(Task)
	 * @see es.uca.spifm.spdt.deployment.spcm.SpcmPackage#getTaskDependency_DependentTask()
	 * @model required="true"
	 * @generated
	 */
	Task getDependentTask();

	/**
	 * Sets the value of the '{@link es.uca.spifm.spdt.deployment.spcm.TaskDependency#getDependentTask <em>Dependent Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dependent Task</em>' reference.
	 * @see #getDependentTask()
	 * @generated
	 */
	void setDependentTask(Task value);

} // TaskDependency
