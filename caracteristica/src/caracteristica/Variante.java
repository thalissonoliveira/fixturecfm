/**
 */
package caracteristica;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variante</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link caracteristica.Variante#getVariacaoPai <em>Variacao Pai</em>}</li>
 * </ul>
 *
 * @see caracteristica.CaracteristicaPackage#getVariante()
 * @model
 * @generated
 */
public interface Variante extends PontoDeVariacao, ElementoCaracteristico, Caracteristica
{
  /**
	 * Returns the value of the '<em><b>Variacao Pai</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link caracteristica.Variacao#getVariantes <em>Variantes</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variacao Pai</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Variacao Pai</em>' reference.
	 * @see #setVariacaoPai(Variacao)
	 * @see caracteristica.CaracteristicaPackage#getVariante_VariacaoPai()
	 * @see caracteristica.Variacao#getVariantes
	 * @model opposite="variantes"
	 * @generated
	 */
  Variacao getVariacaoPai();

  /**
	 * Sets the value of the '{@link caracteristica.Variante#getVariacaoPai <em>Variacao Pai</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variacao Pai</em>' reference.
	 * @see #getVariacaoPai()
	 * @generated
	 */
  void setVariacaoPai(Variacao value);

} // Variante
