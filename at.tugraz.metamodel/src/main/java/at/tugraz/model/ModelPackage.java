/**
 */
package at.tugraz.model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see at.tugraz.model.ModelFactory
 * @model kind="package"
 * @generated
 */
public interface ModelPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "model";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "www.tugraz.at";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "tugraz.at";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ModelPackage eINSTANCE = at.tugraz.model.impl.ModelPackageImpl.init();

  /**
   * The meta object id for the '{@link at.tugraz.model.impl.ParameterImpl <em>Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.tugraz.model.impl.ParameterImpl
   * @see at.tugraz.model.impl.ModelPackageImpl#getParameter()
   * @generated
   */
  int PARAMETER = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__TYPE = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__VALUE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__NAME = 2;

  /**
   * The number of structural features of the '<em>Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_FEATURE_COUNT = 3;

  /**
   * The number of operations of the '<em>Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link at.tugraz.model.impl.FunctionBlockImpl <em>Function Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.tugraz.model.impl.FunctionBlockImpl
   * @see at.tugraz.model.impl.ModelPackageImpl#getFunctionBlock()
   * @generated
   */
  int FUNCTION_BLOCK = 1;

  /**
   * The feature id for the '<em><b>Instructions</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_BLOCK__INSTRUCTIONS = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_BLOCK__NAME = 1;

  /**
   * The number of structural features of the '<em>Function Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_BLOCK_FEATURE_COUNT = 2;

  /**
   * The number of operations of the '<em>Function Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_BLOCK_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link at.tugraz.model.impl.GenericInstructionImpl <em>Generic Instruction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.tugraz.model.impl.GenericInstructionImpl
   * @see at.tugraz.model.impl.ModelPackageImpl#getGenericInstruction()
   * @generated
   */
  int GENERIC_INSTRUCTION = 2;

  /**
   * The feature id for the '<em><b>Ins Nr</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERIC_INSTRUCTION__INS_NR = 0;

  /**
   * The feature id for the '<em><b>Instructions</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERIC_INSTRUCTION__INSTRUCTIONS = 1;

  /**
   * The number of structural features of the '<em>Generic Instruction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERIC_INSTRUCTION_FEATURE_COUNT = 2;

  /**
   * The operation id for the '<em>To Ber</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERIC_INSTRUCTION___TO_BER = 0;

  /**
   * The operation id for the '<em>Get Params</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERIC_INSTRUCTION___GET_PARAMS = 1;

  /**
   * The number of operations of the '<em>Generic Instruction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERIC_INSTRUCTION_OPERATION_COUNT = 2;

  /**
   * The meta object id for the '{@link at.tugraz.model.impl.FunctionBlockRestrictionImpl <em>Function Block Restriction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.tugraz.model.impl.FunctionBlockRestrictionImpl
   * @see at.tugraz.model.impl.ModelPackageImpl#getFunctionBlockRestriction()
   * @generated
   */
  int FUNCTION_BLOCK_RESTRICTION = 3;

  /**
   * The number of structural features of the '<em>Function Block Restriction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_BLOCK_RESTRICTION_FEATURE_COUNT = 0;

  /**
   * The operation id for the '<em>Check</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_BLOCK_RESTRICTION___CHECK__FUNCTIONBLOCK = 0;

  /**
   * The number of operations of the '<em>Function Block Restriction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_BLOCK_RESTRICTION_OPERATION_COUNT = 1;

  /**
   * The meta object id for the '{@link at.tugraz.model.impl.InstructionRestrictionImpl <em>Instruction Restriction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.tugraz.model.impl.InstructionRestrictionImpl
   * @see at.tugraz.model.impl.ModelPackageImpl#getInstructionRestriction()
   * @generated
   */
  int INSTRUCTION_RESTRICTION = 4;

  /**
   * The number of structural features of the '<em>Instruction Restriction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_RESTRICTION_FEATURE_COUNT = 0;

  /**
   * The operation id for the '<em>Check</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_RESTRICTION___CHECK__PARAMETER = 0;

  /**
   * The number of operations of the '<em>Instruction Restriction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_RESTRICTION_OPERATION_COUNT = 1;

  /**
   * The meta object id for the '{@link at.tugraz.model.impl.ParameterRestrictionImpl <em>Parameter Restriction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.tugraz.model.impl.ParameterRestrictionImpl
   * @see at.tugraz.model.impl.ModelPackageImpl#getParameterRestriction()
   * @generated
   */
  int PARAMETER_RESTRICTION = 5;

  /**
   * The number of structural features of the '<em>Parameter Restriction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_RESTRICTION_FEATURE_COUNT = 0;

  /**
   * The operation id for the '<em>Check</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_RESTRICTION___CHECK__PARAMETER = 0;

  /**
   * The number of operations of the '<em>Parameter Restriction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_RESTRICTION_OPERATION_COUNT = 1;

  /**
   * The meta object id for the '{@link at.tugraz.model.ParameterType <em>Parameter Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.tugraz.model.ParameterType
   * @see at.tugraz.model.impl.ModelPackageImpl#getParameterType()
   * @generated
   */
  int PARAMETER_TYPE = 6;


  /**
   * Returns the meta object for class '{@link at.tugraz.model.Parameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter</em>'.
   * @see at.tugraz.model.Parameter
   * @generated
   */
  EClass getParameter();

  /**
   * Returns the meta object for the attribute '{@link at.tugraz.model.Parameter#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see at.tugraz.model.Parameter#getType()
   * @see #getParameter()
   * @generated
   */
  EAttribute getParameter_Type();

  /**
   * Returns the meta object for the attribute '{@link at.tugraz.model.Parameter#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see at.tugraz.model.Parameter#getValue()
   * @see #getParameter()
   * @generated
   */
  EAttribute getParameter_Value();

  /**
   * Returns the meta object for the attribute '{@link at.tugraz.model.Parameter#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see at.tugraz.model.Parameter#getName()
   * @see #getParameter()
   * @generated
   */
  EAttribute getParameter_Name();

  /**
   * Returns the meta object for class '{@link at.tugraz.model.FunctionBlock <em>Function Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function Block</em>'.
   * @see at.tugraz.model.FunctionBlock
   * @generated
   */
  EClass getFunctionBlock();

  /**
   * Returns the meta object for the reference list '{@link at.tugraz.model.FunctionBlock#getInstructions <em>Instructions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Instructions</em>'.
   * @see at.tugraz.model.FunctionBlock#getInstructions()
   * @see #getFunctionBlock()
   * @generated
   */
  EReference getFunctionBlock_Instructions();

  /**
   * Returns the meta object for the attribute '{@link at.tugraz.model.FunctionBlock#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see at.tugraz.model.FunctionBlock#getName()
   * @see #getFunctionBlock()
   * @generated
   */
  EAttribute getFunctionBlock_Name();

  /**
   * Returns the meta object for class '{@link at.tugraz.model.GenericInstruction <em>Generic Instruction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Generic Instruction</em>'.
   * @see at.tugraz.model.GenericInstruction
   * @generated
   */
  EClass getGenericInstruction();

  /**
   * Returns the meta object for the attribute '{@link at.tugraz.model.GenericInstruction#getInsNr <em>Ins Nr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ins Nr</em>'.
   * @see at.tugraz.model.GenericInstruction#getInsNr()
   * @see #getGenericInstruction()
   * @generated
   */
  EAttribute getGenericInstruction_InsNr();

  /**
   * Returns the meta object for the reference list '{@link at.tugraz.model.GenericInstruction#getInstructions <em>Instructions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Instructions</em>'.
   * @see at.tugraz.model.GenericInstruction#getInstructions()
   * @see #getGenericInstruction()
   * @generated
   */
  EReference getGenericInstruction_Instructions();

  /**
   * Returns the meta object for the '{@link at.tugraz.model.GenericInstruction#toBer() <em>To Ber</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>To Ber</em>' operation.
   * @see at.tugraz.model.GenericInstruction#toBer()
   * @generated
   */
  EOperation getGenericInstruction__ToBer();

  /**
   * Returns the meta object for the '{@link at.tugraz.model.GenericInstruction#getParams() <em>Get Params</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Get Params</em>' operation.
   * @see at.tugraz.model.GenericInstruction#getParams()
   * @generated
   */
  EOperation getGenericInstruction__GetParams();

  /**
   * Returns the meta object for class '{@link at.tugraz.model.FunctionBlockRestriction <em>Function Block Restriction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function Block Restriction</em>'.
   * @see at.tugraz.model.FunctionBlockRestriction
   * @generated
   */
  EClass getFunctionBlockRestriction();

  /**
   * Returns the meta object for the '{@link at.tugraz.model.FunctionBlockRestriction#check(at.tugraz.model.FunctionBlock) <em>Check</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Check</em>' operation.
   * @see at.tugraz.model.FunctionBlockRestriction#check(at.tugraz.model.FunctionBlock)
   * @generated
   */
  EOperation getFunctionBlockRestriction__Check__FunctionBlock();

  /**
   * Returns the meta object for class '{@link at.tugraz.model.InstructionRestriction <em>Instruction Restriction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Instruction Restriction</em>'.
   * @see at.tugraz.model.InstructionRestriction
   * @generated
   */
  EClass getInstructionRestriction();

  /**
   * Returns the meta object for the '{@link at.tugraz.model.InstructionRestriction#check(at.tugraz.model.GenericInstruction) <em>Check</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Check</em>' operation.
   * @see at.tugraz.model.InstructionRestriction#check(at.tugraz.model.GenericInstruction)
   * @generated
   */
  EOperation getInstructionRestriction__Check__Parameter();

  /**
   * Returns the meta object for class '{@link at.tugraz.model.ParameterRestriction <em>Parameter Restriction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter Restriction</em>'.
   * @see at.tugraz.model.ParameterRestriction
   * @generated
   */
  EClass getParameterRestriction();

  /**
   * Returns the meta object for the '{@link at.tugraz.model.ParameterRestriction#check(at.tugraz.model.Parameter) <em>Check</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Check</em>' operation.
   * @see at.tugraz.model.ParameterRestriction#check(at.tugraz.model.Parameter)
   * @generated
   */
  EOperation getParameterRestriction__Check__Parameter();

  /**
   * Returns the meta object for enum '{@link at.tugraz.model.ParameterType <em>Parameter Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Parameter Type</em>'.
   * @see at.tugraz.model.ParameterType
   * @generated
   */
  EEnum getParameterType();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ModelFactory getModelFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each operation of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link at.tugraz.model.impl.ParameterImpl <em>Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.tugraz.model.impl.ParameterImpl
     * @see at.tugraz.model.impl.ModelPackageImpl#getParameter()
     * @generated
     */
    EClass PARAMETER = eINSTANCE.getParameter();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER__TYPE = eINSTANCE.getParameter_Type();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER__VALUE = eINSTANCE.getParameter_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER__NAME = eINSTANCE.getParameter_Name();

    /**
     * The meta object literal for the '{@link at.tugraz.model.impl.FunctionBlockImpl <em>Function Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.tugraz.model.impl.FunctionBlockImpl
     * @see at.tugraz.model.impl.ModelPackageImpl#getFunctionBlock()
     * @generated
     */
    EClass FUNCTION_BLOCK = eINSTANCE.getFunctionBlock();

    /**
     * The meta object literal for the '<em><b>Instructions</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_BLOCK__INSTRUCTIONS = eINSTANCE.getFunctionBlock_Instructions();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION_BLOCK__NAME = eINSTANCE.getFunctionBlock_Name();

    /**
     * The meta object literal for the '{@link at.tugraz.model.impl.GenericInstructionImpl <em>Generic Instruction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.tugraz.model.impl.GenericInstructionImpl
     * @see at.tugraz.model.impl.ModelPackageImpl#getGenericInstruction()
     * @generated
     */
    EClass GENERIC_INSTRUCTION = eINSTANCE.getGenericInstruction();

    /**
     * The meta object literal for the '<em><b>Ins Nr</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GENERIC_INSTRUCTION__INS_NR = eINSTANCE.getGenericInstruction_InsNr();

    /**
     * The meta object literal for the '<em><b>Instructions</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GENERIC_INSTRUCTION__INSTRUCTIONS = eINSTANCE.getGenericInstruction_Instructions();

    /**
     * The meta object literal for the '<em><b>To Ber</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation GENERIC_INSTRUCTION___TO_BER = eINSTANCE.getGenericInstruction__ToBer();

    /**
     * The meta object literal for the '<em><b>Get Params</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation GENERIC_INSTRUCTION___GET_PARAMS = eINSTANCE.getGenericInstruction__GetParams();

    /**
     * The meta object literal for the '{@link at.tugraz.model.impl.FunctionBlockRestrictionImpl <em>Function Block Restriction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.tugraz.model.impl.FunctionBlockRestrictionImpl
     * @see at.tugraz.model.impl.ModelPackageImpl#getFunctionBlockRestriction()
     * @generated
     */
    EClass FUNCTION_BLOCK_RESTRICTION = eINSTANCE.getFunctionBlockRestriction();

    /**
     * The meta object literal for the '<em><b>Check</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation FUNCTION_BLOCK_RESTRICTION___CHECK__FUNCTIONBLOCK = eINSTANCE.getFunctionBlockRestriction__Check__FunctionBlock();

    /**
     * The meta object literal for the '{@link at.tugraz.model.impl.InstructionRestrictionImpl <em>Instruction Restriction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.tugraz.model.impl.InstructionRestrictionImpl
     * @see at.tugraz.model.impl.ModelPackageImpl#getInstructionRestriction()
     * @generated
     */
    EClass INSTRUCTION_RESTRICTION = eINSTANCE.getInstructionRestriction();

    /**
     * The meta object literal for the '<em><b>Check</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation INSTRUCTION_RESTRICTION___CHECK__PARAMETER = eINSTANCE.getInstructionRestriction__Check__Parameter();

    /**
     * The meta object literal for the '{@link at.tugraz.model.impl.ParameterRestrictionImpl <em>Parameter Restriction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.tugraz.model.impl.ParameterRestrictionImpl
     * @see at.tugraz.model.impl.ModelPackageImpl#getParameterRestriction()
     * @generated
     */
    EClass PARAMETER_RESTRICTION = eINSTANCE.getParameterRestriction();

    /**
     * The meta object literal for the '<em><b>Check</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation PARAMETER_RESTRICTION___CHECK__PARAMETER = eINSTANCE.getParameterRestriction__Check__Parameter();

    /**
     * The meta object literal for the '{@link at.tugraz.model.ParameterType <em>Parameter Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.tugraz.model.ParameterType
     * @see at.tugraz.model.impl.ModelPackageImpl#getParameterType()
     * @generated
     */
    EEnum PARAMETER_TYPE = eINSTANCE.getParameterType();

  }

} //ModelPackage
