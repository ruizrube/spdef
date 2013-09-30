/**
 * Created by Ivan Ruiz
 */
package es.uca.spifm.spdt.genericTools.itm.impl;

import es.uca.spifm.spdt.genericTools.itm.Issue;
import es.uca.spifm.spdt.genericTools.itm.ItmPackage;
import es.uca.spifm.spdt.genericTools.itm.Version;
import es.uca.spifm.spdt.genericTools.itm.VersionStatus;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Version</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.uca.spifm.spdt.genericTools.itm.impl.VersionImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link es.uca.spifm.spdt.genericTools.itm.impl.VersionImpl#getName <em>Name</em>}</li>
 *   <li>{@link es.uca.spifm.spdt.genericTools.itm.impl.VersionImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link es.uca.spifm.spdt.genericTools.itm.impl.VersionImpl#getEffectiveDate <em>Effective Date</em>}</li>
 *   <li>{@link es.uca.spifm.spdt.genericTools.itm.impl.VersionImpl#getIssues <em>Issues</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VersionImpl extends MinimalEObjectImpl.Container implements Version {
	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final VersionStatus STATUS_EDEFAULT = VersionStatus.OPEN;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected VersionStatus status = STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getEffectiveDate() <em>Effective Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectiveDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date EFFECTIVE_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEffectiveDate() <em>Effective Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectiveDate()
	 * @generated
	 * @ordered
	 */
	protected Date effectiveDate = EFFECTIVE_DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIssues() <em>Issues</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssues()
	 * @generated
	 * @ordered
	 */
	protected EList<Issue> issues;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VersionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ItmPackage.Literals.VERSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ItmPackage.VERSION__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ItmPackage.VERSION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VersionStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(VersionStatus newStatus) {
		VersionStatus oldStatus = status;
		status = newStatus == null ? STATUS_EDEFAULT : newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ItmPackage.VERSION__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getEffectiveDate() {
		return effectiveDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEffectiveDate(Date newEffectiveDate) {
		Date oldEffectiveDate = effectiveDate;
		effectiveDate = newEffectiveDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ItmPackage.VERSION__EFFECTIVE_DATE, oldEffectiveDate, effectiveDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Issue> getIssues() {
		if (issues == null) {
			issues = new EObjectContainmentEList<Issue>(Issue.class, this, ItmPackage.VERSION__ISSUES);
		}
		return issues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ItmPackage.VERSION__ISSUES:
				return ((InternalEList<?>)getIssues()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ItmPackage.VERSION__DESCRIPTION:
				return getDescription();
			case ItmPackage.VERSION__NAME:
				return getName();
			case ItmPackage.VERSION__STATUS:
				return getStatus();
			case ItmPackage.VERSION__EFFECTIVE_DATE:
				return getEffectiveDate();
			case ItmPackage.VERSION__ISSUES:
				return getIssues();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ItmPackage.VERSION__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ItmPackage.VERSION__NAME:
				setName((String)newValue);
				return;
			case ItmPackage.VERSION__STATUS:
				setStatus((VersionStatus)newValue);
				return;
			case ItmPackage.VERSION__EFFECTIVE_DATE:
				setEffectiveDate((Date)newValue);
				return;
			case ItmPackage.VERSION__ISSUES:
				getIssues().clear();
				getIssues().addAll((Collection<? extends Issue>)newValue);
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
			case ItmPackage.VERSION__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ItmPackage.VERSION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ItmPackage.VERSION__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case ItmPackage.VERSION__EFFECTIVE_DATE:
				setEffectiveDate(EFFECTIVE_DATE_EDEFAULT);
				return;
			case ItmPackage.VERSION__ISSUES:
				getIssues().clear();
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
			case ItmPackage.VERSION__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case ItmPackage.VERSION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ItmPackage.VERSION__STATUS:
				return status != STATUS_EDEFAULT;
			case ItmPackage.VERSION__EFFECTIVE_DATE:
				return EFFECTIVE_DATE_EDEFAULT == null ? effectiveDate != null : !EFFECTIVE_DATE_EDEFAULT.equals(effectiveDate);
			case ItmPackage.VERSION__ISSUES:
				return issues != null && !issues.isEmpty();
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
		result.append(" (description: ");
		result.append(description);
		result.append(", name: ");
		result.append(name);
		result.append(", status: ");
		result.append(status);
		result.append(", effectiveDate: ");
		result.append(effectiveDate);
		result.append(')');
		return result.toString();
	}

} //VersionImpl
