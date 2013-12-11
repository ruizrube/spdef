/**
 * Designed by Ivan Ruiz
 */
package es.uca.spifm.spdt.deployment.swpm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deliverable Product</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uca.spifm.spdt.deployment.swpm.DeliverableProduct#getEmbeddedWorkproducts <em>Embedded Workproducts</em>}</li>
 *   <li>{@link es.uca.spifm.spdt.deployment.swpm.DeliverableProduct#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uca.spifm.spdt.deployment.swpm.SwpmPackage#getDeliverableProduct()
 * @model annotation="comment comment='Clase abstracta que representa un producto de trabajo desarrollado durante el transcurso de un proyecto software y con valor para terceros.'"
 * @generated
 */
public interface DeliverableProduct extends WorkProduct {
	/**
	 * Returns the value of the '<em><b>Embedded Workproducts</b></em>' reference list.
	 * The list contents are of type {@link es.uca.spifm.spdt.deployment.swpm.WorkProduct}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Embedded Workproducts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Embedded Workproducts</em>' reference list.
	 * @see es.uca.spifm.spdt.deployment.swpm.SwpmPackage#getDeliverableProduct_EmbeddedWorkproducts()
	 * @model
	 * @generated
	 */
	EList<WorkProduct> getEmbeddedWorkproducts();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link es.uca.spifm.spdt.deployment.swpm.DeliverableType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see es.uca.spifm.spdt.deployment.swpm.DeliverableType
	 * @see #setType(DeliverableType)
	 * @see es.uca.spifm.spdt.deployment.swpm.SwpmPackage#getDeliverableProduct_Type()
	 * @model
	 * @generated
	 */
	DeliverableType getType();

	/**
	 * Sets the value of the '{@link es.uca.spifm.spdt.deployment.swpm.DeliverableProduct#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see es.uca.spifm.spdt.deployment.swpm.DeliverableType
	 * @see #getType()
	 * @generated
	 */
	void setType(DeliverableType value);

} // DeliverableProduct
