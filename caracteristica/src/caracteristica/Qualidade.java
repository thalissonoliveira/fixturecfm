/**
 */
package caracteristica;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Qualidade</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see caracteristica.CaracteristicaPackage#getQualidade()
 * @model
 * @generated
 */
public enum Qualidade implements Enumerator
{
  /**
	 * The '<em><b>Baixo</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #BAIXO_VALUE
	 * @generated
	 * @ordered
	 */
  BAIXO(0, "Baixo", "Baixo"),

  /**
	 * The '<em><b>Alto</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #ALTO_VALUE
	 * @generated
	 * @ordered
	 */
  ALTO(1, "Alto", "Alto");

  /**
	 * The '<em><b>Baixo</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Baixo</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #BAIXO
	 * @model name="Baixo"
	 * @generated
	 * @ordered
	 */
  public static final int BAIXO_VALUE = 0;

  /**
	 * The '<em><b>Alto</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Alto</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #ALTO
	 * @model name="Alto"
	 * @generated
	 * @ordered
	 */
  public static final int ALTO_VALUE = 1;

  /**
	 * An array of all the '<em><b>Qualidade</b></em>' enumerators.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private static final Qualidade[] VALUES_ARRAY =
    new Qualidade[] {
			BAIXO,
			ALTO,
		};

  /**
	 * A public read-only list of all the '<em><b>Qualidade</b></em>' enumerators.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final List<Qualidade> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
	 * Returns the '<em><b>Qualidade</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
  public static Qualidade get(String literal)
  {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Qualidade result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

  /**
	 * Returns the '<em><b>Qualidade</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
  public static Qualidade getByName(String name)
  {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Qualidade result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

  /**
	 * Returns the '<em><b>Qualidade</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
  public static Qualidade get(int value)
  {
		switch (value) {
			case BAIXO_VALUE: return BAIXO;
			case ALTO_VALUE: return ALTO;
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
  private Qualidade(int value, String name, String literal)
  {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public int getValue()
  {
	  return value;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getName()
  {
	  return name;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getLiteral()
  {
	  return literal;
	}

  /**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  
  
  @Override
		public String toString()
  {
		return literal;
	}
  
} //Qualidade
