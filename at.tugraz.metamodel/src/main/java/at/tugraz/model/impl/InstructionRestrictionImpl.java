/**
 */
package at.tugraz.model.impl;

import at.tugraz.model.GenericInstruction;
import at.tugraz.model.InstructionRestriction;
import at.tugraz.model.ModelPackage;
import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instruction Restriction</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class InstructionRestrictionImpl<T extends GenericInstruction> extends MinimalEObjectImpl.Container implements InstructionRestriction<T>
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InstructionRestrictionImpl()
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
    return ModelPackage.Literals.INSTRUCTION_RESTRICTION;
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
      case ModelPackage.INSTRUCTION_RESTRICTION___CHECK__PARAMETER:
        check((T)arguments.get(0));
        return null;
    }
    return super.eInvoke(operationID, arguments);
  }

} //InstructionRestrictionImpl
