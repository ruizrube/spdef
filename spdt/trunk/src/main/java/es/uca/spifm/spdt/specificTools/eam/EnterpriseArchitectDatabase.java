/**
 * Created by Ivan Ruiz
 */
package es.uca.spifm.spdt.specificTools.eam;

import es.uca.spifm.spdt.genericTools.vmm.ModelRepository;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enterprise Architect Database</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uca.spifm.spdt.specificTools.eam.EnterpriseArchitectDatabase#getModelRepository <em>Model Repository</em>}</li>
 *   <li>{@link es.uca.spifm.spdt.specificTools.eam.EnterpriseArchitectDatabase#getFileName <em>File Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uca.spifm.spdt.specificTools.eam.EamPackage#getEnterpriseArchitectDatabase()
 * @model
 * @generated
 */
public interface EnterpriseArchitectDatabase extends EObject {
	/**
	 * Returns the value of the '<em><b>Model Repository</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Repository</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Repository</em>' reference.
	 * @see #setModelRepository(ModelRepository)
	 * @see es.uca.spifm.spdt.specificTools.eam.EamPackage#getEnterpriseArchitectDatabase_ModelRepository()
	 * @model
	 * @generated
	 */
	ModelRepository getModelRepository();

	/**
	 * Sets the value of the '{@link es.uca.spifm.spdt.specificTools.eam.EnterpriseArchitectDatabase#getModelRepository <em>Model Repository</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Repository</em>' reference.
	 * @see #getModelRepository()
	 * @generated
	 */
	void setModelRepository(ModelRepository value);

	/**
	 * Returns the value of the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Name</em>' attribute.
	 * @see #setFileName(String)
	 * @see es.uca.spifm.spdt.specificTools.eam.EamPackage#getEnterpriseArchitectDatabase_FileName()
	 * @model
	 * @generated
	 */
	String getFileName();

	/**
	 * Sets the value of the '{@link es.uca.spifm.spdt.specificTools.eam.EnterpriseArchitectDatabase#getFileName <em>File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Name</em>' attribute.
	 * @see #getFileName()
	 * @generated
	 */
	void setFileName(String value);

} // EnterpriseArchitectDatabase
