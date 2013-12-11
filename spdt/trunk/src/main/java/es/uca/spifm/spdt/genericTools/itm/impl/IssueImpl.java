/**
 * Created by Ivan Ruiz
 */
package es.uca.spifm.spdt.genericTools.itm.impl;

import es.uca.spifm.spdt.genericTools.itm.Issue;
import es.uca.spifm.spdt.genericTools.itm.IssueCategory;
import es.uca.spifm.spdt.genericTools.itm.IssueDependency;
import es.uca.spifm.spdt.genericTools.itm.IssuePriority;
import es.uca.spifm.spdt.genericTools.itm.IssueStatus;
import es.uca.spifm.spdt.genericTools.itm.ItmPackage;
import es.uca.spifm.spdt.genericTools.itm.Member;
import es.uca.spifm.spdt.genericTools.itm.Tracker;

import java.util.Collection;
import java.util.Date;

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
 * An implementation of the model object '<em><b>Issue</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.uca.spifm.spdt.genericTools.itm.impl.IssueImpl#getName <em>Name</em>}</li>
 *   <li>{@link es.uca.spifm.spdt.genericTools.itm.impl.IssueImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link es.uca.spifm.spdt.genericTools.itm.impl.IssueImpl#getDoneRatio <em>Done Ratio</em>}</li>
 *   <li>{@link es.uca.spifm.spdt.genericTools.itm.impl.IssueImpl#getEstimatedHours <em>Estimated Hours</em>}</li>
 *   <li>{@link es.uca.spifm.spdt.genericTools.itm.impl.IssueImpl#getElapsedHours <em>Elapsed Hours</em>}</li>
 *   <li>{@link es.uca.spifm.spdt.genericTools.itm.impl.IssueImpl#getTracker <em>Tracker</em>}</li>
 *   <li>{@link es.uca.spifm.spdt.genericTools.itm.impl.IssueImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link es.uca.spifm.spdt.genericTools.itm.impl.IssueImpl#getDependencies <em>Dependencies</em>}</li>
 *   <li>{@link es.uca.spifm.spdt.genericTools.itm.impl.IssueImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link es.uca.spifm.spdt.genericTools.itm.impl.IssueImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link es.uca.spifm.spdt.genericTools.itm.impl.IssueImpl#getDueDate <em>Due Date</em>}</li>
 *   <li>{@link es.uca.spifm.spdt.genericTools.itm.impl.IssueImpl#getCompletedDate <em>Completed Date</em>}</li>
 *   <li>{@link es.uca.spifm.spdt.genericTools.itm.impl.IssueImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link es.uca.spifm.spdt.genericTools.itm.impl.IssueImpl#getResponsible <em>Responsible</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IssueImpl extends MinimalEObjectImpl.Container implements Issue {
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
	 * The default value of the '{@link #getDoneRatio() <em>Done Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoneRatio()
	 * @generated
	 * @ordered
	 */
	protected static final float DONE_RATIO_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getDoneRatio() <em>Done Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoneRatio()
	 * @generated
	 * @ordered
	 */
	protected float doneRatio = DONE_RATIO_EDEFAULT;

	/**
	 * The default value of the '{@link #getEstimatedHours() <em>Estimated Hours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimatedHours()
	 * @generated
	 * @ordered
	 */
	protected static final float ESTIMATED_HOURS_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getEstimatedHours() <em>Estimated Hours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimatedHours()
	 * @generated
	 * @ordered
	 */
	protected float estimatedHours = ESTIMATED_HOURS_EDEFAULT;

	/**
	 * The default value of the '{@link #getElapsedHours() <em>Elapsed Hours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElapsedHours()
	 * @generated
	 * @ordered
	 */
	protected static final float ELAPSED_HOURS_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getElapsedHours() <em>Elapsed Hours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElapsedHours()
	 * @generated
	 * @ordered
	 */
	protected float elapsedHours = ELAPSED_HOURS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTracker() <em>Tracker</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTracker()
	 * @generated
	 * @ordered
	 */
	protected Tracker tracker;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final IssueStatus STATUS_EDEFAULT = IssueStatus.OPEN;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected IssueStatus status = STATUS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDependencies() <em>Dependencies</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependencies()
	 * @generated
	 * @ordered
	 */
	protected EList<IssueDependency> dependencies;

	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected IssueCategory category;

	/**
	 * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected static final IssuePriority PRIORITY_EDEFAULT = IssuePriority.HIGHER;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected IssuePriority priority = PRIORITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDueDate() <em>Due Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDueDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date DUE_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDueDate() <em>Due Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDueDate()
	 * @generated
	 * @ordered
	 */
	protected Date dueDate = DUE_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCompletedDate() <em>Completed Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompletedDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date COMPLETED_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCompletedDate() <em>Completed Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompletedDate()
	 * @generated
	 * @ordered
	 */
	protected Date completedDate = COMPLETED_DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOwner() <em>Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwner()
	 * @generated
	 * @ordered
	 */
	protected Member owner;

	/**
	 * The cached value of the '{@link #getResponsible() <em>Responsible</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsible()
	 * @generated
	 * @ordered
	 */
	protected Member responsible;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IssueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ItmPackage.Literals.ISSUE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ItmPackage.ISSUE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ItmPackage.ISSUE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getDoneRatio() {
		return doneRatio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDoneRatio(float newDoneRatio) {
		float oldDoneRatio = doneRatio;
		doneRatio = newDoneRatio;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ItmPackage.ISSUE__DONE_RATIO, oldDoneRatio, doneRatio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getEstimatedHours() {
		return estimatedHours;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstimatedHours(float newEstimatedHours) {
		float oldEstimatedHours = estimatedHours;
		estimatedHours = newEstimatedHours;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ItmPackage.ISSUE__ESTIMATED_HOURS, oldEstimatedHours, estimatedHours));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getElapsedHours() {
		return elapsedHours;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElapsedHours(float newElapsedHours) {
		float oldElapsedHours = elapsedHours;
		elapsedHours = newElapsedHours;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ItmPackage.ISSUE__ELAPSED_HOURS, oldElapsedHours, elapsedHours));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tracker getTracker() {
		if (tracker != null && tracker.eIsProxy()) {
			InternalEObject oldTracker = (InternalEObject)tracker;
			tracker = (Tracker)eResolveProxy(oldTracker);
			if (tracker != oldTracker) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ItmPackage.ISSUE__TRACKER, oldTracker, tracker));
			}
		}
		return tracker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tracker basicGetTracker() {
		return tracker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTracker(Tracker newTracker) {
		Tracker oldTracker = tracker;
		tracker = newTracker;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ItmPackage.ISSUE__TRACKER, oldTracker, tracker));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IssueStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(IssueStatus newStatus) {
		IssueStatus oldStatus = status;
		status = newStatus == null ? STATUS_EDEFAULT : newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ItmPackage.ISSUE__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IssueDependency> getDependencies() {
		if (dependencies == null) {
			dependencies = new EObjectContainmentEList<IssueDependency>(IssueDependency.class, this, ItmPackage.ISSUE__DEPENDENCIES);
		}
		return dependencies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IssueCategory getCategory() {
		if (category != null && category.eIsProxy()) {
			InternalEObject oldCategory = (InternalEObject)category;
			category = (IssueCategory)eResolveProxy(oldCategory);
			if (category != oldCategory) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ItmPackage.ISSUE__CATEGORY, oldCategory, category));
			}
		}
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IssueCategory basicGetCategory() {
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategory(IssueCategory newCategory) {
		IssueCategory oldCategory = category;
		category = newCategory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ItmPackage.ISSUE__CATEGORY, oldCategory, category));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IssuePriority getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriority(IssuePriority newPriority) {
		IssuePriority oldPriority = priority;
		priority = newPriority == null ? PRIORITY_EDEFAULT : newPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ItmPackage.ISSUE__PRIORITY, oldPriority, priority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDueDate() {
		return dueDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDueDate(Date newDueDate) {
		Date oldDueDate = dueDate;
		dueDate = newDueDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ItmPackage.ISSUE__DUE_DATE, oldDueDate, dueDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getCompletedDate() {
		return completedDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompletedDate(Date newCompletedDate) {
		Date oldCompletedDate = completedDate;
		completedDate = newCompletedDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ItmPackage.ISSUE__COMPLETED_DATE, oldCompletedDate, completedDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Member getOwner() {
		if (owner != null && owner.eIsProxy()) {
			InternalEObject oldOwner = (InternalEObject)owner;
			owner = (Member)eResolveProxy(oldOwner);
			if (owner != oldOwner) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ItmPackage.ISSUE__OWNER, oldOwner, owner));
			}
		}
		return owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Member basicGetOwner() {
		return owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwner(Member newOwner) {
		Member oldOwner = owner;
		owner = newOwner;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ItmPackage.ISSUE__OWNER, oldOwner, owner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Member getResponsible() {
		if (responsible != null && responsible.eIsProxy()) {
			InternalEObject oldResponsible = (InternalEObject)responsible;
			responsible = (Member)eResolveProxy(oldResponsible);
			if (responsible != oldResponsible) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ItmPackage.ISSUE__RESPONSIBLE, oldResponsible, responsible));
			}
		}
		return responsible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Member basicGetResponsible() {
		return responsible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponsible(Member newResponsible) {
		Member oldResponsible = responsible;
		responsible = newResponsible;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ItmPackage.ISSUE__RESPONSIBLE, oldResponsible, responsible));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ItmPackage.ISSUE__DEPENDENCIES:
				return ((InternalEList<?>)getDependencies()).basicRemove(otherEnd, msgs);
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
			case ItmPackage.ISSUE__NAME:
				return getName();
			case ItmPackage.ISSUE__DESCRIPTION:
				return getDescription();
			case ItmPackage.ISSUE__DONE_RATIO:
				return getDoneRatio();
			case ItmPackage.ISSUE__ESTIMATED_HOURS:
				return getEstimatedHours();
			case ItmPackage.ISSUE__ELAPSED_HOURS:
				return getElapsedHours();
			case ItmPackage.ISSUE__TRACKER:
				if (resolve) return getTracker();
				return basicGetTracker();
			case ItmPackage.ISSUE__STATUS:
				return getStatus();
			case ItmPackage.ISSUE__DEPENDENCIES:
				return getDependencies();
			case ItmPackage.ISSUE__CATEGORY:
				if (resolve) return getCategory();
				return basicGetCategory();
			case ItmPackage.ISSUE__PRIORITY:
				return getPriority();
			case ItmPackage.ISSUE__DUE_DATE:
				return getDueDate();
			case ItmPackage.ISSUE__COMPLETED_DATE:
				return getCompletedDate();
			case ItmPackage.ISSUE__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case ItmPackage.ISSUE__RESPONSIBLE:
				if (resolve) return getResponsible();
				return basicGetResponsible();
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
			case ItmPackage.ISSUE__NAME:
				setName((String)newValue);
				return;
			case ItmPackage.ISSUE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ItmPackage.ISSUE__DONE_RATIO:
				setDoneRatio((Float)newValue);
				return;
			case ItmPackage.ISSUE__ESTIMATED_HOURS:
				setEstimatedHours((Float)newValue);
				return;
			case ItmPackage.ISSUE__ELAPSED_HOURS:
				setElapsedHours((Float)newValue);
				return;
			case ItmPackage.ISSUE__TRACKER:
				setTracker((Tracker)newValue);
				return;
			case ItmPackage.ISSUE__STATUS:
				setStatus((IssueStatus)newValue);
				return;
			case ItmPackage.ISSUE__DEPENDENCIES:
				getDependencies().clear();
				getDependencies().addAll((Collection<? extends IssueDependency>)newValue);
				return;
			case ItmPackage.ISSUE__CATEGORY:
				setCategory((IssueCategory)newValue);
				return;
			case ItmPackage.ISSUE__PRIORITY:
				setPriority((IssuePriority)newValue);
				return;
			case ItmPackage.ISSUE__DUE_DATE:
				setDueDate((Date)newValue);
				return;
			case ItmPackage.ISSUE__COMPLETED_DATE:
				setCompletedDate((Date)newValue);
				return;
			case ItmPackage.ISSUE__OWNER:
				setOwner((Member)newValue);
				return;
			case ItmPackage.ISSUE__RESPONSIBLE:
				setResponsible((Member)newValue);
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
			case ItmPackage.ISSUE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ItmPackage.ISSUE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ItmPackage.ISSUE__DONE_RATIO:
				setDoneRatio(DONE_RATIO_EDEFAULT);
				return;
			case ItmPackage.ISSUE__ESTIMATED_HOURS:
				setEstimatedHours(ESTIMATED_HOURS_EDEFAULT);
				return;
			case ItmPackage.ISSUE__ELAPSED_HOURS:
				setElapsedHours(ELAPSED_HOURS_EDEFAULT);
				return;
			case ItmPackage.ISSUE__TRACKER:
				setTracker((Tracker)null);
				return;
			case ItmPackage.ISSUE__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case ItmPackage.ISSUE__DEPENDENCIES:
				getDependencies().clear();
				return;
			case ItmPackage.ISSUE__CATEGORY:
				setCategory((IssueCategory)null);
				return;
			case ItmPackage.ISSUE__PRIORITY:
				setPriority(PRIORITY_EDEFAULT);
				return;
			case ItmPackage.ISSUE__DUE_DATE:
				setDueDate(DUE_DATE_EDEFAULT);
				return;
			case ItmPackage.ISSUE__COMPLETED_DATE:
				setCompletedDate(COMPLETED_DATE_EDEFAULT);
				return;
			case ItmPackage.ISSUE__OWNER:
				setOwner((Member)null);
				return;
			case ItmPackage.ISSUE__RESPONSIBLE:
				setResponsible((Member)null);
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
			case ItmPackage.ISSUE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ItmPackage.ISSUE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case ItmPackage.ISSUE__DONE_RATIO:
				return doneRatio != DONE_RATIO_EDEFAULT;
			case ItmPackage.ISSUE__ESTIMATED_HOURS:
				return estimatedHours != ESTIMATED_HOURS_EDEFAULT;
			case ItmPackage.ISSUE__ELAPSED_HOURS:
				return elapsedHours != ELAPSED_HOURS_EDEFAULT;
			case ItmPackage.ISSUE__TRACKER:
				return tracker != null;
			case ItmPackage.ISSUE__STATUS:
				return status != STATUS_EDEFAULT;
			case ItmPackage.ISSUE__DEPENDENCIES:
				return dependencies != null && !dependencies.isEmpty();
			case ItmPackage.ISSUE__CATEGORY:
				return category != null;
			case ItmPackage.ISSUE__PRIORITY:
				return priority != PRIORITY_EDEFAULT;
			case ItmPackage.ISSUE__DUE_DATE:
				return DUE_DATE_EDEFAULT == null ? dueDate != null : !DUE_DATE_EDEFAULT.equals(dueDate);
			case ItmPackage.ISSUE__COMPLETED_DATE:
				return COMPLETED_DATE_EDEFAULT == null ? completedDate != null : !COMPLETED_DATE_EDEFAULT.equals(completedDate);
			case ItmPackage.ISSUE__OWNER:
				return owner != null;
			case ItmPackage.ISSUE__RESPONSIBLE:
				return responsible != null;
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
		result.append(", doneRatio: ");
		result.append(doneRatio);
		result.append(", estimatedHours: ");
		result.append(estimatedHours);
		result.append(", elapsedHours: ");
		result.append(elapsedHours);
		result.append(", status: ");
		result.append(status);
		result.append(", priority: ");
		result.append(priority);
		result.append(", dueDate: ");
		result.append(dueDate);
		result.append(", completedDate: ");
		result.append(completedDate);
		result.append(')');
		return result.toString();
	}

} //IssueImpl
