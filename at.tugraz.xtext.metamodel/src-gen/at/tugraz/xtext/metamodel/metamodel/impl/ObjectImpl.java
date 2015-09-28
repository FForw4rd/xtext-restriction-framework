/**
 */
package at.tugraz.xtext.metamodel.metamodel.impl;

import at.tugraz.xtext.metamodel.metamodel.Member;
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
 * An implementation of the model object '<em><b>Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link at.tugraz.xtext.metamodel.metamodel.impl.ObjectImpl#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link at.tugraz.xtext.metamodel.metamodel.impl.ObjectImpl#getMembers <em>Members</em>}</li>
 *   <li>{@link at.tugraz.xtext.metamodel.metamodel.impl.ObjectImpl#isIssecure <em>Issecure</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObjectImpl extends TypeImpl implements at.tugraz.xtext.metamodel.metamodel.Object
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
   * The cached value of the '{@link #getMembers() <em>Members</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMembers()
   * @generated
   * @ordered
   */
  protected EList<Member> members;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ObjectImpl()
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
    return MetamodelPackage.Literals.OBJECT;
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetamodelPackage.OBJECT__SUPER_TYPE, oldSuperType, superType));
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
      eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.OBJECT__SUPER_TYPE, oldSuperType, superType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Member> getMembers()
  {
    if (members == null)
    {
      members = new EObjectContainmentEList<Member>(Member.class, this, MetamodelPackage.OBJECT__MEMBERS);
    }
    return members;
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
      eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.OBJECT__ISSECURE, oldIssecure, issecure));
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
      case MetamodelPackage.OBJECT__MEMBERS:
        return ((InternalEList<?>)getMembers()).basicRemove(otherEnd, msgs);
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
      case MetamodelPackage.OBJECT__SUPER_TYPE:
        if (resolve) return getSuperType();
        return basicGetSuperType();
      case MetamodelPackage.OBJECT__MEMBERS:
        return getMembers();
      case MetamodelPackage.OBJECT__ISSECURE:
        return isIssecure();
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
      case MetamodelPackage.OBJECT__SUPER_TYPE:
        setSuperType((at.tugraz.xtext.metamodel.metamodel.Object)newValue);
        return;
      case MetamodelPackage.OBJECT__MEMBERS:
        getMembers().clear();
        getMembers().addAll((Collection<? extends Member>)newValue);
        return;
      case MetamodelPackage.OBJECT__ISSECURE:
        setIssecure((Boolean)newValue);
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
      case MetamodelPackage.OBJECT__SUPER_TYPE:
        setSuperType((at.tugraz.xtext.metamodel.metamodel.Object)null);
        return;
      case MetamodelPackage.OBJECT__MEMBERS:
        getMembers().clear();
        return;
      case MetamodelPackage.OBJECT__ISSECURE:
        setIssecure(ISSECURE_EDEFAULT);
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
      case MetamodelPackage.OBJECT__SUPER_TYPE:
        return superType != null;
      case MetamodelPackage.OBJECT__MEMBERS:
        return members != null && !members.isEmpty();
      case MetamodelPackage.OBJECT__ISSECURE:
        return issecure != ISSECURE_EDEFAULT;
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
    result.append(" (issecure: ");
    result.append(issecure);
    result.append(')');
    return result.toString();
  }

} //ObjectImpl
