/**
 * Designed by Ivan Ruiz
 */
package es.uca.spifm.spdt.deployment.spcm.impl;

import es.uca.spifm.spdt.deployment.spcm.DependencyType;
import es.uca.spifm.spdt.deployment.spcm.SpcmPackage;
import es.uca.spifm.spdt.deployment.spcm.Task;
import es.uca.spifm.spdt.deployment.spcm.TaskDependency;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task Dependency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.uca.spifm.spdt.deployment.spcm.impl.TaskDependencyImpl#getType <em>Type</em>}</li>
 *   <li>{@link es.uca.spifm.spdt.deployment.spcm.impl.TaskDependencyImpl#getDependentTask <em>Dependent Task</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TaskDependencyImpl extends MinimalEObjectImpl.Container implements TaskDependency {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final DependencyType TYPE_EDEFAULT = DependencyType.START_START;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected DependencyType type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDependentTask() <em>Dependent Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependentTask()
	 * @generated
	 * @ordered
	 */
	protected Task dependentTask;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskDependencyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpcmPackage.Literals.TASK_DEPENDENCY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DependencyType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(DependencyType newType) {
		DependencyType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpcmPackage.TASK_DEPENDENCY__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task getDependentTask() {
		if (dependentTask != null && dependentTask.eIsProxy()) {
			InternalEObject oldDependentTask = (InternalEObject)dependentTask;
			dependentTask = (Task)eResolveProxy(oldDependentTask);
			if (dependentTask != oldDependentTask) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SpcmPackage.TASK_DEPENDENCY__DEPENDENT_TASK, oldDependentTask, dependentTask));
			}
		}
		return dependentTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task basicGetDependentTask() {
		return dependentTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDependentTask(Task newDependentTask) {
		Task oldDependentTask = dependentTask;
		dependentTask = newDependentTask;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpcmPackage.TASK_DEPENDENCY__DEPENDENT_TASK, oldDependentTask, dependentTask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SpcmPackage.TASK_DEPENDENCY__TYPE:
				return getType();
			case SpcmPackage.TASK_DEPENDENCY__DEPENDENT_TASK:
				if (resolve) return getDependentTask();
				return basicGetDependentTask();
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
			case SpcmPackage.TASK_DEPENDENCY__TYPE:
				setType((DependencyType)newValue);
				return;
			case SpcmPackage.TASK_DEPENDENCY__DEPENDENT_TASK:
				setDependentTask((Task)newValue);
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
			case SpcmPackage.TASK_DEPENDENCY__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case SpcmPackage.TASK_DEPENDENCY__DEPENDENT_TASK:
				setDependentTask((Task)null);
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
			case SpcmPackage.TASK_DEPENDENCY__TYPE:
				return type != TYPE_EDEFAULT;
			case SpcmPackage.TASK_DEPENDENCY__DEPENDENT_TASK:
				return dependentTask != null;
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
		result.append(" (type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //TaskDependencyImpl
