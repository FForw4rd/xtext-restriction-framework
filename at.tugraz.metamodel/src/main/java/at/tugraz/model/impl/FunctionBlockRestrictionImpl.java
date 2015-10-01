/**
 */
package at.tugraz.model.impl;

import at.tugraz.model.FunctionBlock;
import at.tugraz.model.FunctionBlockRestriction;
import at.tugraz.model.ModelPackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Block Restriction</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class FunctionBlockRestrictionImpl<T extends FunctionBlock> extends MinimalEObjectImpl.Container implements FunctionBlockRestriction<T>
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FunctionBlockRestrictionImpl()
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
    return ModelPackage.Literals.FUNCTION_BLOCK_RESTRICTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void check(T param)
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
  @SuppressWarnings("unchecked")
  public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException
  {
    switch (operationID)
    {
      case ModelPackage.FUNCTION_BLOCK_RESTRICTION___CHECK__FUNCTIONBLOCK:
        check((T)arguments.get(0));
        return null;
    }
    return super.eInvoke(operationID, arguments);
  }

} //FunctionBlockRestrictionImpl
