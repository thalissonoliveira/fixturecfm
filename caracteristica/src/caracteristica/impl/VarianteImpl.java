/**
 */
package caracteristica.impl;

import caracteristica.Atributo;
import caracteristica.Caracteristica;
import caracteristica.CaracteristicaPackage;
import caracteristica.Elemento;
import caracteristica.ElementoCaracteristico;
import caracteristica.ElementoExterno;
import caracteristica.Variacao;
import caracteristica.Variante;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variante</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link caracteristica.impl.VarianteImpl#getNome <em>Nome</em>}</li>
 *   <li>{@link caracteristica.impl.VarianteImpl#getCaracteristicaPai <em>Caracteristica Pai</em>}</li>
 *   <li>{@link caracteristica.impl.VarianteImpl#getCaracteristicaFilha <em>Caracteristica Filha</em>}</li>
 *   <li>{@link caracteristica.impl.VarianteImpl#getVariacoes <em>Variacoes</em>}</li>
 *   <li>{@link caracteristica.impl.VarianteImpl#getAtributo <em>Atributo</em>}</li>
 *   <li>{@link caracteristica.impl.VarianteImpl#getVariacaoPai <em>Variacao Pai</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VarianteImpl extends PontoDeVariacaoImpl implements Variante
{
  /**
	 * The default value of the '{@link #getNome() <em>Nome</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getNome()
	 * @generated
	 * @ordered
	 */
  protected static final String NOME_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getNome() <em>Nome</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getNome()
	 * @generated
	 * @ordered
	 */
  protected String nome = NOME_EDEFAULT;

  /**
	 * The cached value of the '{@link #getCaracteristicaPai() <em>Caracteristica Pai</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getCaracteristicaPai()
	 * @generated
	 * @ordered
	 */
  protected Caracteristica caracteristicaPai;

  /**
	 * The cached value of the '{@link #getCaracteristicaFilha() <em>Caracteristica Filha</em>}' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getCaracteristicaFilha()
	 * @generated
	 * @ordered
	 */
  protected EList<Caracteristica> caracteristicaFilha;

  /**
	 * The cached value of the '{@link #getVariacoes() <em>Variacoes</em>}' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getVariacoes()
	 * @generated
	 * @ordered
	 */
  protected EList<Variacao> variacoes;

  /**
	 * The cached value of the '{@link #getAtributo() <em>Atributo</em>}' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getAtributo()
	 * @generated
	 * @ordered
	 */
  protected EList<Atributo> atributo;

  /**
	 * The cached value of the '{@link #getVariacaoPai() <em>Variacao Pai</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getVariacaoPai()
	 * @generated
	 * @ordered
	 */
  protected Variacao variacaoPai;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected VarianteImpl()
  {
		super();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  
  
  @Override
		protected EClass eStaticClass()
  {
		return CaracteristicaPackage.Literals.VARIANTE;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getNome()
  {
		return nome;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setNome(String newNome)
  {
		String oldNome = nome;
		nome = newNome;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CaracteristicaPackage.VARIANTE__NOME, oldNome, nome));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Caracteristica getCaracteristicaPai()
  {
		if (caracteristicaPai != null && caracteristicaPai.eIsProxy()) {
			InternalEObject oldCaracteristicaPai = (InternalEObject)caracteristicaPai;
			caracteristicaPai = (Caracteristica)eResolveProxy(oldCaracteristicaPai);
			if (caracteristicaPai != oldCaracteristicaPai) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CaracteristicaPackage.VARIANTE__CARACTERISTICA_PAI, oldCaracteristicaPai, caracteristicaPai));
			}
		}
		return caracteristicaPai;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Caracteristica basicGetCaracteristicaPai()
  {
		return caracteristicaPai;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetCaracteristicaPai(Caracteristica newCaracteristicaPai, NotificationChain msgs)
  {
		Caracteristica oldCaracteristicaPai = caracteristicaPai;
		caracteristicaPai = newCaracteristicaPai;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CaracteristicaPackage.VARIANTE__CARACTERISTICA_PAI, oldCaracteristicaPai, newCaracteristicaPai);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setCaracteristicaPai(Caracteristica newCaracteristicaPai)
  {
		if (newCaracteristicaPai != caracteristicaPai) {
			NotificationChain msgs = null;
			if (caracteristicaPai != null)
				msgs = ((InternalEObject)caracteristicaPai).eInverseRemove(this, CaracteristicaPackage.CARACTERISTICA__CARACTERISTICA_FILHA, Caracteristica.class, msgs);
			if (newCaracteristicaPai != null)
				msgs = ((InternalEObject)newCaracteristicaPai).eInverseAdd(this, CaracteristicaPackage.CARACTERISTICA__CARACTERISTICA_FILHA, Caracteristica.class, msgs);
			msgs = basicSetCaracteristicaPai(newCaracteristicaPai, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CaracteristicaPackage.VARIANTE__CARACTERISTICA_PAI, newCaracteristicaPai, newCaracteristicaPai));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<Caracteristica> getCaracteristicaFilha()
  {
		if (caracteristicaFilha == null) {
			caracteristicaFilha = new EObjectWithInverseResolvingEList<Caracteristica>(Caracteristica.class, this, CaracteristicaPackage.VARIANTE__CARACTERISTICA_FILHA, CaracteristicaPackage.CARACTERISTICA__CARACTERISTICA_PAI);
		}
		return caracteristicaFilha;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<Variacao> getVariacoes()
  {
		if (variacoes == null) {
			variacoes = new EObjectWithInverseResolvingEList<Variacao>(Variacao.class, this, CaracteristicaPackage.VARIANTE__VARIACOES, CaracteristicaPackage.VARIACAO__CARACTERISTICA_PAI);
		}
		return variacoes;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<Atributo> getAtributo()
  {
		if (atributo == null) {
			atributo = new EObjectWithInverseResolvingEList<Atributo>(Atributo.class, this, CaracteristicaPackage.VARIANTE__ATRIBUTO, CaracteristicaPackage.ATRIBUTO__CARACTERISTICA_PAI);
		}
		return atributo;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Variacao getVariacaoPai()
  {
		if (variacaoPai != null && variacaoPai.eIsProxy()) {
			InternalEObject oldVariacaoPai = (InternalEObject)variacaoPai;
			variacaoPai = (Variacao)eResolveProxy(oldVariacaoPai);
			if (variacaoPai != oldVariacaoPai) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CaracteristicaPackage.VARIANTE__VARIACAO_PAI, oldVariacaoPai, variacaoPai));
			}
		}
		return variacaoPai;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Variacao basicGetVariacaoPai()
  {
		return variacaoPai;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetVariacaoPai(Variacao newVariacaoPai, NotificationChain msgs)
  {
		Variacao oldVariacaoPai = variacaoPai;
		variacaoPai = newVariacaoPai;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CaracteristicaPackage.VARIANTE__VARIACAO_PAI, oldVariacaoPai, newVariacaoPai);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setVariacaoPai(Variacao newVariacaoPai)
  {
		if (newVariacaoPai != variacaoPai) {
			NotificationChain msgs = null;
			if (variacaoPai != null)
				msgs = ((InternalEObject)variacaoPai).eInverseRemove(this, CaracteristicaPackage.VARIACAO__VARIANTES, Variacao.class, msgs);
			if (newVariacaoPai != null)
				msgs = ((InternalEObject)newVariacaoPai).eInverseAdd(this, CaracteristicaPackage.VARIACAO__VARIANTES, Variacao.class, msgs);
			msgs = basicSetVariacaoPai(newVariacaoPai, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CaracteristicaPackage.VARIANTE__VARIACAO_PAI, newVariacaoPai, newVariacaoPai));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @SuppressWarnings("unchecked")
		@Override
  
  
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
		switch (featureID) {
			case CaracteristicaPackage.VARIANTE__CARACTERISTICA_PAI:
				if (caracteristicaPai != null)
					msgs = ((InternalEObject)caracteristicaPai).eInverseRemove(this, CaracteristicaPackage.CARACTERISTICA__CARACTERISTICA_FILHA, Caracteristica.class, msgs);
				return basicSetCaracteristicaPai((Caracteristica)otherEnd, msgs);
			case CaracteristicaPackage.VARIANTE__CARACTERISTICA_FILHA:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCaracteristicaFilha()).basicAdd(otherEnd, msgs);
			case CaracteristicaPackage.VARIANTE__VARIACOES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getVariacoes()).basicAdd(otherEnd, msgs);
			case CaracteristicaPackage.VARIANTE__ATRIBUTO:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAtributo()).basicAdd(otherEnd, msgs);
			case CaracteristicaPackage.VARIANTE__VARIACAO_PAI:
				if (variacaoPai != null)
					msgs = ((InternalEObject)variacaoPai).eInverseRemove(this, CaracteristicaPackage.VARIACAO__VARIANTES, Variacao.class, msgs);
				return basicSetVariacaoPai((Variacao)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  
  
  @Override
		public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
		switch (featureID) {
			case CaracteristicaPackage.VARIANTE__CARACTERISTICA_PAI:
				return basicSetCaracteristicaPai(null, msgs);
			case CaracteristicaPackage.VARIANTE__CARACTERISTICA_FILHA:
				return ((InternalEList<?>)getCaracteristicaFilha()).basicRemove(otherEnd, msgs);
			case CaracteristicaPackage.VARIANTE__VARIACOES:
				return ((InternalEList<?>)getVariacoes()).basicRemove(otherEnd, msgs);
			case CaracteristicaPackage.VARIANTE__ATRIBUTO:
				return ((InternalEList<?>)getAtributo()).basicRemove(otherEnd, msgs);
			case CaracteristicaPackage.VARIANTE__VARIACAO_PAI:
				return basicSetVariacaoPai(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  
  
  @Override
		public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
		switch (featureID) {
			case CaracteristicaPackage.VARIANTE__NOME:
				return getNome();
			case CaracteristicaPackage.VARIANTE__CARACTERISTICA_PAI:
				if (resolve) return getCaracteristicaPai();
				return basicGetCaracteristicaPai();
			case CaracteristicaPackage.VARIANTE__CARACTERISTICA_FILHA:
				return getCaracteristicaFilha();
			case CaracteristicaPackage.VARIANTE__VARIACOES:
				return getVariacoes();
			case CaracteristicaPackage.VARIANTE__ATRIBUTO:
				return getAtributo();
			case CaracteristicaPackage.VARIANTE__VARIACAO_PAI:
				if (resolve) return getVariacaoPai();
				return basicGetVariacaoPai();
		}
		return super.eGet(featureID, resolve, coreType);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @SuppressWarnings("unchecked")
		@Override
  
  
  public void eSet(int featureID, Object newValue)
  {
		switch (featureID) {
			case CaracteristicaPackage.VARIANTE__NOME:
				setNome((String)newValue);
				return;
			case CaracteristicaPackage.VARIANTE__CARACTERISTICA_PAI:
				setCaracteristicaPai((Caracteristica)newValue);
				return;
			case CaracteristicaPackage.VARIANTE__CARACTERISTICA_FILHA:
				getCaracteristicaFilha().clear();
				getCaracteristicaFilha().addAll((Collection<? extends Caracteristica>)newValue);
				return;
			case CaracteristicaPackage.VARIANTE__VARIACOES:
				getVariacoes().clear();
				getVariacoes().addAll((Collection<? extends Variacao>)newValue);
				return;
			case CaracteristicaPackage.VARIANTE__ATRIBUTO:
				getAtributo().clear();
				getAtributo().addAll((Collection<? extends Atributo>)newValue);
				return;
			case CaracteristicaPackage.VARIANTE__VARIACAO_PAI:
				setVariacaoPai((Variacao)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  
  
  @Override
		public void eUnset(int featureID)
  {
		switch (featureID) {
			case CaracteristicaPackage.VARIANTE__NOME:
				setNome(NOME_EDEFAULT);
				return;
			case CaracteristicaPackage.VARIANTE__CARACTERISTICA_PAI:
				setCaracteristicaPai((Caracteristica)null);
				return;
			case CaracteristicaPackage.VARIANTE__CARACTERISTICA_FILHA:
				getCaracteristicaFilha().clear();
				return;
			case CaracteristicaPackage.VARIANTE__VARIACOES:
				getVariacoes().clear();
				return;
			case CaracteristicaPackage.VARIANTE__ATRIBUTO:
				getAtributo().clear();
				return;
			case CaracteristicaPackage.VARIANTE__VARIACAO_PAI:
				setVariacaoPai((Variacao)null);
				return;
		}
		super.eUnset(featureID);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  
  
  @Override
		public boolean eIsSet(int featureID)
  {
		switch (featureID) {
			case CaracteristicaPackage.VARIANTE__NOME:
				return NOME_EDEFAULT == null ? nome != null : !NOME_EDEFAULT.equals(nome);
			case CaracteristicaPackage.VARIANTE__CARACTERISTICA_PAI:
				return caracteristicaPai != null;
			case CaracteristicaPackage.VARIANTE__CARACTERISTICA_FILHA:
				return caracteristicaFilha != null && !caracteristicaFilha.isEmpty();
			case CaracteristicaPackage.VARIANTE__VARIACOES:
				return variacoes != null && !variacoes.isEmpty();
			case CaracteristicaPackage.VARIANTE__ATRIBUTO:
				return atributo != null && !atributo.isEmpty();
			case CaracteristicaPackage.VARIANTE__VARIACAO_PAI:
				return variacaoPai != null;
		}
		return super.eIsSet(featureID);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  
  
  @Override
		public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
		if (baseClass == Elemento.class) {
			switch (derivedFeatureID) {
				case CaracteristicaPackage.VARIANTE__NOME: return CaracteristicaPackage.ELEMENTO__NOME;
				default: return -1;
			}
		}
		if (baseClass == ElementoCaracteristico.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Caracteristica.class) {
			switch (derivedFeatureID) {
				case CaracteristicaPackage.VARIANTE__CARACTERISTICA_PAI: return CaracteristicaPackage.CARACTERISTICA__CARACTERISTICA_PAI;
				case CaracteristicaPackage.VARIANTE__CARACTERISTICA_FILHA: return CaracteristicaPackage.CARACTERISTICA__CARACTERISTICA_FILHA;
				case CaracteristicaPackage.VARIANTE__VARIACOES: return CaracteristicaPackage.CARACTERISTICA__VARIACOES;
				case CaracteristicaPackage.VARIANTE__ATRIBUTO: return CaracteristicaPackage.CARACTERISTICA__ATRIBUTO;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  
  
  @Override
		public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
  {
		if (baseClass == Elemento.class) {
			switch (baseFeatureID) {
				case CaracteristicaPackage.ELEMENTO__NOME: return CaracteristicaPackage.VARIANTE__NOME;
				default: return -1;
			}
		}
		if (baseClass == ElementoCaracteristico.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Caracteristica.class) {
			switch (baseFeatureID) {
				case CaracteristicaPackage.CARACTERISTICA__CARACTERISTICA_PAI: return CaracteristicaPackage.VARIANTE__CARACTERISTICA_PAI;
				case CaracteristicaPackage.CARACTERISTICA__CARACTERISTICA_FILHA: return CaracteristicaPackage.VARIANTE__CARACTERISTICA_FILHA;
				case CaracteristicaPackage.CARACTERISTICA__VARIACOES: return CaracteristicaPackage.VARIANTE__VARIACOES;
				case CaracteristicaPackage.CARACTERISTICA__ATRIBUTO: return CaracteristicaPackage.VARIANTE__ATRIBUTO;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  
  
  @Override
		public String toString()
  {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (nome: ");
		result.append(nome);
		result.append(')');
		return result.toString();
	}

} //VarianteImpl
