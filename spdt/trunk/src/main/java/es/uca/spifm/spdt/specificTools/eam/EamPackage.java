/**
 * Created by Ivan Ruiz
 */
package es.uca.spifm.spdt.specificTools.eam;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see es.uca.spifm.spdt.specificTools.eam.EamFactory
 * @model kind="package"
 * @generated
 */
public interface EamPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "eam";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://spi-fm.uca.es/spdef/models/specificTools/eam/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "eam";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EamPackage eINSTANCE = es.uca.spifm.spdt.specificTools.eam.impl.EamPackageImpl.init();

	/**
	 * The meta object id for the '{@link es.uca.spifm.spdt.specificTools.eam.impl.EnterpriseArchitectDatabaseImpl <em>Enterprise Architect Database</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uca.spifm.spdt.specificTools.eam.impl.EnterpriseArchitectDatabaseImpl
	 * @see es.uca.spifm.spdt.specificTools.eam.impl.EamPackageImpl#getEnterpriseArchitectDatabase()
	 * @generated
	 */
	int ENTERPRISE_ARCHITECT_DATABASE = 0;

	/**
	 * The feature id for the '<em><b>Model Repository</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTERPRISE_ARCHITECT_DATABASE__MODEL_REPOSITORY = 0;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTERPRISE_ARCHITECT_DATABASE__FILE_NAME = 1;

	/**
	 * The number of structural features of the '<em>Enterprise Architect Database</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTERPRISE_ARCHITECT_DATABASE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Enterprise Architect Database</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTERPRISE_ARCHITECT_DATABASE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link es.uca.spifm.spdt.specificTools.eam.EnterpriseArchitectDatabase <em>Enterprise Architect Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enterprise Architect Database</em>'.
	 * @see es.uca.spifm.spdt.specificTools.eam.EnterpriseArchitectDatabase
	 * @generated
	 */
	EClass getEnterpriseArchitectDatabase();

	/**
	 * Returns the meta object for the reference '{@link es.uca.spifm.spdt.specificTools.eam.EnterpriseArchitectDatabase#getModelRepository <em>Model Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Model Repository</em>'.
	 * @see es.uca.spifm.spdt.specificTools.eam.EnterpriseArchitectDatabase#getModelRepository()
	 * @see #getEnterpriseArchitectDatabase()
	 * @generated
	 */
	EReference getEnterpriseArchitectDatabase_ModelRepository();

	/**
	 * Returns the meta object for the attribute '{@link es.uca.spifm.spdt.specificTools.eam.EnterpriseArchitectDatabase#getFileName <em>File Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Name</em>'.
	 * @see es.uca.spifm.spdt.specificTools.eam.EnterpriseArchitectDatabase#getFileName()
	 * @see #getEnterpriseArchitectDatabase()
	 * @generated
	 */
	EAttribute getEnterpriseArchitectDatabase_FileName();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EamFactory getEamFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link es.uca.spifm.spdt.specificTools.eam.impl.EnterpriseArchitectDatabaseImpl <em>Enterprise Architect Database</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uca.spifm.spdt.specificTools.eam.impl.EnterpriseArchitectDatabaseImpl
		 * @see es.uca.spifm.spdt.specificTools.eam.impl.EamPackageImpl#getEnterpriseArchitectDatabase()
		 * @generated
		 */
		EClass ENTERPRISE_ARCHITECT_DATABASE = eINSTANCE.getEnterpriseArchitectDatabase();

		/**
		 * The meta object literal for the '<em><b>Model Repository</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTERPRISE_ARCHITECT_DATABASE__MODEL_REPOSITORY = eINSTANCE.getEnterpriseArchitectDatabase_ModelRepository();

		/**
		 * The meta object literal for the '<em><b>File Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTERPRISE_ARCHITECT_DATABASE__FILE_NAME = eINSTANCE.getEnterpriseArchitectDatabase_FileName();

	}

} //EamPackage
