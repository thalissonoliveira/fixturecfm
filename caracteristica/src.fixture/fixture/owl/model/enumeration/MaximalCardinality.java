package fixture.owl.model.enumeration;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public enum MaximalCardinality {
	

	  /**
		 * The '<em><b>OR</b></em>' literal object.
		 * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
		 * @see #OR_VALUE
		 * @generated
		 * @ordered
		 */
	  OR(0, "OR", "OR"),

	  /**
		 * The '<em><b>XOR</b></em>' literal object.
		 * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
		 * @see #XOR_VALUE
		 * @generated
		 * @ordered
		 */
	  XOR(1, "XOR", "XOR");

	  /**
		 * The '<em><b>OR</b></em>' literal value.
		 * <!-- begin-user-doc -->
	   * <p>
	   * If the meaning of '<em><b>OR</b></em>' literal object isn't clear,
	   * there really should be more of a description here...
	   * </p>
	   * <!-- end-user-doc -->
		 * @see #OR
		 * @model
		 * @generated
		 * @ordered
		 */
	  public static final int OR_VALUE = 0;

	  /**
		 * The '<em><b>XOR</b></em>' literal value.
		 * <!-- begin-user-doc -->
	   * <p>
	   * If the meaning of '<em><b>XOR</b></em>' literal object isn't clear,
	   * there really should be more of a description here...
	   * </p>
	   * <!-- end-user-doc -->
		 * @see #XOR
		 * @model
		 * @generated
		 * @ordered
		 */
	  public static final int XOR_VALUE = 1;

	  /**
		 * An array of all the '<em><b>Cardinalidade Maxima</b></em>' enumerators.
		 * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
		 * @generated
		 */
	  private static final MaximalCardinality[] VALUES_ARRAY =
	    new MaximalCardinality[] {
				OR,
				XOR,
			};

	  /**
		 * A public read-only list of all the '<em><b>Cardinalidade Maxima</b></em>' enumerators.
		 * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
		 * @generated
		 */
	  public static final List<MaximalCardinality> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	  /**
		 * Returns the '<em><b>Cardinalidade Maxima</b></em>' literal with the specified literal value.
		 * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
		 * @generated
		 */
	  public static MaximalCardinality get(String literal)
	  {
			for (int i = 0; i < VALUES_ARRAY.length; ++i) {
				MaximalCardinality result = VALUES_ARRAY[i];
				if (result.toString().equals(literal)) {
					return result;
				}
			}
			return null;
		}

	  /**
		 * Returns the '<em><b>Cardinalidade Maxima</b></em>' literal with the specified name.
		 * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
		 * @generated
		 */
	  public static MaximalCardinality getByName(String name)
	  {
			for (int i = 0; i < VALUES_ARRAY.length; ++i) {
				MaximalCardinality result = VALUES_ARRAY[i];
				if (result.getName().equals(name)) {
					return result;
				}
			}
			return null;
		}

	  /**
		 * Returns the '<em><b>Cardinalidade Maxima</b></em>' literal with the specified integer value.
		 * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
		 * @generated
		 */
	  public static MaximalCardinality get(int value)
	  {
			switch (value) {
				case OR_VALUE: return OR;
				case XOR_VALUE: return XOR;
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
	  private MaximalCardinality(int value, String name, String literal)
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
	  

	
} //CardinalidadeMaxima
