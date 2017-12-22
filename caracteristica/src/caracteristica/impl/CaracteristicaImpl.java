/**
 */
package caracteristica.impl;

import caracteristica.Atributo;
import caracteristica.Caracteristica;
import caracteristica.CaracteristicaPackage;
import caracteristica.ElementoExterno;
import caracteristica.Variacao;

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
 * An implementation of the model object '<em><b>Caracteristica</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link caracteristica.impl.CaracteristicaImpl#getCaracteristicaPai <em>Caracteristica Pai</em>}</li>
 *   <li>{@link caracteristica.impl.CaracteristicaImpl#getCaracteristicaFilha <em>Caracteristica Filha</em>}</li>
 *   <li>{@link caracteristica.impl.CaracteristicaImpl#getVariacoes <em>Variacoes</em>}</li>
 *   <li>{@link caracteristica.impl.CaracteristicaImpl#getAtributo <em>Atributo</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CaracteristicaImpl extends ElementoImpl implements Caracteristica
{
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
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected CaracteristicaImpl()
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
		return CaracteristicaPackage.Literals.CARACTERISTICA;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CaracteristicaPackage.CARACTERISTICA__CARACTERISTICA_PAI, oldCaracteristicaPai, caracteristicaPai));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CaracteristicaPackage.CARACTERISTICA__CARACTERISTICA_PAI, oldCaracteristicaPai, newCaracteristicaPai);
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
			eNotify(new ENotificationImpl(this, Notification.SET, CaracteristicaPackage.CARACTERISTICA__CARACTERISTICA_PAI, newCaracteristicaPai, newCaracteristicaPai));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<Caracteristica> getCaracteristicaFilha()
  {
		if (caracteristicaFilha == null) {
			caracteristicaFilha = new EObjectWithInverseResolvingEList<Caracteristica>(Caracteristica.class, this, CaracteristicaPackage.CARACTERISTICA__CARACTERISTICA_FILHA, CaracteristicaPackage.CARACTERISTICA__CARACTERISTICA_PAI);
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
			variacoes = new EObjectWithInverseResolvingEList<Variacao>(Variacao.class, this, CaracteristicaPackage.CARACTERISTICA__VARIACOES, CaracteristicaPackage.VARIACAO__CARACTERISTICA_PAI);
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
			atributo = new EObjectWithInverseResolvingEList<Atributo>(Atributo.class, this, CaracteristicaPackage.CARACTERISTICA__ATRIBUTO, CaracteristicaPackage.ATRIBUTO__CARACTERISTICA_PAI);
		}
		return atributo;
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
			case CaracteristicaPackage.CARACTERISTICA__CARACTERISTICA_PAI:
				if (caracteristicaPai != null)
					msgs = ((InternalEObject)caracteristicaPai).eInverseRemove(this, CaracteristicaPackage.CARACTERISTICA__CARACTERISTICA_FILHA, Caracteristica.class, msgs);
				return basicSetCaracteristicaPai((Caracteristica)otherEnd, msgs);
			case CaracteristicaPackage.CARACTERISTICA__CARACTERISTICA_FILHA:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCaracteristicaFilha()).basicAdd(otherEnd, msgs);
			case CaracteristicaPackage.CARACTERISTICA__VARIACOES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getVariacoes()).basicAdd(otherEnd, msgs);
			case CaracteristicaPackage.CARACTERISTICA__ATRIBUTO:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAtributo()).basicAdd(otherEnd, msgs);
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
			case CaracteristicaPackage.CARACTERISTICA__CARACTERISTICA_PAI:
				return basicSetCaracteristicaPai(null, msgs);
			case CaracteristicaPackage.CARACTERISTICA__CARACTERISTICA_FILHA:
				return ((InternalEList<?>)getCaracteristicaFilha()).basicRemove(otherEnd, msgs);
			case CaracteristicaPackage.CARACTERISTICA__VARIACOES:
				return ((InternalEList<?>)getVariacoes()).basicRemove(otherEnd, msgs);
			case CaracteristicaPackage.CARACTERISTICA__ATRIBUTO:
				return ((InternalEList<?>)getAtributo()).basicRemove(otherEnd, msgs);
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
			case CaracteristicaPackage.CARACTERISTICA__CARACTERISTICA_PAI:
				if (resolve) return getCaracteristicaPai();
				return basicGetCaracteristicaPai();
			case CaracteristicaPackage.CARACTERISTICA__CARACTERISTICA_FILHA:
				return getCaracteristicaFilha();
			case CaracteristicaPackage.CARACTERISTICA__VARIACOES:
				return getVariacoes();
			case CaracteristicaPackage.CARACTERISTICA__ATRIBUTO:
				return getAtributo();
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
			case CaracteristicaPackage.CARACTERISTICA__CARACTERISTICA_PAI:
				setCaracteristicaPai((Caracteristica)newValue);
				return;
			case CaracteristicaPackage.CARACTERISTICA__CARACTERISTICA_FILHA:
				getCaracteristicaFilha().clear();
				getCaracteristicaFilha().addAll((Collection<? extends Caracteristica>)newValue);
				return;
			case CaracteristicaPackage.CARACTERISTICA__VARIACOES:
				getVariacoes().clear();
				getVariacoes().addAll((Collection<? extends Variacao>)newValue);
				return;
			case CaracteristicaPackage.CARACTERISTICA__ATRIBUTO:
				getAtributo().clear();
				getAtributo().addAll((Collection<? extends Atributo>)newValue);
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
			case CaracteristicaPackage.CARACTERISTICA__CARACTERISTICA_PAI:
				setCaracteristicaPai((Caracteristica)null);
				return;
			case CaracteristicaPackage.CARACTERISTICA__CARACTERISTICA_FILHA:
				getCaracteristicaFilha().clear();
				return;
			case CaracteristicaPackage.CARACTERISTICA__VARIACOES:
				getVariacoes().clear();
				return;
			case CaracteristicaPackage.CARACTERISTICA__ATRIBUTO:
				getAtributo().clear();
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
			case CaracteristicaPackage.CARACTERISTICA__CARACTERISTICA_PAI:
				return caracteristicaPai != null;
			case CaracteristicaPackage.CARACTERISTICA__CARACTERISTICA_FILHA:
				return caracteristicaFilha != null && !caracteristicaFilha.isEmpty();
			case CaracteristicaPackage.CARACTERISTICA__VARIACOES:
				return variacoes != null && !variacoes.isEmpty();
			case CaracteristicaPackage.CARACTERISTICA__ATRIBUTO:
				return atributo != null && !atributo.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CaracteristicaImpl
