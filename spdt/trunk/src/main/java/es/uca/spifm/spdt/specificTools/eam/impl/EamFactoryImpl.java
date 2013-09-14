/**
 * Created by Ivan Ruiz
 */
package es.uca.spifm.spdt.specificTools.eam.impl;

import es.uca.spifm.spdt.specificTools.eam.*;

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
public class EamFactoryImpl extends EFactoryImpl implements EamFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EamFactory init() {
		try {
			EamFactory theEamFactory = (EamFactory)EPackage.Registry.INSTANCE.getEFactory(EamPackage.eNS_URI);
			if (theEamFactory != null) {
				return theEamFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EamFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EamFactoryImpl() {
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
			case EamPackage.ENTERPRISE_ARCHITECT_DATABASE: return createEnterpriseArchitectDatabase();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnterpriseArchitectDatabase createEnterpriseArchitectDatabase() {
		EnterpriseArchitectDatabaseImpl enterpriseArchitectDatabase = new EnterpriseArchitectDatabaseImpl();
		return enterpriseArchitectDatabase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EamPackage getEamPackage() {
		return (EamPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EamPackage getPackage() {
		return EamPackage.eINSTANCE;
	}

} //EamFactoryImpl
