/**
 */
package caracteristica;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Literal Acao</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link caracteristica.LiteralAcao#getPresenca <em>Presenca</em>}</li>
 *   <li>{@link caracteristica.LiteralAcao#getElemento <em>Elemento</em>}</li>
 * </ul>
 * </p>
 *
 * @see caracteristica.CaracteristicaPackage#getLiteralAcao()
 * @model annotation="gmf.node label='nome'"
 * @generated
 */
public interface LiteralAcao extends Acao
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
   * @see caracteristica.CaracteristicaPackage#getLiteralAcao_Presenca()
   * @model
   * @generated
   */
  Presenca getPresenca();

  /**
   * Sets the value of the '{@link caracteristica.LiteralAcao#getPresenca <em>Presenca</em>}' attribute.
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
   * @see caracteristica.CaracteristicaPackage#getLiteralAcao_Elemento()
   * @model
   * @generated
   */
  ElementoCaracteristico getElemento();

  /**
   * Sets the value of the '{@link caracteristica.LiteralAcao#getElemento <em>Elemento</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Elemento</em>' reference.
   * @see #getElemento()
   * @generated
   */
  void setElemento(ElementoCaracteristico value);

} // LiteralAcao
