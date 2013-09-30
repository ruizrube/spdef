/**
 * Created by Ivan Ruiz
 */
package es.uca.spifm.spdt.specificTools.redm.impl;

import es.uca.spifm.spdt.genericTools.itm.IssueTrackingDatabase;

import es.uca.spifm.spdt.genericTools.wikim.WikiDatabase;

import es.uca.spifm.spdt.specificTools.redm.RedmPackage;
import es.uca.spifm.spdt.specificTools.redm.RedmineDatabase;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Redmine Database</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.uca.spifm.spdt.specificTools.redm.impl.RedmineDatabaseImpl#getWikiDatabase <em>Wiki Database</em>}</li>
 *   <li>{@link es.uca.spifm.spdt.specificTools.redm.impl.RedmineDatabaseImpl#getApiAccessKey <em>Api Access Key</em>}</li>
 *   <li>{@link es.uca.spifm.spdt.specificTools.redm.impl.RedmineDatabaseImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link es.uca.spifm.spdt.specificTools.redm.impl.RedmineDatabaseImpl#getIssueTrackingDatabase <em>Issue Tracking Database</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RedmineDatabaseImpl extends MinimalEObjectImpl.Container implements RedmineDatabase {
	/**
	 * The cached value of the '{@link #getWikiDatabase() <em>Wiki Database</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWikiDatabase()
	 * @generated
	 * @ordered
	 */
	protected WikiDatabase wikiDatabase;

	/**
	 * The default value of the '{@link #getApiAccessKey() <em>Api Access Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApiAccessKey()
	 * @generated
	 * @ordered
	 */
	protected static final String API_ACCESS_KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getApiAccessKey() <em>Api Access Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApiAccessKey()
	 * @generated
	 * @ordered
	 */
	protected String apiAccessKey = API_ACCESS_KEY_EDEFAULT;

	/**
	 * The default value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected String url = URL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIssueTrackingDatabase() <em>Issue Tracking Database</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssueTrackingDatabase()
	 * @generated
	 * @ordered
	 */
	protected IssueTrackingDatabase issueTrackingDatabase;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RedmineDatabaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RedmPackage.Literals.REDMINE_DATABASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WikiDatabase getWikiDatabase() {
		if (wikiDatabase != null && wikiDatabase.eIsProxy()) {
			InternalEObject oldWikiDatabase = (InternalEObject)wikiDatabase;
			wikiDatabase = (WikiDatabase)eResolveProxy(oldWikiDatabase);
			if (wikiDatabase != oldWikiDatabase) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RedmPackage.REDMINE_DATABASE__WIKI_DATABASE, oldWikiDatabase, wikiDatabase));
			}
		}
		return wikiDatabase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WikiDatabase basicGetWikiDatabase() {
		return wikiDatabase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWikiDatabase(WikiDatabase newWikiDatabase) {
		WikiDatabase oldWikiDatabase = wikiDatabase;
		wikiDatabase = newWikiDatabase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RedmPackage.REDMINE_DATABASE__WIKI_DATABASE, oldWikiDatabase, wikiDatabase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getApiAccessKey() {
		return apiAccessKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApiAccessKey(String newApiAccessKey) {
		String oldApiAccessKey = apiAccessKey;
		apiAccessKey = newApiAccessKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RedmPackage.REDMINE_DATABASE__API_ACCESS_KEY, oldApiAccessKey, apiAccessKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUrl(String newUrl) {
		String oldUrl = url;
		url = newUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RedmPackage.REDMINE_DATABASE__URL, oldUrl, url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IssueTrackingDatabase getIssueTrackingDatabase() {
		if (issueTrackingDatabase != null && issueTrackingDatabase.eIsProxy()) {
			InternalEObject oldIssueTrackingDatabase = (InternalEObject)issueTrackingDatabase;
			issueTrackingDatabase = (IssueTrackingDatabase)eResolveProxy(oldIssueTrackingDatabase);
			if (issueTrackingDatabase != oldIssueTrackingDatabase) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RedmPackage.REDMINE_DATABASE__ISSUE_TRACKING_DATABASE, oldIssueTrackingDatabase, issueTrackingDatabase));
			}
		}
		return issueTrackingDatabase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IssueTrackingDatabase basicGetIssueTrackingDatabase() {
		return issueTrackingDatabase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIssueTrackingDatabase(IssueTrackingDatabase newIssueTrackingDatabase) {
		IssueTrackingDatabase oldIssueTrackingDatabase = issueTrackingDatabase;
		issueTrackingDatabase = newIssueTrackingDatabase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RedmPackage.REDMINE_DATABASE__ISSUE_TRACKING_DATABASE, oldIssueTrackingDatabase, issueTrackingDatabase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RedmPackage.REDMINE_DATABASE__WIKI_DATABASE:
				if (resolve) return getWikiDatabase();
				return basicGetWikiDatabase();
			case RedmPackage.REDMINE_DATABASE__API_ACCESS_KEY:
				return getApiAccessKey();
			case RedmPackage.REDMINE_DATABASE__URL:
				return getUrl();
			case RedmPackage.REDMINE_DATABASE__ISSUE_TRACKING_DATABASE:
				if (resolve) return getIssueTrackingDatabase();
				return basicGetIssueTrackingDatabase();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RedmPackage.REDMINE_DATABASE__WIKI_DATABASE:
				setWikiDatabase((WikiDatabase)newValue);
				return;
			case RedmPackage.REDMINE_DATABASE__API_ACCESS_KEY:
				setApiAccessKey((String)newValue);
				return;
			case RedmPackage.REDMINE_DATABASE__URL:
				setUrl((String)newValue);
				return;
			case RedmPackage.REDMINE_DATABASE__ISSUE_TRACKING_DATABASE:
				setIssueTrackingDatabase((IssueTrackingDatabase)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case RedmPackage.REDMINE_DATABASE__WIKI_DATABASE:
				setWikiDatabase((WikiDatabase)null);
				return;
			case RedmPackage.REDMINE_DATABASE__API_ACCESS_KEY:
				setApiAccessKey(API_ACCESS_KEY_EDEFAULT);
				return;
			case RedmPackage.REDMINE_DATABASE__URL:
				setUrl(URL_EDEFAULT);
				return;
			case RedmPackage.REDMINE_DATABASE__ISSUE_TRACKING_DATABASE:
				setIssueTrackingDatabase((IssueTrackingDatabase)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case RedmPackage.REDMINE_DATABASE__WIKI_DATABASE:
				return wikiDatabase != null;
			case RedmPackage.REDMINE_DATABASE__API_ACCESS_KEY:
				return API_ACCESS_KEY_EDEFAULT == null ? apiAccessKey != null : !API_ACCESS_KEY_EDEFAULT.equals(apiAccessKey);
			case RedmPackage.REDMINE_DATABASE__URL:
				return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
			case RedmPackage.REDMINE_DATABASE__ISSUE_TRACKING_DATABASE:
				return issueTrackingDatabase != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (apiAccessKey: ");
		result.append(apiAccessKey);
		result.append(", url: ");
		result.append(url);
		result.append(')');
		return result.toString();
	}

} //RedmineDatabaseImpl
