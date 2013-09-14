/**
 * Created by Ivan Ruiz
 */
package es.uca.spifm.spdt.specificTools.wikim;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Category</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uca.spifm.spdt.specificTools.wikim.Category#getParentCategory <em>Parent Category</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uca.spifm.spdt.specificTools.wikim.WikimPackage#getCategory()
 * @model
 * @generated
 */
public interface Category extends WikiContent {
	/**
	 * Returns the value of the '<em><b>Parent Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Category</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Category</em>' reference.
	 * @see #setParentCategory(Category)
	 * @see es.uca.spifm.spdt.specificTools.wikim.WikimPackage#getCategory_ParentCategory()
	 * @model
	 * @generated
	 */
	Category getParentCategory();

	/**
	 * Sets the value of the '{@link es.uca.spifm.spdt.specificTools.wikim.Category#getParentCategory <em>Parent Category</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Category</em>' reference.
	 * @see #getParentCategory()
	 * @generated
	 */
	void setParentCategory(Category value);

} // Category
