/**
 */
package at.tugraz.xtext.metamodel.metamodel.impl;

import at.tugraz.xtext.metamodel.metamodel.Function;
import at.tugraz.xtext.metamodel.metamodel.FunctionType;
import at.tugraz.xtext.metamodel.metamodel.MetamodelPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link at.tugraz.xtext.metamodel.metamodel.impl.FunctionImpl#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link at.tugraz.xtext.metamodel.metamodel.impl.FunctionImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link at.tugraz.xtext.metamodel.metamodel.impl.FunctionImpl#isIssecure <em>Issecure</em>}</li>
 *   <li>{@link at.tugraz.xtext.metamodel.metamodel.impl.FunctionImpl#getInputs <em>Inputs</em>}</li>
 *   <li>{@link at.tugraz.xtext.metamodel.metamodel.impl.FunctionImpl#getOutpust <em>Outpust</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionImpl extends AbstractElementImpl implements Function
{
  /**
   * The cached value of the '{@link #getSuperType() <em>Super Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSuperType()
   * @generated
   * @ordered
   */
  protected at.tugraz.xtext.metamodel.metamodel.Object superType;

  /**
   * The default value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIdentifier()
   * @generated
   * @ordered
   */
  protected static final int IDENTIFIER_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIdentifier()
   * @generated
   * @ordered
   */
  protected int identifier = IDENTIFIER_EDEFAULT;

  /**
   * The default value of the '{@link #isIssecure() <em>Issecure</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIssecure()
   * @generated
   * @ordered
   */
  protected static final boolean ISSECURE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIssecure() <em>Issecure</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIssecure()
   * @generated
   * @ordered
   */
  protected boolean issecure = ISSECURE_EDEFAULT;

  /**
   * The cached value of the '{@link #getInputs() <em>Inputs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInputs()
   * @generated
   * @ordered
   */
  protected EList<FunctionType> inputs;

  /**
   * The cached value of the '{@link #getOutpust() <em>Outpust</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOutpust()
   * @generated
   * @ordered
   */
  protected EList<FunctionType> outpust;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FunctionImpl()
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
    return MetamodelPackage.Literals.FUNCTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public at.tugraz.xtext.metamodel.metamodel.Object getSuperType()
  {
    if (superType != null && superType.eIsProxy())
    {
      InternalEObject oldSuperType = (InternalEObject)superType;
      superType = (at.tugraz.xtext.metamodel.metamodel.Object)eResolveProxy(oldSuperType);
      if (superType != oldSuperType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetamodelPackage.FUNCTION__SUPER_TYPE, oldSuperType, superType));
      }
    }
    return superType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public at.tugraz.xtext.metamodel.metamodel.Object basicGetSuperType()
  {
    return superType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSuperType(at.tugraz.xtext.metamodel.metamodel.Object newSuperType)
  {
    at.tugraz.xtext.metamodel.metamodel.Object oldSuperType = superType;
    superType = newSuperType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.FUNCTION__SUPER_TYPE, oldSuperType, superType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getIdentifier()
  {
    return identifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIdentifier(int newIdentifier)
  {
    int oldIdentifier = identifier;
    identifier = newIdentifier;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.FUNCTION__IDENTIFIER, oldIdentifier, identifier));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIssecure()
  {
    return issecure;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIssecure(boolean newIssecure)
  {
    boolean oldIssecure = issecure;
    issecure = newIssecure;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.FUNCTION__ISSECURE, oldIssecure, issecure));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<FunctionType> getInputs()
  {
    if (inputs == null)
    {
      inputs = new EObjectContainmentEList<FunctionType>(FunctionType.class, this, MetamodelPackage.FUNCTION__INPUTS);
    }
    return inputs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<FunctionType> getOutpust()
  {
    if (outpust == null)
    {
      outpust = new EObjectContainmentEList<FunctionType>(FunctionType.class, this, MetamodelPackage.FUNCTION__OUTPUST);
    }
    return outpust;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case MetamodelPackage.FUNCTION__INPUTS:
        return ((InternalEList<?>)getInputs()).basicRemove(otherEnd, msgs);
      case MetamodelPackage.FUNCTION__OUTPUST:
        return ((InternalEList<?>)getOutpust()).basicRemove(otherEnd, msgs);
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
    switch (featureID)
    {
      case MetamodelPackage.FUNCTION__SUPER_TYPE:
        if (resolve) return getSuperType();
        return basicGetSuperType();
      case MetamodelPackage.FUNCTION__IDENTIFIER:
        return getIdentifier();
      case MetamodelPackage.FUNCTION__ISSECURE:
        return isIssecure();
      case MetamodelPackage.FUNCTION__INPUTS:
        return getInputs();
      case MetamodelPackage.FUNCTION__OUTPUST:
        return getOutpust();
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
    switch (featureID)
    {
      case MetamodelPackage.FUNCTION__SUPER_TYPE:
        setSuperType((at.tugraz.xtext.metamodel.metamodel.Object)newValue);
        return;
      case MetamodelPackage.FUNCTION__IDENTIFIER:
        setIdentifier((Integer)newValue);
        return;
      case MetamodelPackage.FUNCTION__ISSECURE:
        setIssecure((Boolean)newValue);
        return;
      case MetamodelPackage.FUNCTION__INPUTS:
        getInputs().clear();
        getInputs().addAll((Collection<? extends FunctionType>)newValue);
        return;
      case MetamodelPackage.FUNCTION__OUTPUST:
        getOutpust().clear();
        getOutpust().addAll((Collection<? extends FunctionType>)newValue);
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
    switch (featureID)
    {
      case MetamodelPackage.FUNCTION__SUPER_TYPE:
        setSuperType((at.tugraz.xtext.metamodel.metamodel.Object)null);
        return;
      case MetamodelPackage.FUNCTION__IDENTIFIER:
        setIdentifier(IDENTIFIER_EDEFAULT);
        return;
      case MetamodelPackage.FUNCTION__ISSECURE:
        setIssecure(ISSECURE_EDEFAULT);
        return;
      case MetamodelPackage.FUNCTION__INPUTS:
        getInputs().clear();
        return;
      case MetamodelPackage.FUNCTION__OUTPUST:
        getOutpust().clear();
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
    switch (featureID)
    {
      case MetamodelPackage.FUNCTION__SUPER_TYPE:
        return superType != null;
      case MetamodelPackage.FUNCTION__IDENTIFIER:
        return identifier != IDENTIFIER_EDEFAULT;
      case MetamodelPackage.FUNCTION__ISSECURE:
        return issecure != ISSECURE_EDEFAULT;
      case MetamodelPackage.FUNCTION__INPUTS:
        return inputs != null && !inputs.isEmpty();
      case MetamodelPackage.FUNCTION__OUTPUST:
        return outpust != null && !outpust.isEmpty();
    }
    return super.eIsSet(featureID);
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
    result.append(" (identifier: ");
    result.append(identifier);
    result.append(", issecure: ");
    result.append(issecure);
    result.append(')');
    return result.toString();
  }

} //FunctionImpl
