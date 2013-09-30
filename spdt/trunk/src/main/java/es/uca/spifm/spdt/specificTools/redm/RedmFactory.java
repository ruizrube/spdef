/**
 * Created by Ivan Ruiz
 */
package es.uca.spifm.spdt.specificTools.redm;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see es.uca.spifm.spdt.specificTools.redm.RedmPackage
 * @generated
 */
public interface RedmFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RedmFactory eINSTANCE = es.uca.spifm.spdt.specificTools.redm.impl.RedmFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Redmine Database</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Redmine Database</em>'.
	 * @generated
	 */
	RedmineDatabase createRedmineDatabase();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RedmPackage getRedmPackage();

} //RedmFactory
