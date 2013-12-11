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
 * A representation of the literals of the enumeration '<em><b>Specification Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see es.uca.spifm.spdt.deployment.swpm.SwpmPackage#getSpecificationType()
 * @model annotation="comment comment='Enumeraci\363n con los posibles tipos de especificaciones no basadas en modelos. Pueden consistir en una descripci\363n textual, una lista de elementos o contenido binario gestionado por alguna herramienta externa.'"
 * @generated
 */
public enum SpecificationType implements Enumerator {
	/**
	 * The '<em><b>TEXTUAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEXTUAL_VALUE
	 * @generated
	 * @ordered
	 */
	TEXTUAL(1, "TEXTUAL", "TEXTUAL"),

	/**
	 * The '<em><b>EXTERNALCONTENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXTERNALCONTENT_VALUE
	 * @generated
	 * @ordered
	 */
	EXTERNALCONTENT(2, "EXTERNALCONTENT", "EXTERNALCONTENT"),

	/**
	 * The '<em><b>ITEMLIST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ITEMLIST_VALUE
	 * @generated
	 * @ordered
	 */
	ITEMLIST(3, "ITEMLIST", "ITEMLIST");

	/**
	 * The '<em><b>TEXTUAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TEXTUAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TEXTUAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TEXTUAL_VALUE = 1;

	/**
	 * The '<em><b>EXTERNALCONTENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EXTERNALCONTENT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EXTERNALCONTENT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EXTERNALCONTENT_VALUE = 2;

	/**
	 * The '<em><b>ITEMLIST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ITEMLIST</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ITEMLIST
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ITEMLIST_VALUE = 3;

	/**
	 * An array of all the '<em><b>Specification Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SpecificationType[] VALUES_ARRAY =
		new SpecificationType[] {
			TEXTUAL,
			EXTERNALCONTENT,
			ITEMLIST,
		};

	/**
	 * A public read-only list of all the '<em><b>Specification Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SpecificationType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Specification Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SpecificationType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SpecificationType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Specification Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SpecificationType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SpecificationType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Specification Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SpecificationType get(int value) {
		switch (value) {
			case TEXTUAL_VALUE: return TEXTUAL;
			case EXTERNALCONTENT_VALUE: return EXTERNALCONTENT;
			case ITEMLIST_VALUE: return ITEMLIST;
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
	private SpecificationType(int value, String name, String literal) {
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
	
} //SpecificationType
