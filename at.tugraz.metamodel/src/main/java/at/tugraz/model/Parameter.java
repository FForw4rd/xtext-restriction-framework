/**
 */
package at.tugraz.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.tugraz.model.Parameter#getType <em>Type</em>}</li>
 *   <li>{@link at.tugraz.model.Parameter#getValue <em>Value</em>}</li>
 *   <li>{@link at.tugraz.model.Parameter#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see at.tugraz.model.ModelPackage#getParameter()
 * @model
 * @generated
 */
public interface Parameter
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link at.tugraz.model.ParameterType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see at.tugraz.model.ParameterType
   * @see #setType(ParameterType)
   * @see at.tugraz.model.ModelPackage#getParameter_Type()
   * @model
   * @generated
   */
  ParameterType getType();

  /**
   * Sets the value of the '{@link at.tugraz.model.Parameter#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see at.tugraz.model.ParameterType
   * @see #getType()
   * @generated
   */
  void setType(ParameterType value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(byte[])
   * @see at.tugraz.model.ModelPackage#getParameter_Value()
   * @model
   * @generated
   */
  byte[] getValue();

  /**
   * Sets the value of the '{@link at.tugraz.model.Parameter#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(byte[] value);

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
   * @see at.tugraz.model.ModelPackage#getParameter_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link at.tugraz.model.Parameter#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // Parameter
