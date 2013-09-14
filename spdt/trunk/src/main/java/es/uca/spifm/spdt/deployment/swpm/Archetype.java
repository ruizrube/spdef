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
 * A representation of the literals of the enumeration '<em><b>Archetype</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see es.uca.spifm.spdt.deployment.swpm.SwpmPackage#getArchetype()
 * @model
 * @generated
 */
public enum Archetype implements Enumerator {
	/**
	 * The '<em><b>J2EE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #J2EE_VALUE
	 * @generated
	 * @ordered
	 */
	J2EE(0, "J2EE", "J2EE"),

	/**
	 * The '<em><b>STRUTS2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRUTS2_VALUE
	 * @generated
	 * @ordered
	 */
	STRUTS2(1, "STRUTS2", "STRUTS2"),

	/**
	 * The '<em><b>SPRING OSGI</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPRING_OSGI_VALUE
	 * @generated
	 * @ordered
	 */
	SPRING_OSGI(2, "SPRING_OSGI", "SPRING_OSGI"),

	/**
	 * The '<em><b>JSF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JSF_VALUE
	 * @generated
	 * @ordered
	 */
	JSF(3, "JSF", "JSF");

	/**
	 * The '<em><b>J2EE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>J2EE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #J2EE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int J2EE_VALUE = 0;

	/**
	 * The '<em><b>STRUTS2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>STRUTS2</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STRUTS2
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STRUTS2_VALUE = 1;

	/**
	 * The '<em><b>SPRING OSGI</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SPRING OSGI</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SPRING_OSGI
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SPRING_OSGI_VALUE = 2;

	/**
	 * The '<em><b>JSF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>JSF</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #JSF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int JSF_VALUE = 3;

	/**
	 * An array of all the '<em><b>Archetype</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Archetype[] VALUES_ARRAY =
		new Archetype[] {
			J2EE,
			STRUTS2,
			SPRING_OSGI,
			JSF,
		};

	/**
	 * A public read-only list of all the '<em><b>Archetype</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Archetype> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Archetype</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Archetype get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Archetype result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Archetype</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Archetype getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Archetype result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Archetype</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Archetype get(int value) {
		switch (value) {
			case J2EE_VALUE: return J2EE;
			case STRUTS2_VALUE: return STRUTS2;
			case SPRING_OSGI_VALUE: return SPRING_OSGI;
			case JSF_VALUE: return JSF;
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
	private Archetype(int value, String name, String literal) {
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
	
} //Archetype
