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
 *   <li>{@link es.uca.spifm.spdt.specificTools.eam.impl.EnterpriseArchitectDatabaseImpl#getFileName <em>File Name</em>}</li>
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
	 * The default value of the '{@link #getFileName() <em>File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileName()
	 * @generated
	 * @ordered
	 */
	protected static final String FILE_NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getFileName() <em>File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileName()
	 * @generated
	 * @ordered
	 */
	protected String fileName = FILE_NAME_EDEFAULT;

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
	public String getFileName() {
		return fileName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFileName(String newFileName) {
		String oldFileName = fileName;
		fileName = newFileName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EamPackage.ENTERPRISE_ARCHITECT_DATABASE__FILE_NAME, oldFileName, fileName));
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
			case EamPackage.ENTERPRISE_ARCHITECT_DATABASE__FILE_NAME:
				return getFileName();
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
			case EamPackage.ENTERPRISE_ARCHITECT_DATABASE__FILE_NAME:
				setFileName((String)newValue);
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
			case EamPackage.ENTERPRISE_ARCHITECT_DATABASE__FILE_NAME:
				setFileName(FILE_NAME_EDEFAULT);
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
			case EamPackage.ENTERPRISE_ARCHITECT_DATABASE__FILE_NAME:
				return FILE_NAME_EDEFAULT == null ? fileName != null : !FILE_NAME_EDEFAULT.equals(fileName);
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
		result.append(" (fileName: ");
		result.append(fileName);
		result.append(')');
		return result.toString();
	}

} //EnterpriseArchitectDatabaseImpl
