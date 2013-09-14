/**
 * Created by Ivan Ruiz
 */
package es.uca.spifm.spdt.specificTools.eam.impl;

import es.uca.spifm.spdt.genericTools.vmm.ModelRepository;

import es.uca.spifm.spdt.specificTools.eam.EamPackage;
import es.uca.spifm.spdt.specificTools.eam.EnterpriseArchitectDatabase;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enterprise Architect Database</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.uca.spifm.spdt.specificTools.eam.impl.EnterpriseArchitectDatabaseImpl#getModelRepository <em>Model Repository</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EnterpriseArchitectDatabaseImpl extends MinimalEObjectImpl.Container implements EnterpriseArchitectDatabase {
	/**
	 * The cached value of the '{@link #getModelRepository() <em>Model Repository</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelRepository()
	 * @generated
	 * @ordered
	 */
	protected ModelRepository modelRepository;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnterpriseArchitectDatabaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EamPackage.Literals.ENTERPRISE_ARCHITECT_DATABASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelRepository getModelRepository() {
		if (modelRepository != null && modelRepository.eIsProxy()) {
			InternalEObject oldModelRepository = (InternalEObject)modelRepository;
			modelRepository = (ModelRepository)eResolveProxy(oldModelRepository);
			if (modelRepository != oldModelRepository) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EamPackage.ENTERPRISE_ARCHITECT_DATABASE__MODEL_REPOSITORY, oldModelRepository, modelRepository));
			}
		}
		return modelRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelRepository basicGetModelRepository() {
		return modelRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelRepository(ModelRepository newModelRepository) {
		ModelRepository oldModelRepository = modelRepository;
		modelRepository = newModelRepository;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EamPackage.ENTERPRISE_ARCHITECT_DATABASE__MODEL_REPOSITORY, oldModelRepository, modelRepository));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EamPackage.ENTERPRISE_ARCHITECT_DATABASE__MODEL_REPOSITORY:
				if (resolve) return getModelRepository();
				return basicGetModelRepository();
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
			case EamPackage.ENTERPRISE_ARCHITECT_DATABASE__MODEL_REPOSITORY:
				setModelRepository((ModelRepository)newValue);
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
			case EamPackage.ENTERPRISE_ARCHITECT_DATABASE__MODEL_REPOSITORY:
				setModelRepository((ModelRepository)null);
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
			case EamPackage.ENTERPRISE_ARCHITECT_DATABASE__MODEL_REPOSITORY:
				return modelRepository != null;
		}
		return super.eIsSet(featureID);
	}

} //EnterpriseArchitectDatabaseImpl
