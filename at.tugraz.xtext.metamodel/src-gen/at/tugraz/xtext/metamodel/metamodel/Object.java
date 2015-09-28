/**
 */
package at.tugraz.xtext.metamodel.metamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.tugraz.xtext.metamodel.metamodel.Object#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link at.tugraz.xtext.metamodel.metamodel.Object#getMembers <em>Members</em>}</li>
 *   <li>{@link at.tugraz.xtext.metamodel.metamodel.Object#isIssecure <em>Issecure</em>}</li>
 * </ul>
 *
 * @see at.tugraz.xtext.metamodel.metamodel.MetamodelPackage#getObject()
 * @model
 * @generated
 */
public interface Object extends Type
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
   * @see #setSuperType(Object)
   * @see at.tugraz.xtext.metamodel.metamodel.MetamodelPackage#getObject_SuperType()
   * @model
   * @generated
   */
  Object getSuperType();

  /**
   * Sets the value of the '{@link at.tugraz.xtext.metamodel.metamodel.Object#getSuperType <em>Super Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Super Type</em>' reference.
   * @see #getSuperType()
   * @generated
   */
  void setSuperType(Object value);

  /**
   * Returns the value of the '<em><b>Members</b></em>' containment reference list.
   * The list contents are of type {@link at.tugraz.xtext.metamodel.metamodel.Member}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Members</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Members</em>' containment reference list.
   * @see at.tugraz.xtext.metamodel.metamodel.MetamodelPackage#getObject_Members()
   * @model containment="true"
   * @generated
   */
  EList<Member> getMembers();

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
   * @see at.tugraz.xtext.metamodel.metamodel.MetamodelPackage#getObject_Issecure()
   * @model
   * @generated
   */
  boolean isIssecure();

  /**
   * Sets the value of the '{@link at.tugraz.xtext.metamodel.metamodel.Object#isIssecure <em>Issecure</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Issecure</em>' attribute.
   * @see #isIssecure()
   * @generated
   */
  void setIssecure(boolean value);

} // Object
