/**
 * Created by Ivan Ruiz
 */
package es.uca.spifm.spdt.genericTools.itm.impl;

import es.uca.spifm.spdt.genericTools.itm.IssueCategory;
import es.uca.spifm.spdt.genericTools.itm.ItmPackage;
import es.uca.spifm.spdt.genericTools.itm.Member;
import es.uca.spifm.spdt.genericTools.itm.Project;
import es.uca.spifm.spdt.genericTools.itm.Version;

import java.util.Collection;

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
 * An implementation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.uca.spifm.spdt.genericTools.itm.impl.ProjectImpl#getName <em>Name</em>}</li>
 *   <li>{@link es.uca.spifm.spdt.genericTools.itm.impl.ProjectImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link es.uca.spifm.spdt.genericTools.itm.impl.ProjectImpl#getVersions <em>Versions</em>}</li>
 *   <li>{@link es.uca.spifm.spdt.genericTools.itm.impl.ProjectImpl#getIssueCategories <em>Issue Categories</em>}</li>
 *   <li>{@link es.uca.spifm.spdt.genericTools.itm.impl.ProjectImpl#getMembers <em>Members</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProjectImpl extends MinimalEObjectImpl.Container implements Project {
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
	 * The cached value of the '{@link #getVersions() <em>Versions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersions()
	 * @generated
	 * @ordered
	 */
	protected EList<Version> versions;

	/**
	 * The cached value of the '{@link #getIssueCategories() <em>Issue Categories</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssueCategories()
	 * @generated
	 * @ordered
	 */
	protected EList<IssueCategory> issueCategories;

	/**
	 * The cached value of the '{@link #getMembers() <em>Members</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMembers()
	 * @generated
	 * @ordered
	 */
	protected EList<Member> members;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ItmPackage.Literals.PROJECT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ItmPackage.PROJECT__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ItmPackage.PROJECT__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Version> getVersions() {
		if (versions == null) {
			versions = new EObjectContainmentEList<Version>(Version.class, this, ItmPackage.PROJECT__VERSIONS);
		}
		return versions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IssueCategory> getIssueCategories() {
		if (issueCategories == null) {
			issueCategories = new EObjectContainmentEList<IssueCategory>(IssueCategory.class, this, ItmPackage.PROJECT__ISSUE_CATEGORIES);
		}
		return issueCategories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Member> getMembers() {
		if (members == null) {
			members = new EObjectContainmentEList<Member>(Member.class, this, ItmPackage.PROJECT__MEMBERS);
		}
		return members;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ItmPackage.PROJECT__VERSIONS:
				return ((InternalEList<?>)getVersions()).basicRemove(otherEnd, msgs);
			case ItmPackage.PROJECT__ISSUE_CATEGORIES:
				return ((InternalEList<?>)getIssueCategories()).basicRemove(otherEnd, msgs);
			case ItmPackage.PROJECT__MEMBERS:
				return ((InternalEList<?>)getMembers()).basicRemove(otherEnd, msgs);
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
			case ItmPackage.PROJECT__NAME:
				return getName();
			case ItmPackage.PROJECT__DESCRIPTION:
				return getDescription();
			case ItmPackage.PROJECT__VERSIONS:
				return getVersions();
			case ItmPackage.PROJECT__ISSUE_CATEGORIES:
				return getIssueCategories();
			case ItmPackage.PROJECT__MEMBERS:
				return getMembers();
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
			case ItmPackage.PROJECT__NAME:
				setName((String)newValue);
				return;
			case ItmPackage.PROJECT__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ItmPackage.PROJECT__VERSIONS:
				getVersions().clear();
				getVersions().addAll((Collection<? extends Version>)newValue);
				return;
			case ItmPackage.PROJECT__ISSUE_CATEGORIES:
				getIssueCategories().clear();
				getIssueCategories().addAll((Collection<? extends IssueCategory>)newValue);
				return;
			case ItmPackage.PROJECT__MEMBERS:
				getMembers().clear();
				getMembers().addAll((Collection<? extends Member>)newValue);
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
			case ItmPackage.PROJECT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ItmPackage.PROJECT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ItmPackage.PROJECT__VERSIONS:
				getVersions().clear();
				return;
			case ItmPackage.PROJECT__ISSUE_CATEGORIES:
				getIssueCategories().clear();
				return;
			case ItmPackage.PROJECT__MEMBERS:
				getMembers().clear();
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
			case ItmPackage.PROJECT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ItmPackage.PROJECT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case ItmPackage.PROJECT__VERSIONS:
				return versions != null && !versions.isEmpty();
			case ItmPackage.PROJECT__ISSUE_CATEGORIES:
				return issueCategories != null && !issueCategories.isEmpty();
			case ItmPackage.PROJECT__MEMBERS:
				return members != null && !members.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //ProjectImpl
