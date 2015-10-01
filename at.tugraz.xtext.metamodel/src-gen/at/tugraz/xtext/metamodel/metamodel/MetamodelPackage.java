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
   * The feature id for the '<em><b>Restrictions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__RESTRICTIONS = ABSTRACT_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FEATURE_COUNT = ABSTRACT_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link at.tugraz.xtext.metamodel.metamodel.impl.FunctionTypeImpl <em>Function Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.tugraz.xtext.metamodel.metamodel.impl.FunctionTypeImpl
   * @see at.tugraz.xtext.metamodel.metamodel.impl.MetamodelPackageImpl#getFunctionType()
   * @generated
   */
  int FUNCTION_TYPE = 3;

  /**
   * The feature id for the '<em><b>Repeat</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_TYPE__REPEAT = 0;

  /**
   * The feature id for the '<em><b>Optional</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_TYPE__OPTIONAL = 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_TYPE__TYPE = 2;

  /**
   * The number of structural features of the '<em>Function Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_TYPE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link at.tugraz.xtext.metamodel.metamodel.impl.DatatypeImpl <em>Datatype</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.tugraz.xtext.metamodel.metamodel.impl.DatatypeImpl
   * @see at.tugraz.xtext.metamodel.metamodel.impl.MetamodelPackageImpl#getDatatype()
   * @generated
   */
  int DATATYPE = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATATYPE__NAME = TYPE__NAME;

  /**
   * The feature id for the '<em><b>Restrictions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATATYPE__RESTRICTIONS = TYPE__RESTRICTIONS;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATATYPE__TYPE = TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Default Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATATYPE__DEFAULT_VALUE = TYPE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Datatype</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATATYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link at.tugraz.xtext.metamodel.metamodel.impl.RestrictionImpl <em>Restriction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.tugraz.xtext.metamodel.metamodel.impl.RestrictionImpl
   * @see at.tugraz.xtext.metamodel.metamodel.impl.MetamodelPackageImpl#getRestriction()
   * @generated
   */
  int RESTRICTION = 5;

  /**
   * The feature id for the '<em><b>Stringrestriction</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESTRICTION__STRINGRESTRICTION = 0;

  /**
   * The feature id for the '<em><b>Maxlength</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESTRICTION__MAXLENGTH = 1;

  /**
   * The feature id for the '<em><b>Minlength</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESTRICTION__MINLENGTH = 2;

  /**
   * The feature id for the '<em><b>Valuerestriction</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESTRICTION__VALUERESTRICTION = 3;

  /**
   * The feature id for the '<em><b>Maxvalue</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESTRICTION__MAXVALUE = 4;

  /**
   * The feature id for the '<em><b>Minvalue</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESTRICTION__MINVALUE = 5;

  /**
   * The number of structural features of the '<em>Restriction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESTRICTION_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link at.tugraz.xtext.metamodel.metamodel.impl.MemberImpl <em>Member</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.tugraz.xtext.metamodel.metamodel.impl.MemberImpl
   * @see at.tugraz.xtext.metamodel.metamodel.impl.MetamodelPackageImpl#getMember()
   * @generated
   */
  int MEMBER = 6;

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
  int OBJECT = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT__NAME = TYPE__NAME;

  /**
   * The feature id for the '<em><b>Restrictions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT__RESTRICTIONS = TYPE__RESTRICTIONS;

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
  int FUNCTION = 8;

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
   * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__INPUTS = ABSTRACT_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Outpust</b></em>' containment reference list.
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
   * Returns the meta object for the containment reference list '{@link at.tugraz.xtext.metamodel.metamodel.Type#getRestrictions <em>Restrictions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Restrictions</em>'.
   * @see at.tugraz.xtext.metamodel.metamodel.Type#getRestrictions()
   * @see #getType()
   * @generated
   */
  EReference getType_Restrictions();

  /**
   * Returns the meta object for class '{@link at.tugraz.xtext.metamodel.metamodel.FunctionType <em>Function Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function Type</em>'.
   * @see at.tugraz.xtext.metamodel.metamodel.FunctionType
   * @generated
   */
  EClass getFunctionType();

  /**
   * Returns the meta object for the attribute '{@link at.tugraz.xtext.metamodel.metamodel.FunctionType#isRepeat <em>Repeat</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Repeat</em>'.
   * @see at.tugraz.xtext.metamodel.metamodel.FunctionType#isRepeat()
   * @see #getFunctionType()
   * @generated
   */
  EAttribute getFunctionType_Repeat();

  /**
   * Returns the meta object for the attribute '{@link at.tugraz.xtext.metamodel.metamodel.FunctionType#isOptional <em>Optional</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Optional</em>'.
   * @see at.tugraz.xtext.metamodel.metamodel.FunctionType#isOptional()
   * @see #getFunctionType()
   * @generated
   */
  EAttribute getFunctionType_Optional();

  /**
   * Returns the meta object for the reference '{@link at.tugraz.xtext.metamodel.metamodel.FunctionType#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see at.tugraz.xtext.metamodel.metamodel.FunctionType#getType()
   * @see #getFunctionType()
   * @generated
   */
  EReference getFunctionType_Type();

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
   * Returns the meta object for the attribute '{@link at.tugraz.xtext.metamodel.metamodel.Datatype#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see at.tugraz.xtext.metamodel.metamodel.Datatype#getType()
   * @see #getDatatype()
   * @generated
   */
  EAttribute getDatatype_Type();

  /**
   * Returns the meta object for the attribute '{@link at.tugraz.xtext.metamodel.metamodel.Datatype#getDefaultValue <em>Default Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Default Value</em>'.
   * @see at.tugraz.xtext.metamodel.metamodel.Datatype#getDefaultValue()
   * @see #getDatatype()
   * @generated
   */
  EAttribute getDatatype_DefaultValue();

  /**
   * Returns the meta object for class '{@link at.tugraz.xtext.metamodel.metamodel.Restriction <em>Restriction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Restriction</em>'.
   * @see at.tugraz.xtext.metamodel.metamodel.Restriction
   * @generated
   */
  EClass getRestriction();

  /**
   * Returns the meta object for the attribute '{@link at.tugraz.xtext.metamodel.metamodel.Restriction#isStringrestriction <em>Stringrestriction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Stringrestriction</em>'.
   * @see at.tugraz.xtext.metamodel.metamodel.Restriction#isStringrestriction()
   * @see #getRestriction()
   * @generated
   */
  EAttribute getRestriction_Stringrestriction();

  /**
   * Returns the meta object for the attribute '{@link at.tugraz.xtext.metamodel.metamodel.Restriction#getMaxlength <em>Maxlength</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Maxlength</em>'.
   * @see at.tugraz.xtext.metamodel.metamodel.Restriction#getMaxlength()
   * @see #getRestriction()
   * @generated
   */
  EAttribute getRestriction_Maxlength();

  /**
   * Returns the meta object for the attribute '{@link at.tugraz.xtext.metamodel.metamodel.Restriction#getMinlength <em>Minlength</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Minlength</em>'.
   * @see at.tugraz.xtext.metamodel.metamodel.Restriction#getMinlength()
   * @see #getRestriction()
   * @generated
   */
  EAttribute getRestriction_Minlength();

  /**
   * Returns the meta object for the attribute '{@link at.tugraz.xtext.metamodel.metamodel.Restriction#isValuerestriction <em>Valuerestriction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Valuerestriction</em>'.
   * @see at.tugraz.xtext.metamodel.metamodel.Restriction#isValuerestriction()
   * @see #getRestriction()
   * @generated
   */
  EAttribute getRestriction_Valuerestriction();

  /**
   * Returns the meta object for the attribute '{@link at.tugraz.xtext.metamodel.metamodel.Restriction#getMaxvalue <em>Maxvalue</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Maxvalue</em>'.
   * @see at.tugraz.xtext.metamodel.metamodel.Restriction#getMaxvalue()
   * @see #getRestriction()
   * @generated
   */
  EAttribute getRestriction_Maxvalue();

  /**
   * Returns the meta object for the attribute '{@link at.tugraz.xtext.metamodel.metamodel.Restriction#getMinvalue <em>Minvalue</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Minvalue</em>'.
   * @see at.tugraz.xtext.metamodel.metamodel.Restriction#getMinvalue()
   * @see #getRestriction()
   * @generated
   */
  EAttribute getRestriction_Minvalue();

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
   * Returns the meta object for the containment reference list '{@link at.tugraz.xtext.metamodel.metamodel.Function#getInputs <em>Inputs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Inputs</em>'.
   * @see at.tugraz.xtext.metamodel.metamodel.Function#getInputs()
   * @see #getFunction()
   * @generated
   */
  EReference getFunction_Inputs();

  /**
   * Returns the meta object for the containment reference list '{@link at.tugraz.xtext.metamodel.metamodel.Function#getOutpust <em>Outpust</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Outpust</em>'.
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
     * The meta object literal for the '<em><b>Restrictions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE__RESTRICTIONS = eINSTANCE.getType_Restrictions();

    /**
     * The meta object literal for the '{@link at.tugraz.xtext.metamodel.metamodel.impl.FunctionTypeImpl <em>Function Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.tugraz.xtext.metamodel.metamodel.impl.FunctionTypeImpl
     * @see at.tugraz.xtext.metamodel.metamodel.impl.MetamodelPackageImpl#getFunctionType()
     * @generated
     */
    EClass FUNCTION_TYPE = eINSTANCE.getFunctionType();

    /**
     * The meta object literal for the '<em><b>Repeat</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION_TYPE__REPEAT = eINSTANCE.getFunctionType_Repeat();

    /**
     * The meta object literal for the '<em><b>Optional</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION_TYPE__OPTIONAL = eINSTANCE.getFunctionType_Optional();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_TYPE__TYPE = eINSTANCE.getFunctionType_Type();

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
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATATYPE__TYPE = eINSTANCE.getDatatype_Type();

    /**
     * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATATYPE__DEFAULT_VALUE = eINSTANCE.getDatatype_DefaultValue();

    /**
     * The meta object literal for the '{@link at.tugraz.xtext.metamodel.metamodel.impl.RestrictionImpl <em>Restriction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.tugraz.xtext.metamodel.metamodel.impl.RestrictionImpl
     * @see at.tugraz.xtext.metamodel.metamodel.impl.MetamodelPackageImpl#getRestriction()
     * @generated
     */
    EClass RESTRICTION = eINSTANCE.getRestriction();

    /**
     * The meta object literal for the '<em><b>Stringrestriction</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RESTRICTION__STRINGRESTRICTION = eINSTANCE.getRestriction_Stringrestriction();

    /**
     * The meta object literal for the '<em><b>Maxlength</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RESTRICTION__MAXLENGTH = eINSTANCE.getRestriction_Maxlength();

    /**
     * The meta object literal for the '<em><b>Minlength</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RESTRICTION__MINLENGTH = eINSTANCE.getRestriction_Minlength();

    /**
     * The meta object literal for the '<em><b>Valuerestriction</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RESTRICTION__VALUERESTRICTION = eINSTANCE.getRestriction_Valuerestriction();

    /**
     * The meta object literal for the '<em><b>Maxvalue</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RESTRICTION__MAXVALUE = eINSTANCE.getRestriction_Maxvalue();

    /**
     * The meta object literal for the '<em><b>Minvalue</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RESTRICTION__MINVALUE = eINSTANCE.getRestriction_Minvalue();

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
     * The meta object literal for the '<em><b>Inputs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION__INPUTS = eINSTANCE.getFunction_Inputs();

    /**
     * The meta object literal for the '<em><b>Outpust</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION__OUTPUST = eINSTANCE.getFunction_Outpust();

  }

} //MetamodelPackage
