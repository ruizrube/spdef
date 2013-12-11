/**
 * Designed by Ivan Ruiz
 */
package es.uca.spifm.spdt.deployment.swpm.impl;

import es.uca.spifm.spdt.deployment.swpm.Model;
import es.uca.spifm.spdt.deployment.swpm.Section;
import es.uca.spifm.spdt.deployment.swpm.Specification;
import es.uca.spifm.spdt.deployment.swpm.SwpmPackage;

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
 * An implementation of the model object '<em><b>Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.uca.spifm.spdt.deployment.swpm.impl.SectionImpl#getName <em>Name</em>}</li>
 *   <li>{@link es.uca.spifm.spdt.deployment.swpm.impl.SectionImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link es.uca.spifm.spdt.deployment.swpm.impl.SectionImpl#getOrder <em>Order</em>}</li>
 *   <li>{@link es.uca.spifm.spdt.deployment.swpm.impl.SectionImpl#getEmbeddedSections <em>Embedded Sections</em>}</li>
 *   <li>{@link es.uca.spifm.spdt.deployment.swpm.impl.SectionImpl#getModels <em>Models</em>}</li>
 *   <li>{@link es.uca.spifm.spdt.deployment.swpm.impl.SectionImpl#getSpecifications <em>Specifications</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SectionImpl extends MinimalEObjectImpl.Container implements Section {
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
	 * The default value of the '{@link #getOrder() <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrder()
	 * @generated
	 * @ordered
	 */
	protected static final int ORDER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getOrder() <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrder()
	 * @generated
	 * @ordered
	 */
	protected int order = ORDER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEmbeddedSections() <em>Embedded Sections</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmbeddedSections()
	 * @generated
	 * @ordered
	 */
	protected EList<Section> embeddedSections;

	/**
	 * The cached value of the '{@link #getModels() <em>Models</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModels()
	 * @generated
	 * @ordered
	 */
	protected EList<Model> models;

	/**
	 * The cached value of the '{@link #getSpecifications() <em>Specifications</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecifications()
	 * @generated
	 * @ordered
	 */
	protected EList<Specification> specifications;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SwpmPackage.Literals.SECTION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SwpmPackage.SECTION__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SwpmPackage.SECTION__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getOrder() {
		return order;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrder(int newOrder) {
		int oldOrder = order;
		order = newOrder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SwpmPackage.SECTION__ORDER, oldOrder, order));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Section> getEmbeddedSections() {
		if (embeddedSections == null) {
			embeddedSections = new EObjectContainmentEList<Section>(Section.class, this, SwpmPackage.SECTION__EMBEDDED_SECTIONS);
		}
		return embeddedSections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Model> getModels() {
		if (models == null) {
			models = new EObjectContainmentEList<Model>(Model.class, this, SwpmPackage.SECTION__MODELS);
		}
		return models;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Specification> getSpecifications() {
		if (specifications == null) {
			specifications = new EObjectContainmentEList<Specification>(Specification.class, this, SwpmPackage.SECTION__SPECIFICATIONS);
		}
		return specifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SwpmPackage.SECTION__EMBEDDED_SECTIONS:
				return ((InternalEList<?>)getEmbeddedSections()).basicRemove(otherEnd, msgs);
			case SwpmPackage.SECTION__MODELS:
				return ((InternalEList<?>)getModels()).basicRemove(otherEnd, msgs);
			case SwpmPackage.SECTION__SPECIFICATIONS:
				return ((InternalEList<?>)getSpecifications()).basicRemove(otherEnd, msgs);
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
			case SwpmPackage.SECTION__NAME:
				return getName();
			case SwpmPackage.SECTION__DESCRIPTION:
				return getDescription();
			case SwpmPackage.SECTION__ORDER:
				return getOrder();
			case SwpmPackage.SECTION__EMBEDDED_SECTIONS:
				return getEmbeddedSections();
			case SwpmPackage.SECTION__MODELS:
				return getModels();
			case SwpmPackage.SECTION__SPECIFICATIONS:
				return getSpecifications();
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
			case SwpmPackage.SECTION__NAME:
				setName((String)newValue);
				return;
			case SwpmPackage.SECTION__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case SwpmPackage.SECTION__ORDER:
				setOrder((Integer)newValue);
				return;
			case SwpmPackage.SECTION__EMBEDDED_SECTIONS:
				getEmbeddedSections().clear();
				getEmbeddedSections().addAll((Collection<? extends Section>)newValue);
				return;
			case SwpmPackage.SECTION__MODELS:
				getModels().clear();
				getModels().addAll((Collection<? extends Model>)newValue);
				return;
			case SwpmPackage.SECTION__SPECIFICATIONS:
				getSpecifications().clear();
				getSpecifications().addAll((Collection<? extends Specification>)newValue);
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
			case SwpmPackage.SECTION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SwpmPackage.SECTION__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case SwpmPackage.SECTION__ORDER:
				setOrder(ORDER_EDEFAULT);
				return;
			case SwpmPackage.SECTION__EMBEDDED_SECTIONS:
				getEmbeddedSections().clear();
				return;
			case SwpmPackage.SECTION__MODELS:
				getModels().clear();
				return;
			case SwpmPackage.SECTION__SPECIFICATIONS:
				getSpecifications().clear();
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
			case SwpmPackage.SECTION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SwpmPackage.SECTION__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case SwpmPackage.SECTION__ORDER:
				return order != ORDER_EDEFAULT;
			case SwpmPackage.SECTION__EMBEDDED_SECTIONS:
				return embeddedSections != null && !embeddedSections.isEmpty();
			case SwpmPackage.SECTION__MODELS:
				return models != null && !models.isEmpty();
			case SwpmPackage.SECTION__SPECIFICATIONS:
				return specifications != null && !specifications.isEmpty();
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
		result.append(", order: ");
		result.append(order);
		result.append(')');
		return result.toString();
	}

} //SectionImpl
