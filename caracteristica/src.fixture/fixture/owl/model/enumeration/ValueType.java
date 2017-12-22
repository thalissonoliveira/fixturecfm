package fixture.owl.model.enumeration;

public enum ValueType
{
  /**
   * The '<em><b>TInteger</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TINTEGER_VALUE
   * @generated
   * @ordered
   */
  TINTEGER(0, "TInteger", "TInteger"),

  /**
   * The '<em><b>TString</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TSTRING_VALUE
   * @generated
   * @ordered
   */
  TSTRING(1, "TString", "TString"),

  /**
   * The '<em><b>TFloat</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TFLOAT_VALUE
   * @generated
   * @ordered
   */
  TFLOAT(2, "TFloat", "TFloat"),

  /**
   * The '<em><b>TBoolean</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TBOOLEAN_VALUE
   * @generated
   * @ordered
   */
  TBOOLEAN(3, "TBoolean", "TBoolean");

  /**
   * The '<em><b>TInteger</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>TInteger</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TINTEGER
   * @model name="TInteger"
   * @generated
   * @ordered
   */
  public static final int TINTEGER_VALUE = 0;

  /**
   * The '<em><b>TString</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>TString</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TSTRING
   * @model name="TString"
   * @generated
   * @ordered
   */
  public static final int TSTRING_VALUE = 1;

  /**
   * The '<em><b>TFloat</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>TFloat</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TFLOAT
   * @model name="TFloat"
   * @generated
   * @ordered
   */
  public static final int TFLOAT_VALUE = 2;

  /**
   * The '<em><b>TBoolean</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>TBoolean</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TBOOLEAN
   * @model name="TBoolean"
   * @generated
   * @ordered
   */
  public static final int TBOOLEAN_VALUE = 3;

  /**
   * An array of all the '<em><b>Tipo Valor</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final ValueType[] VALUES_ARRAY =
    new ValueType[]
    {
      TINTEGER,
      TSTRING,
      TFLOAT,
      TBOOLEAN,
    };

  /**
   * Returns the '<em><b>Tipo Valor</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ValueType get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      ValueType result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Tipo Valor</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ValueType getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      ValueType result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Tipo Valor</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ValueType get(int value)
  {
    switch (value)
    {
      case TINTEGER_VALUE: return TINTEGER;
      case TSTRING_VALUE: return TSTRING;
      case TFLOAT_VALUE: return TFLOAT;
      case TBOOLEAN_VALUE: return TBOOLEAN;
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
  private ValueType(int value, String name, String literal)
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
  
} //TipoValor
