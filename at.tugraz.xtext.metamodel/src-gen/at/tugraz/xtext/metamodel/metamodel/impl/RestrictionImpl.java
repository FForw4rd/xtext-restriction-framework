/**
 */
package at.tugraz.xtext.metamodel.metamodel.impl;

import at.tugraz.xtext.metamodel.metamodel.MetamodelPackage;
import at.tugraz.xtext.metamodel.metamodel.Restriction;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Restriction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link at.tugraz.xtext.metamodel.metamodel.impl.RestrictionImpl#isStringrestriction <em>Stringrestriction</em>}</li>
 *   <li>{@link at.tugraz.xtext.metamodel.metamodel.impl.RestrictionImpl#getMaxlength <em>Maxlength</em>}</li>
 *   <li>{@link at.tugraz.xtext.metamodel.metamodel.impl.RestrictionImpl#getMinlength <em>Minlength</em>}</li>
 *   <li>{@link at.tugraz.xtext.metamodel.metamodel.impl.RestrictionImpl#isValuerestriction <em>Valuerestriction</em>}</li>
 *   <li>{@link at.tugraz.xtext.metamodel.metamodel.impl.RestrictionImpl#getMaxvalue <em>Maxvalue</em>}</li>
 *   <li>{@link at.tugraz.xtext.metamodel.metamodel.impl.RestrictionImpl#getMinvalue <em>Minvalue</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RestrictionImpl extends MinimalEObjectImpl.Container implements Restriction
{
  /**
   * The default value of the '{@link #isStringrestriction() <em>Stringrestriction</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isStringrestriction()
   * @generated
   * @ordered
   */
  protected static final boolean STRINGRESTRICTION_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isStringrestriction() <em>Stringrestriction</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isStringrestriction()
   * @generated
   * @ordered
   */
  protected boolean stringrestriction = STRINGRESTRICTION_EDEFAULT;

  /**
   * The default value of the '{@link #getMaxlength() <em>Maxlength</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMaxlength()
   * @generated
   * @ordered
   */
  protected static final int MAXLENGTH_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getMaxlength() <em>Maxlength</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMaxlength()
   * @generated
   * @ordered
   */
  protected int maxlength = MAXLENGTH_EDEFAULT;

  /**
   * The default value of the '{@link #getMinlength() <em>Minlength</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMinlength()
   * @generated
   * @ordered
   */
  protected static final int MINLENGTH_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getMinlength() <em>Minlength</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMinlength()
   * @generated
   * @ordered
   */
  protected int minlength = MINLENGTH_EDEFAULT;

  /**
   * The default value of the '{@link #isValuerestriction() <em>Valuerestriction</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isValuerestriction()
   * @generated
   * @ordered
   */
  protected static final boolean VALUERESTRICTION_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isValuerestriction() <em>Valuerestriction</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isValuerestriction()
   * @generated
   * @ordered
   */
  protected boolean valuerestriction = VALUERESTRICTION_EDEFAULT;

  /**
   * The default value of the '{@link #getMaxvalue() <em>Maxvalue</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMaxvalue()
   * @generated
   * @ordered
   */
  protected static final int MAXVALUE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getMaxvalue() <em>Maxvalue</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMaxvalue()
   * @generated
   * @ordered
   */
  protected int maxvalue = MAXVALUE_EDEFAULT;

  /**
   * The default value of the '{@link #getMinvalue() <em>Minvalue</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMinvalue()
   * @generated
   * @ordered
   */
  protected static final int MINVALUE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getMinvalue() <em>Minvalue</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMinvalue()
   * @generated
   * @ordered
   */
  protected int minvalue = MINVALUE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RestrictionImpl()
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
    return MetamodelPackage.Literals.RESTRICTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isStringrestriction()
  {
    return stringrestriction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStringrestriction(boolean newStringrestriction)
  {
    boolean oldStringrestriction = stringrestriction;
    stringrestriction = newStringrestriction;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.RESTRICTION__STRINGRESTRICTION, oldStringrestriction, stringrestriction));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getMaxlength()
  {
    return maxlength;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMaxlength(int newMaxlength)
  {
    int oldMaxlength = maxlength;
    maxlength = newMaxlength;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.RESTRICTION__MAXLENGTH, oldMaxlength, maxlength));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getMinlength()
  {
    return minlength;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMinlength(int newMinlength)
  {
    int oldMinlength = minlength;
    minlength = newMinlength;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.RESTRICTION__MINLENGTH, oldMinlength, minlength));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isValuerestriction()
  {
    return valuerestriction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValuerestriction(boolean newValuerestriction)
  {
    boolean oldValuerestriction = valuerestriction;
    valuerestriction = newValuerestriction;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.RESTRICTION__VALUERESTRICTION, oldValuerestriction, valuerestriction));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getMaxvalue()
  {
    return maxvalue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMaxvalue(int newMaxvalue)
  {
    int oldMaxvalue = maxvalue;
    maxvalue = newMaxvalue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.RESTRICTION__MAXVALUE, oldMaxvalue, maxvalue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getMinvalue()
  {
    return minvalue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMinvalue(int newMinvalue)
  {
    int oldMinvalue = minvalue;
    minvalue = newMinvalue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.RESTRICTION__MINVALUE, oldMinvalue, minvalue));
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
      case MetamodelPackage.RESTRICTION__STRINGRESTRICTION:
        return isStringrestriction();
      case MetamodelPackage.RESTRICTION__MAXLENGTH:
        return getMaxlength();
      case MetamodelPackage.RESTRICTION__MINLENGTH:
        return getMinlength();
      case MetamodelPackage.RESTRICTION__VALUERESTRICTION:
        return isValuerestriction();
      case MetamodelPackage.RESTRICTION__MAXVALUE:
        return getMaxvalue();
      case MetamodelPackage.RESTRICTION__MINVALUE:
        return getMinvalue();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MetamodelPackage.RESTRICTION__STRINGRESTRICTION:
        setStringrestriction((Boolean)newValue);
        return;
      case MetamodelPackage.RESTRICTION__MAXLENGTH:
        setMaxlength((Integer)newValue);
        return;
      case MetamodelPackage.RESTRICTION__MINLENGTH:
        setMinlength((Integer)newValue);
        return;
      case MetamodelPackage.RESTRICTION__VALUERESTRICTION:
        setValuerestriction((Boolean)newValue);
        return;
      case MetamodelPackage.RESTRICTION__MAXVALUE:
        setMaxvalue((Integer)newValue);
        return;
      case MetamodelPackage.RESTRICTION__MINVALUE:
        setMinvalue((Integer)newValue);
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
      case MetamodelPackage.RESTRICTION__STRINGRESTRICTION:
        setStringrestriction(STRINGRESTRICTION_EDEFAULT);
        return;
      case MetamodelPackage.RESTRICTION__MAXLENGTH:
        setMaxlength(MAXLENGTH_EDEFAULT);
        return;
      case MetamodelPackage.RESTRICTION__MINLENGTH:
        setMinlength(MINLENGTH_EDEFAULT);
        return;
      case MetamodelPackage.RESTRICTION__VALUERESTRICTION:
        setValuerestriction(VALUERESTRICTION_EDEFAULT);
        return;
      case MetamodelPackage.RESTRICTION__MAXVALUE:
        setMaxvalue(MAXVALUE_EDEFAULT);
        return;
      case MetamodelPackage.RESTRICTION__MINVALUE:
        setMinvalue(MINVALUE_EDEFAULT);
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
      case MetamodelPackage.RESTRICTION__STRINGRESTRICTION:
        return stringrestriction != STRINGRESTRICTION_EDEFAULT;
      case MetamodelPackage.RESTRICTION__MAXLENGTH:
        return maxlength != MAXLENGTH_EDEFAULT;
      case MetamodelPackage.RESTRICTION__MINLENGTH:
        return minlength != MINLENGTH_EDEFAULT;
      case MetamodelPackage.RESTRICTION__VALUERESTRICTION:
        return valuerestriction != VALUERESTRICTION_EDEFAULT;
      case MetamodelPackage.RESTRICTION__MAXVALUE:
        return maxvalue != MAXVALUE_EDEFAULT;
      case MetamodelPackage.RESTRICTION__MINVALUE:
        return minvalue != MINVALUE_EDEFAULT;
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
    result.append(" (stringrestriction: ");
    result.append(stringrestriction);
    result.append(", maxlength: ");
    result.append(maxlength);
    result.append(", minlength: ");
    result.append(minlength);
    result.append(", valuerestriction: ");
    result.append(valuerestriction);
    result.append(", maxvalue: ");
    result.append(maxvalue);
    result.append(", minvalue: ");
    result.append(minvalue);
    result.append(')');
    return result.toString();
  }

} //RestrictionImpl
