/**
 * Created by Ivan Ruiz
 */
package es.uca.spifm.spdt.genericTools.wikim;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uca.spifm.spdt.genericTools.wikim.Section#getEmbeddedSections <em>Embedded Sections</em>}</li>
 *   <li>{@link es.uca.spifm.spdt.genericTools.wikim.Section#getTitle <em>Title</em>}</li>
 *   <li>{@link es.uca.spifm.spdt.genericTools.wikim.Section#getText <em>Text</em>}</li>
 *   <li>{@link es.uca.spifm.spdt.genericTools.wikim.Section#getContents <em>Contents</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uca.spifm.spdt.genericTools.wikim.WikimPackage#getSection()
 * @model
 * @generated
 */
public interface Section extends EObject {
	/**
	 * Returns the value of the '<em><b>Embedded Sections</b></em>' containment reference list.
	 * The list contents are of type {@link es.uca.spifm.spdt.genericTools.wikim.Section}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Embedded Sections</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Embedded Sections</em>' containment reference list.
	 * @see es.uca.spifm.spdt.genericTools.wikim.WikimPackage#getSection_EmbeddedSections()
	 * @model containment="true"
	 * @generated
	 */
	EList<Section> getEmbeddedSections();

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see es.uca.spifm.spdt.genericTools.wikim.WikimPackage#getSection_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link es.uca.spifm.spdt.genericTools.wikim.Section#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see es.uca.spifm.spdt.genericTools.wikim.WikimPackage#getSection_Text()
	 * @model
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link es.uca.spifm.spdt.genericTools.wikim.Section#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Returns the value of the '<em><b>Contents</b></em>' containment reference list.
	 * The list contents are of type {@link es.uca.spifm.spdt.genericTools.wikim.SectionContent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contents</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contents</em>' containment reference list.
	 * @see es.uca.spifm.spdt.genericTools.wikim.WikimPackage#getSection_Contents()
	 * @model containment="true"
	 * @generated
	 */
	EList<SectionContent> getContents();

} // Section
