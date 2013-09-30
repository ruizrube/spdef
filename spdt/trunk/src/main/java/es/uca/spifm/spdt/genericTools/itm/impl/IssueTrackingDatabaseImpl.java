/**
 * Created by Ivan Ruiz
 */
package es.uca.spifm.spdt.genericTools.itm.impl;

import es.uca.spifm.spdt.genericTools.itm.IssueTrackingDatabase;
import es.uca.spifm.spdt.genericTools.itm.ItmPackage;
import es.uca.spifm.spdt.genericTools.itm.Project;
import es.uca.spifm.spdt.genericTools.itm.Role;
import es.uca.spifm.spdt.genericTools.itm.Tracker;
import es.uca.spifm.spdt.genericTools.itm.User;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Issue Tracking Database</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.uca.spifm.spdt.genericTools.itm.impl.IssueTrackingDatabaseImpl#getProjects <em>Projects</em>}</li>
 *   <li>{@link es.uca.spifm.spdt.genericTools.itm.impl.IssueTrackingDatabaseImpl#getTrackers <em>Trackers</em>}</li>
 *   <li>{@link es.uca.spifm.spdt.genericTools.itm.impl.IssueTrackingDatabaseImpl#getRoles <em>Roles</em>}</li>
 *   <li>{@link es.uca.spifm.spdt.genericTools.itm.impl.IssueTrackingDatabaseImpl#getUsers <em>Users</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IssueTrackingDatabaseImpl extends MinimalEObjectImpl.Container implements IssueTrackingDatabase {
	/**
	 * The cached value of the '{@link #getProjects() <em>Projects</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjects()
	 * @generated
	 * @ordered
	 */
	protected EList<Project> projects;

	/**
	 * The cached value of the '{@link #getTrackers() <em>Trackers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrackers()
	 * @generated
	 * @ordered
	 */
	protected EList<Tracker> trackers;

	/**
	 * The cached value of the '{@link #getRoles() <em>Roles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<Role> roles;

	/**
	 * The cached value of the '{@link #getUsers() <em>Users</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsers()
	 * @generated
	 * @ordered
	 */
	protected EList<User> users;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IssueTrackingDatabaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ItmPackage.Literals.ISSUE_TRACKING_DATABASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Project> getProjects() {
		if (projects == null) {
			projects = new EObjectContainmentEList<Project>(Project.class, this, ItmPackage.ISSUE_TRACKING_DATABASE__PROJECTS);
		}
		return projects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Tracker> getTrackers() {
		if (trackers == null) {
			trackers = new EObjectContainmentEList<Tracker>(Tracker.class, this, ItmPackage.ISSUE_TRACKING_DATABASE__TRACKERS);
		}
		return trackers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Role> getRoles() {
		if (roles == null) {
			roles = new EObjectContainmentEList<Role>(Role.class, this, ItmPackage.ISSUE_TRACKING_DATABASE__ROLES);
		}
		return roles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<User> getUsers() {
		if (users == null) {
			users = new EObjectContainmentEList<User>(User.class, this, ItmPackage.ISSUE_TRACKING_DATABASE__USERS);
		}
		return users;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ItmPackage.ISSUE_TRACKING_DATABASE__PROJECTS:
				return ((InternalEList<?>)getProjects()).basicRemove(otherEnd, msgs);
			case ItmPackage.ISSUE_TRACKING_DATABASE__TRACKERS:
				return ((InternalEList<?>)getTrackers()).basicRemove(otherEnd, msgs);
			case ItmPackage.ISSUE_TRACKING_DATABASE__ROLES:
				return ((InternalEList<?>)getRoles()).basicRemove(otherEnd, msgs);
			case ItmPackage.ISSUE_TRACKING_DATABASE__USERS:
				return ((InternalEList<?>)getUsers()).basicRemove(otherEnd, msgs);
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
			case ItmPackage.ISSUE_TRACKING_DATABASE__PROJECTS:
				return getProjects();
			case ItmPackage.ISSUE_TRACKING_DATABASE__TRACKERS:
				return getTrackers();
			case ItmPackage.ISSUE_TRACKING_DATABASE__ROLES:
				return getRoles();
			case ItmPackage.ISSUE_TRACKING_DATABASE__USERS:
				return getUsers();
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
			case ItmPackage.ISSUE_TRACKING_DATABASE__PROJECTS:
				getProjects().clear();
				getProjects().addAll((Collection<? extends Project>)newValue);
				return;
			case ItmPackage.ISSUE_TRACKING_DATABASE__TRACKERS:
				getTrackers().clear();
				getTrackers().addAll((Collection<? extends Tracker>)newValue);
				return;
			case ItmPackage.ISSUE_TRACKING_DATABASE__ROLES:
				getRoles().clear();
				getRoles().addAll((Collection<? extends Role>)newValue);
				return;
			case ItmPackage.ISSUE_TRACKING_DATABASE__USERS:
				getUsers().clear();
				getUsers().addAll((Collection<? extends User>)newValue);
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
			case ItmPackage.ISSUE_TRACKING_DATABASE__PROJECTS:
				getProjects().clear();
				return;
			case ItmPackage.ISSUE_TRACKING_DATABASE__TRACKERS:
				getTrackers().clear();
				return;
			case ItmPackage.ISSUE_TRACKING_DATABASE__ROLES:
				getRoles().clear();
				return;
			case ItmPackage.ISSUE_TRACKING_DATABASE__USERS:
				getUsers().clear();
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
			case ItmPackage.ISSUE_TRACKING_DATABASE__PROJECTS:
				return projects != null && !projects.isEmpty();
			case ItmPackage.ISSUE_TRACKING_DATABASE__TRACKERS:
				return trackers != null && !trackers.isEmpty();
			case ItmPackage.ISSUE_TRACKING_DATABASE__ROLES:
				return roles != null && !roles.isEmpty();
			case ItmPackage.ISSUE_TRACKING_DATABASE__USERS:
				return users != null && !users.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //IssueTrackingDatabaseImpl
