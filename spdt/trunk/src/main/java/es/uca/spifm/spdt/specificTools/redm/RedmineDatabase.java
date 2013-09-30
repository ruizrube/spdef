/**
 * Created by Ivan Ruiz
 */
package es.uca.spifm.spdt.specificTools.redm;

import es.uca.spifm.spdt.genericTools.itm.IssueTrackingDatabase;

import es.uca.spifm.spdt.genericTools.wikim.WikiDatabase;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Redmine Database</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uca.spifm.spdt.specificTools.redm.RedmineDatabase#getWikiDatabase <em>Wiki Database</em>}</li>
 *   <li>{@link es.uca.spifm.spdt.specificTools.redm.RedmineDatabase#getApiAccessKey <em>Api Access Key</em>}</li>
 *   <li>{@link es.uca.spifm.spdt.specificTools.redm.RedmineDatabase#getUrl <em>Url</em>}</li>
 *   <li>{@link es.uca.spifm.spdt.specificTools.redm.RedmineDatabase#getIssueTrackingDatabase <em>Issue Tracking Database</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uca.spifm.spdt.specificTools.redm.RedmPackage#getRedmineDatabase()
 * @model
 * @generated
 */
public interface RedmineDatabase extends EObject {
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
	 * @see es.uca.spifm.spdt.specificTools.redm.RedmPackage#getRedmineDatabase_WikiDatabase()
	 * @model
	 * @generated
	 */
	WikiDatabase getWikiDatabase();

	/**
	 * Sets the value of the '{@link es.uca.spifm.spdt.specificTools.redm.RedmineDatabase#getWikiDatabase <em>Wiki Database</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wiki Database</em>' reference.
	 * @see #getWikiDatabase()
	 * @generated
	 */
	void setWikiDatabase(WikiDatabase value);

	/**
	 * Returns the value of the '<em><b>Api Access Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Api Access Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Api Access Key</em>' attribute.
	 * @see #setApiAccessKey(String)
	 * @see es.uca.spifm.spdt.specificTools.redm.RedmPackage#getRedmineDatabase_ApiAccessKey()
	 * @model
	 * @generated
	 */
	String getApiAccessKey();

	/**
	 * Sets the value of the '{@link es.uca.spifm.spdt.specificTools.redm.RedmineDatabase#getApiAccessKey <em>Api Access Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Api Access Key</em>' attribute.
	 * @see #getApiAccessKey()
	 * @generated
	 */
	void setApiAccessKey(String value);

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
	 * @see es.uca.spifm.spdt.specificTools.redm.RedmPackage#getRedmineDatabase_Url()
	 * @model
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link es.uca.spifm.spdt.specificTools.redm.RedmineDatabase#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

	/**
	 * Returns the value of the '<em><b>Issue Tracking Database</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Issue Tracking Database</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Issue Tracking Database</em>' reference.
	 * @see #setIssueTrackingDatabase(IssueTrackingDatabase)
	 * @see es.uca.spifm.spdt.specificTools.redm.RedmPackage#getRedmineDatabase_IssueTrackingDatabase()
	 * @model
	 * @generated
	 */
	IssueTrackingDatabase getIssueTrackingDatabase();

	/**
	 * Sets the value of the '{@link es.uca.spifm.spdt.specificTools.redm.RedmineDatabase#getIssueTrackingDatabase <em>Issue Tracking Database</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issue Tracking Database</em>' reference.
	 * @see #getIssueTrackingDatabase()
	 * @generated
	 */
	void setIssueTrackingDatabase(IssueTrackingDatabase value);

} // RedmineDatabase
