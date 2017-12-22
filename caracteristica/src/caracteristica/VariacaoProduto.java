/**
 */
package caracteristica;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variacao Produto</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link caracteristica.VariacaoProduto#getCardinalidadeMinima <em>Cardinalidade Minima</em>}</li>
 *   <li>{@link caracteristica.VariacaoProduto#getCardinalidadeMaxima <em>Cardinalidade Maxima</em>}</li>
 *   <li>{@link caracteristica.VariacaoProduto#getVariantesProduto <em>Variantes Produto</em>}</li>
 *   <li>{@link caracteristica.VariacaoProduto#getCaracteristicaProdutoPai <em>Caracteristica Produto Pai</em>}</li>
 * </ul>
 * </p>
 *
 * @see caracteristica.CaracteristicaPackage#getVariacaoProduto()
 * @model
 * @generated
 */
public interface VariacaoProduto extends ElementoDeProduto
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
   * @see caracteristica.CaracteristicaPackage#getVariacaoProduto_CardinalidadeMinima()
   * @model
   * @generated
   */
  Integer getCardinalidadeMinima();

  /**
   * Sets the value of the '{@link caracteristica.VariacaoProduto#getCardinalidadeMinima <em>Cardinalidade Minima</em>}' attribute.
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
   * @see caracteristica.CaracteristicaPackage#getVariacaoProduto_CardinalidadeMaxima()
   * @model
   * @generated
   */
  Integer getCardinalidadeMaxima();

  /**
   * Sets the value of the '{@link caracteristica.VariacaoProduto#getCardinalidadeMaxima <em>Cardinalidade Maxima</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cardinalidade Maxima</em>' attribute.
   * @see #getCardinalidadeMaxima()
   * @generated
   */
  void setCardinalidadeMaxima(Integer value);

  /**
   * Returns the value of the '<em><b>Variantes Produto</b></em>' reference list.
   * The list contents are of type {@link caracteristica.VarianteProduto}.
   * It is bidirectional and its opposite is '{@link caracteristica.VarianteProduto#getVariacaoProdutoPai <em>Variacao Produto Pai</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variantes Produto</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variantes Produto</em>' reference list.
   * @see caracteristica.CaracteristicaPackage#getVariacaoProduto_VariantesProduto()
   * @see caracteristica.VarianteProduto#getVariacaoProdutoPai
   * @model opposite="variacaoProdutoPai"
   *        annotation="gmf.link target.decoration='closedarrow' color='0,0,0' style='solid' width='3'"
   * @generated
   */
  EList<VarianteProduto> getVariantesProduto();

  /**
   * Returns the value of the '<em><b>Caracteristica Produto Pai</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Caracteristica Produto Pai</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Caracteristica Produto Pai</em>' reference.
   * @see #setCaracteristicaProdutoPai(CaracteristicaProduto)
   * @see caracteristica.CaracteristicaPackage#getVariacaoProduto_CaracteristicaProdutoPai()
   * @model
   * @generated
   */
  CaracteristicaProduto getCaracteristicaProdutoPai();

  /**
   * Sets the value of the '{@link caracteristica.VariacaoProduto#getCaracteristicaProdutoPai <em>Caracteristica Produto Pai</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Caracteristica Produto Pai</em>' reference.
   * @see #getCaracteristicaProdutoPai()
   * @generated
   */
  void setCaracteristicaProdutoPai(CaracteristicaProduto value);

} // VariacaoProduto
