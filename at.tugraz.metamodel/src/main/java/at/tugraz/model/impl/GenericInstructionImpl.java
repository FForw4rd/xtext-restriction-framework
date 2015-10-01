/**
 */
package at.tugraz.model.impl;

import at.tugraz.model.GenericInstruction;
import at.tugraz.model.ModelPackage;
import at.tugraz.model.Parameter;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generic Instruction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link at.tugraz.model.impl.GenericInstructionImpl#getInsNr <em>Ins Nr</em>}</li>
 *   <li>{@link at.tugraz.model.impl.GenericInstructionImpl#getInstructions <em>Instructions</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class GenericInstructionImpl extends MinimalEObjectImpl.Container implements GenericInstruction
{
  /**
   * The default value of the '{@link #getInsNr() <em>Ins Nr</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInsNr()
   * @generated
   * @ordered
   */
  protected static final int INS_NR_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getInsNr() <em>Ins Nr</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInsNr()
   * @generated
   * @ordered
   */
  protected int insNr = INS_NR_EDEFAULT;

  /**
   * This is true if the Ins Nr attribute has been set.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean insNrESet;

  /**
   * The cached value of the '{@link #getInstructions() <em>Instructions</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInstructions()
   * @generated
   * @ordered
   */
  protected EList<Parameter> instructions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GenericInstructionImpl()
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
    return ModelPackage.Literals.GENERIC_INSTRUCTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getInsNr()
  {
    return insNr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetInsNr()
  {
    return insNrESet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Parameter> getInstructions()
  {
    if (instructions == null)
    {
      instructions = new EObjectResolvingEList<Parameter>(Parameter.class, this, ModelPackage.GENERIC_INSTRUCTION__INSTRUCTIONS);
    }
    return instructions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public byte[] toBer()
  {
    // This is just for demonstration do not worry about anything
    java.io.ByteArrayOutputStream str = new java.io.ByteArrayOutputStream();
    for(Parameter para : getParams()) {
      try {
        str.write(para.getValue());
      } catch (java.io.IOException e) {
        return new byte[0];
      }
    }
    
    return str.toByteArray();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Parameter> getParams()
  {
    // TODO: implement this method
    // Ensure that you remove @generated or mark it @generated NOT
    throw new UnsupportedOperationException();
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
      case ModelPackage.GENERIC_INSTRUCTION__INS_NR:
        return getInsNr();
      case ModelPackage.GENERIC_INSTRUCTION__INSTRUCTIONS:
        return getInstructions();
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
      case ModelPackage.GENERIC_INSTRUCTION__INSTRUCTIONS:
        getInstructions().clear();
        getInstructions().addAll((Collection<? extends Parameter>)newValue);
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
      case ModelPackage.GENERIC_INSTRUCTION__INSTRUCTIONS:
        getInstructions().clear();
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
      case ModelPackage.GENERIC_INSTRUCTION__INS_NR:
        return isSetInsNr();
      case ModelPackage.GENERIC_INSTRUCTION__INSTRUCTIONS:
        return instructions != null && !instructions.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException
  {
    switch (operationID)
    {
      case ModelPackage.GENERIC_INSTRUCTION___TO_BER:
        return toBer();
      case ModelPackage.GENERIC_INSTRUCTION___GET_PARAMS:
        return getParams();
    }
    return super.eInvoke(operationID, arguments);
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
    result.append(" (insNr: ");
    if (insNrESet) result.append(insNr); else result.append("<unset>");
    result.append(')');
    return result.toString();
  }

} //GenericInstructionImpl
