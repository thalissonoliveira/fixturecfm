/**
 */
package caracteristica;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Origem</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see caracteristica.CaracteristicaPackage#getOrigem()
 * @model
 * @generated
 */
public enum Origem implements Enumerator
{
  /**
	 * The '<em><b>Sentida</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #SENTIDA_VALUE
	 * @generated
	 * @ordered
	 */
  SENTIDA(0, "Sentida", "Sentida"),

  /**
	 * The '<em><b>Usuario</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #USUARIO_VALUE
	 * @generated
	 * @ordered
	 */
  USUARIO(1, "Usuario", "Usuario"),

  /**
	 * The '<em><b>Perfil</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #PERFIL_VALUE
	 * @generated
	 * @ordered
	 */
  PERFIL(2, "Perfil", "Perfil"),

  /**
	 * The '<em><b>Derivada</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #DERIVADA_VALUE
	 * @generated
	 * @ordered
	 */
  DERIVADA(3, "Derivada", "Derivada");

  /**
	 * The '<em><b>Sentida</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Sentida</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #SENTIDA
	 * @model name="Sentida"
	 * @generated
	 * @ordered
	 */
  public static final int SENTIDA_VALUE = 0;

  /**
	 * The '<em><b>Usuario</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Usuario</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #USUARIO
	 * @model name="Usuario"
	 * @generated
	 * @ordered
	 */
  public static final int USUARIO_VALUE = 1;

  /**
	 * The '<em><b>Perfil</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Perfil</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #PERFIL
	 * @model name="Perfil"
	 * @generated
	 * @ordered
	 */
  public static final int PERFIL_VALUE = 2;

  /**
	 * The '<em><b>Derivada</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Derivada</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #DERIVADA
	 * @model name="Derivada"
	 * @generated
	 * @ordered
	 */
  public static final int DERIVADA_VALUE = 3;

  /**
	 * An array of all the '<em><b>Origem</b></em>' enumerators.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private static final Origem[] VALUES_ARRAY =
    new Origem[] {
			SENTIDA,
			USUARIO,
			PERFIL,
			DERIVADA,
		};

  /**
	 * A public read-only list of all the '<em><b>Origem</b></em>' enumerators.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final List<Origem> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
	 * Returns the '<em><b>Origem</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
  public static Origem get(String literal)
  {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Origem result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

  /**
	 * Returns the '<em><b>Origem</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
  public static Origem getByName(String name)
  {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Origem result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

  /**
	 * Returns the '<em><b>Origem</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
  public static Origem get(int value)
  {
		switch (value) {
			case SENTIDA_VALUE: return SENTIDA;
			case USUARIO_VALUE: return USUARIO;
			case PERFIL_VALUE: return PERFIL;
			case DERIVADA_VALUE: return DERIVADA;
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
  private Origem(int value, String name, String literal)
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
  
} //Origem
