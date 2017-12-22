package fixture.owl.model.enumeration;


public enum Origin
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
  private static final Origin[] VALUES_ARRAY =
    new Origin[]
    {
      SENTIDA,
      USUARIO,
      PERFIL,
      DERIVADA,
    };


  /**
   * Returns the '<em><b>Origem</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Origin get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Origin result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Origem</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Origin getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Origin result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Origem</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Origin get(int value)
  {
    switch (value)
    {
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
  private Origin(int value, String name, String literal)
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
  
} //Origem
