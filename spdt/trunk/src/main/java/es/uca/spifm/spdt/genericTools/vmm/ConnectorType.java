/**
 * Created by Ivan Ruiz
 */
package es.uca.spifm.spdt.genericTools.vmm;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Connector Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see es.uca.spifm.spdt.genericTools.vmm.VmmPackage#getConnectorType()
 * @model annotation="comment comment='Enumeraci\363n con los posibles tipos de conectores que pueden vincular dos elementos, como por ejemplo las asociaciones, generalizaciones y relaciones de inclusi\363n o extensi\363n en UML.'"
 * @generated
 */
public enum ConnectorType implements Enumerator {
	/**
	 * The '<em><b>ASSOCIATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASSOCIATION_VALUE
	 * @generated
	 * @ordered
	 */
	ASSOCIATION(0, "ASSOCIATION", "ASSOCIATION"),

	/**
	 * The '<em><b>AGGREGATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AGGREGATION_VALUE
	 * @generated
	 * @ordered
	 */
	AGGREGATION(1, "AGGREGATION", "AGGREGATION"),

	/**
	 * The '<em><b>COMPOSITION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPOSITION_VALUE
	 * @generated
	 * @ordered
	 */
	COMPOSITION(2, "COMPOSITION", "COMPOSITION"),

	/**
	 * The '<em><b>DEPENDENCY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEPENDENCY_VALUE
	 * @generated
	 * @ordered
	 */
	DEPENDENCY(3, "DEPENDENCY", "DEPENDENCY"),

	/**
	 * The '<em><b>INCLUDE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INCLUDE_VALUE
	 * @generated
	 * @ordered
	 */
	INCLUDE(4, "INCLUDE", "INCLUDE"),

	/**
	 * The '<em><b>EXTEND</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXTEND_VALUE
	 * @generated
	 * @ordered
	 */
	EXTEND(5, "EXTEND", "EXTEND");

	/**
	 * The '<em><b>ASSOCIATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ASSOCIATION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ASSOCIATION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ASSOCIATION_VALUE = 0;

	/**
	 * The '<em><b>AGGREGATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>AGGREGATION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AGGREGATION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AGGREGATION_VALUE = 1;

	/**
	 * The '<em><b>COMPOSITION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COMPOSITION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMPOSITION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COMPOSITION_VALUE = 2;

	/**
	 * The '<em><b>DEPENDENCY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DEPENDENCY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEPENDENCY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DEPENDENCY_VALUE = 3;

	/**
	 * The '<em><b>INCLUDE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INCLUDE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INCLUDE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INCLUDE_VALUE = 4;

	/**
	 * The '<em><b>EXTEND</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EXTEND</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EXTEND
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EXTEND_VALUE = 5;

	/**
	 * An array of all the '<em><b>Connector Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ConnectorType[] VALUES_ARRAY =
		new ConnectorType[] {
			ASSOCIATION,
			AGGREGATION,
			COMPOSITION,
			DEPENDENCY,
			INCLUDE,
			EXTEND,
		};

	/**
	 * A public read-only list of all the '<em><b>Connector Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ConnectorType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Connector Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ConnectorType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ConnectorType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Connector Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ConnectorType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ConnectorType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Connector Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ConnectorType get(int value) {
		switch (value) {
			case ASSOCIATION_VALUE: return ASSOCIATION;
			case AGGREGATION_VALUE: return AGGREGATION;
			case COMPOSITION_VALUE: return COMPOSITION;
			case DEPENDENCY_VALUE: return DEPENDENCY;
			case INCLUDE_VALUE: return INCLUDE;
			case EXTEND_VALUE: return EXTEND;
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
	private ConnectorType(int value, String name, String literal) {
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
	
} //ConnectorType
