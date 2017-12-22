/**
 */
package caracteristica;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Evento Relacional</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link caracteristica.EventoRelacional#getVariavelDeContexto <em>Variavel De Contexto</em>}</li>
 *   <li>{@link caracteristica.EventoRelacional#getOperadorRelacional <em>Operador Relacional</em>}</li>
 *   <li>{@link caracteristica.EventoRelacional#getValor <em>Valor</em>}</li>
 * </ul>
 * </p>
 *
 * @see caracteristica.CaracteristicaPackage#getEventoRelacional()
 * @model annotation="gmf.node label='nome'"
 * @generated
 */
public interface EventoRelacional extends Evento
{
  /**
   * Returns the value of the '<em><b>Variavel De Contexto</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variavel De Contexto</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variavel De Contexto</em>' reference.
   * @see #setVariavelDeContexto(InformacaoDeContexto)
   * @see caracteristica.CaracteristicaPackage#getEventoRelacional_VariavelDeContexto()
   * @model
   * @generated
   */
  InformacaoDeContexto getVariavelDeContexto();

  /**
   * Sets the value of the '{@link caracteristica.EventoRelacional#getVariavelDeContexto <em>Variavel De Contexto</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variavel De Contexto</em>' reference.
   * @see #getVariavelDeContexto()
   * @generated
   */
  void setVariavelDeContexto(InformacaoDeContexto value);

  /**
   * Returns the value of the '<em><b>Operador Relacional</b></em>' attribute.
   * The literals are from the enumeration {@link caracteristica.OperadorRelacional}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operador Relacional</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operador Relacional</em>' attribute.
   * @see caracteristica.OperadorRelacional
   * @see #setOperadorRelacional(OperadorRelacional)
   * @see caracteristica.CaracteristicaPackage#getEventoRelacional_OperadorRelacional()
   * @model
   * @generated
   */
  OperadorRelacional getOperadorRelacional();

  /**
   * Sets the value of the '{@link caracteristica.EventoRelacional#getOperadorRelacional <em>Operador Relacional</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operador Relacional</em>' attribute.
   * @see caracteristica.OperadorRelacional
   * @see #getOperadorRelacional()
   * @generated
   */
  void setOperadorRelacional(OperadorRelacional value);

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
   * @see caracteristica.CaracteristicaPackage#getEventoRelacional_Valor()
   * @model
   * @generated
   */
  String getValor();

  /**
   * Sets the value of the '{@link caracteristica.EventoRelacional#getValor <em>Valor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Valor</em>' attribute.
   * @see #getValor()
   * @generated
   */
  void setValor(String value);

} // EventoRelacional
