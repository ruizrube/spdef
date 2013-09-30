/**
 * Created by Ivan Ruiz
 */
package es.uca.spifm.spdt.specificTools.redm.impl;

import es.uca.spifm.spdt.specificTools.redm.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RedmFactoryImpl extends EFactoryImpl implements RedmFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RedmFactory init() {
		try {
			RedmFactory theRedmFactory = (RedmFactory)EPackage.Registry.INSTANCE.getEFactory(RedmPackage.eNS_URI);
			if (theRedmFactory != null) {
				return theRedmFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RedmFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RedmFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case RedmPackage.REDMINE_DATABASE: return createRedmineDatabase();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RedmineDatabase createRedmineDatabase() {
		RedmineDatabaseImpl redmineDatabase = new RedmineDatabaseImpl();
		return redmineDatabase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RedmPackage getRedmPackage() {
		return (RedmPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RedmPackage getPackage() {
		return RedmPackage.eINSTANCE;
	}

} //RedmFactoryImpl
