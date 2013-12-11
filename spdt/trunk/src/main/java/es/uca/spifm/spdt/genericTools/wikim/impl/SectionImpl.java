/**
 * Created by Ivan Ruiz
 */
package es.uca.spifm.spdt.genericTools.wikim.impl;

import es.uca.spifm.spdt.genericTools.wikim.Section;
import es.uca.spifm.spdt.genericTools.wikim.SectionContent;
import es.uca.spifm.spdt.genericTools.wikim.WikimPackage;

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
 *   <li>{@link es.uca.spifm.spdt.genericTools.wikim.impl.SectionImpl#getEmbeddedSections <em>Embedded Sections</em>}</li>
 *   <li>{@link es.uca.spifm.spdt.genericTools.wikim.impl.SectionImpl#getName <em>Name</em>}</li>
 *   <li>{@link es.uca.spifm.spdt.genericTools.wikim.impl.SectionImpl#getText <em>Text</em>}</li>
 *   <li>{@link es.uca.spifm.spdt.genericTools.wikim.impl.SectionImpl#getContents <em>Contents</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SectionImpl extends MinimalEObjectImpl.Container implements Section {
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
	 * The default value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected String text = TEXT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getContents() <em>Contents</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContents()
	 * @generated
	 * @ordered
	 */
	protected EList<SectionContent> contents;

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
		return WikimPackage.Literals.SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Section> getEmbeddedSections() {
		if (embeddedSections == null) {
			embeddedSections = new EObjectContainmentEList<Section>(Section.class, this, WikimPackage.SECTION__EMBEDDED_SECTIONS);
		}
		return embeddedSections;
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
			eNotify(new ENotificationImpl(this, Notification.SET, WikimPackage.SECTION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText(String newText) {
		String oldText = text;
		text = newText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WikimPackage.SECTION__TEXT, oldText, text));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SectionContent> getContents() {
		if (contents == null) {
			contents = new EObjectContainmentEList<SectionContent>(SectionContent.class, this, WikimPackage.SECTION__CONTENTS);
		}
		return contents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WikimPackage.SECTION__EMBEDDED_SECTIONS:
				return ((InternalEList<?>)getEmbeddedSections()).basicRemove(otherEnd, msgs);
			case WikimPackage.SECTION__CONTENTS:
				return ((InternalEList<?>)getContents()).basicRemove(otherEnd, msgs);
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
			case WikimPackage.SECTION__EMBEDDED_SECTIONS:
				return getEmbeddedSections();
			case WikimPackage.SECTION__NAME:
				return getName();
			case WikimPackage.SECTION__TEXT:
				return getText();
			case WikimPackage.SECTION__CONTENTS:
				return getContents();
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
			case WikimPackage.SECTION__EMBEDDED_SECTIONS:
				getEmbeddedSections().clear();
				getEmbeddedSections().addAll((Collection<? extends Section>)newValue);
				return;
			case WikimPackage.SECTION__NAME:
				setName((String)newValue);
				return;
			case WikimPackage.SECTION__TEXT:
				setText((String)newValue);
				return;
			case WikimPackage.SECTION__CONTENTS:
				getContents().clear();
				getContents().addAll((Collection<? extends SectionContent>)newValue);
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
			case WikimPackage.SECTION__EMBEDDED_SECTIONS:
				getEmbeddedSections().clear();
				return;
			case WikimPackage.SECTION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case WikimPackage.SECTION__TEXT:
				setText(TEXT_EDEFAULT);
				return;
			case WikimPackage.SECTION__CONTENTS:
				getContents().clear();
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
			case WikimPackage.SECTION__EMBEDDED_SECTIONS:
				return embeddedSections != null && !embeddedSections.isEmpty();
			case WikimPackage.SECTION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case WikimPackage.SECTION__TEXT:
				return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
			case WikimPackage.SECTION__CONTENTS:
				return contents != null && !contents.isEmpty();
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
		result.append(", text: ");
		result.append(text);
		result.append(')');
		return result.toString();
	}

} //SectionImpl
