/**
 * Created by Ivan Ruiz
 */
package es.uca.spifm.spdt.genericTools.itm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Issue Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uca.spifm.spdt.genericTools.itm.IssueDependency#getType <em>Type</em>}</li>
 *   <li>{@link es.uca.spifm.spdt.genericTools.itm.IssueDependency#getDependentTask <em>Dependent Task</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uca.spifm.spdt.genericTools.itm.ItmPackage#getIssueDependency()
 * @model
 * @generated
 */
public interface IssueDependency extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link es.uca.spifm.spdt.genericTools.itm.DependencyType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see es.uca.spifm.spdt.genericTools.itm.DependencyType
	 * @see #setType(DependencyType)
	 * @see es.uca.spifm.spdt.genericTools.itm.ItmPackage#getIssueDependency_Type()
	 * @model
	 * @generated
	 */
	DependencyType getType();

	/**
	 * Sets the value of the '{@link es.uca.spifm.spdt.genericTools.itm.IssueDependency#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see es.uca.spifm.spdt.genericTools.itm.DependencyType
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
	 * @see #setDependentTask(Issue)
	 * @see es.uca.spifm.spdt.genericTools.itm.ItmPackage#getIssueDependency_DependentTask()
	 * @model required="true"
	 * @generated
	 */
	Issue getDependentTask();

	/**
	 * Sets the value of the '{@link es.uca.spifm.spdt.genericTools.itm.IssueDependency#getDependentTask <em>Dependent Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dependent Task</em>' reference.
	 * @see #getDependentTask()
	 * @generated
	 */
	void setDependentTask(Issue value);

} // IssueDependency
