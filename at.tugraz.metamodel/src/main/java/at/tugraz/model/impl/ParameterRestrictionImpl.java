/**
 */
package at.tugraz.model.impl;

import at.tugraz.model.ModelPackage;
import at.tugraz.model.Parameter;
import at.tugraz.model.ParameterRestriction;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter Restriction</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ParameterRestrictionImpl extends MinimalEObjectImpl.Container implements ParameterRestriction
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ParameterRestrictionImpl()
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
    return ModelPackage.Literals.PARAMETER_RESTRICTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void check(Parameter param)
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
  public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException
  {
    switch (operationID)
    {
      case ModelPackage.PARAMETER_RESTRICTION___CHECK__PARAMETER:
        check((Parameter)arguments.get(0));
        return null;
    }
    return super.eInvoke(operationID, arguments);
  }

} //ParameterRestrictionImpl
