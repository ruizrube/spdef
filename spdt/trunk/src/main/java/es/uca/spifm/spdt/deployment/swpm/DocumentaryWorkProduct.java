/**
 * Designed by Ivan Ruiz
 */
package es.uca.spifm.spdt.deployment.swpm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Documentary Work Product</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uca.spifm.spdt.deployment.swpm.DocumentaryWorkProduct#getSections <em>Sections</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uca.spifm.spdt.deployment.swpm.SwpmPackage#getDocumentaryWorkProduct()
 * @model annotation="comment comment='Clase que representa un documento t\351cnico de trabajo.'"
 * @generated
 */
public interface DocumentaryWorkProduct extends InternalProduct {
	/**
	 * Returns the value of the '<em><b>Sections</b></em>' containment reference list.
	 * The list contents are of type {@link es.uca.spifm.spdt.deployment.swpm.Section}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sections</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sections</em>' containment reference list.
	 * @see es.uca.spifm.spdt.deployment.swpm.SwpmPackage#getDocumentaryWorkProduct_Sections()
	 * @model containment="true"
	 * @generated
	 */
	EList<Section> getSections();

} // DocumentaryWorkProduct
