/**
 * Created by Ivan Ruiz
 */
package es.uca.spifm.spdt.specificTools.mwm;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see es.uca.spifm.spdt.specificTools.mwm.MwmPackage
 * @generated
 */
public interface MwmFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MwmFactory eINSTANCE = es.uca.spifm.spdt.specificTools.mwm.impl.MwmFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Media Wiki Database</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Media Wiki Database</em>'.
	 * @generated
	 */
	MediaWikiDatabase createMediaWikiDatabase();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MwmPackage getMwmPackage();

} //MwmFactory
