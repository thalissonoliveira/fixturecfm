/**
 */
package caracteristica.impl;

import caracteristica.Caracteristica;
import caracteristica.CaracteristicaPackage;
import caracteristica.CardinalidadeMaxima;
import caracteristica.Elemento;
import caracteristica.Variacao;
import caracteristica.Variante;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variacao</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link caracteristica.impl.VariacaoImpl#getNome <em>Nome</em>}</li>
 *   <li>{@link caracteristica.impl.VariacaoImpl#getCardinalidadeMinima <em>Cardinalidade Minima</em>}</li>
 *   <li>{@link caracteristica.impl.VariacaoImpl#getCardinalidadeMaxima <em>Cardinalidade Maxima</em>}</li>
 *   <li>{@link caracteristica.impl.VariacaoImpl#getVariantes <em>Variantes</em>}</li>
 *   <li>{@link caracteristica.impl.VariacaoImpl#getCaracteristicaPai <em>Caracteristica Pai</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VariacaoImpl extends PontoDeVariacaoImpl implements Variacao
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
	 * The default value of the '{@link #getCardinalidadeMinima() <em>Cardinalidade Minima</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getCardinalidadeMinima()
	 * @generated
	 * @ordered
	 */
  protected static final Integer CARDINALIDADE_MINIMA_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getCardinalidadeMinima() <em>Cardinalidade Minima</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getCardinalidadeMinima()
	 * @generated
	 * @ordered
	 */
  protected Integer cardinalidadeMinima = CARDINALIDADE_MINIMA_EDEFAULT;

  /**
	 * The default value of the '{@link #getCardinalidadeMaxima() <em>Cardinalidade Maxima</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getCardinalidadeMaxima()
	 * @generated
	 * @ordered
	 */
  protected static final Integer CARDINALIDADE_MAXIMA_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getCardinalidadeMaxima() <em>Cardinalidade Maxima</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getCardinalidadeMaxima()
	 * @generated
	 * @ordered
	 */
  protected Integer cardinalidadeMaxima = CARDINALIDADE_MAXIMA_EDEFAULT;

  /**
	 * The cached value of the '{@link #getVariantes() <em>Variantes</em>}' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getVariantes()
	 * @generated
	 * @ordered
	 */
  protected EList<Variante> variantes;

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
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected VariacaoImpl()
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
		return CaracteristicaPackage.Literals.VARIACAO;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CaracteristicaPackage.VARIACAO__NOME, oldNome, nome));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Integer getCardinalidadeMinima()
  {
		return cardinalidadeMinima;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setCardinalidadeMinima(Integer newCardinalidadeMinima)
  {
		Integer oldCardinalidadeMinima = cardinalidadeMinima;
		cardinalidadeMinima = newCardinalidadeMinima;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CaracteristicaPackage.VARIACAO__CARDINALIDADE_MINIMA, oldCardinalidadeMinima, cardinalidadeMinima));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Integer getCardinalidadeMaxima()
  {
		return cardinalidadeMaxima;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setCardinalidadeMaxima(Integer newCardinalidadeMaxima)
  {
		Integer oldCardinalidadeMaxima = cardinalidadeMaxima;
		cardinalidadeMaxima = newCardinalidadeMaxima;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CaracteristicaPackage.VARIACAO__CARDINALIDADE_MAXIMA, oldCardinalidadeMaxima, cardinalidadeMaxima));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<Variante> getVariantes()
  {
		if (variantes == null) {
			variantes = new EObjectWithInverseResolvingEList<Variante>(Variante.class, this, CaracteristicaPackage.VARIACAO__VARIANTES, CaracteristicaPackage.VARIANTE__VARIACAO_PAI);
		}
		return variantes;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CaracteristicaPackage.VARIACAO__CARACTERISTICA_PAI, oldCaracteristicaPai, caracteristicaPai));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CaracteristicaPackage.VARIACAO__CARACTERISTICA_PAI, oldCaracteristicaPai, newCaracteristicaPai);
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
				msgs = ((InternalEObject)caracteristicaPai).eInverseRemove(this, CaracteristicaPackage.CARACTERISTICA__VARIACOES, Caracteristica.class, msgs);
			if (newCaracteristicaPai != null)
				msgs = ((InternalEObject)newCaracteristicaPai).eInverseAdd(this, CaracteristicaPackage.CARACTERISTICA__VARIACOES, Caracteristica.class, msgs);
			msgs = basicSetCaracteristicaPai(newCaracteristicaPai, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CaracteristicaPackage.VARIACAO__CARACTERISTICA_PAI, newCaracteristicaPai, newCaracteristicaPai));
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
			case CaracteristicaPackage.VARIACAO__VARIANTES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getVariantes()).basicAdd(otherEnd, msgs);
			case CaracteristicaPackage.VARIACAO__CARACTERISTICA_PAI:
				if (caracteristicaPai != null)
					msgs = ((InternalEObject)caracteristicaPai).eInverseRemove(this, CaracteristicaPackage.CARACTERISTICA__VARIACOES, Caracteristica.class, msgs);
				return basicSetCaracteristicaPai((Caracteristica)otherEnd, msgs);
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
			case CaracteristicaPackage.VARIACAO__VARIANTES:
				return ((InternalEList<?>)getVariantes()).basicRemove(otherEnd, msgs);
			case CaracteristicaPackage.VARIACAO__CARACTERISTICA_PAI:
				return basicSetCaracteristicaPai(null, msgs);
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
			case CaracteristicaPackage.VARIACAO__NOME:
				return getNome();
			case CaracteristicaPackage.VARIACAO__CARDINALIDADE_MINIMA:
				return getCardinalidadeMinima();
			case CaracteristicaPackage.VARIACAO__CARDINALIDADE_MAXIMA:
				return getCardinalidadeMaxima();
			case CaracteristicaPackage.VARIACAO__VARIANTES:
				return getVariantes();
			case CaracteristicaPackage.VARIACAO__CARACTERISTICA_PAI:
				if (resolve) return getCaracteristicaPai();
				return basicGetCaracteristicaPai();
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
			case CaracteristicaPackage.VARIACAO__NOME:
				setNome((String)newValue);
				return;
			case CaracteristicaPackage.VARIACAO__CARDINALIDADE_MINIMA:
				setCardinalidadeMinima((Integer)newValue);
				return;
			case CaracteristicaPackage.VARIACAO__CARDINALIDADE_MAXIMA:
				setCardinalidadeMaxima((Integer)newValue);
				return;
			case CaracteristicaPackage.VARIACAO__VARIANTES:
				getVariantes().clear();
				getVariantes().addAll((Collection<? extends Variante>)newValue);
				return;
			case CaracteristicaPackage.VARIACAO__CARACTERISTICA_PAI:
				setCaracteristicaPai((Caracteristica)newValue);
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
			case CaracteristicaPackage.VARIACAO__NOME:
				setNome(NOME_EDEFAULT);
				return;
			case CaracteristicaPackage.VARIACAO__CARDINALIDADE_MINIMA:
				setCardinalidadeMinima(CARDINALIDADE_MINIMA_EDEFAULT);
				return;
			case CaracteristicaPackage.VARIACAO__CARDINALIDADE_MAXIMA:
				setCardinalidadeMaxima(CARDINALIDADE_MAXIMA_EDEFAULT);
				return;
			case CaracteristicaPackage.VARIACAO__VARIANTES:
				getVariantes().clear();
				return;
			case CaracteristicaPackage.VARIACAO__CARACTERISTICA_PAI:
				setCaracteristicaPai((Caracteristica)null);
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
			case CaracteristicaPackage.VARIACAO__NOME:
				return NOME_EDEFAULT == null ? nome != null : !NOME_EDEFAULT.equals(nome);
			case CaracteristicaPackage.VARIACAO__CARDINALIDADE_MINIMA:
				return CARDINALIDADE_MINIMA_EDEFAULT == null ? cardinalidadeMinima != null : !CARDINALIDADE_MINIMA_EDEFAULT.equals(cardinalidadeMinima);
			case CaracteristicaPackage.VARIACAO__CARDINALIDADE_MAXIMA:
				return CARDINALIDADE_MAXIMA_EDEFAULT == null ? cardinalidadeMaxima != null : !CARDINALIDADE_MAXIMA_EDEFAULT.equals(cardinalidadeMaxima);
			case CaracteristicaPackage.VARIACAO__VARIANTES:
				return variantes != null && !variantes.isEmpty();
			case CaracteristicaPackage.VARIACAO__CARACTERISTICA_PAI:
				return caracteristicaPai != null;
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
				case CaracteristicaPackage.VARIACAO__NOME: return CaracteristicaPackage.ELEMENTO__NOME;
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
				case CaracteristicaPackage.ELEMENTO__NOME: return CaracteristicaPackage.VARIACAO__NOME;
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
		result.append(", cardinalidadeMinima: ");
		result.append(cardinalidadeMinima);
		result.append(", cardinalidadeMaxima: ");
		result.append(cardinalidadeMaxima);
		result.append(')');
		return result.toString();
	}

} //VariacaoImpl
