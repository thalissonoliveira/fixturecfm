/**
 */
package caracteristica;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variacao</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link caracteristica.Variacao#getCardinalidadeMinima <em>Cardinalidade Minima</em>}</li>
 *   <li>{@link caracteristica.Variacao#getCardinalidadeMaxima <em>Cardinalidade Maxima</em>}</li>
 *   <li>{@link caracteristica.Variacao#getVariantes <em>Variantes</em>}</li>
 *   <li>{@link caracteristica.Variacao#getCaracteristicaPai <em>Caracteristica Pai</em>}</li>
 * </ul>
 *
 * @see caracteristica.CaracteristicaPackage#getVariacao()
 * @model
 * @generated
 */
public interface Variacao extends PontoDeVariacao, Elemento
{
  /**
	 * Returns the value of the '<em><b>Cardinalidade Minima</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cardinalidade Minima</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Cardinalidade Minima</em>' attribute.
	 * @see #setCardinalidadeMinima(Integer)
	 * @see caracteristica.CaracteristicaPackage#getVariacao_CardinalidadeMinima()
	 * @model
	 * @generated
	 */
  Integer getCardinalidadeMinima();

  /**
	 * Sets the value of the '{@link caracteristica.Variacao#getCardinalidadeMinima <em>Cardinalidade Minima</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cardinalidade Minima</em>' attribute.
	 * @see #getCardinalidadeMinima()
	 * @generated
	 */
  void setCardinalidadeMinima(Integer value);

  /**
	 * Returns the value of the '<em><b>Cardinalidade Maxima</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cardinalidade Maxima</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Cardinalidade Maxima</em>' attribute.
	 * @see #setCardinalidadeMaxima(Integer)
	 * @see caracteristica.CaracteristicaPackage#getVariacao_CardinalidadeMaxima()
	 * @model
	 * @generated
	 */
  Integer getCardinalidadeMaxima();

  /**
	 * Sets the value of the '{@link caracteristica.Variacao#getCardinalidadeMaxima <em>Cardinalidade Maxima</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cardinalidade Maxima</em>' attribute.
	 * @see #getCardinalidadeMaxima()
	 * @generated
	 */
  void setCardinalidadeMaxima(Integer value);

  /**
	 * Returns the value of the '<em><b>Variantes</b></em>' reference list.
	 * The list contents are of type {@link caracteristica.Variante}.
	 * It is bidirectional and its opposite is '{@link caracteristica.Variante#getVariacaoPai <em>Variacao Pai</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variantes</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Variantes</em>' reference list.
	 * @see caracteristica.CaracteristicaPackage#getVariacao_Variantes()
	 * @see caracteristica.Variante#getVariacaoPai
	 * @model opposite="variacaoPai"
	 *        annotation="gmf.link target.decoration='closedarrow' color='0,0,0' style='solid' width='3'"
	 * @generated
	 */
  EList<Variante> getVariantes();

  /**
	 * Returns the value of the '<em><b>Caracteristica Pai</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link caracteristica.Caracteristica#getVariacoes <em>Variacoes</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Caracteristica Pai</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Caracteristica Pai</em>' reference.
	 * @see #setCaracteristicaPai(Caracteristica)
	 * @see caracteristica.CaracteristicaPackage#getVariacao_CaracteristicaPai()
	 * @see caracteristica.Caracteristica#getVariacoes
	 * @model opposite="variacoes"
	 * @generated
	 */
  Caracteristica getCaracteristicaPai();

  /**
	 * Sets the value of the '{@link caracteristica.Variacao#getCaracteristicaPai <em>Caracteristica Pai</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Caracteristica Pai</em>' reference.
	 * @see #getCaracteristicaPai()
	 * @generated
	 */
  void setCaracteristicaPai(Caracteristica value);

} // Variacao
