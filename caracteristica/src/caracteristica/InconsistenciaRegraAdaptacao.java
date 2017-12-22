/**
 */
package caracteristica;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inconsistencia Regra Adaptacao</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link caracteristica.InconsistenciaRegraAdaptacao#getRegrasInconsistentes <em>Regras Inconsistentes</em>}</li>
 *   <li>{@link caracteristica.InconsistenciaRegraAdaptacao#getLiteraisInconsistentes <em>Literais Inconsistentes</em>}</li>
 *   <li>{@link caracteristica.InconsistenciaRegraAdaptacao#getAtribuicoesInconsistentes <em>Atribuicoes Inconsistentes</em>}</li>
 * </ul>
 * </p>
 *
 * @see caracteristica.CaracteristicaPackage#getInconsistenciaRegraAdaptacao()
 * @model
 * @generated
 */
public interface InconsistenciaRegraAdaptacao extends EObject
{
  /**
   * Returns the value of the '<em><b>Regras Inconsistentes</b></em>' reference list.
   * The list contents are of type {@link caracteristica.RegraDeContexto}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Regras Inconsistentes</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Regras Inconsistentes</em>' reference list.
   * @see caracteristica.CaracteristicaPackage#getInconsistenciaRegraAdaptacao_RegrasInconsistentes()
   * @model
   * @generated
   */
  EList<RegraDeContexto> getRegrasInconsistentes();

  /**
   * Returns the value of the '<em><b>Literais Inconsistentes</b></em>' reference list.
   * The list contents are of type {@link caracteristica.LiteralAcao}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Literais Inconsistentes</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Literais Inconsistentes</em>' reference list.
   * @see caracteristica.CaracteristicaPackage#getInconsistenciaRegraAdaptacao_LiteraisInconsistentes()
   * @model
   * @generated
   */
  EList<LiteralAcao> getLiteraisInconsistentes();

  /**
   * Returns the value of the '<em><b>Atribuicoes Inconsistentes</b></em>' reference list.
   * The list contents are of type {@link caracteristica.Designar}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Atribuicoes Inconsistentes</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Atribuicoes Inconsistentes</em>' reference list.
   * @see caracteristica.CaracteristicaPackage#getInconsistenciaRegraAdaptacao_AtribuicoesInconsistentes()
   * @model
   * @generated
   */
  EList<Designar> getAtribuicoesInconsistentes();

} // InconsistenciaRegraAdaptacao
