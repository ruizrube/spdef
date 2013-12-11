/**
 * Created by Ivan Ruiz
 */
package es.uca.spifm.spdt.specificTools.mwm.impl;

import es.uca.spifm.spdt.genericTools.wikim.WikiDatabase;

import es.uca.spifm.spdt.specificTools.mwm.MediaWikiDatabase;
import es.uca.spifm.spdt.specificTools.mwm.MwmPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Media Wiki Database</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.uca.spifm.spdt.specificTools.mwm.impl.MediaWikiDatabaseImpl#getWikiDatabase <em>Wiki Database</em>}</li>
 *   <li>{@link es.uca.spifm.spdt.specificTools.mwm.impl.MediaWikiDatabaseImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link es.uca.spifm.spdt.specificTools.mwm.impl.MediaWikiDatabaseImpl#getLogin <em>Login</em>}</li>
 *   <li>{@link es.uca.spifm.spdt.specificTools.mwm.impl.MediaWikiDatabaseImpl#getPassword <em>Password</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MediaWikiDatabaseImpl extends MinimalEObjectImpl.Container implements MediaWikiDatabase {
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
	 * The default value of the '{@link #getLogin() <em>Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogin()
	 * @generated
	 * @ordered
	 */
	protected static final String LOGIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLogin() <em>Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogin()
	 * @generated
	 * @ordered
	 */
	protected String login = LOGIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected static final String PASSWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected String password = PASSWORD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MediaWikiDatabaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MwmPackage.Literals.MEDIA_WIKI_DATABASE;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MwmPackage.MEDIA_WIKI_DATABASE__WIKI_DATABASE, oldWikiDatabase, wikiDatabase));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MwmPackage.MEDIA_WIKI_DATABASE__WIKI_DATABASE, oldWikiDatabase, wikiDatabase));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MwmPackage.MEDIA_WIKI_DATABASE__URL, oldUrl, url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLogin() {
		return login;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLogin(String newLogin) {
		String oldLogin = login;
		login = newLogin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MwmPackage.MEDIA_WIKI_DATABASE__LOGIN, oldLogin, login));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassword(String newPassword) {
		String oldPassword = password;
		password = newPassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MwmPackage.MEDIA_WIKI_DATABASE__PASSWORD, oldPassword, password));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MwmPackage.MEDIA_WIKI_DATABASE__WIKI_DATABASE:
				if (resolve) return getWikiDatabase();
				return basicGetWikiDatabase();
			case MwmPackage.MEDIA_WIKI_DATABASE__URL:
				return getUrl();
			case MwmPackage.MEDIA_WIKI_DATABASE__LOGIN:
				return getLogin();
			case MwmPackage.MEDIA_WIKI_DATABASE__PASSWORD:
				return getPassword();
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
			case MwmPackage.MEDIA_WIKI_DATABASE__WIKI_DATABASE:
				setWikiDatabase((WikiDatabase)newValue);
				return;
			case MwmPackage.MEDIA_WIKI_DATABASE__URL:
				setUrl((String)newValue);
				return;
			case MwmPackage.MEDIA_WIKI_DATABASE__LOGIN:
				setLogin((String)newValue);
				return;
			case MwmPackage.MEDIA_WIKI_DATABASE__PASSWORD:
				setPassword((String)newValue);
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
			case MwmPackage.MEDIA_WIKI_DATABASE__WIKI_DATABASE:
				setWikiDatabase((WikiDatabase)null);
				return;
			case MwmPackage.MEDIA_WIKI_DATABASE__URL:
				setUrl(URL_EDEFAULT);
				return;
			case MwmPackage.MEDIA_WIKI_DATABASE__LOGIN:
				setLogin(LOGIN_EDEFAULT);
				return;
			case MwmPackage.MEDIA_WIKI_DATABASE__PASSWORD:
				setPassword(PASSWORD_EDEFAULT);
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
			case MwmPackage.MEDIA_WIKI_DATABASE__WIKI_DATABASE:
				return wikiDatabase != null;
			case MwmPackage.MEDIA_WIKI_DATABASE__URL:
				return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
			case MwmPackage.MEDIA_WIKI_DATABASE__LOGIN:
				return LOGIN_EDEFAULT == null ? login != null : !LOGIN_EDEFAULT.equals(login);
			case MwmPackage.MEDIA_WIKI_DATABASE__PASSWORD:
				return PASSWORD_EDEFAULT == null ? password != null : !PASSWORD_EDEFAULT.equals(password);
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
		result.append(" (url: ");
		result.append(url);
		result.append(", login: ");
		result.append(login);
		result.append(", password: ");
		result.append(password);
		result.append(')');
		return result.toString();
	}

} //MediaWikiDatabaseImpl
