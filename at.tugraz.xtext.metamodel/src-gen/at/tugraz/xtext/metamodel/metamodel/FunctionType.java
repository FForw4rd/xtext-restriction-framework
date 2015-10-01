/**
 */
package at.tugraz.xtext.metamodel.metamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.tugraz.xtext.metamodel.metamodel.FunctionType#isRepeat <em>Repeat</em>}</li>
 *   <li>{@link at.tugraz.xtext.metamodel.metamodel.FunctionType#isOptional <em>Optional</em>}</li>
 *   <li>{@link at.tugraz.xtext.metamodel.metamodel.FunctionType#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see at.tugraz.xtext.metamodel.metamodel.MetamodelPackage#getFunctionType()
 * @model
 * @generated
 */
public interface FunctionType extends EObject
{
  /**
   * Returns the value of the '<em><b>Repeat</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Repeat</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Repeat</em>' attribute.
   * @see #setRepeat(boolean)
   * @see at.tugraz.xtext.metamodel.metamodel.MetamodelPackage#getFunctionType_Repeat()
   * @model
   * @generated
   */
  boolean isRepeat();

  /**
   * Sets the value of the '{@link at.tugraz.xtext.metamodel.metamodel.FunctionType#isRepeat <em>Repeat</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Repeat</em>' attribute.
   * @see #isRepeat()
   * @generated
   */
  void setRepeat(boolean value);

  /**
   * Returns the value of the '<em><b>Optional</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Optional</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Optional</em>' attribute.
   * @see #setOptional(boolean)
   * @see at.tugraz.xtext.metamodel.metamodel.MetamodelPackage#getFunctionType_Optional()
   * @model
   * @generated
   */
  boolean isOptional();

  /**
   * Sets the value of the '{@link at.tugraz.xtext.metamodel.metamodel.FunctionType#isOptional <em>Optional</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Optional</em>' attribute.
   * @see #isOptional()
   * @generated
   */
  void setOptional(boolean value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' reference.
   * @see #setType(Type)
   * @see at.tugraz.xtext.metamodel.metamodel.MetamodelPackage#getFunctionType_Type()
   * @model
   * @generated
   */
  Type getType();

  /**
   * Sets the value of the '{@link at.tugraz.xtext.metamodel.metamodel.FunctionType#getType <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' reference.
   * @see #getType()
   * @generated
   */
  void setType(Type value);

} // FunctionType
