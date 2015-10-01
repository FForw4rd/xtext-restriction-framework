/**
 */
package at.tugraz.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.tugraz.model.FunctionBlock#getInstructions <em>Instructions</em>}</li>
 *   <li>{@link at.tugraz.model.FunctionBlock#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see at.tugraz.model.ModelPackage#getFunctionBlock()
 * @model
 * @generated
 */
public interface FunctionBlock
{
  /**
   * Returns the value of the '<em><b>Instructions</b></em>' reference list.
   * The list contents are of type {@link at.tugraz.model.GenericInstruction}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Instructions</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Instructions</em>' reference list.
   * @see at.tugraz.model.ModelPackage#getFunctionBlock_Instructions()
   * @model
   * @generated
   */
  EList<GenericInstruction> getInstructions();

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see at.tugraz.model.ModelPackage#getFunctionBlock_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link at.tugraz.model.FunctionBlock#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // FunctionBlock
