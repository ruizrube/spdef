/**
 * Created by Ivan Ruiz
 */
package es.uca.spifm.spdt.genericTools.itm;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see es.uca.spifm.spdt.genericTools.itm.ItmFactory
 * @model kind="package"
 * @generated
 */
public interface ItmPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "itm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://spi-fm.uca.es/spdef/models/genericTools/itm/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "itm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ItmPackage eINSTANCE = es.uca.spifm.spdt.genericTools.itm.impl.ItmPackageImpl.init();

	/**
	 * The meta object id for the '{@link es.uca.spifm.spdt.genericTools.itm.impl.IssueTrackingDatabaseImpl <em>Issue Tracking Database</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uca.spifm.spdt.genericTools.itm.impl.IssueTrackingDatabaseImpl
	 * @see es.uca.spifm.spdt.genericTools.itm.impl.ItmPackageImpl#getIssueTrackingDatabase()
	 * @generated
	 */
	int ISSUE_TRACKING_DATABASE = 0;

	/**
	 * The feature id for the '<em><b>Projects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_TRACKING_DATABASE__PROJECTS = 0;

	/**
	 * The feature id for the '<em><b>Trackers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_TRACKING_DATABASE__TRACKERS = 1;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_TRACKING_DATABASE__ROLES = 2;

	/**
	 * The feature id for the '<em><b>Users</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_TRACKING_DATABASE__USERS = 3;

	/**
	 * The number of structural features of the '<em>Issue Tracking Database</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_TRACKING_DATABASE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Issue Tracking Database</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_TRACKING_DATABASE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uca.spifm.spdt.genericTools.itm.impl.ProjectImpl <em>Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uca.spifm.spdt.genericTools.itm.impl.ProjectImpl
	 * @see es.uca.spifm.spdt.genericTools.itm.impl.ItmPackageImpl#getProject()
	 * @generated
	 */
	int PROJECT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Versions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__VERSIONS = 2;

	/**
	 * The feature id for the '<em><b>Issue Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__ISSUE_CATEGORIES = 3;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__MEMBERS = 4;

	/**
	 * The number of structural features of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uca.spifm.spdt.genericTools.itm.impl.VersionImpl <em>Version</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uca.spifm.spdt.genericTools.itm.impl.VersionImpl
	 * @see es.uca.spifm.spdt.genericTools.itm.impl.ItmPackageImpl#getVersion()
	 * @generated
	 */
	int VERSION = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION__NAME = 1;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION__STATUS = 2;

	/**
	 * The feature id for the '<em><b>Due Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION__DUE_DATE = 3;

	/**
	 * The feature id for the '<em><b>Issues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION__ISSUES = 4;

	/**
	 * The number of structural features of the '<em>Version</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Version</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uca.spifm.spdt.genericTools.itm.impl.IssueImpl <em>Issue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uca.spifm.spdt.genericTools.itm.impl.IssueImpl
	 * @see es.uca.spifm.spdt.genericTools.itm.impl.ItmPackageImpl#getIssue()
	 * @generated
	 */
	int ISSUE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Done Ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__DONE_RATIO = 2;

	/**
	 * The feature id for the '<em><b>Estimated Hours</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__ESTIMATED_HOURS = 3;

	/**
	 * The feature id for the '<em><b>Elapsed Hours</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__ELAPSED_HOURS = 4;

	/**
	 * The feature id for the '<em><b>Tracker</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__TRACKER = 5;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__STATUS = 6;

	/**
	 * The feature id for the '<em><b>Dependencies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__DEPENDENCIES = 7;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__CATEGORY = 8;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__PRIORITY = 9;

	/**
	 * The feature id for the '<em><b>Due Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__DUE_DATE = 10;

	/**
	 * The feature id for the '<em><b>Completed Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__COMPLETED_DATE = 11;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__OWNER = 12;

	/**
	 * The feature id for the '<em><b>Responsible</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__RESPONSIBLE = 13;

	/**
	 * The number of structural features of the '<em>Issue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_FEATURE_COUNT = 14;

	/**
	 * The number of operations of the '<em>Issue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uca.spifm.spdt.genericTools.itm.impl.TrackerImpl <em>Tracker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uca.spifm.spdt.genericTools.itm.impl.TrackerImpl
	 * @see es.uca.spifm.spdt.genericTools.itm.impl.ItmPackageImpl#getTracker()
	 * @generated
	 */
	int TRACKER = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACKER__NAME = 0;

	/**
	 * The number of structural features of the '<em>Tracker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACKER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Tracker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACKER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uca.spifm.spdt.genericTools.itm.impl.IssueDependencyImpl <em>Issue Dependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uca.spifm.spdt.genericTools.itm.impl.IssueDependencyImpl
	 * @see es.uca.spifm.spdt.genericTools.itm.impl.ItmPackageImpl#getIssueDependency()
	 * @generated
	 */
	int ISSUE_DEPENDENCY = 5;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_DEPENDENCY__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Dependent Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_DEPENDENCY__DEPENDENT_TASK = 1;

	/**
	 * The number of structural features of the '<em>Issue Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_DEPENDENCY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Issue Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_DEPENDENCY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uca.spifm.spdt.genericTools.itm.impl.IssueCategoryImpl <em>Issue Category</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uca.spifm.spdt.genericTools.itm.impl.IssueCategoryImpl
	 * @see es.uca.spifm.spdt.genericTools.itm.impl.ItmPackageImpl#getIssueCategory()
	 * @generated
	 */
	int ISSUE_CATEGORY = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_CATEGORY__NAME = 0;

	/**
	 * The number of structural features of the '<em>Issue Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_CATEGORY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Issue Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_CATEGORY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uca.spifm.spdt.genericTools.itm.impl.MemberImpl <em>Member</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uca.spifm.spdt.genericTools.itm.impl.MemberImpl
	 * @see es.uca.spifm.spdt.genericTools.itm.impl.ItmPackageImpl#getMember()
	 * @generated
	 */
	int MEMBER = 7;

	/**
	 * The feature id for the '<em><b>User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__USER = 0;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__ROLE = 1;

	/**
	 * The number of structural features of the '<em>Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uca.spifm.spdt.genericTools.itm.impl.UserImpl <em>User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uca.spifm.spdt.genericTools.itm.impl.UserImpl
	 * @see es.uca.spifm.spdt.genericTools.itm.impl.ItmPackageImpl#getUser()
	 * @generated
	 */
	int USER = 8;

	/**
	 * The feature id for the '<em><b>Login</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__LOGIN = 0;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__LANGUAGE = 1;

	/**
	 * The number of structural features of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uca.spifm.spdt.genericTools.itm.impl.RoleImpl <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uca.spifm.spdt.genericTools.itm.impl.RoleImpl
	 * @see es.uca.spifm.spdt.genericTools.itm.impl.ItmPackageImpl#getRole()
	 * @generated
	 */
	int ROLE = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Permissions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__PERMISSIONS = 1;

	/**
	 * The number of structural features of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uca.spifm.spdt.genericTools.itm.IssueStatus <em>Issue Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uca.spifm.spdt.genericTools.itm.IssueStatus
	 * @see es.uca.spifm.spdt.genericTools.itm.impl.ItmPackageImpl#getIssueStatus()
	 * @generated
	 */
	int ISSUE_STATUS = 10;

	/**
	 * The meta object id for the '{@link es.uca.spifm.spdt.genericTools.itm.VersionStatus <em>Version Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uca.spifm.spdt.genericTools.itm.VersionStatus
	 * @see es.uca.spifm.spdt.genericTools.itm.impl.ItmPackageImpl#getVersionStatus()
	 * @generated
	 */
	int VERSION_STATUS = 11;

	/**
	 * The meta object id for the '{@link es.uca.spifm.spdt.genericTools.itm.DependencyType <em>Dependency Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uca.spifm.spdt.genericTools.itm.DependencyType
	 * @see es.uca.spifm.spdt.genericTools.itm.impl.ItmPackageImpl#getDependencyType()
	 * @generated
	 */
	int DEPENDENCY_TYPE = 12;


	/**
	 * The meta object id for the '{@link es.uca.spifm.spdt.genericTools.itm.IssuePriority <em>Issue Priority</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uca.spifm.spdt.genericTools.itm.IssuePriority
	 * @see es.uca.spifm.spdt.genericTools.itm.impl.ItmPackageImpl#getIssuePriority()
	 * @generated
	 */
	int ISSUE_PRIORITY = 13;


	/**
	 * Returns the meta object for class '{@link es.uca.spifm.spdt.genericTools.itm.IssueTrackingDatabase <em>Issue Tracking Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Issue Tracking Database</em>'.
	 * @see es.uca.spifm.spdt.genericTools.itm.IssueTrackingDatabase
	 * @generated
	 */
	EClass getIssueTrackingDatabase();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uca.spifm.spdt.genericTools.itm.IssueTrackingDatabase#getProjects <em>Projects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Projects</em>'.
	 * @see es.uca.spifm.spdt.genericTools.itm.IssueTrackingDatabase#getProjects()
	 * @see #getIssueTrackingDatabase()
	 * @generated
	 */
	EReference getIssueTrackingDatabase_Projects();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uca.spifm.spdt.genericTools.itm.IssueTrackingDatabase#getTrackers <em>Trackers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Trackers</em>'.
	 * @see es.uca.spifm.spdt.genericTools.itm.IssueTrackingDatabase#getTrackers()
	 * @see #getIssueTrackingDatabase()
	 * @generated
	 */
	EReference getIssueTrackingDatabase_Trackers();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uca.spifm.spdt.genericTools.itm.IssueTrackingDatabase#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Roles</em>'.
	 * @see es.uca.spifm.spdt.genericTools.itm.IssueTrackingDatabase#getRoles()
	 * @see #getIssueTrackingDatabase()
	 * @generated
	 */
	EReference getIssueTrackingDatabase_Roles();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uca.spifm.spdt.genericTools.itm.IssueTrackingDatabase#getUsers <em>Users</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Users</em>'.
	 * @see es.uca.spifm.spdt.genericTools.itm.IssueTrackingDatabase#getUsers()
	 * @see #getIssueTrackingDatabase()
	 * @generated
	 */
	EReference getIssueTrackingDatabase_Users();

	/**
	 * Returns the meta object for class '{@link es.uca.spifm.spdt.genericTools.itm.Project <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project</em>'.
	 * @see es.uca.spifm.spdt.genericTools.itm.Project
	 * @generated
	 */
	EClass getProject();

	/**
	 * Returns the meta object for the attribute '{@link es.uca.spifm.spdt.genericTools.itm.Project#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.uca.spifm.spdt.genericTools.itm.Project#getName()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_Name();

	/**
	 * Returns the meta object for the attribute '{@link es.uca.spifm.spdt.genericTools.itm.Project#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see es.uca.spifm.spdt.genericTools.itm.Project#getDescription()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uca.spifm.spdt.genericTools.itm.Project#getVersions <em>Versions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Versions</em>'.
	 * @see es.uca.spifm.spdt.genericTools.itm.Project#getVersions()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Versions();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uca.spifm.spdt.genericTools.itm.Project#getIssueCategories <em>Issue Categories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Issue Categories</em>'.
	 * @see es.uca.spifm.spdt.genericTools.itm.Project#getIssueCategories()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_IssueCategories();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uca.spifm.spdt.genericTools.itm.Project#getMembers <em>Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Members</em>'.
	 * @see es.uca.spifm.spdt.genericTools.itm.Project#getMembers()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Members();

	/**
	 * Returns the meta object for class '{@link es.uca.spifm.spdt.genericTools.itm.Version <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Version</em>'.
	 * @see es.uca.spifm.spdt.genericTools.itm.Version
	 * @generated
	 */
	EClass getVersion();

	/**
	 * Returns the meta object for the attribute '{@link es.uca.spifm.spdt.genericTools.itm.Version#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see es.uca.spifm.spdt.genericTools.itm.Version#getDescription()
	 * @see #getVersion()
	 * @generated
	 */
	EAttribute getVersion_Description();

	/**
	 * Returns the meta object for the attribute '{@link es.uca.spifm.spdt.genericTools.itm.Version#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.uca.spifm.spdt.genericTools.itm.Version#getName()
	 * @see #getVersion()
	 * @generated
	 */
	EAttribute getVersion_Name();

	/**
	 * Returns the meta object for the attribute '{@link es.uca.spifm.spdt.genericTools.itm.Version#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see es.uca.spifm.spdt.genericTools.itm.Version#getStatus()
	 * @see #getVersion()
	 * @generated
	 */
	EAttribute getVersion_Status();

	/**
	 * Returns the meta object for the attribute '{@link es.uca.spifm.spdt.genericTools.itm.Version#getDueDate <em>Due Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Due Date</em>'.
	 * @see es.uca.spifm.spdt.genericTools.itm.Version#getDueDate()
	 * @see #getVersion()
	 * @generated
	 */
	EAttribute getVersion_DueDate();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uca.spifm.spdt.genericTools.itm.Version#getIssues <em>Issues</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Issues</em>'.
	 * @see es.uca.spifm.spdt.genericTools.itm.Version#getIssues()
	 * @see #getVersion()
	 * @generated
	 */
	EReference getVersion_Issues();

	/**
	 * Returns the meta object for class '{@link es.uca.spifm.spdt.genericTools.itm.Issue <em>Issue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Issue</em>'.
	 * @see es.uca.spifm.spdt.genericTools.itm.Issue
	 * @generated
	 */
	EClass getIssue();

	/**
	 * Returns the meta object for the attribute '{@link es.uca.spifm.spdt.genericTools.itm.Issue#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.uca.spifm.spdt.genericTools.itm.Issue#getName()
	 * @see #getIssue()
	 * @generated
	 */
	EAttribute getIssue_Name();

	/**
	 * Returns the meta object for the attribute '{@link es.uca.spifm.spdt.genericTools.itm.Issue#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see es.uca.spifm.spdt.genericTools.itm.Issue#getDescription()
	 * @see #getIssue()
	 * @generated
	 */
	EAttribute getIssue_Description();

	/**
	 * Returns the meta object for the attribute '{@link es.uca.spifm.spdt.genericTools.itm.Issue#getDoneRatio <em>Done Ratio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Done Ratio</em>'.
	 * @see es.uca.spifm.spdt.genericTools.itm.Issue#getDoneRatio()
	 * @see #getIssue()
	 * @generated
	 */
	EAttribute getIssue_DoneRatio();

	/**
	 * Returns the meta object for the attribute '{@link es.uca.spifm.spdt.genericTools.itm.Issue#getEstimatedHours <em>Estimated Hours</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Estimated Hours</em>'.
	 * @see es.uca.spifm.spdt.genericTools.itm.Issue#getEstimatedHours()
	 * @see #getIssue()
	 * @generated
	 */
	EAttribute getIssue_EstimatedHours();

	/**
	 * Returns the meta object for the attribute '{@link es.uca.spifm.spdt.genericTools.itm.Issue#getElapsedHours <em>Elapsed Hours</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Elapsed Hours</em>'.
	 * @see es.uca.spifm.spdt.genericTools.itm.Issue#getElapsedHours()
	 * @see #getIssue()
	 * @generated
	 */
	EAttribute getIssue_ElapsedHours();

	/**
	 * Returns the meta object for the reference '{@link es.uca.spifm.spdt.genericTools.itm.Issue#getTracker <em>Tracker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tracker</em>'.
	 * @see es.uca.spifm.spdt.genericTools.itm.Issue#getTracker()
	 * @see #getIssue()
	 * @generated
	 */
	EReference getIssue_Tracker();

	/**
	 * Returns the meta object for the attribute '{@link es.uca.spifm.spdt.genericTools.itm.Issue#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see es.uca.spifm.spdt.genericTools.itm.Issue#getStatus()
	 * @see #getIssue()
	 * @generated
	 */
	EAttribute getIssue_Status();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uca.spifm.spdt.genericTools.itm.Issue#getDependencies <em>Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dependencies</em>'.
	 * @see es.uca.spifm.spdt.genericTools.itm.Issue#getDependencies()
	 * @see #getIssue()
	 * @generated
	 */
	EReference getIssue_Dependencies();

	/**
	 * Returns the meta object for the reference '{@link es.uca.spifm.spdt.genericTools.itm.Issue#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Category</em>'.
	 * @see es.uca.spifm.spdt.genericTools.itm.Issue#getCategory()
	 * @see #getIssue()
	 * @generated
	 */
	EReference getIssue_Category();

	/**
	 * Returns the meta object for the attribute '{@link es.uca.spifm.spdt.genericTools.itm.Issue#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see es.uca.spifm.spdt.genericTools.itm.Issue#getPriority()
	 * @see #getIssue()
	 * @generated
	 */
	EAttribute getIssue_Priority();

	/**
	 * Returns the meta object for the attribute '{@link es.uca.spifm.spdt.genericTools.itm.Issue#getDueDate <em>Due Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Due Date</em>'.
	 * @see es.uca.spifm.spdt.genericTools.itm.Issue#getDueDate()
	 * @see #getIssue()
	 * @generated
	 */
	EAttribute getIssue_DueDate();

	/**
	 * Returns the meta object for the attribute '{@link es.uca.spifm.spdt.genericTools.itm.Issue#getCompletedDate <em>Completed Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Completed Date</em>'.
	 * @see es.uca.spifm.spdt.genericTools.itm.Issue#getCompletedDate()
	 * @see #getIssue()
	 * @generated
	 */
	EAttribute getIssue_CompletedDate();

	/**
	 * Returns the meta object for the reference '{@link es.uca.spifm.spdt.genericTools.itm.Issue#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owner</em>'.
	 * @see es.uca.spifm.spdt.genericTools.itm.Issue#getOwner()
	 * @see #getIssue()
	 * @generated
	 */
	EReference getIssue_Owner();

	/**
	 * Returns the meta object for the reference '{@link es.uca.spifm.spdt.genericTools.itm.Issue#getResponsible <em>Responsible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Responsible</em>'.
	 * @see es.uca.spifm.spdt.genericTools.itm.Issue#getResponsible()
	 * @see #getIssue()
	 * @generated
	 */
	EReference getIssue_Responsible();

	/**
	 * Returns the meta object for class '{@link es.uca.spifm.spdt.genericTools.itm.Tracker <em>Tracker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tracker</em>'.
	 * @see es.uca.spifm.spdt.genericTools.itm.Tracker
	 * @generated
	 */
	EClass getTracker();

	/**
	 * Returns the meta object for the attribute '{@link es.uca.spifm.spdt.genericTools.itm.Tracker#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.uca.spifm.spdt.genericTools.itm.Tracker#getName()
	 * @see #getTracker()
	 * @generated
	 */
	EAttribute getTracker_Name();

	/**
	 * Returns the meta object for class '{@link es.uca.spifm.spdt.genericTools.itm.IssueDependency <em>Issue Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Issue Dependency</em>'.
	 * @see es.uca.spifm.spdt.genericTools.itm.IssueDependency
	 * @generated
	 */
	EClass getIssueDependency();

	/**
	 * Returns the meta object for the attribute '{@link es.uca.spifm.spdt.genericTools.itm.IssueDependency#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see es.uca.spifm.spdt.genericTools.itm.IssueDependency#getType()
	 * @see #getIssueDependency()
	 * @generated
	 */
	EAttribute getIssueDependency_Type();

	/**
	 * Returns the meta object for the reference '{@link es.uca.spifm.spdt.genericTools.itm.IssueDependency#getDependentTask <em>Dependent Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dependent Task</em>'.
	 * @see es.uca.spifm.spdt.genericTools.itm.IssueDependency#getDependentTask()
	 * @see #getIssueDependency()
	 * @generated
	 */
	EReference getIssueDependency_DependentTask();

	/**
	 * Returns the meta object for class '{@link es.uca.spifm.spdt.genericTools.itm.IssueCategory <em>Issue Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Issue Category</em>'.
	 * @see es.uca.spifm.spdt.genericTools.itm.IssueCategory
	 * @generated
	 */
	EClass getIssueCategory();

	/**
	 * Returns the meta object for the attribute '{@link es.uca.spifm.spdt.genericTools.itm.IssueCategory#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.uca.spifm.spdt.genericTools.itm.IssueCategory#getName()
	 * @see #getIssueCategory()
	 * @generated
	 */
	EAttribute getIssueCategory_Name();

	/**
	 * Returns the meta object for class '{@link es.uca.spifm.spdt.genericTools.itm.Member <em>Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Member</em>'.
	 * @see es.uca.spifm.spdt.genericTools.itm.Member
	 * @generated
	 */
	EClass getMember();

	/**
	 * Returns the meta object for the reference '{@link es.uca.spifm.spdt.genericTools.itm.Member#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>User</em>'.
	 * @see es.uca.spifm.spdt.genericTools.itm.Member#getUser()
	 * @see #getMember()
	 * @generated
	 */
	EReference getMember_User();

	/**
	 * Returns the meta object for the reference '{@link es.uca.spifm.spdt.genericTools.itm.Member#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role</em>'.
	 * @see es.uca.spifm.spdt.genericTools.itm.Member#getRole()
	 * @see #getMember()
	 * @generated
	 */
	EReference getMember_Role();

	/**
	 * Returns the meta object for class '{@link es.uca.spifm.spdt.genericTools.itm.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User</em>'.
	 * @see es.uca.spifm.spdt.genericTools.itm.User
	 * @generated
	 */
	EClass getUser();

	/**
	 * Returns the meta object for the attribute '{@link es.uca.spifm.spdt.genericTools.itm.User#getLogin <em>Login</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Login</em>'.
	 * @see es.uca.spifm.spdt.genericTools.itm.User#getLogin()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Login();

	/**
	 * Returns the meta object for the attribute '{@link es.uca.spifm.spdt.genericTools.itm.User#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see es.uca.spifm.spdt.genericTools.itm.User#getLanguage()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Language();

	/**
	 * Returns the meta object for class '{@link es.uca.spifm.spdt.genericTools.itm.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role</em>'.
	 * @see es.uca.spifm.spdt.genericTools.itm.Role
	 * @generated
	 */
	EClass getRole();

	/**
	 * Returns the meta object for the attribute '{@link es.uca.spifm.spdt.genericTools.itm.Role#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.uca.spifm.spdt.genericTools.itm.Role#getName()
	 * @see #getRole()
	 * @generated
	 */
	EAttribute getRole_Name();

	/**
	 * Returns the meta object for the attribute '{@link es.uca.spifm.spdt.genericTools.itm.Role#getPermissions <em>Permissions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Permissions</em>'.
	 * @see es.uca.spifm.spdt.genericTools.itm.Role#getPermissions()
	 * @see #getRole()
	 * @generated
	 */
	EAttribute getRole_Permissions();

	/**
	 * Returns the meta object for enum '{@link es.uca.spifm.spdt.genericTools.itm.IssueStatus <em>Issue Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Issue Status</em>'.
	 * @see es.uca.spifm.spdt.genericTools.itm.IssueStatus
	 * @generated
	 */
	EEnum getIssueStatus();

	/**
	 * Returns the meta object for enum '{@link es.uca.spifm.spdt.genericTools.itm.VersionStatus <em>Version Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Version Status</em>'.
	 * @see es.uca.spifm.spdt.genericTools.itm.VersionStatus
	 * @generated
	 */
	EEnum getVersionStatus();

	/**
	 * Returns the meta object for enum '{@link es.uca.spifm.spdt.genericTools.itm.DependencyType <em>Dependency Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Dependency Type</em>'.
	 * @see es.uca.spifm.spdt.genericTools.itm.DependencyType
	 * @generated
	 */
	EEnum getDependencyType();

	/**
	 * Returns the meta object for enum '{@link es.uca.spifm.spdt.genericTools.itm.IssuePriority <em>Issue Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Issue Priority</em>'.
	 * @see es.uca.spifm.spdt.genericTools.itm.IssuePriority
	 * @generated
	 */
	EEnum getIssuePriority();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ItmFactory getItmFactory();

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
		 * The meta object literal for the '{@link es.uca.spifm.spdt.genericTools.itm.impl.IssueTrackingDatabaseImpl <em>Issue Tracking Database</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uca.spifm.spdt.genericTools.itm.impl.IssueTrackingDatabaseImpl
		 * @see es.uca.spifm.spdt.genericTools.itm.impl.ItmPackageImpl#getIssueTrackingDatabase()
		 * @generated
		 */
		EClass ISSUE_TRACKING_DATABASE = eINSTANCE.getIssueTrackingDatabase();

		/**
		 * The meta object literal for the '<em><b>Projects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISSUE_TRACKING_DATABASE__PROJECTS = eINSTANCE.getIssueTrackingDatabase_Projects();

		/**
		 * The meta object literal for the '<em><b>Trackers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISSUE_TRACKING_DATABASE__TRACKERS = eINSTANCE.getIssueTrackingDatabase_Trackers();

		/**
		 * The meta object literal for the '<em><b>Roles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISSUE_TRACKING_DATABASE__ROLES = eINSTANCE.getIssueTrackingDatabase_Roles();

		/**
		 * The meta object literal for the '<em><b>Users</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISSUE_TRACKING_DATABASE__USERS = eINSTANCE.getIssueTrackingDatabase_Users();

		/**
		 * The meta object literal for the '{@link es.uca.spifm.spdt.genericTools.itm.impl.ProjectImpl <em>Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uca.spifm.spdt.genericTools.itm.impl.ProjectImpl
		 * @see es.uca.spifm.spdt.genericTools.itm.impl.ItmPackageImpl#getProject()
		 * @generated
		 */
		EClass PROJECT = eINSTANCE.getProject();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__NAME = eINSTANCE.getProject_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__DESCRIPTION = eINSTANCE.getProject_Description();

		/**
		 * The meta object literal for the '<em><b>Versions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__VERSIONS = eINSTANCE.getProject_Versions();

		/**
		 * The meta object literal for the '<em><b>Issue Categories</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__ISSUE_CATEGORIES = eINSTANCE.getProject_IssueCategories();

		/**
		 * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__MEMBERS = eINSTANCE.getProject_Members();

		/**
		 * The meta object literal for the '{@link es.uca.spifm.spdt.genericTools.itm.impl.VersionImpl <em>Version</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uca.spifm.spdt.genericTools.itm.impl.VersionImpl
		 * @see es.uca.spifm.spdt.genericTools.itm.impl.ItmPackageImpl#getVersion()
		 * @generated
		 */
		EClass VERSION = eINSTANCE.getVersion();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERSION__DESCRIPTION = eINSTANCE.getVersion_Description();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERSION__NAME = eINSTANCE.getVersion_Name();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERSION__STATUS = eINSTANCE.getVersion_Status();

		/**
		 * The meta object literal for the '<em><b>Due Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERSION__DUE_DATE = eINSTANCE.getVersion_DueDate();

		/**
		 * The meta object literal for the '<em><b>Issues</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERSION__ISSUES = eINSTANCE.getVersion_Issues();

		/**
		 * The meta object literal for the '{@link es.uca.spifm.spdt.genericTools.itm.impl.IssueImpl <em>Issue</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uca.spifm.spdt.genericTools.itm.impl.IssueImpl
		 * @see es.uca.spifm.spdt.genericTools.itm.impl.ItmPackageImpl#getIssue()
		 * @generated
		 */
		EClass ISSUE = eINSTANCE.getIssue();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISSUE__NAME = eINSTANCE.getIssue_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISSUE__DESCRIPTION = eINSTANCE.getIssue_Description();

		/**
		 * The meta object literal for the '<em><b>Done Ratio</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISSUE__DONE_RATIO = eINSTANCE.getIssue_DoneRatio();

		/**
		 * The meta object literal for the '<em><b>Estimated Hours</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISSUE__ESTIMATED_HOURS = eINSTANCE.getIssue_EstimatedHours();

		/**
		 * The meta object literal for the '<em><b>Elapsed Hours</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISSUE__ELAPSED_HOURS = eINSTANCE.getIssue_ElapsedHours();

		/**
		 * The meta object literal for the '<em><b>Tracker</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISSUE__TRACKER = eINSTANCE.getIssue_Tracker();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISSUE__STATUS = eINSTANCE.getIssue_Status();

		/**
		 * The meta object literal for the '<em><b>Dependencies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISSUE__DEPENDENCIES = eINSTANCE.getIssue_Dependencies();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISSUE__CATEGORY = eINSTANCE.getIssue_Category();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISSUE__PRIORITY = eINSTANCE.getIssue_Priority();

		/**
		 * The meta object literal for the '<em><b>Due Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISSUE__DUE_DATE = eINSTANCE.getIssue_DueDate();

		/**
		 * The meta object literal for the '<em><b>Completed Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISSUE__COMPLETED_DATE = eINSTANCE.getIssue_CompletedDate();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISSUE__OWNER = eINSTANCE.getIssue_Owner();

		/**
		 * The meta object literal for the '<em><b>Responsible</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISSUE__RESPONSIBLE = eINSTANCE.getIssue_Responsible();

		/**
		 * The meta object literal for the '{@link es.uca.spifm.spdt.genericTools.itm.impl.TrackerImpl <em>Tracker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uca.spifm.spdt.genericTools.itm.impl.TrackerImpl
		 * @see es.uca.spifm.spdt.genericTools.itm.impl.ItmPackageImpl#getTracker()
		 * @generated
		 */
		EClass TRACKER = eINSTANCE.getTracker();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACKER__NAME = eINSTANCE.getTracker_Name();

		/**
		 * The meta object literal for the '{@link es.uca.spifm.spdt.genericTools.itm.impl.IssueDependencyImpl <em>Issue Dependency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uca.spifm.spdt.genericTools.itm.impl.IssueDependencyImpl
		 * @see es.uca.spifm.spdt.genericTools.itm.impl.ItmPackageImpl#getIssueDependency()
		 * @generated
		 */
		EClass ISSUE_DEPENDENCY = eINSTANCE.getIssueDependency();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISSUE_DEPENDENCY__TYPE = eINSTANCE.getIssueDependency_Type();

		/**
		 * The meta object literal for the '<em><b>Dependent Task</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISSUE_DEPENDENCY__DEPENDENT_TASK = eINSTANCE.getIssueDependency_DependentTask();

		/**
		 * The meta object literal for the '{@link es.uca.spifm.spdt.genericTools.itm.impl.IssueCategoryImpl <em>Issue Category</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uca.spifm.spdt.genericTools.itm.impl.IssueCategoryImpl
		 * @see es.uca.spifm.spdt.genericTools.itm.impl.ItmPackageImpl#getIssueCategory()
		 * @generated
		 */
		EClass ISSUE_CATEGORY = eINSTANCE.getIssueCategory();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISSUE_CATEGORY__NAME = eINSTANCE.getIssueCategory_Name();

		/**
		 * The meta object literal for the '{@link es.uca.spifm.spdt.genericTools.itm.impl.MemberImpl <em>Member</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uca.spifm.spdt.genericTools.itm.impl.MemberImpl
		 * @see es.uca.spifm.spdt.genericTools.itm.impl.ItmPackageImpl#getMember()
		 * @generated
		 */
		EClass MEMBER = eINSTANCE.getMember();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMBER__USER = eINSTANCE.getMember_User();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMBER__ROLE = eINSTANCE.getMember_Role();

		/**
		 * The meta object literal for the '{@link es.uca.spifm.spdt.genericTools.itm.impl.UserImpl <em>User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uca.spifm.spdt.genericTools.itm.impl.UserImpl
		 * @see es.uca.spifm.spdt.genericTools.itm.impl.ItmPackageImpl#getUser()
		 * @generated
		 */
		EClass USER = eINSTANCE.getUser();

		/**
		 * The meta object literal for the '<em><b>Login</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__LOGIN = eINSTANCE.getUser_Login();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__LANGUAGE = eINSTANCE.getUser_Language();

		/**
		 * The meta object literal for the '{@link es.uca.spifm.spdt.genericTools.itm.impl.RoleImpl <em>Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uca.spifm.spdt.genericTools.itm.impl.RoleImpl
		 * @see es.uca.spifm.spdt.genericTools.itm.impl.ItmPackageImpl#getRole()
		 * @generated
		 */
		EClass ROLE = eINSTANCE.getRole();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE__NAME = eINSTANCE.getRole_Name();

		/**
		 * The meta object literal for the '<em><b>Permissions</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE__PERMISSIONS = eINSTANCE.getRole_Permissions();

		/**
		 * The meta object literal for the '{@link es.uca.spifm.spdt.genericTools.itm.IssueStatus <em>Issue Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uca.spifm.spdt.genericTools.itm.IssueStatus
		 * @see es.uca.spifm.spdt.genericTools.itm.impl.ItmPackageImpl#getIssueStatus()
		 * @generated
		 */
		EEnum ISSUE_STATUS = eINSTANCE.getIssueStatus();

		/**
		 * The meta object literal for the '{@link es.uca.spifm.spdt.genericTools.itm.VersionStatus <em>Version Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uca.spifm.spdt.genericTools.itm.VersionStatus
		 * @see es.uca.spifm.spdt.genericTools.itm.impl.ItmPackageImpl#getVersionStatus()
		 * @generated
		 */
		EEnum VERSION_STATUS = eINSTANCE.getVersionStatus();

		/**
		 * The meta object literal for the '{@link es.uca.spifm.spdt.genericTools.itm.DependencyType <em>Dependency Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uca.spifm.spdt.genericTools.itm.DependencyType
		 * @see es.uca.spifm.spdt.genericTools.itm.impl.ItmPackageImpl#getDependencyType()
		 * @generated
		 */
		EEnum DEPENDENCY_TYPE = eINSTANCE.getDependencyType();

		/**
		 * The meta object literal for the '{@link es.uca.spifm.spdt.genericTools.itm.IssuePriority <em>Issue Priority</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uca.spifm.spdt.genericTools.itm.IssuePriority
		 * @see es.uca.spifm.spdt.genericTools.itm.impl.ItmPackageImpl#getIssuePriority()
		 * @generated
		 */
		EEnum ISSUE_PRIORITY = eINSTANCE.getIssuePriority();

	}

} //ItmPackage
