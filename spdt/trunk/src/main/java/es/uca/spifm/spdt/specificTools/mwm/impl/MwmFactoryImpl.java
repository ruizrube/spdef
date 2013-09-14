/**
 * Created by Ivan Ruiz
 */
package es.uca.spifm.spdt.specificTools.mwm.impl;

import es.uca.spifm.spdt.specificTools.mwm.*;

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
public class MwmFactoryImpl extends EFactoryImpl implements MwmFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MwmFactory init() {
		try {
			MwmFactory theMwmFactory = (MwmFactory)EPackage.Registry.INSTANCE.getEFactory(MwmPackage.eNS_URI);
			if (theMwmFactory != null) {
				return theMwmFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MwmFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MwmFactoryImpl() {
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
			case MwmPackage.MEDIA_WIKI_DATABASE: return createMediaWikiDatabase();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MediaWikiDatabase createMediaWikiDatabase() {
		MediaWikiDatabaseImpl mediaWikiDatabase = new MediaWikiDatabaseImpl();
		return mediaWikiDatabase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MwmPackage getMwmPackage() {
		return (MwmPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MwmPackage getPackage() {
		return MwmPackage.eINSTANCE;
	}

} //MwmFactoryImpl
