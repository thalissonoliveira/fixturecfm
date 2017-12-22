/**
 */
package caracteristica;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Produto</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link caracteristica.Produto#getLinhaDoProduto <em>Linha Do Produto</em>}</li>
 * </ul>
 * </p>
 *
 * @see caracteristica.CaracteristicaPackage#getProduto()
 * @model annotation="gmf.node label='nome' label.pattern='Product: {0}' figure='ellipse'"
 * @generated
 */
public interface Produto extends CaracteristicaProduto
{
  /**
   * Returns the value of the '<em><b>Linha Do Produto</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Linha Do Produto</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Linha Do Produto</em>' reference.
   * @see #setLinhaDoProduto(CaracteristicaRaiz)
   * @see caracteristica.CaracteristicaPackage#getProduto_LinhaDoProduto()
   * @model annotation="gmf.link target.decoration='closedarrow' color='0,0,0' style='solid'"
   * @generated
   */
  CaracteristicaRaiz getLinhaDoProduto();

  /**
   * Sets the value of the '{@link caracteristica.Produto#getLinhaDoProduto <em>Linha Do Produto</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Linha Do Produto</em>' reference.
   * @see #getLinhaDoProduto()
   * @generated
   */
  void setLinhaDoProduto(CaracteristicaRaiz value);

} // Produto
