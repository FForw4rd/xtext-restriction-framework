/**
 */
package at.tugraz.model.util;

import at.tugraz.model.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see at.tugraz.model.ModelPackage
 * @generated
 */
public class ModelAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static ModelPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModelAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = ModelPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModelSwitch<Adapter> modelSwitch =
    new ModelSwitch<Adapter>()
    {
      @Override
      public Adapter caseParameter(Parameter object)
      {
        return createParameterAdapter();
      }
      @Override
      public Adapter caseFunctionBlock(FunctionBlock object)
      {
        return createFunctionBlockAdapter();
      }
      @Override
      public Adapter caseGenericInstruction(GenericInstruction object)
      {
        return createGenericInstructionAdapter();
      }
      @Override
      public <T extends FunctionBlock> Adapter caseFunctionBlockRestriction(FunctionBlockRestriction<T> object)
      {
        return createFunctionBlockRestrictionAdapter();
      }
      @Override
      public <T extends GenericInstruction> Adapter caseInstructionRestriction(InstructionRestriction<T> object)
      {
        return createInstructionRestrictionAdapter();
      }
      @Override
      public Adapter caseParameterRestriction(ParameterRestriction object)
      {
        return createParameterRestrictionAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link at.tugraz.model.Parameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.tugraz.model.Parameter
   * @generated
   */
  public Adapter createParameterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.tugraz.model.FunctionBlock <em>Function Block</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.tugraz.model.FunctionBlock
   * @generated
   */
  public Adapter createFunctionBlockAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.tugraz.model.GenericInstruction <em>Generic Instruction</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.tugraz.model.GenericInstruction
   * @generated
   */
  public Adapter createGenericInstructionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.tugraz.model.FunctionBlockRestriction <em>Function Block Restriction</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.tugraz.model.FunctionBlockRestriction
   * @generated
   */
  public Adapter createFunctionBlockRestrictionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.tugraz.model.InstructionRestriction <em>Instruction Restriction</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.tugraz.model.InstructionRestriction
   * @generated
   */
  public Adapter createInstructionRestrictionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.tugraz.model.ParameterRestriction <em>Parameter Restriction</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.tugraz.model.ParameterRestriction
   * @generated
   */
  public Adapter createParameterRestrictionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //ModelAdapterFactory
