package fixture.owl.model.enumeration;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public enum RelationalOperator
{
  /**
   * The '<em><b>MAIOR</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MAIOR_VALUE
   * @generated
   * @ordered
   */
  MAIOR(0, "MAIOR", "MAIOR"),

  /**
   * The '<em><b>MENOR</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MENOR_VALUE
   * @generated
   * @ordered
   */
  MENOR(1, "MENOR", "MENOR"),

  /**
   * The '<em><b>IGUAL</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #IGUAL_VALUE
   * @generated
   * @ordered
   */
  IGUAL(2, "IGUAL", "IGUAL"),

  /**
   * The '<em><b>MAIORIGUAL</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MAIORIGUAL_VALUE
   * @generated
   * @ordered
   */
  MAIORIGUAL(3, "MAIORIGUAL", "MAIORIGUAL"),

  /**
   * The '<em><b>MENORIGUAL</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MENORIGUAL_VALUE
   * @generated
   * @ordered
   */
  MENORIGUAL(4, "MENORIGUAL", "MENORIGUAL"),

  /**
   * The '<em><b>DIFERENTE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DIFERENTE_VALUE
   * @generated
   * @ordered
   */
  DIFERENTE(5, "DIFERENTE", "DIFERENTE");

  /**
   * The '<em><b>MAIOR</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>MAIOR</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #MAIOR
   * @model
   * @generated
   * @ordered
   */
  public static final int MAIOR_VALUE = 0;

  /**
   * The '<em><b>MENOR</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>MENOR</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #MENOR
   * @model
   * @generated
   * @ordered
   */
  public static final int MENOR_VALUE = 1;

  /**
   * The '<em><b>IGUAL</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>IGUAL</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #IGUAL
   * @model
   * @generated
   * @ordered
   */
  public static final int IGUAL_VALUE = 2;

  /**
   * The '<em><b>MAIORIGUAL</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>MAIORIGUAL</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #MAIORIGUAL
   * @model
   * @generated
   * @ordered
   */
  public static final int MAIORIGUAL_VALUE = 3;

  /**
   * The '<em><b>MENORIGUAL</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>MENORIGUAL</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #MENORIGUAL
   * @model
   * @generated
   * @ordered
   */
  public static final int MENORIGUAL_VALUE = 4;

  /**
   * The '<em><b>DIFERENTE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>DIFERENTE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DIFERENTE
   * @model
   * @generated
   * @ordered
   */
  public static final int DIFERENTE_VALUE = 5;

  /**
   * An array of all the '<em><b>Operador Relacional</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final RelationalOperator[] VALUES_ARRAY =
    new RelationalOperator[]
    {
      MAIOR,
      MENOR,
      IGUAL,
      MAIORIGUAL,
      MENORIGUAL,
      DIFERENTE,
    };

  /**
   * A public read-only list of all the '<em><b>Operador Relacional</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<RelationalOperator> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Operador Relacional</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static RelationalOperator get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      RelationalOperator result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Operador Relacional</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static RelationalOperator getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      RelationalOperator result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Operador Relacional</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static RelationalOperator get(int value)
  {
    switch (value)
    {
      case MAIOR_VALUE: return MAIOR;
      case MENOR_VALUE: return MENOR;
      case IGUAL_VALUE: return IGUAL;
      case MAIORIGUAL_VALUE: return MAIORIGUAL;
      case MENORIGUAL_VALUE: return MENORIGUAL;
      case DIFERENTE_VALUE: return DIFERENTE;
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
  private RelationalOperator(int value, String name, String literal)
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
  
  public String toString()
  {
    return literal;
  }
  
} //OperadorRelacional
