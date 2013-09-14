/**
 * Designed by Ivan Ruiz
 */
package es.uca.spifm.spdt.deployment.swpm.impl;

import es.uca.spifm.spdt.deployment.swpm.DeliverableProduct;
import es.uca.spifm.spdt.deployment.swpm.DeliverableType;
import es.uca.spifm.spdt.deployment.swpm.SwpmPackage;
import es.uca.spifm.spdt.deployment.swpm.WorkProduct;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deliverable Product</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.uca.spifm.spdt.deployment.swpm.impl.DeliverableProductImpl#getEmbeddedWorkproducts <em>Embedded Workproducts</em>}</li>
 *   <li>{@link es.uca.spifm.spdt.deployment.swpm.impl.DeliverableProductImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeliverableProductImpl extends WorkProductImpl implements DeliverableProduct {
	/**
	 * The cached value of the '{@link #getEmbeddedWorkproducts() <em>Embedded Workproducts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmbeddedWorkproducts()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkProduct> embeddedWorkproducts;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final DeliverableType TYPE_EDEFAULT = DeliverableType.DOC;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected DeliverableType type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeliverableProductImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SwpmPackage.Literals.DELIVERABLE_PRODUCT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WorkProduct> getEmbeddedWorkproducts() {
		if (embeddedWorkproducts == null) {
			embeddedWorkproducts = new EObjectResolvingEList<WorkProduct>(WorkProduct.class, this, SwpmPackage.DELIVERABLE_PRODUCT__EMBEDDED_WORKPRODUCTS);
		}
		return embeddedWorkproducts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeliverableType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(DeliverableType newType) {
		DeliverableType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SwpmPackage.DELIVERABLE_PRODUCT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SwpmPackage.DELIVERABLE_PRODUCT__EMBEDDED_WORKPRODUCTS:
				return getEmbeddedWorkproducts();
			case SwpmPackage.DELIVERABLE_PRODUCT__TYPE:
				return getType();
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
			case SwpmPackage.DELIVERABLE_PRODUCT__EMBEDDED_WORKPRODUCTS:
				getEmbeddedWorkproducts().clear();
				getEmbeddedWorkproducts().addAll((Collection<? extends WorkProduct>)newValue);
				return;
			case SwpmPackage.DELIVERABLE_PRODUCT__TYPE:
				setType((DeliverableType)newValue);
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
			case SwpmPackage.DELIVERABLE_PRODUCT__EMBEDDED_WORKPRODUCTS:
				getEmbeddedWorkproducts().clear();
				return;
			case SwpmPackage.DELIVERABLE_PRODUCT__TYPE:
				setType(TYPE_EDEFAULT);
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
			case SwpmPackage.DELIVERABLE_PRODUCT__EMBEDDED_WORKPRODUCTS:
				return embeddedWorkproducts != null && !embeddedWorkproducts.isEmpty();
			case SwpmPackage.DELIVERABLE_PRODUCT__TYPE:
				return type != TYPE_EDEFAULT;
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

} //DeliverableProductImpl
