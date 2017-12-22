/**
 */
package caracteristica;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atributo Produto</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link caracteristica.AtributoProduto#getValor <em>Valor</em>}</li>
 *   <li>{@link caracteristica.AtributoProduto#getTipoValor <em>Tipo Valor</em>}</li>
 *   <li>{@link caracteristica.AtributoProduto#getCaracteristicaProdutoPai <em>Caracteristica Produto Pai</em>}</li>
 * </ul>
 * </p>
 *
 * @see caracteristica.CaracteristicaPackage#getAtributoProduto()
 * @model annotation="gmf.node label='nome,valor' figure='utils.TriangleFigure' label.pattern='Attribute {0}:{1}'"
 * @generated
 */
public interface AtributoProduto extends ElementoDeProduto
{
  /**
   * Returns the value of the '<em><b>Valor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Valor</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Valor</em>' attribute.
   * @see #setValor(String)
   * @see caracteristica.CaracteristicaPackage#getAtributoProduto_Valor()
   * @model
   * @generated
   */
  String getValor();

  /**
   * Sets the value of the '{@link caracteristica.AtributoProduto#getValor <em>Valor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Valor</em>' attribute.
   * @see #getValor()
   * @generated
   */
  void setValor(String value);

  /**
   * Returns the value of the '<em><b>Tipo Valor</b></em>' attribute.
   * The literals are from the enumeration {@link caracteristica.TipoValor}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tipo Valor</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tipo Valor</em>' attribute.
   * @see caracteristica.TipoValor
   * @see #setTipoValor(TipoValor)
   * @see caracteristica.CaracteristicaPackage#getAtributoProduto_TipoValor()
   * @model
   * @generated
   */
  TipoValor getTipoValor();

  /**
   * Sets the value of the '{@link caracteristica.AtributoProduto#getTipoValor <em>Tipo Valor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tipo Valor</em>' attribute.
   * @see caracteristica.TipoValor
   * @see #getTipoValor()
   * @generated
   */
  void setTipoValor(TipoValor value);

  /**
   * Returns the value of the '<em><b>Caracteristica Produto Pai</b></em>' reference.
   * It is bidirectional and its opposite is '{@link caracteristica.CaracteristicaProduto#getAtributoProduto <em>Atributo Produto</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Caracteristica Produto Pai</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Caracteristica Produto Pai</em>' reference.
   * @see #setCaracteristicaProdutoPai(CaracteristicaProduto)
   * @see caracteristica.CaracteristicaPackage#getAtributoProduto_CaracteristicaProdutoPai()
   * @see caracteristica.CaracteristicaProduto#getAtributoProduto
   * @model opposite="atributoProduto"
   * @generated
   */
  CaracteristicaProduto getCaracteristicaProdutoPai();

  /**
   * Sets the value of the '{@link caracteristica.AtributoProduto#getCaracteristicaProdutoPai <em>Caracteristica Produto Pai</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Caracteristica Produto Pai</em>' reference.
   * @see #getCaracteristicaProdutoPai()
   * @generated
   */
  void setCaracteristicaProdutoPai(CaracteristicaProduto value);

} // AtributoProduto
