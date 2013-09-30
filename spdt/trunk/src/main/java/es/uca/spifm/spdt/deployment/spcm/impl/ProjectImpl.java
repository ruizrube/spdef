/**
 * Designed by Ivan Ruiz
 */
package es.uca.spifm.spdt.deployment.spcm.impl;

import es.uca.spifm.spdt.deployment.spcm.Milestone;
import es.uca.spifm.spdt.deployment.spcm.Project;
import es.uca.spifm.spdt.deployment.spcm.Role;
import es.uca.spifm.spdt.deployment.spcm.SpcmPackage;
import es.uca.spifm.spdt.deployment.spcm.TaskCategory;

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
 *   <li>{@link es.uca.spifm.spdt.deployment.spcm.impl.ProjectImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link es.uca.spifm.spdt.deployment.spcm.impl.ProjectImpl#getName <em>Name</em>}</li>
 *   <li>{@link es.uca.spifm.spdt.deployment.spcm.impl.ProjectImpl#getMilestones <em>Milestones</em>}</li>
 *   <li>{@link es.uca.spifm.spdt.deployment.spcm.impl.ProjectImpl#getMembers <em>Members</em>}</li>
 *   <li>{@link es.uca.spifm.spdt.deployment.spcm.impl.ProjectImpl#getTaskCategories <em>Task Categories</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProjectImpl extends MinimalEObjectImpl.Container implements Project {
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
	 * The cached value of the '{@link #getMilestones() <em>Milestones</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMilestones()
	 * @generated
	 * @ordered
	 */
	protected EList<Milestone> milestones;

	/**
	 * The cached value of the '{@link #getMembers() <em>Members</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMembers()
	 * @generated
	 * @ordered
	 */
	protected EList<Role> members;

	/**
	 * The cached value of the '{@link #getTaskCategories() <em>Task Categories</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskCategories()
	 * @generated
	 * @ordered
	 */
	protected EList<TaskCategory> taskCategories;

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
		return SpcmPackage.Literals.PROJECT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SpcmPackage.PROJECT__DESCRIPTION, oldDescription, description));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SpcmPackage.PROJECT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Milestone> getMilestones() {
		if (milestones == null) {
			milestones = new EObjectContainmentEList<Milestone>(Milestone.class, this, SpcmPackage.PROJECT__MILESTONES);
		}
		return milestones;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Role> getMembers() {
		if (members == null) {
			members = new EObjectContainmentEList<Role>(Role.class, this, SpcmPackage.PROJECT__MEMBERS);
		}
		return members;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TaskCategory> getTaskCategories() {
		if (taskCategories == null) {
			taskCategories = new EObjectContainmentEList<TaskCategory>(TaskCategory.class, this, SpcmPackage.PROJECT__TASK_CATEGORIES);
		}
		return taskCategories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpcmPackage.PROJECT__MILESTONES:
				return ((InternalEList<?>)getMilestones()).basicRemove(otherEnd, msgs);
			case SpcmPackage.PROJECT__MEMBERS:
				return ((InternalEList<?>)getMembers()).basicRemove(otherEnd, msgs);
			case SpcmPackage.PROJECT__TASK_CATEGORIES:
				return ((InternalEList<?>)getTaskCategories()).basicRemove(otherEnd, msgs);
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
			case SpcmPackage.PROJECT__DESCRIPTION:
				return getDescription();
			case SpcmPackage.PROJECT__NAME:
				return getName();
			case SpcmPackage.PROJECT__MILESTONES:
				return getMilestones();
			case SpcmPackage.PROJECT__MEMBERS:
				return getMembers();
			case SpcmPackage.PROJECT__TASK_CATEGORIES:
				return getTaskCategories();
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
			case SpcmPackage.PROJECT__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case SpcmPackage.PROJECT__NAME:
				setName((String)newValue);
				return;
			case SpcmPackage.PROJECT__MILESTONES:
				getMilestones().clear();
				getMilestones().addAll((Collection<? extends Milestone>)newValue);
				return;
			case SpcmPackage.PROJECT__MEMBERS:
				getMembers().clear();
				getMembers().addAll((Collection<? extends Role>)newValue);
				return;
			case SpcmPackage.PROJECT__TASK_CATEGORIES:
				getTaskCategories().clear();
				getTaskCategories().addAll((Collection<? extends TaskCategory>)newValue);
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
			case SpcmPackage.PROJECT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case SpcmPackage.PROJECT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SpcmPackage.PROJECT__MILESTONES:
				getMilestones().clear();
				return;
			case SpcmPackage.PROJECT__MEMBERS:
				getMembers().clear();
				return;
			case SpcmPackage.PROJECT__TASK_CATEGORIES:
				getTaskCategories().clear();
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
			case SpcmPackage.PROJECT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case SpcmPackage.PROJECT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SpcmPackage.PROJECT__MILESTONES:
				return milestones != null && !milestones.isEmpty();
			case SpcmPackage.PROJECT__MEMBERS:
				return members != null && !members.isEmpty();
			case SpcmPackage.PROJECT__TASK_CATEGORIES:
				return taskCategories != null && !taskCategories.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //ProjectImpl
