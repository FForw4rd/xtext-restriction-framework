/**
 */
package at.tugraz.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generic Instruction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.tugraz.model.GenericInstruction#getInsNr <em>Ins Nr</em>}</li>
 *   <li>{@link at.tugraz.model.GenericInstruction#getInstructions <em>Instructions</em>}</li>
 * </ul>
 *
 * @see at.tugraz.model.ModelPackage#getGenericInstruction()
 * @model abstract="true"
 * @generated
 */
public interface GenericInstruction
{
  /**
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Params</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * You need to override the getParams - Method so that the generic Instruction gets access to the parameter
   * <!-- end-model-doc -->
   * @model kind="operation"
   * @generated
   */
  EList<Parameter> getParams();

  /**
   * Returns the value of the '<em><b>Ins Nr</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ins Nr</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ins Nr</em>' attribute.
   * @see #isSetInsNr()
   * @see at.tugraz.model.ModelPackage#getGenericInstruction_InsNr()
   * @model unsettable="true" changeable="false"
   * @generated
   */
  int getInsNr();

  /**
   * Returns whether the value of the '{@link at.tugraz.model.GenericInstruction#getInsNr <em>Ins Nr</em>}' attribute is set.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return whether the value of the '<em>Ins Nr</em>' attribute is set.
   * @see #getInsNr()
   * @generated
   */
  boolean isSetInsNr();

  /**
   * Returns the value of the '<em><b>Instructions</b></em>' reference list.
   * The list contents are of type {@link at.tugraz.model.Parameter}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Instructions</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Instructions</em>' reference list.
   * @see at.tugraz.model.ModelPackage#getGenericInstruction_Instructions()
   * @model
   * @generated
   */
  EList<Parameter> getInstructions();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * You do not need to worry about this.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='// This is just for demonstration do not worry about anything\r\njava.io.ByteArrayOutputStream str = new java.io.ByteArrayOutputStream();\r\nfor(Parameter para : getParams()) {\r\n  try {\r\n    str.write(para.getValue());\r\n  } catch (java.io.IOException e) {\r\n    return new byte[0];\r\n  }\r\n}\r\n\r\nreturn str.toByteArray();'"
   * @generated
   */
  byte[] toBer();

} // GenericInstruction
