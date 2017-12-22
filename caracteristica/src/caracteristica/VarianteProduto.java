/**
 */
package caracteristica;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variante Produto</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link caracteristica.VarianteProduto#getVariacaoProdutoPai <em>Variacao Produto Pai</em>}</li>
 *   <li>{@link caracteristica.VarianteProduto#getSelecionado <em>Selecionado</em>}</li>
 * </ul>
 * </p>
 *
 * @see caracteristica.CaracteristicaPackage#getVarianteProduto()
 * @model
 * @generated
 */
public interface VarianteProduto extends ElementoDeProduto
{
  /**
   * Returns the value of the '<em><b>Variacao Produto Pai</b></em>' reference.
   * It is bidirectional and its opposite is '{@link caracteristica.VariacaoProduto#getVariantesProduto <em>Variantes Produto</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variacao Produto Pai</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variacao Produto Pai</em>' reference.
   * @see #setVariacaoProdutoPai(VariacaoProduto)
   * @see caracteristica.CaracteristicaPackage#getVarianteProduto_VariacaoProdutoPai()
   * @see caracteristica.VariacaoProduto#getVariantesProduto
   * @model opposite="variantesProduto" required="true"
   * @generated
   */
  VariacaoProduto getVariacaoProdutoPai();

  /**
   * Sets the value of the '{@link caracteristica.VarianteProduto#getVariacaoProdutoPai <em>Variacao Produto Pai</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variacao Produto Pai</em>' reference.
   * @see #getVariacaoProdutoPai()
   * @generated
   */
  void setVariacaoProdutoPai(VariacaoProduto value);

  /**
   * Returns the value of the '<em><b>Selecionado</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Selecionado</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Selecionado</em>' attribute.
   * @see #setSelecionado(Boolean)
   * @see caracteristica.CaracteristicaPackage#getVarianteProduto_Selecionado()
   * @model
   * @generated
   */
  Boolean getSelecionado();

  /**
   * Sets the value of the '{@link caracteristica.VarianteProduto#getSelecionado <em>Selecionado</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Selecionado</em>' attribute.
   * @see #getSelecionado()
   * @generated
   */
  void setSelecionado(Boolean value);

} // VarianteProduto
