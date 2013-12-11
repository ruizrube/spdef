/**
 * Created by Ivan Ruiz
 */
package es.uca.spifm.spdt.genericTools.vmm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uca.spifm.spdt.genericTools.vmm.Package#getDiagrams <em>Diagrams</em>}</li>
 *   <li>{@link es.uca.spifm.spdt.genericTools.vmm.Package#getName <em>Name</em>}</li>
 *   <li>{@link es.uca.spifm.spdt.genericTools.vmm.Package#getDescription <em>Description</em>}</li>
 *   <li>{@link es.uca.spifm.spdt.genericTools.vmm.Package#getEmbeddedPackages <em>Embedded Packages</em>}</li>
 *   <li>{@link es.uca.spifm.spdt.genericTools.vmm.Package#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uca.spifm.spdt.genericTools.vmm.VmmPackage#getPackage()
 * @model annotation="comment comment='Clase que representa a un paquete de modelos, con el cual organizar los diferentes modelos.'"
 * @generated
 */
public interface Package extends EObject {
	/**
	 * Returns the value of the '<em><b>Diagrams</b></em>' containment reference list.
	 * The list contents are of type {@link es.uca.spifm.spdt.genericTools.vmm.Diagram}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diagrams</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagrams</em>' containment reference list.
	 * @see es.uca.spifm.spdt.genericTools.vmm.VmmPackage#getPackage_Diagrams()
	 * @model containment="true"
	 * @generated
	 */
	EList<Diagram> getDiagrams();

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
	 * @see es.uca.spifm.spdt.genericTools.vmm.VmmPackage#getPackage_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link es.uca.spifm.spdt.genericTools.vmm.Package#getName <em>Name</em>}' attribute.
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
	 * @see es.uca.spifm.spdt.genericTools.vmm.VmmPackage#getPackage_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link es.uca.spifm.spdt.genericTools.vmm.Package#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Embedded Packages</b></em>' containment reference list.
	 * The list contents are of type {@link es.uca.spifm.spdt.genericTools.vmm.Package}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Embedded Packages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Embedded Packages</em>' containment reference list.
	 * @see es.uca.spifm.spdt.genericTools.vmm.VmmPackage#getPackage_EmbeddedPackages()
	 * @model containment="true"
	 * @generated
	 */
	EList<Package> getEmbeddedPackages();

	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link es.uca.spifm.spdt.genericTools.vmm.Element}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see es.uca.spifm.spdt.genericTools.vmm.VmmPackage#getPackage_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Element> getElements();

} // Package
