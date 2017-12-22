/**
 */
package caracteristica;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variacao Dois Produto</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link caracteristica.VariacaoDoisProduto#getCardinalidadeMaxima <em>Cardinalidade Maxima</em>}</li>
 *   <li>{@link caracteristica.VariacaoDoisProduto#getCardinalidadeMinimaOr <em>Cardinalidade Minima Or</em>}</li>
 *   <li>{@link caracteristica.VariacaoDoisProduto#getCardinalidadeMaximaOr <em>Cardinalidade Maxima Or</em>}</li>
 * </ul>
 * </p>
 *
 * @see caracteristica.CaracteristicaPackage#getVariacaoDoisProduto()
 * @model annotation="gmf.node label='nome,cardinalidadeMaxima' label.pattern='Variation {0} : {1} ' figure='utils.DiamondFigure'"
 * @generated
 */
public interface VariacaoDoisProduto extends CaracteristicaProduto
{
  /**
   * Returns the value of the '<em><b>Cardinalidade Maxima</b></em>' attribute.
   * The literals are from the enumeration {@link caracteristica.CardinalidadeMaxima}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cardinalidade Maxima</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cardinalidade Maxima</em>' attribute.
   * @see caracteristica.CardinalidadeMaxima
   * @see #setCardinalidadeMaxima(CardinalidadeMaxima)
   * @see caracteristica.CaracteristicaPackage#getVariacaoDoisProduto_CardinalidadeMaxima()
   * @model
   * @generated
   */
  CardinalidadeMaxima getCardinalidadeMaxima();

  /**
   * Sets the value of the '{@link caracteristica.VariacaoDoisProduto#getCardinalidadeMaxima <em>Cardinalidade Maxima</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cardinalidade Maxima</em>' attribute.
   * @see caracteristica.CardinalidadeMaxima
   * @see #getCardinalidadeMaxima()
   * @generated
   */
  void setCardinalidadeMaxima(CardinalidadeMaxima value);

		/**
   * Returns the value of the '<em><b>Cardinalidade Minima Or</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cardinalidade Minima Or</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Cardinalidade Minima Or</em>' attribute.
   * @see #setCardinalidadeMinimaOr(Integer)
   * @see caracteristica.CaracteristicaPackage#getVariacaoDoisProduto_CardinalidadeMinimaOr()
   * @model
   * @generated
   */
	Integer getCardinalidadeMinimaOr();

		/**
   * Sets the value of the '{@link caracteristica.VariacaoDoisProduto#getCardinalidadeMinimaOr <em>Cardinalidade Minima Or</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cardinalidade Minima Or</em>' attribute.
   * @see #getCardinalidadeMinimaOr()
   * @generated
   */
	void setCardinalidadeMinimaOr(Integer value);

		/**
   * Returns the value of the '<em><b>Cardinalidade Maxima Or</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cardinalidade Maxima Or</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Cardinalidade Maxima Or</em>' attribute.
   * @see #setCardinalidadeMaximaOr(Integer)
   * @see caracteristica.CaracteristicaPackage#getVariacaoDoisProduto_CardinalidadeMaximaOr()
   * @model
   * @generated
   */
	Integer getCardinalidadeMaximaOr();

		/**
   * Sets the value of the '{@link caracteristica.VariacaoDoisProduto#getCardinalidadeMaximaOr <em>Cardinalidade Maxima Or</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cardinalidade Maxima Or</em>' attribute.
   * @see #getCardinalidadeMaximaOr()
   * @generated
   */
	void setCardinalidadeMaximaOr(Integer value);

} // VariacaoDoisProduto
