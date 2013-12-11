/**
 * Created by Ivan Ruiz
 */
package es.uca.spifm.spdt.genericTools.itm;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Issue</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uca.spifm.spdt.genericTools.itm.Issue#getName <em>Name</em>}</li>
 *   <li>{@link es.uca.spifm.spdt.genericTools.itm.Issue#getDescription <em>Description</em>}</li>
 *   <li>{@link es.uca.spifm.spdt.genericTools.itm.Issue#getDoneRatio <em>Done Ratio</em>}</li>
 *   <li>{@link es.uca.spifm.spdt.genericTools.itm.Issue#getEstimatedHours <em>Estimated Hours</em>}</li>
 *   <li>{@link es.uca.spifm.spdt.genericTools.itm.Issue#getElapsedHours <em>Elapsed Hours</em>}</li>
 *   <li>{@link es.uca.spifm.spdt.genericTools.itm.Issue#getTracker <em>Tracker</em>}</li>
 *   <li>{@link es.uca.spifm.spdt.genericTools.itm.Issue#getStatus <em>Status</em>}</li>
 *   <li>{@link es.uca.spifm.spdt.genericTools.itm.Issue#getDependencies <em>Dependencies</em>}</li>
 *   <li>{@link es.uca.spifm.spdt.genericTools.itm.Issue#getCategory <em>Category</em>}</li>
 *   <li>{@link es.uca.spifm.spdt.genericTools.itm.Issue#getPriority <em>Priority</em>}</li>
 *   <li>{@link es.uca.spifm.spdt.genericTools.itm.Issue#getDueDate <em>Due Date</em>}</li>
 *   <li>{@link es.uca.spifm.spdt.genericTools.itm.Issue#getCompletedDate <em>Completed Date</em>}</li>
 *   <li>{@link es.uca.spifm.spdt.genericTools.itm.Issue#getOwner <em>Owner</em>}</li>
 *   <li>{@link es.uca.spifm.spdt.genericTools.itm.Issue#getResponsible <em>Responsible</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uca.spifm.spdt.genericTools.itm.ItmPackage#getIssue()
 * @model annotation="comment comment='Clase para describir una tarea o unidad concreta de trabajo, necesaria para evolucionar un sistema inform\341tico, como a\361adir una nueva caracter\355stica, arreglo de un fallo, etc.'"
 * @generated
 */
public interface Issue extends EObject {
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
	 * @see es.uca.spifm.spdt.genericTools.itm.ItmPackage#getIssue_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link es.uca.spifm.spdt.genericTools.itm.Issue#getName <em>Name</em>}' attribute.
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
	 * @see es.uca.spifm.spdt.genericTools.itm.ItmPackage#getIssue_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link es.uca.spifm.spdt.genericTools.itm.Issue#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Done Ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Done Ratio</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Done Ratio</em>' attribute.
	 * @see #setDoneRatio(float)
	 * @see es.uca.spifm.spdt.genericTools.itm.ItmPackage#getIssue_DoneRatio()
	 * @model
	 * @generated
	 */
	float getDoneRatio();

	/**
	 * Sets the value of the '{@link es.uca.spifm.spdt.genericTools.itm.Issue#getDoneRatio <em>Done Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Done Ratio</em>' attribute.
	 * @see #getDoneRatio()
	 * @generated
	 */
	void setDoneRatio(float value);

	/**
	 * Returns the value of the '<em><b>Estimated Hours</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Estimated Hours</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estimated Hours</em>' attribute.
	 * @see #setEstimatedHours(float)
	 * @see es.uca.spifm.spdt.genericTools.itm.ItmPackage#getIssue_EstimatedHours()
	 * @model
	 * @generated
	 */
	float getEstimatedHours();

	/**
	 * Sets the value of the '{@link es.uca.spifm.spdt.genericTools.itm.Issue#getEstimatedHours <em>Estimated Hours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estimated Hours</em>' attribute.
	 * @see #getEstimatedHours()
	 * @generated
	 */
	void setEstimatedHours(float value);

	/**
	 * Returns the value of the '<em><b>Elapsed Hours</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elapsed Hours</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elapsed Hours</em>' attribute.
	 * @see #setElapsedHours(float)
	 * @see es.uca.spifm.spdt.genericTools.itm.ItmPackage#getIssue_ElapsedHours()
	 * @model
	 * @generated
	 */
	float getElapsedHours();

	/**
	 * Sets the value of the '{@link es.uca.spifm.spdt.genericTools.itm.Issue#getElapsedHours <em>Elapsed Hours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elapsed Hours</em>' attribute.
	 * @see #getElapsedHours()
	 * @generated
	 */
	void setElapsedHours(float value);

	/**
	 * Returns the value of the '<em><b>Tracker</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tracker</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tracker</em>' reference.
	 * @see #setTracker(Tracker)
	 * @see es.uca.spifm.spdt.genericTools.itm.ItmPackage#getIssue_Tracker()
	 * @model required="true"
	 * @generated
	 */
	Tracker getTracker();

	/**
	 * Sets the value of the '{@link es.uca.spifm.spdt.genericTools.itm.Issue#getTracker <em>Tracker</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tracker</em>' reference.
	 * @see #getTracker()
	 * @generated
	 */
	void setTracker(Tracker value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link es.uca.spifm.spdt.genericTools.itm.IssueStatus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see es.uca.spifm.spdt.genericTools.itm.IssueStatus
	 * @see #setStatus(IssueStatus)
	 * @see es.uca.spifm.spdt.genericTools.itm.ItmPackage#getIssue_Status()
	 * @model
	 * @generated
	 */
	IssueStatus getStatus();

	/**
	 * Sets the value of the '{@link es.uca.spifm.spdt.genericTools.itm.Issue#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see es.uca.spifm.spdt.genericTools.itm.IssueStatus
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(IssueStatus value);

	/**
	 * Returns the value of the '<em><b>Dependencies</b></em>' containment reference list.
	 * The list contents are of type {@link es.uca.spifm.spdt.genericTools.itm.IssueDependency}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependencies</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependencies</em>' containment reference list.
	 * @see es.uca.spifm.spdt.genericTools.itm.ItmPackage#getIssue_Dependencies()
	 * @model containment="true"
	 * @generated
	 */
	EList<IssueDependency> getDependencies();

	/**
	 * Returns the value of the '<em><b>Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' reference.
	 * @see #setCategory(IssueCategory)
	 * @see es.uca.spifm.spdt.genericTools.itm.ItmPackage#getIssue_Category()
	 * @model
	 * @generated
	 */
	IssueCategory getCategory();

	/**
	 * Sets the value of the '{@link es.uca.spifm.spdt.genericTools.itm.Issue#getCategory <em>Category</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' reference.
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(IssueCategory value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * The literals are from the enumeration {@link es.uca.spifm.spdt.genericTools.itm.IssuePriority}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see es.uca.spifm.spdt.genericTools.itm.IssuePriority
	 * @see #setPriority(IssuePriority)
	 * @see es.uca.spifm.spdt.genericTools.itm.ItmPackage#getIssue_Priority()
	 * @model
	 * @generated
	 */
	IssuePriority getPriority();

	/**
	 * Sets the value of the '{@link es.uca.spifm.spdt.genericTools.itm.Issue#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see es.uca.spifm.spdt.genericTools.itm.IssuePriority
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(IssuePriority value);

	/**
	 * Returns the value of the '<em><b>Due Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Due Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Due Date</em>' attribute.
	 * @see #setDueDate(Date)
	 * @see es.uca.spifm.spdt.genericTools.itm.ItmPackage#getIssue_DueDate()
	 * @model
	 * @generated
	 */
	Date getDueDate();

	/**
	 * Sets the value of the '{@link es.uca.spifm.spdt.genericTools.itm.Issue#getDueDate <em>Due Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Due Date</em>' attribute.
	 * @see #getDueDate()
	 * @generated
	 */
	void setDueDate(Date value);

	/**
	 * Returns the value of the '<em><b>Completed Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Completed Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Completed Date</em>' attribute.
	 * @see #setCompletedDate(Date)
	 * @see es.uca.spifm.spdt.genericTools.itm.ItmPackage#getIssue_CompletedDate()
	 * @model
	 * @generated
	 */
	Date getCompletedDate();

	/**
	 * Sets the value of the '{@link es.uca.spifm.spdt.genericTools.itm.Issue#getCompletedDate <em>Completed Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Completed Date</em>' attribute.
	 * @see #getCompletedDate()
	 * @generated
	 */
	void setCompletedDate(Date value);

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' reference.
	 * @see #setOwner(Member)
	 * @see es.uca.spifm.spdt.genericTools.itm.ItmPackage#getIssue_Owner()
	 * @model required="true"
	 * @generated
	 */
	Member getOwner();

	/**
	 * Sets the value of the '{@link es.uca.spifm.spdt.genericTools.itm.Issue#getOwner <em>Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(Member value);

	/**
	 * Returns the value of the '<em><b>Responsible</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Responsible</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responsible</em>' reference.
	 * @see #setResponsible(Member)
	 * @see es.uca.spifm.spdt.genericTools.itm.ItmPackage#getIssue_Responsible()
	 * @model required="true"
	 * @generated
	 */
	Member getResponsible();

	/**
	 * Sets the value of the '{@link es.uca.spifm.spdt.genericTools.itm.Issue#getResponsible <em>Responsible</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Responsible</em>' reference.
	 * @see #getResponsible()
	 * @generated
	 */
	void setResponsible(Member value);

} // Issue
