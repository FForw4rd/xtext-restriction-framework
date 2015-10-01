/**
 */
package at.tugraz.model;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see at.tugraz.model.ModelPackage
 * @generated
 */
public interface ModelFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ModelFactory eINSTANCE = at.tugraz.model.impl.ModelFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Parameter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Parameter</em>'.
   * @generated
   */
  Parameter createParameter();

  /**
   * Returns a new object of class '<em>Function Block</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Function Block</em>'.
   * @generated
   */
  FunctionBlock createFunctionBlock();

  /**
   * Returns a new object of class '<em>Function Block Restriction</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Function Block Restriction</em>'.
   * @generated
   */
  <T extends FunctionBlock> FunctionBlockRestriction<T> createFunctionBlockRestriction();

  /**
   * Returns a new object of class '<em>Instruction Restriction</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Instruction Restriction</em>'.
   * @generated
   */
  <T extends GenericInstruction> InstructionRestriction<T> createInstructionRestriction();

  /**
   * Returns a new object of class '<em>Parameter Restriction</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Parameter Restriction</em>'.
   * @generated
   */
  ParameterRestriction createParameterRestriction();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  ModelPackage getModelPackage();

} //ModelFactory
