/**
 * Created by Ivan Ruiz
 */
package es.uca.spifm.spdt.specificTools.wikim.impl;

import es.uca.spifm.spdt.specificTools.wikim.Category;
import es.uca.spifm.spdt.specificTools.wikim.WikimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Category</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.uca.spifm.spdt.specificTools.wikim.impl.CategoryImpl#getParentCategory <em>Parent Category</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CategoryImpl extends WikiContentImpl implements Category {
	/**
	 * The cached value of the '{@link #getParentCategory() <em>Parent Category</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentCategory()
	 * @generated
	 * @ordered
	 */
	protected Category parentCategory;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CategoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WikimPackage.Literals.CATEGORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Category getParentCategory() {
		if (parentCategory != null && parentCategory.eIsProxy()) {
			InternalEObject oldParentCategory = (InternalEObject)parentCategory;
			parentCategory = (Category)eResolveProxy(oldParentCategory);
			if (parentCategory != oldParentCategory) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WikimPackage.CATEGORY__PARENT_CATEGORY, oldParentCategory, parentCategory));
			}
		}
		return parentCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Category basicGetParentCategory() {
		return parentCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentCategory(Category newParentCategory) {
		Category oldParentCategory = parentCategory;
		parentCategory = newParentCategory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WikimPackage.CATEGORY__PARENT_CATEGORY, oldParentCategory, parentCategory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WikimPackage.CATEGORY__PARENT_CATEGORY:
				if (resolve) return getParentCategory();
				return basicGetParentCategory();
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
			case WikimPackage.CATEGORY__PARENT_CATEGORY:
				setParentCategory((Category)newValue);
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
			case WikimPackage.CATEGORY__PARENT_CATEGORY:
				setParentCategory((Category)null);
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
			case WikimPackage.CATEGORY__PARENT_CATEGORY:
				return parentCategory != null;
		}
		return super.eIsSet(featureID);
	}

} //CategoryImpl
