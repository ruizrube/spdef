/**
 * Created by Ivan Ruiz
 */
package es.uca.spifm.spdt.genericTools.wikim;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uca.spifm.spdt.genericTools.wikim.ItemList#getItems <em>Items</em>}</li>
 *   <li>{@link es.uca.spifm.spdt.genericTools.wikim.ItemList#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uca.spifm.spdt.genericTools.wikim.WikimPackage#getItemList()
 * @model annotation="comment comment='Clase que representa un lista de items.'"
 * @generated
 */
public interface ItemList extends SectionContent {
	/**
	 * Returns the value of the '<em><b>Items</b></em>' containment reference list.
	 * The list contents are of type {@link es.uca.spifm.spdt.genericTools.wikim.Item}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Items</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' containment reference list.
	 * @see es.uca.spifm.spdt.genericTools.wikim.WikimPackage#getItemList_Items()
	 * @model containment="true"
	 * @generated
	 */
	EList<Item> getItems();

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
	 * @see es.uca.spifm.spdt.genericTools.wikim.WikimPackage#getItemList_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link es.uca.spifm.spdt.genericTools.wikim.ItemList#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // ItemList
