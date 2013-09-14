/**
 * Created by Ivan Ruiz
 */
package es.uca.spifm.spdt.specificTools.eam;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see es.uca.spifm.spdt.specificTools.eam.EamPackage
 * @generated
 */
public interface EamFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EamFactory eINSTANCE = es.uca.spifm.spdt.specificTools.eam.impl.EamFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Enterprise Architect Database</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enterprise Architect Database</em>'.
	 * @generated
	 */
	EnterpriseArchitectDatabase createEnterpriseArchitectDatabase();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EamPackage getEamPackage();

} //EamFactory
