/**
 */
package caracteristica;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Informacaode Contexto</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link caracteristica.InformacaoDeContexto#getOrigem <em>Origem</em>}</li>
 *   <li>{@link caracteristica.InformacaoDeContexto#getValidade <em>Validade</em>}</li>
 *   <li>{@link caracteristica.InformacaoDeContexto#getQualidade <em>Qualidade</em>}</li>
 *   <li>{@link caracteristica.InformacaoDeContexto#getTipoValor <em>Tipo Valor</em>}</li>
 *   <li>{@link caracteristica.InformacaoDeContexto#getValor <em>Valor</em>}</li>
 *   <li>{@link caracteristica.InformacaoDeContexto#getElementoPai <em>Elemento Pai</em>}</li>
 * </ul>
 * </p>
 *
 * @see caracteristica.CaracteristicaPackage#getInformacaoDeContexto()
 * @model annotation="gmf.node label='nome,valor' label.pattern='Informa\347\343o de Contexto: {0} Valor {1}'"
 * @generated
 */
public interface InformacaoDeContexto extends Elemento
{
  /**
   * Returns the value of the '<em><b>Origem</b></em>' attribute.
   * The literals are from the enumeration {@link caracteristica.Origem}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Origem</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Origem</em>' attribute.
   * @see caracteristica.Origem
   * @see #setOrigem(Origem)
   * @see caracteristica.CaracteristicaPackage#getInformacaoDeContexto_Origem()
   * @model
   * @generated
   */
  Origem getOrigem();

  /**
   * Sets the value of the '{@link caracteristica.InformacaoDeContexto#getOrigem <em>Origem</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Origem</em>' attribute.
   * @see caracteristica.Origem
   * @see #getOrigem()
   * @generated
   */
  void setOrigem(Origem value);

  /**
   * Returns the value of the '<em><b>Validade</b></em>' attribute.
   * The literals are from the enumeration {@link caracteristica.Validade}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Validade</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Validade</em>' attribute.
   * @see caracteristica.Validade
   * @see #setValidade(Validade)
   * @see caracteristica.CaracteristicaPackage#getInformacaoDeContexto_Validade()
   * @model
   * @generated
   */
  Validade getValidade();

  /**
   * Sets the value of the '{@link caracteristica.InformacaoDeContexto#getValidade <em>Validade</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Validade</em>' attribute.
   * @see caracteristica.Validade
   * @see #getValidade()
   * @generated
   */
  void setValidade(Validade value);

  /**
   * Returns the value of the '<em><b>Qualidade</b></em>' attribute.
   * The literals are from the enumeration {@link caracteristica.Qualidade}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Qualidade</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Qualidade</em>' attribute.
   * @see caracteristica.Qualidade
   * @see #setQualidade(Qualidade)
   * @see caracteristica.CaracteristicaPackage#getInformacaoDeContexto_Qualidade()
   * @model
   * @generated
   */
  Qualidade getQualidade();

  /**
   * Sets the value of the '{@link caracteristica.InformacaoDeContexto#getQualidade <em>Qualidade</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Qualidade</em>' attribute.
   * @see caracteristica.Qualidade
   * @see #getQualidade()
   * @generated
   */
  void setQualidade(Qualidade value);

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
   * @see caracteristica.CaracteristicaPackage#getInformacaoDeContexto_TipoValor()
   * @model
   * @generated
   */
  TipoValor getTipoValor();

  /**
   * Sets the value of the '{@link caracteristica.InformacaoDeContexto#getTipoValor <em>Tipo Valor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tipo Valor</em>' attribute.
   * @see caracteristica.TipoValor
   * @see #getTipoValor()
   * @generated
   */
  void setTipoValor(TipoValor value);

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
   * @see caracteristica.CaracteristicaPackage#getInformacaoDeContexto_Valor()
   * @model
   * @generated
   */
  String getValor();

  /**
   * Sets the value of the '{@link caracteristica.InformacaoDeContexto#getValor <em>Valor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Valor</em>' attribute.
   * @see #getValor()
   * @generated
   */
  void setValor(String value);

  /**
   * Returns the value of the '<em><b>Elemento Pai</b></em>' reference.
   * It is bidirectional and its opposite is '{@link caracteristica.EntidadeDeContexto#getInformacoesDeContexto <em>Informacoes De Contexto</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elemento Pai</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elemento Pai</em>' reference.
   * @see #setElementoPai(EntidadeDeContexto)
   * @see caracteristica.CaracteristicaPackage#getInformacaoDeContexto_ElementoPai()
   * @see caracteristica.EntidadeDeContexto#getInformacoesDeContexto
   * @model opposite="informacoesDeContexto" required="true"
   * @generated
   */
  EntidadeDeContexto getElementoPai();

  /**
   * Sets the value of the '{@link caracteristica.InformacaoDeContexto#getElementoPai <em>Elemento Pai</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Elemento Pai</em>' reference.
   * @see #getElementoPai()
   * @generated
   */
  void setElementoPai(EntidadeDeContexto value);

} // InformacaodeContexto
