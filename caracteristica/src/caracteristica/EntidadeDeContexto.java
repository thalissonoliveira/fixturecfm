/**
 */
package caracteristica;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entidadede Contexto</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link caracteristica.EntidadeDeContexto#getRaiz <em>Raiz</em>}</li>
 *   <li>{@link caracteristica.EntidadeDeContexto#getInformacoesDeContexto <em>Informacoes De Contexto</em>}</li>
 * </ul>
 * </p>
 *
 * @see caracteristica.CaracteristicaPackage#getEntidadeDeContexto()
 * @model annotation="gmf.node label='nome' label.pattern='Entidade de Contexto {0}'"
 * @generated
 */
public interface EntidadeDeContexto extends Elemento
{
  /**
   * Returns the value of the '<em><b>Raiz</b></em>' reference.
   * It is bidirectional and its opposite is '{@link caracteristica.RaizDeContexto#getEntidadesDeContexto <em>Entidades De Contexto</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Raiz</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Raiz</em>' reference.
   * @see #setRaiz(RaizDeContexto)
   * @see caracteristica.CaracteristicaPackage#getEntidadeDeContexto_Raiz()
   * @see caracteristica.RaizDeContexto#getEntidadesDeContexto
   * @model opposite="entidadesDeContexto"
   * @generated
   */
  RaizDeContexto getRaiz();

  /**
   * Sets the value of the '{@link caracteristica.EntidadeDeContexto#getRaiz <em>Raiz</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Raiz</em>' reference.
   * @see #getRaiz()
   * @generated
   */
  void setRaiz(RaizDeContexto value);

  /**
   * Returns the value of the '<em><b>Informacoes De Contexto</b></em>' reference list.
   * The list contents are of type {@link caracteristica.InformacaoDeContexto}.
   * It is bidirectional and its opposite is '{@link caracteristica.InformacaoDeContexto#getElementoPai <em>Elemento Pai</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Informacoes De Contexto</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Informacoes De Contexto</em>' reference list.
   * @see caracteristica.CaracteristicaPackage#getEntidadeDeContexto_InformacoesDeContexto()
   * @see caracteristica.InformacaoDeContexto#getElementoPai
   * @model opposite="elementoPai"
   *        annotation="gmf.link target.decoration='closedarrow' color='0,0,0' style='solid' width='3'"
   * @generated
   */
  EList<InformacaoDeContexto> getInformacoesDeContexto();

} // EntidadedeContexto
