/**
 */
package caracteristica;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Produto</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link caracteristica.CaracteristicaProduto#getCaracteristicaProdutoPai <em>Caracteristica Produto Pai</em>}</li>
 *   <li>{@link caracteristica.CaracteristicaProduto#getCaracteristicaProdutoFilha <em>Caracteristica Produto Filha</em>}</li>
 *   <li>{@link caracteristica.CaracteristicaProduto#getAtributoProduto <em>Atributo Produto</em>}</li>
 * </ul>
 * </p>
 *
 * @see caracteristica.CaracteristicaPackage#getCaracteristicaProduto()
 * @model
 * @generated
 */
public interface CaracteristicaProduto extends ElementoDeProduto
{
  /**
   * Returns the value of the '<em><b>Caracteristica Produto Pai</b></em>' reference.
   * It is bidirectional and its opposite is '{@link caracteristica.CaracteristicaProduto#getCaracteristicaProdutoFilha <em>Caracteristica Produto Filha</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Caracteristica Produto Pai</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Caracteristica Produto Pai</em>' reference.
   * @see #setCaracteristicaProdutoPai(CaracteristicaProduto)
   * @see caracteristica.CaracteristicaPackage#getCaracteristicaProduto_CaracteristicaProdutoPai()
   * @see caracteristica.CaracteristicaProduto#getCaracteristicaProdutoFilha
   * @model opposite="caracteristicaProdutoFilha"
   * @generated
   */
  CaracteristicaProduto getCaracteristicaProdutoPai();

  /**
   * Sets the value of the '{@link caracteristica.CaracteristicaProduto#getCaracteristicaProdutoPai <em>Caracteristica Produto Pai</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Caracteristica Produto Pai</em>' reference.
   * @see #getCaracteristicaProdutoPai()
   * @generated
   */
  void setCaracteristicaProdutoPai(CaracteristicaProduto value);

  /**
   * Returns the value of the '<em><b>Caracteristica Produto Filha</b></em>' reference list.
   * The list contents are of type {@link caracteristica.CaracteristicaProduto}.
   * It is bidirectional and its opposite is '{@link caracteristica.CaracteristicaProduto#getCaracteristicaProdutoPai <em>Caracteristica Produto Pai</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Caracteristica Produto Filha</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Caracteristica Produto Filha</em>' reference list.
   * @see caracteristica.CaracteristicaPackage#getCaracteristicaProduto_CaracteristicaProdutoFilha()
   * @see caracteristica.CaracteristicaProduto#getCaracteristicaProdutoPai
   * @model opposite="caracteristicaProdutoPai"
   *        annotation="gmf.link target.decoration='closedarrow' color='0,0,0' style='solid' width='3'"
   * @generated
   */
  EList<CaracteristicaProduto> getCaracteristicaProdutoFilha();

  /**
   * Returns the value of the '<em><b>Atributo Produto</b></em>' reference list.
   * The list contents are of type {@link caracteristica.AtributoProduto}.
   * It is bidirectional and its opposite is '{@link caracteristica.AtributoProduto#getCaracteristicaProdutoPai <em>Caracteristica Produto Pai</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Atributo Produto</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Atributo Produto</em>' reference list.
   * @see caracteristica.CaracteristicaPackage#getCaracteristicaProduto_AtributoProduto()
   * @see caracteristica.AtributoProduto#getCaracteristicaProdutoPai
   * @model opposite="caracteristicaProdutoPai"
   *        annotation="gmf.link target.decoration='closedarrow' color='0,0,0' style='solid' width='3'"
   * @generated
   */
  EList<AtributoProduto> getAtributoProduto();

} // CaracteristicaProduto
