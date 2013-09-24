/**
 * Created by Ivan Ruiz
 */
package es.uca.spifm.spdt.specificTools.mwm;

import es.uca.spifm.spdt.genericTools.wikim.WikiDatabase;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Media Wiki Database</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uca.spifm.spdt.specificTools.mwm.MediaWikiDatabase#getWikiDatabase <em>Wiki Database</em>}</li>
 *   <li>{@link es.uca.spifm.spdt.specificTools.mwm.MediaWikiDatabase#getUrl <em>Url</em>}</li>
 *   <li>{@link es.uca.spifm.spdt.specificTools.mwm.MediaWikiDatabase#getLogin <em>Login</em>}</li>
 *   <li>{@link es.uca.spifm.spdt.specificTools.mwm.MediaWikiDatabase#getPassword <em>Password</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uca.spifm.spdt.specificTools.mwm.MwmPackage#getMediaWikiDatabase()
 * @model
 * @generated
 */
public interface MediaWikiDatabase extends EObject {
	/**
	 * Returns the value of the '<em><b>Wiki Database</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wiki Database</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wiki Database</em>' reference.
	 * @see #setWikiDatabase(WikiDatabase)
	 * @see es.uca.spifm.spdt.specificTools.mwm.MwmPackage#getMediaWikiDatabase_WikiDatabase()
	 * @model
	 * @generated
	 */
	WikiDatabase getWikiDatabase();

	/**
	 * Sets the value of the '{@link es.uca.spifm.spdt.specificTools.mwm.MediaWikiDatabase#getWikiDatabase <em>Wiki Database</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wiki Database</em>' reference.
	 * @see #getWikiDatabase()
	 * @generated
	 */
	void setWikiDatabase(WikiDatabase value);

	/**
	 * Returns the value of the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #setUrl(String)
	 * @see es.uca.spifm.spdt.specificTools.mwm.MwmPackage#getMediaWikiDatabase_Url()
	 * @model
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link es.uca.spifm.spdt.specificTools.mwm.MediaWikiDatabase#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

	/**
	 * Returns the value of the '<em><b>Login</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Login</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Login</em>' attribute.
	 * @see #setLogin(String)
	 * @see es.uca.spifm.spdt.specificTools.mwm.MwmPackage#getMediaWikiDatabase_Login()
	 * @model
	 * @generated
	 */
	String getLogin();

	/**
	 * Sets the value of the '{@link es.uca.spifm.spdt.specificTools.mwm.MediaWikiDatabase#getLogin <em>Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Login</em>' attribute.
	 * @see #getLogin()
	 * @generated
	 */
	void setLogin(String value);

	/**
	 * Returns the value of the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Password</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Password</em>' attribute.
	 * @see #setPassword(String)
	 * @see es.uca.spifm.spdt.specificTools.mwm.MwmPackage#getMediaWikiDatabase_Password()
	 * @model
	 * @generated
	 */
	String getPassword();

	/**
	 * Sets the value of the '{@link es.uca.spifm.spdt.specificTools.mwm.MediaWikiDatabase#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' attribute.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(String value);

} // MediaWikiDatabase
