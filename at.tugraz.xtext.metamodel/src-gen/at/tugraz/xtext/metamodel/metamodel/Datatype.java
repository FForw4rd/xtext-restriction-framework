/**
 */
package at.tugraz.xtext.metamodel.metamodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Datatype</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.tugraz.xtext.metamodel.metamodel.Datatype#getType <em>Type</em>}</li>
 *   <li>{@link at.tugraz.xtext.metamodel.metamodel.Datatype#getDefaultValue <em>Default Value</em>}</li>
 * </ul>
 *
 * @see at.tugraz.xtext.metamodel.metamodel.MetamodelPackage#getDatatype()
 * @model
 * @generated
 */
public interface Datatype extends Type
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see #setType(String)
   * @see at.tugraz.xtext.metamodel.metamodel.MetamodelPackage#getDatatype_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link at.tugraz.xtext.metamodel.metamodel.Datatype#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

  /**
   * Returns the value of the '<em><b>Default Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Default Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Default Value</em>' attribute.
   * @see #setDefaultValue(String)
   * @see at.tugraz.xtext.metamodel.metamodel.MetamodelPackage#getDatatype_DefaultValue()
   * @model
   * @generated
   */
  String getDefaultValue();

  /**
   * Sets the value of the '{@link at.tugraz.xtext.metamodel.metamodel.Datatype#getDefaultValue <em>Default Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Default Value</em>' attribute.
   * @see #getDefaultValue()
   * @generated
   */
  void setDefaultValue(String value);

} // Datatype
