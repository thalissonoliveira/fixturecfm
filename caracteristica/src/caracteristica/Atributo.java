/**
 */
package caracteristica;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atributo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link caracteristica.Atributo#getTipoValor <em>Tipo Valor</em>}</li>
 *   <li>{@link caracteristica.Atributo#getCaracteristicaPai <em>Caracteristica Pai</em>}</li>
 * </ul>
 *
 * @see caracteristica.CaracteristicaPackage#getAtributo()
 * @model annotation="gmf.node label='nome' figure='utils.TriangleFigure' label.pattern='Attribute {0}'"
 * @generated
 */
public interface Atributo extends Elemento
{
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
	 * @see caracteristica.CaracteristicaPackage#getAtributo_TipoValor()
	 * @model
	 * @generated
	 */
  TipoValor getTipoValor();

  /**
	 * Sets the value of the '{@link caracteristica.Atributo#getTipoValor <em>Tipo Valor</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo Valor</em>' attribute.
	 * @see caracteristica.TipoValor
	 * @see #getTipoValor()
	 * @generated
	 */
  void setTipoValor(TipoValor value);

  /**
	 * Returns the value of the '<em><b>Caracteristica Pai</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link caracteristica.Caracteristica#getAtributo <em>Atributo</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Caracteristica Pai</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Caracteristica Pai</em>' reference.
	 * @see #setCaracteristicaPai(Caracteristica)
	 * @see caracteristica.CaracteristicaPackage#getAtributo_CaracteristicaPai()
	 * @see caracteristica.Caracteristica#getAtributo
	 * @model opposite="atributo"
	 * @generated
	 */
  Caracteristica getCaracteristicaPai();

  /**
	 * Sets the value of the '{@link caracteristica.Atributo#getCaracteristicaPai <em>Caracteristica Pai</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Caracteristica Pai</em>' reference.
	 * @see #getCaracteristicaPai()
	 * @generated
	 */
  void setCaracteristicaPai(Caracteristica value);

} // Atributo
