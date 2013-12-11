/**
 * Designed by Ivan Ruiz
 */
package es.uca.spifm.spdt.deployment.spcm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uca.spifm.spdt.deployment.spcm.Task#getName <em>Name</em>}</li>
 *   <li>{@link es.uca.spifm.spdt.deployment.spcm.Task#getDescription <em>Description</em>}</li>
 *   <li>{@link es.uca.spifm.spdt.deployment.spcm.Task#getResponsible <em>Responsible</em>}</li>
 *   <li>{@link es.uca.spifm.spdt.deployment.spcm.Task#getCategory <em>Category</em>}</li>
 *   <li>{@link es.uca.spifm.spdt.deployment.spcm.Task#getDependencies <em>Dependencies</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uca.spifm.spdt.deployment.spcm.SpcmPackage#getTask()
 * @model annotation="comment comment='Clase que define la acci\363n de realizar una labor necesaria para conseguir los objetivos del proyecto.'"
 * @generated
 */
public interface Task extends EObject {
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
	 * @see es.uca.spifm.spdt.deployment.spcm.SpcmPackage#getTask_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link es.uca.spifm.spdt.deployment.spcm.Task#getName <em>Name</em>}' attribute.
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
	 * @see es.uca.spifm.spdt.deployment.spcm.SpcmPackage#getTask_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link es.uca.spifm.spdt.deployment.spcm.Task#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Responsible</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Responsible</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responsible</em>' reference.
	 * @see #setResponsible(Role)
	 * @see es.uca.spifm.spdt.deployment.spcm.SpcmPackage#getTask_Responsible()
	 * @model
	 * @generated
	 */
	Role getResponsible();

	/**
	 * Sets the value of the '{@link es.uca.spifm.spdt.deployment.spcm.Task#getResponsible <em>Responsible</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Responsible</em>' reference.
	 * @see #getResponsible()
	 * @generated
	 */
	void setResponsible(Role value);

	/**
	 * Returns the value of the '<em><b>Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' reference.
	 * @see #setCategory(TaskCategory)
	 * @see es.uca.spifm.spdt.deployment.spcm.SpcmPackage#getTask_Category()
	 * @model
	 * @generated
	 */
	TaskCategory getCategory();

	/**
	 * Sets the value of the '{@link es.uca.spifm.spdt.deployment.spcm.Task#getCategory <em>Category</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' reference.
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(TaskCategory value);

	/**
	 * Returns the value of the '<em><b>Dependencies</b></em>' containment reference list.
	 * The list contents are of type {@link es.uca.spifm.spdt.deployment.spcm.TaskDependency}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependencies</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependencies</em>' containment reference list.
	 * @see es.uca.spifm.spdt.deployment.spcm.SpcmPackage#getTask_Dependencies()
	 * @model containment="true"
	 * @generated
	 */
	EList<TaskDependency> getDependencies();

} // Task
