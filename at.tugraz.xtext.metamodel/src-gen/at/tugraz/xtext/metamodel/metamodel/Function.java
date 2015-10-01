/**
 */
package at.tugraz.xtext.metamodel.metamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.tugraz.xtext.metamodel.metamodel.Function#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link at.tugraz.xtext.metamodel.metamodel.Function#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link at.tugraz.xtext.metamodel.metamodel.Function#isIssecure <em>Issecure</em>}</li>
 *   <li>{@link at.tugraz.xtext.metamodel.metamodel.Function#getInputs <em>Inputs</em>}</li>
 *   <li>{@link at.tugraz.xtext.metamodel.metamodel.Function#getOutpust <em>Outpust</em>}</li>
 * </ul>
 *
 * @see at.tugraz.xtext.metamodel.metamodel.MetamodelPackage#getFunction()
 * @model
 * @generated
 */
public interface Function extends AbstractElement
{
  /**
   * Returns the value of the '<em><b>Super Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Super Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Super Type</em>' reference.
   * @see #setSuperType(at.tugraz.xtext.metamodel.metamodel.Object)
   * @see at.tugraz.xtext.metamodel.metamodel.MetamodelPackage#getFunction_SuperType()
   * @model
   * @generated
   */
  at.tugraz.xtext.metamodel.metamodel.Object getSuperType();

  /**
   * Sets the value of the '{@link at.tugraz.xtext.metamodel.metamodel.Function#getSuperType <em>Super Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Super Type</em>' reference.
   * @see #getSuperType()
   * @generated
   */
  void setSuperType(at.tugraz.xtext.metamodel.metamodel.Object value);

  /**
   * Returns the value of the '<em><b>Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Identifier</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Identifier</em>' attribute.
   * @see #setIdentifier(int)
   * @see at.tugraz.xtext.metamodel.metamodel.MetamodelPackage#getFunction_Identifier()
   * @model
   * @generated
   */
  int getIdentifier();

  /**
   * Sets the value of the '{@link at.tugraz.xtext.metamodel.metamodel.Function#getIdentifier <em>Identifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Identifier</em>' attribute.
   * @see #getIdentifier()
   * @generated
   */
  void setIdentifier(int value);

  /**
   * Returns the value of the '<em><b>Issecure</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Issecure</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Issecure</em>' attribute.
   * @see #setIssecure(boolean)
   * @see at.tugraz.xtext.metamodel.metamodel.MetamodelPackage#getFunction_Issecure()
   * @model
   * @generated
   */
  boolean isIssecure();

  /**
   * Sets the value of the '{@link at.tugraz.xtext.metamodel.metamodel.Function#isIssecure <em>Issecure</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Issecure</em>' attribute.
   * @see #isIssecure()
   * @generated
   */
  void setIssecure(boolean value);

  /**
   * Returns the value of the '<em><b>Inputs</b></em>' containment reference list.
   * The list contents are of type {@link at.tugraz.xtext.metamodel.metamodel.FunctionType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Inputs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Inputs</em>' containment reference list.
   * @see at.tugraz.xtext.metamodel.metamodel.MetamodelPackage#getFunction_Inputs()
   * @model containment="true"
   * @generated
   */
  EList<FunctionType> getInputs();

  /**
   * Returns the value of the '<em><b>Outpust</b></em>' containment reference list.
   * The list contents are of type {@link at.tugraz.xtext.metamodel.metamodel.FunctionType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Outpust</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Outpust</em>' containment reference list.
   * @see at.tugraz.xtext.metamodel.metamodel.MetamodelPackage#getFunction_Outpust()
   * @model containment="true"
   * @generated
   */
  EList<FunctionType> getOutpust();

} // Function
