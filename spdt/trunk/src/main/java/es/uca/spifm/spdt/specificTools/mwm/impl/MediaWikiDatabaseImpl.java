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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MwmPackage.MEDIA_WIKI_DATABASE__WIKI_DATABASE:
				if (resolve) return getWikiDatabase();
				return basicGetWikiDatabase();
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
		}
		return super.eIsSet(featureID);
	}

} //MediaWikiDatabaseImpl
