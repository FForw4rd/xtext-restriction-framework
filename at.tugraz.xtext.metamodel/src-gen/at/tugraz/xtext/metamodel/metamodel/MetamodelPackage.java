/**
 */
package at.tugraz.xtext.metamodel.metamodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see at.tugraz.xtext.metamodel.metamodel.MetamodelFactory
 * @model kind="package"
 * @generated
 */
public interface MetamodelPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "metamodel";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.tugraz.at/xtext/metamodel/Metamodel";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "metamodel";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MetamodelPackage eINSTANCE = at.tugraz.xtext.metamodel.metamodel.impl.MetamodelPackageImpl.init();

  /**
   * The meta object id for the '{@link at.tugraz.xtext.metamodel.metamodel.impl.DomainmodelImpl <em>Domainmodel</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.tugraz.xtext.metamodel.metamodel.impl.DomainmodelImpl
   * @see at.tugraz.xtext.metamodel.metamodel.impl.MetamodelPackageImpl#getDomainmodel()
   * @generated
   */
  int DOMAINMODEL = 0;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAINMODEL__ELEMENTS = 0;

  /**
   * The number of structural features of the '<em>Domainmodel</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAINMODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link at.tugraz.xtext.metamodel.metamodel.impl.AbstractElementImpl <em>Abstract Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.tugraz.xtext.metamodel.metamodel.impl.AbstractElementImpl
   * @see at.tugraz.xtext.metamodel.metamodel.impl.MetamodelPackageImpl#getAbstractElement()
   * @generated
   */
  int ABSTRACT_ELEMENT = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_ELEMENT__NAME = 0;

  /**
   * The number of structural features of the '<em>Abstract Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_ELEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link at.tugraz.xtext.metamodel.metamodel.impl.TypeImpl <em>Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.tugraz.xtext.metamodel.metamodel.impl.TypeImpl
   * @see at.tugraz.xtext.metamodel.metamodel.impl.MetamodelPackageImpl#getType()
   * @generated
   */
  int TYPE = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__NAME = ABSTRACT_ELEMENT__NAME;

  /**
   * The number of structural features of the '<em>Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FEATURE_COUNT = ABSTRACT_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link at.tugraz.xtext.metamodel.metamodel.impl.DatatypeImpl <em>Datatype</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.tugraz.xtext.metamodel.metamodel.impl.DatatypeImpl
   * @see at.tugraz.xtext.metamodel.metamodel.impl.MetamodelPackageImpl#getDatatype()
   * @generated
   */
  int DATATYPE = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATATYPE__NAME = TYPE__NAME;

  /**
   * The number of structural features of the '<em>Datatype</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATATYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link at.tugraz.xtext.metamodel.metamodel.impl.MemberImpl <em>Member</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.tugraz.xtext.metamodel.metamodel.impl.MemberImpl
   * @see at.tugraz.xtext.metamodel.metamodel.impl.MetamodelPackageImpl#getMember()
   * @generated
   */
  int MEMBER = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEMBER__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEMBER__TYPE = 1;

  /**
   * The number of structural features of the '<em>Member</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEMBER_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link at.tugraz.xtext.metamodel.metamodel.impl.ObjectImpl <em>Object</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.tugraz.xtext.metamodel.metamodel.impl.ObjectImpl
   * @see at.tugraz.xtext.metamodel.metamodel.impl.MetamodelPackageImpl#getObject()
   * @generated
   */
  int OBJECT = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT__NAME = TYPE__NAME;

  /**
   * The feature id for the '<em><b>Super Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT__SUPER_TYPE = TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Members</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT__MEMBERS = TYPE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Issecure</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT__ISSECURE = TYPE_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Object</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_FEATURE_COUNT = TYPE_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link at.tugraz.xtext.metamodel.metamodel.impl.FunctionImpl <em>Function</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.tugraz.xtext.metamodel.metamodel.impl.FunctionImpl
   * @see at.tugraz.xtext.metamodel.metamodel.impl.MetamodelPackageImpl#getFunction()
   * @generated
   */
  int FUNCTION = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__NAME = ABSTRACT_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Super Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__SUPER_TYPE = ABSTRACT_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__IDENTIFIER = ABSTRACT_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Issecure</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__ISSECURE = ABSTRACT_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Inputs</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__INPUTS = ABSTRACT_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Outpust</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__OUTPUST = ABSTRACT_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Function</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_FEATURE_COUNT = ABSTRACT_ELEMENT_FEATURE_COUNT + 5;


  /**
   * Returns the meta object for class '{@link at.tugraz.xtext.metamodel.metamodel.Domainmodel <em>Domainmodel</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Domainmodel</em>'.
   * @see at.tugraz.xtext.metamodel.metamodel.Domainmodel
   * @generated
   */
  EClass getDomainmodel();

  /**
   * Returns the meta object for the containment reference list '{@link at.tugraz.xtext.metamodel.metamodel.Domainmodel#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see at.tugraz.xtext.metamodel.metamodel.Domainmodel#getElements()
   * @see #getDomainmodel()
   * @generated
   */
  EReference getDomainmodel_Elements();

  /**
   * Returns the meta object for class '{@link at.tugraz.xtext.metamodel.metamodel.AbstractElement <em>Abstract Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Element</em>'.
   * @see at.tugraz.xtext.metamodel.metamodel.AbstractElement
   * @generated
   */
  EClass getAbstractElement();

  /**
   * Returns the meta object for the attribute '{@link at.tugraz.xtext.metamodel.metamodel.AbstractElement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see at.tugraz.xtext.metamodel.metamodel.AbstractElement#getName()
   * @see #getAbstractElement()
   * @generated
   */
  EAttribute getAbstractElement_Name();

  /**
   * Returns the meta object for class '{@link at.tugraz.xtext.metamodel.metamodel.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type</em>'.
   * @see at.tugraz.xtext.metamodel.metamodel.Type
   * @generated
   */
  EClass getType();

  /**
   * Returns the meta object for class '{@link at.tugraz.xtext.metamodel.metamodel.Datatype <em>Datatype</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Datatype</em>'.
   * @see at.tugraz.xtext.metamodel.metamodel.Datatype
   * @generated
   */
  EClass getDatatype();

  /**
   * Returns the meta object for class '{@link at.tugraz.xtext.metamodel.metamodel.Member <em>Member</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Member</em>'.
   * @see at.tugraz.xtext.metamodel.metamodel.Member
   * @generated
   */
  EClass getMember();

  /**
   * Returns the meta object for the attribute '{@link at.tugraz.xtext.metamodel.metamodel.Member#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see at.tugraz.xtext.metamodel.metamodel.Member#getName()
   * @see #getMember()
   * @generated
   */
  EAttribute getMember_Name();

  /**
   * Returns the meta object for the reference '{@link at.tugraz.xtext.metamodel.metamodel.Member#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see at.tugraz.xtext.metamodel.metamodel.Member#getType()
   * @see #getMember()
   * @generated
   */
  EReference getMember_Type();

  /**
   * Returns the meta object for class '{@link at.tugraz.xtext.metamodel.metamodel.Object <em>Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Object</em>'.
   * @see at.tugraz.xtext.metamodel.metamodel.Object
   * @generated
   */
  EClass getObject();

  /**
   * Returns the meta object for the reference '{@link at.tugraz.xtext.metamodel.metamodel.Object#getSuperType <em>Super Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Super Type</em>'.
   * @see at.tugraz.xtext.metamodel.metamodel.Object#getSuperType()
   * @see #getObject()
   * @generated
   */
  EReference getObject_SuperType();

  /**
   * Returns the meta object for the containment reference list '{@link at.tugraz.xtext.metamodel.metamodel.Object#getMembers <em>Members</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Members</em>'.
   * @see at.tugraz.xtext.metamodel.metamodel.Object#getMembers()
   * @see #getObject()
   * @generated
   */
  EReference getObject_Members();

  /**
   * Returns the meta object for the attribute '{@link at.tugraz.xtext.metamodel.metamodel.Object#isIssecure <em>Issecure</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Issecure</em>'.
   * @see at.tugraz.xtext.metamodel.metamodel.Object#isIssecure()
   * @see #getObject()
   * @generated
   */
  EAttribute getObject_Issecure();

  /**
   * Returns the meta object for class '{@link at.tugraz.xtext.metamodel.metamodel.Function <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function</em>'.
   * @see at.tugraz.xtext.metamodel.metamodel.Function
   * @generated
   */
  EClass getFunction();

  /**
   * Returns the meta object for the reference '{@link at.tugraz.xtext.metamodel.metamodel.Function#getSuperType <em>Super Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Super Type</em>'.
   * @see at.tugraz.xtext.metamodel.metamodel.Function#getSuperType()
   * @see #getFunction()
   * @generated
   */
  EReference getFunction_SuperType();

  /**
   * Returns the meta object for the attribute '{@link at.tugraz.xtext.metamodel.metamodel.Function#getIdentifier <em>Identifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Identifier</em>'.
   * @see at.tugraz.xtext.metamodel.metamodel.Function#getIdentifier()
   * @see #getFunction()
   * @generated
   */
  EAttribute getFunction_Identifier();

  /**
   * Returns the meta object for the attribute '{@link at.tugraz.xtext.metamodel.metamodel.Function#isIssecure <em>Issecure</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Issecure</em>'.
   * @see at.tugraz.xtext.metamodel.metamodel.Function#isIssecure()
   * @see #getFunction()
   * @generated
   */
  EAttribute getFunction_Issecure();

  /**
   * Returns the meta object for the reference list '{@link at.tugraz.xtext.metamodel.metamodel.Function#getInputs <em>Inputs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Inputs</em>'.
   * @see at.tugraz.xtext.metamodel.metamodel.Function#getInputs()
   * @see #getFunction()
   * @generated
   */
  EReference getFunction_Inputs();

  /**
   * Returns the meta object for the reference list '{@link at.tugraz.xtext.metamodel.metamodel.Function#getOutpust <em>Outpust</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Outpust</em>'.
   * @see at.tugraz.xtext.metamodel.metamodel.Function#getOutpust()
   * @see #getFunction()
   * @generated
   */
  EReference getFunction_Outpust();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  MetamodelFactory getMetamodelFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link at.tugraz.xtext.metamodel.metamodel.impl.DomainmodelImpl <em>Domainmodel</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.tugraz.xtext.metamodel.metamodel.impl.DomainmodelImpl
     * @see at.tugraz.xtext.metamodel.metamodel.impl.MetamodelPackageImpl#getDomainmodel()
     * @generated
     */
    EClass DOMAINMODEL = eINSTANCE.getDomainmodel();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOMAINMODEL__ELEMENTS = eINSTANCE.getDomainmodel_Elements();

    /**
     * The meta object literal for the '{@link at.tugraz.xtext.metamodel.metamodel.impl.AbstractElementImpl <em>Abstract Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.tugraz.xtext.metamodel.metamodel.impl.AbstractElementImpl
     * @see at.tugraz.xtext.metamodel.metamodel.impl.MetamodelPackageImpl#getAbstractElement()
     * @generated
     */
    EClass ABSTRACT_ELEMENT = eINSTANCE.getAbstractElement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ABSTRACT_ELEMENT__NAME = eINSTANCE.getAbstractElement_Name();

    /**
     * The meta object literal for the '{@link at.tugraz.xtext.metamodel.metamodel.impl.TypeImpl <em>Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.tugraz.xtext.metamodel.metamodel.impl.TypeImpl
     * @see at.tugraz.xtext.metamodel.metamodel.impl.MetamodelPackageImpl#getType()
     * @generated
     */
    EClass TYPE = eINSTANCE.getType();

    /**
     * The meta object literal for the '{@link at.tugraz.xtext.metamodel.metamodel.impl.DatatypeImpl <em>Datatype</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.tugraz.xtext.metamodel.metamodel.impl.DatatypeImpl
     * @see at.tugraz.xtext.metamodel.metamodel.impl.MetamodelPackageImpl#getDatatype()
     * @generated
     */
    EClass DATATYPE = eINSTANCE.getDatatype();

    /**
     * The meta object literal for the '{@link at.tugraz.xtext.metamodel.metamodel.impl.MemberImpl <em>Member</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.tugraz.xtext.metamodel.metamodel.impl.MemberImpl
     * @see at.tugraz.xtext.metamodel.metamodel.impl.MetamodelPackageImpl#getMember()
     * @generated
     */
    EClass MEMBER = eINSTANCE.getMember();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MEMBER__NAME = eINSTANCE.getMember_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MEMBER__TYPE = eINSTANCE.getMember_Type();

    /**
     * The meta object literal for the '{@link at.tugraz.xtext.metamodel.metamodel.impl.ObjectImpl <em>Object</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.tugraz.xtext.metamodel.metamodel.impl.ObjectImpl
     * @see at.tugraz.xtext.metamodel.metamodel.impl.MetamodelPackageImpl#getObject()
     * @generated
     */
    EClass OBJECT = eINSTANCE.getObject();

    /**
     * The meta object literal for the '<em><b>Super Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OBJECT__SUPER_TYPE = eINSTANCE.getObject_SuperType();

    /**
     * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OBJECT__MEMBERS = eINSTANCE.getObject_Members();

    /**
     * The meta object literal for the '<em><b>Issecure</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OBJECT__ISSECURE = eINSTANCE.getObject_Issecure();

    /**
     * The meta object literal for the '{@link at.tugraz.xtext.metamodel.metamodel.impl.FunctionImpl <em>Function</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.tugraz.xtext.metamodel.metamodel.impl.FunctionImpl
     * @see at.tugraz.xtext.metamodel.metamodel.impl.MetamodelPackageImpl#getFunction()
     * @generated
     */
    EClass FUNCTION = eINSTANCE.getFunction();

    /**
     * The meta object literal for the '<em><b>Super Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION__SUPER_TYPE = eINSTANCE.getFunction_SuperType();

    /**
     * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION__IDENTIFIER = eINSTANCE.getFunction_Identifier();

    /**
     * The meta object literal for the '<em><b>Issecure</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION__ISSECURE = eINSTANCE.getFunction_Issecure();

    /**
     * The meta object literal for the '<em><b>Inputs</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION__INPUTS = eINSTANCE.getFunction_Inputs();

    /**
     * The meta object literal for the '<em><b>Outpust</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION__OUTPUST = eINSTANCE.getFunction_Outpust();

  }

} //MetamodelPackage
