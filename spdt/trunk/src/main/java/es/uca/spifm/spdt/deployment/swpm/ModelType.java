/**
 * Designed by Ivan Ruiz
 */
package es.uca.spifm.spdt.deployment.swpm;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Model Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see es.uca.spifm.spdt.deployment.swpm.SwpmPackage#getModelType()
 * @model annotation="comment comment='Enumeraci\363n con los posibles tipos de modelos. Comprende los tipos propuestos con el lenguaje UML, aunque podr\355a englobar otros tipos de modelos visuales o textuales desarrollados con otros lenguajes, ya sean gen\351ricos o de prop\363sitos espec\355ficos (DSL).'"
 * @generated
 */
public enum ModelType implements Enumerator {
	/**
	 * The '<em><b>USECASE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USECASE_VALUE
	 * @generated
	 * @ordered
	 */
	USECASE(0, "USECASE", "USECASE"),

	/**
	 * The '<em><b>CLASS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLASS_VALUE
	 * @generated
	 * @ordered
	 */
	CLASS(1, "CLASS", "CLASS"),

	/**
	 * The '<em><b>ACTIVITY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACTIVITY_VALUE
	 * @generated
	 * @ordered
	 */
	ACTIVITY(2, "ACTIVITY", "ACTIVITY"),

	/**
	 * The '<em><b>COMPONENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPONENT_VALUE
	 * @generated
	 * @ordered
	 */
	COMPONENT(3, "COMPONENT", "COMPONENT"),

	/**
	 * The '<em><b>DEPLOYMENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEPLOYMENT_VALUE
	 * @generated
	 * @ordered
	 */
	DEPLOYMENT(4, "DEPLOYMENT", "DEPLOYMENT"),

	/**
	 * The '<em><b>SEQUENCE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEQUENCE_VALUE
	 * @generated
	 * @ordered
	 */
	SEQUENCE(5, "SEQUENCE", "SEQUENCE"),

	/**
	 * The '<em><b>STATECHART</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STATECHART_VALUE
	 * @generated
	 * @ordered
	 */
	STATECHART(6, "STATECHART", "STATECHART"),

	/**
	 * The '<em><b>COLLABORATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLLABORATION_VALUE
	 * @generated
	 * @ordered
	 */
	COLLABORATION(7, "COLLABORATION", "COLLABORATION"),

	/**
	 * The '<em><b>OTHER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(8, "OTHER", "OTHER");

	/**
	 * The '<em><b>USECASE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>USECASE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #USECASE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int USECASE_VALUE = 0;

	/**
	 * The '<em><b>CLASS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CLASS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CLASS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CLASS_VALUE = 1;

	/**
	 * The '<em><b>ACTIVITY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ACTIVITY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ACTIVITY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ACTIVITY_VALUE = 2;

	/**
	 * The '<em><b>COMPONENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COMPONENT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMPONENT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COMPONENT_VALUE = 3;

	/**
	 * The '<em><b>DEPLOYMENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DEPLOYMENT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEPLOYMENT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DEPLOYMENT_VALUE = 4;

	/**
	 * The '<em><b>SEQUENCE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SEQUENCE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SEQUENCE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SEQUENCE_VALUE = 5;

	/**
	 * The '<em><b>STATECHART</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>STATECHART</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STATECHART
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STATECHART_VALUE = 6;

	/**
	 * The '<em><b>COLLABORATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COLLABORATION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COLLABORATION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COLLABORATION_VALUE = 7;

	/**
	 * The '<em><b>OTHER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OTHER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OTHER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_VALUE = 8;

	/**
	 * An array of all the '<em><b>Model Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ModelType[] VALUES_ARRAY =
		new ModelType[] {
			USECASE,
			CLASS,
			ACTIVITY,
			COMPONENT,
			DEPLOYMENT,
			SEQUENCE,
			STATECHART,
			COLLABORATION,
			OTHER,
		};

	/**
	 * A public read-only list of all the '<em><b>Model Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ModelType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Model Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ModelType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ModelType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Model Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ModelType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ModelType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Model Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ModelType get(int value) {
		switch (value) {
			case USECASE_VALUE: return USECASE;
			case CLASS_VALUE: return CLASS;
			case ACTIVITY_VALUE: return ACTIVITY;
			case COMPONENT_VALUE: return COMPONENT;
			case DEPLOYMENT_VALUE: return DEPLOYMENT;
			case SEQUENCE_VALUE: return SEQUENCE;
			case STATECHART_VALUE: return STATECHART;
			case COLLABORATION_VALUE: return COLLABORATION;
			case OTHER_VALUE: return OTHER;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ModelType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
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
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //ModelType
