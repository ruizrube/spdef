/**
 * Designed by Ivan Ruiz
 */
package es.uca.spifm.spdt.deployment.swpm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Code Work Product</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uca.spifm.spdt.deployment.swpm.CodeWorkProduct#getPackages <em>Packages</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uca.spifm.spdt.deployment.swpm.SwpmPackage#getCodeWorkProduct()
 * @model
 * @generated
 */
public interface CodeWorkProduct extends InternalProduct {
	/**
	 * Returns the value of the '<em><b>Packages</b></em>' containment reference list.
	 * The list contents are of type {@link es.uca.spifm.spdt.deployment.swpm.SourcePackage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Packages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Packages</em>' containment reference list.
	 * @see es.uca.spifm.spdt.deployment.swpm.SwpmPackage#getCodeWorkProduct_Packages()
	 * @model containment="true"
	 * @generated
	 */
	EList<SourcePackage> getPackages();

} // CodeWorkProduct
