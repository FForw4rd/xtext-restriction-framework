/**
 */
package at.tugraz.model.impl;

import at.tugraz.model.FunctionBlock;
import at.tugraz.model.FunctionBlockRestriction;
import at.tugraz.model.GenericInstruction;
import at.tugraz.model.InstructionRestriction;
import at.tugraz.model.ModelFactory;
import at.tugraz.model.ModelPackage;
import at.tugraz.model.Parameter;
import at.tugraz.model.ParameterRestriction;
import at.tugraz.model.ParameterType;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelPackageImpl extends EPackageImpl implements ModelPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parameterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass functionBlockEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass genericInstructionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass functionBlockRestrictionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass instructionRestrictionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parameterRestrictionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum parameterTypeEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see at.tugraz.model.ModelPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private ModelPackageImpl()
  {
    super(eNS_URI, ModelFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link ModelPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static ModelPackage init()
  {
    if (isInited) return (ModelPackage)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI);

    // Obtain or create and register package
    ModelPackageImpl theModelPackage = (ModelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ModelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ModelPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theModelPackage.createPackageContents();

    // Initialize created meta-data
    theModelPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theModelPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(ModelPackage.eNS_URI, theModelPackage);
    return theModelPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParameter()
  {
    return parameterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParameter_Type()
  {
    return (EAttribute)parameterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParameter_Value()
  {
    return (EAttribute)parameterEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParameter_Name()
  {
    return (EAttribute)parameterEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFunctionBlock()
  {
    return functionBlockEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFunctionBlock_Instructions()
  {
    return (EReference)functionBlockEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFunctionBlock_Name()
  {
    return (EAttribute)functionBlockEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGenericInstruction()
  {
    return genericInstructionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGenericInstruction_InsNr()
  {
    return (EAttribute)genericInstructionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGenericInstruction_Instructions()
  {
    return (EReference)genericInstructionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getGenericInstruction__ToBer()
  {
    return genericInstructionEClass.getEOperations().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getGenericInstruction__GetParams()
  {
    return genericInstructionEClass.getEOperations().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFunctionBlockRestriction()
  {
    return functionBlockRestrictionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getFunctionBlockRestriction__Check__FunctionBlock()
  {
    return functionBlockRestrictionEClass.getEOperations().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInstructionRestriction()
  {
    return instructionRestrictionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getInstructionRestriction__Check__Parameter()
  {
    return instructionRestrictionEClass.getEOperations().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParameterRestriction()
  {
    return parameterRestrictionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getParameterRestriction__Check__Parameter()
  {
    return parameterRestrictionEClass.getEOperations().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getParameterType()
  {
    return parameterTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModelFactory getModelFactory()
  {
    return (ModelFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    parameterEClass = createEClass(PARAMETER);
    createEAttribute(parameterEClass, PARAMETER__TYPE);
    createEAttribute(parameterEClass, PARAMETER__VALUE);
    createEAttribute(parameterEClass, PARAMETER__NAME);

    functionBlockEClass = createEClass(FUNCTION_BLOCK);
    createEReference(functionBlockEClass, FUNCTION_BLOCK__INSTRUCTIONS);
    createEAttribute(functionBlockEClass, FUNCTION_BLOCK__NAME);

    genericInstructionEClass = createEClass(GENERIC_INSTRUCTION);
    createEAttribute(genericInstructionEClass, GENERIC_INSTRUCTION__INS_NR);
    createEReference(genericInstructionEClass, GENERIC_INSTRUCTION__INSTRUCTIONS);
    createEOperation(genericInstructionEClass, GENERIC_INSTRUCTION___TO_BER);
    createEOperation(genericInstructionEClass, GENERIC_INSTRUCTION___GET_PARAMS);

    functionBlockRestrictionEClass = createEClass(FUNCTION_BLOCK_RESTRICTION);
    createEOperation(functionBlockRestrictionEClass, FUNCTION_BLOCK_RESTRICTION___CHECK__FUNCTIONBLOCK);

    instructionRestrictionEClass = createEClass(INSTRUCTION_RESTRICTION);
    createEOperation(instructionRestrictionEClass, INSTRUCTION_RESTRICTION___CHECK__PARAMETER);

    parameterRestrictionEClass = createEClass(PARAMETER_RESTRICTION);
    createEOperation(parameterRestrictionEClass, PARAMETER_RESTRICTION___CHECK__PARAMETER);

    // Create enums
    parameterTypeEEnum = createEEnum(PARAMETER_TYPE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters
    ETypeParameter functionBlockRestrictionEClass_T = addETypeParameter(functionBlockRestrictionEClass, "T");
    ETypeParameter instructionRestrictionEClass_T = addETypeParameter(instructionRestrictionEClass, "T");

    // Set bounds for type parameters
    EGenericType g1 = createEGenericType(this.getFunctionBlock());
    functionBlockRestrictionEClass_T.getEBounds().add(g1);
    g1 = createEGenericType(this.getGenericInstruction());
    instructionRestrictionEClass_T.getEBounds().add(g1);

    // Add supertypes to classes

    // Initialize classes, features, and operations; add parameters
    initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getParameter_Type(), this.getParameterType(), "type", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getParameter_Value(), ecorePackage.getEByteArray(), "value", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getParameter_Name(), ecorePackage.getEString(), "name", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(functionBlockEClass, FunctionBlock.class, "FunctionBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFunctionBlock_Instructions(), this.getGenericInstruction(), null, "instructions", null, 0, -1, FunctionBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFunctionBlock_Name(), ecorePackage.getEString(), "name", null, 0, 1, FunctionBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(genericInstructionEClass, GenericInstruction.class, "GenericInstruction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getGenericInstruction_InsNr(), ecorePackage.getEInt(), "insNr", null, 0, 1, GenericInstruction.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGenericInstruction_Instructions(), this.getParameter(), null, "instructions", null, 0, -1, GenericInstruction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEOperation(getGenericInstruction__ToBer(), ecorePackage.getEByteArray(), "toBer", 0, 1, IS_UNIQUE, IS_ORDERED);

    initEOperation(getGenericInstruction__GetParams(), this.getParameter(), "getParams", 0, -1, IS_UNIQUE, IS_ORDERED);

    initEClass(functionBlockRestrictionEClass, FunctionBlockRestriction.class, "FunctionBlockRestriction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    EOperation op = initEOperation(getFunctionBlockRestriction__Check__FunctionBlock(), null, "check", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(functionBlockRestrictionEClass_T);
    addEParameter(op, g1, "param", 0, 1, IS_UNIQUE, IS_ORDERED);

    initEClass(instructionRestrictionEClass, InstructionRestriction.class, "InstructionRestriction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = initEOperation(getInstructionRestriction__Check__Parameter(), null, "check", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(instructionRestrictionEClass_T);
    addEParameter(op, g1, "param", 0, 1, IS_UNIQUE, IS_ORDERED);

    initEClass(parameterRestrictionEClass, ParameterRestriction.class, "ParameterRestriction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = initEOperation(getParameterRestriction__Check__Parameter(), null, "check", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, this.getParameter(), "param", 0, 1, IS_UNIQUE, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(parameterTypeEEnum, ParameterType.class, "ParameterType");
    addEEnumLiteral(parameterTypeEEnum, ParameterType.SECRET);
    addEEnumLiteral(parameterTypeEEnum, ParameterType.CONST);
    addEEnumLiteral(parameterTypeEEnum, ParameterType.DATA);

    // Create resource
    createResource(eNS_URI);
  }

} //ModelPackageImpl
