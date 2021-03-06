/**
 * Created by Ivan Ruiz
 */
package es.uca.spifm.spdt.genericTools.itm;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Dependency Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see es.uca.spifm.spdt.genericTools.itm.ItmPackage#getDependencyType()
 * @model annotation="comment comment='Enumeraci\363n con los diferentes tipos de dependencia entre issues.'"
 * @generated
 */
public enum DependencyType implements Enumerator {
	/**
	 * The '<em><b>START START</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #START_START_VALUE
	 * @generated
	 * @ordered
	 */
	START_START(0, "START_START", "START_START"),

	/**
	 * The '<em><b>START END</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #START_END_VALUE
	 * @generated
	 * @ordered
	 */
	START_END(1, "START_END", "START_END"),

	/**
	 * The '<em><b>END START</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #END_START_VALUE
	 * @generated
	 * @ordered
	 */
	END_START(2, "END_START", "END_START"),

	/**
	 * The '<em><b>END END</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #END_END_VALUE
	 * @generated
	 * @ordered
	 */
	END_END(3, "END_END", "END_END");

	/**
	 * The '<em><b>START START</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>START START</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #START_START
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int START_START_VALUE = 0;

	/**
	 * The '<em><b>START END</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>START END</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #START_END
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int START_END_VALUE = 1;

	/**
	 * The '<em><b>END START</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>END START</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #END_START
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int END_START_VALUE = 2;

	/**
	 * The '<em><b>END END</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>END END</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #END_END
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int END_END_VALUE = 3;

	/**
	 * An array of all the '<em><b>Dependency Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DependencyType[] VALUES_ARRAY =
		new DependencyType[] {
			START_START,
			START_END,
			END_START,
			END_END,
		};

	/**
	 * A public read-only list of all the '<em><b>Dependency Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DependencyType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Dependency Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DependencyType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DependencyType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Dependency Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DependencyType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DependencyType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Dependency Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DependencyType get(int value) {
		switch (value) {
			case START_START_VALUE: return START_START;
			case START_END_VALUE: return START_END;
			case END_START_VALUE: return END_START;
			case END_END_VALUE: return END_END;
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
	private DependencyType(int value, String name, String literal) {
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
	
} //DependencyType
