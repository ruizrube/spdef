/**
 * Created by Ivan Ruiz
 */
package es.uca.spifm.spdt.genericTools.itm.impl;

import es.uca.spifm.spdt.genericTools.itm.DependencyType;
import es.uca.spifm.spdt.genericTools.itm.Issue;
import es.uca.spifm.spdt.genericTools.itm.IssueDependency;
import es.uca.spifm.spdt.genericTools.itm.ItmPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Issue Dependency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.uca.spifm.spdt.genericTools.itm.impl.IssueDependencyImpl#getType <em>Type</em>}</li>
 *   <li>{@link es.uca.spifm.spdt.genericTools.itm.impl.IssueDependencyImpl#getDependentTask <em>Dependent Task</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IssueDependencyImpl extends MinimalEObjectImpl.Container implements IssueDependency {
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
	protected Issue dependentTask;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IssueDependencyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ItmPackage.Literals.ISSUE_DEPENDENCY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ItmPackage.ISSUE_DEPENDENCY__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Issue getDependentTask() {
		if (dependentTask != null && dependentTask.eIsProxy()) {
			InternalEObject oldDependentTask = (InternalEObject)dependentTask;
			dependentTask = (Issue)eResolveProxy(oldDependentTask);
			if (dependentTask != oldDependentTask) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ItmPackage.ISSUE_DEPENDENCY__DEPENDENT_TASK, oldDependentTask, dependentTask));
			}
		}
		return dependentTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Issue basicGetDependentTask() {
		return dependentTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDependentTask(Issue newDependentTask) {
		Issue oldDependentTask = dependentTask;
		dependentTask = newDependentTask;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ItmPackage.ISSUE_DEPENDENCY__DEPENDENT_TASK, oldDependentTask, dependentTask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ItmPackage.ISSUE_DEPENDENCY__TYPE:
				return getType();
			case ItmPackage.ISSUE_DEPENDENCY__DEPENDENT_TASK:
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
			case ItmPackage.ISSUE_DEPENDENCY__TYPE:
				setType((DependencyType)newValue);
				return;
			case ItmPackage.ISSUE_DEPENDENCY__DEPENDENT_TASK:
				setDependentTask((Issue)newValue);
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
			case ItmPackage.ISSUE_DEPENDENCY__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case ItmPackage.ISSUE_DEPENDENCY__DEPENDENT_TASK:
				setDependentTask((Issue)null);
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
			case ItmPackage.ISSUE_DEPENDENCY__TYPE:
				return type != TYPE_EDEFAULT;
			case ItmPackage.ISSUE_DEPENDENCY__DEPENDENT_TASK:
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

} //IssueDependencyImpl
