/**
 * Created by Ivan Ruiz
 */
package es.uca.spifm.spdt.specificTools.redm;

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
 * @see es.uca.spifm.spdt.specificTools.redm.RedmFactory
 * @model kind="package"
 * @generated
 */
public interface RedmPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "redm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://spi-fm.uca.es/spdef/models/specificTools/redm/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "redm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RedmPackage eINSTANCE = es.uca.spifm.spdt.specificTools.redm.impl.RedmPackageImpl.init();

	/**
	 * The meta object id for the '{@link es.uca.spifm.spdt.specificTools.redm.impl.RedmineDatabaseImpl <em>Redmine Database</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uca.spifm.spdt.specificTools.redm.impl.RedmineDatabaseImpl
	 * @see es.uca.spifm.spdt.specificTools.redm.impl.RedmPackageImpl#getRedmineDatabase()
	 * @generated
	 */
	int REDMINE_DATABASE = 0;

	/**
	 * The feature id for the '<em><b>Wiki Database</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDMINE_DATABASE__WIKI_DATABASE = 0;

	/**
	 * The feature id for the '<em><b>Api Access Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDMINE_DATABASE__API_ACCESS_KEY = 1;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDMINE_DATABASE__URL = 2;

	/**
	 * The feature id for the '<em><b>Issue Tracking Database</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDMINE_DATABASE__ISSUE_TRACKING_DATABASE = 3;

	/**
	 * The number of structural features of the '<em>Redmine Database</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDMINE_DATABASE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Redmine Database</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDMINE_DATABASE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link es.uca.spifm.spdt.specificTools.redm.RedmineDatabase <em>Redmine Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Redmine Database</em>'.
	 * @see es.uca.spifm.spdt.specificTools.redm.RedmineDatabase
	 * @generated
	 */
	EClass getRedmineDatabase();

	/**
	 * Returns the meta object for the reference '{@link es.uca.spifm.spdt.specificTools.redm.RedmineDatabase#getWikiDatabase <em>Wiki Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Wiki Database</em>'.
	 * @see es.uca.spifm.spdt.specificTools.redm.RedmineDatabase#getWikiDatabase()
	 * @see #getRedmineDatabase()
	 * @generated
	 */
	EReference getRedmineDatabase_WikiDatabase();

	/**
	 * Returns the meta object for the attribute '{@link es.uca.spifm.spdt.specificTools.redm.RedmineDatabase#getApiAccessKey <em>Api Access Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Api Access Key</em>'.
	 * @see es.uca.spifm.spdt.specificTools.redm.RedmineDatabase#getApiAccessKey()
	 * @see #getRedmineDatabase()
	 * @generated
	 */
	EAttribute getRedmineDatabase_ApiAccessKey();

	/**
	 * Returns the meta object for the attribute '{@link es.uca.spifm.spdt.specificTools.redm.RedmineDatabase#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see es.uca.spifm.spdt.specificTools.redm.RedmineDatabase#getUrl()
	 * @see #getRedmineDatabase()
	 * @generated
	 */
	EAttribute getRedmineDatabase_Url();

	/**
	 * Returns the meta object for the reference '{@link es.uca.spifm.spdt.specificTools.redm.RedmineDatabase#getIssueTrackingDatabase <em>Issue Tracking Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Issue Tracking Database</em>'.
	 * @see es.uca.spifm.spdt.specificTools.redm.RedmineDatabase#getIssueTrackingDatabase()
	 * @see #getRedmineDatabase()
	 * @generated
	 */
	EReference getRedmineDatabase_IssueTrackingDatabase();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RedmFactory getRedmFactory();

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
		 * The meta object literal for the '{@link es.uca.spifm.spdt.specificTools.redm.impl.RedmineDatabaseImpl <em>Redmine Database</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uca.spifm.spdt.specificTools.redm.impl.RedmineDatabaseImpl
		 * @see es.uca.spifm.spdt.specificTools.redm.impl.RedmPackageImpl#getRedmineDatabase()
		 * @generated
		 */
		EClass REDMINE_DATABASE = eINSTANCE.getRedmineDatabase();

		/**
		 * The meta object literal for the '<em><b>Wiki Database</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REDMINE_DATABASE__WIKI_DATABASE = eINSTANCE.getRedmineDatabase_WikiDatabase();

		/**
		 * The meta object literal for the '<em><b>Api Access Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REDMINE_DATABASE__API_ACCESS_KEY = eINSTANCE.getRedmineDatabase_ApiAccessKey();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REDMINE_DATABASE__URL = eINSTANCE.getRedmineDatabase_Url();

		/**
		 * The meta object literal for the '<em><b>Issue Tracking Database</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REDMINE_DATABASE__ISSUE_TRACKING_DATABASE = eINSTANCE.getRedmineDatabase_IssueTrackingDatabase();

	}

} //RedmPackage
