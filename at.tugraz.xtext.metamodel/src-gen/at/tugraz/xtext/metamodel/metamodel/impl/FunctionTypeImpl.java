/**
 */
package at.tugraz.xtext.metamodel.metamodel.impl;

import at.tugraz.xtext.metamodel.metamodel.FunctionType;
import at.tugraz.xtext.metamodel.metamodel.MetamodelPackage;
import at.tugraz.xtext.metamodel.metamodel.Type;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link at.tugraz.xtext.metamodel.metamodel.impl.FunctionTypeImpl#isRepeat <em>Repeat</em>}</li>
 *   <li>{@link at.tugraz.xtext.metamodel.metamodel.impl.FunctionTypeImpl#isOptional <em>Optional</em>}</li>
 *   <li>{@link at.tugraz.xtext.metamodel.metamodel.impl.FunctionTypeImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionTypeImpl extends MinimalEObjectImpl.Container implements FunctionType
{
  /**
   * The default value of the '{@link #isRepeat() <em>Repeat</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isRepeat()
   * @generated
   * @ordered
   */
  protected static final boolean REPEAT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isRepeat() <em>Repeat</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isRepeat()
   * @generated
   * @ordered
   */
  protected boolean repeat = REPEAT_EDEFAULT;

  /**
   * The default value of the '{@link #isOptional() <em>Optional</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isOptional()
   * @generated
   * @ordered
   */
  protected static final boolean OPTIONAL_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isOptional() <em>Optional</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isOptional()
   * @generated
   * @ordered
   */
  protected boolean optional = OPTIONAL_EDEFAULT;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected Type type;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FunctionTypeImpl()
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
    return MetamodelPackage.Literals.FUNCTION_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isRepeat()
  {
    return repeat;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRepeat(boolean newRepeat)
  {
    boolean oldRepeat = repeat;
    repeat = newRepeat;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.FUNCTION_TYPE__REPEAT, oldRepeat, repeat));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isOptional()
  {
    return optional;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOptional(boolean newOptional)
  {
    boolean oldOptional = optional;
    optional = newOptional;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.FUNCTION_TYPE__OPTIONAL, oldOptional, optional));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type getType()
  {
    if (type != null && type.eIsProxy())
    {
      InternalEObject oldType = (InternalEObject)type;
      type = (Type)eResolveProxy(oldType);
      if (type != oldType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetamodelPackage.FUNCTION_TYPE__TYPE, oldType, type));
      }
    }
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type basicGetType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(Type newType)
  {
    Type oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.FUNCTION_TYPE__TYPE, oldType, type));
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
      case MetamodelPackage.FUNCTION_TYPE__REPEAT:
        return isRepeat();
      case MetamodelPackage.FUNCTION_TYPE__OPTIONAL:
        return isOptional();
      case MetamodelPackage.FUNCTION_TYPE__TYPE:
        if (resolve) return getType();
        return basicGetType();
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
      case MetamodelPackage.FUNCTION_TYPE__REPEAT:
        setRepeat((Boolean)newValue);
        return;
      case MetamodelPackage.FUNCTION_TYPE__OPTIONAL:
        setOptional((Boolean)newValue);
        return;
      case MetamodelPackage.FUNCTION_TYPE__TYPE:
        setType((Type)newValue);
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
      case MetamodelPackage.FUNCTION_TYPE__REPEAT:
        setRepeat(REPEAT_EDEFAULT);
        return;
      case MetamodelPackage.FUNCTION_TYPE__OPTIONAL:
        setOptional(OPTIONAL_EDEFAULT);
        return;
      case MetamodelPackage.FUNCTION_TYPE__TYPE:
        setType((Type)null);
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
      case MetamodelPackage.FUNCTION_TYPE__REPEAT:
        return repeat != REPEAT_EDEFAULT;
      case MetamodelPackage.FUNCTION_TYPE__OPTIONAL:
        return optional != OPTIONAL_EDEFAULT;
      case MetamodelPackage.FUNCTION_TYPE__TYPE:
        return type != null;
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
    result.append(" (repeat: ");
    result.append(repeat);
    result.append(", optional: ");
    result.append(optional);
    result.append(')');
    return result.toString();
  }

} //FunctionTypeImpl
