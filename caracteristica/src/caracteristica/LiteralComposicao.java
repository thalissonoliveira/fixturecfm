/**
 */
package caracteristica;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Literal Composicao</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link caracteristica.LiteralComposicao#getPresenca <em>Presenca</em>}</li>
 *   <li>{@link caracteristica.LiteralComposicao#getElemento <em>Elemento</em>}</li>
 * </ul>
 * </p>
 *
 * @see caracteristica.CaracteristicaPackage#getLiteralComposicao()
 * @model annotation="gmf.node label='nome'"
 * @generated
 */
public interface LiteralComposicao extends Antecedente
{
  /**
   * Returns the value of the '<em><b>Presenca</b></em>' attribute.
   * The literals are from the enumeration {@link caracteristica.Presenca}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Presenca</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Presenca</em>' attribute.
   * @see caracteristica.Presenca
   * @see #setPresenca(Presenca)
   * @see caracteristica.CaracteristicaPackage#getLiteralComposicao_Presenca()
   * @model
   * @generated
   */
  Presenca getPresenca();

  /**
   * Sets the value of the '{@link caracteristica.LiteralComposicao#getPresenca <em>Presenca</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Presenca</em>' attribute.
   * @see caracteristica.Presenca
   * @see #getPresenca()
   * @generated
   */
  void setPresenca(Presenca value);

  /**
   * Returns the value of the '<em><b>Elemento</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elemento</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elemento</em>' reference.
   * @see #setElemento(ElementoCaracteristico)
   * @see caracteristica.CaracteristicaPackage#getLiteralComposicao_Elemento()
   * @model
   * @generated
   */
  ElementoCaracteristico getElemento();

  /**
   * Sets the value of the '{@link caracteristica.LiteralComposicao#getElemento <em>Elemento</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Elemento</em>' reference.
   * @see #getElemento()
   * @generated
   */
  void setElemento(ElementoCaracteristico value);

} // LiteralComposicao
