/**
 */
package at.tugraz.xtext.metamodel.metamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Restriction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.tugraz.xtext.metamodel.metamodel.Restriction#isStringrestriction <em>Stringrestriction</em>}</li>
 *   <li>{@link at.tugraz.xtext.metamodel.metamodel.Restriction#getMaxlength <em>Maxlength</em>}</li>
 *   <li>{@link at.tugraz.xtext.metamodel.metamodel.Restriction#getMinlength <em>Minlength</em>}</li>
 *   <li>{@link at.tugraz.xtext.metamodel.metamodel.Restriction#isValuerestriction <em>Valuerestriction</em>}</li>
 *   <li>{@link at.tugraz.xtext.metamodel.metamodel.Restriction#getMaxvalue <em>Maxvalue</em>}</li>
 *   <li>{@link at.tugraz.xtext.metamodel.metamodel.Restriction#getMinvalue <em>Minvalue</em>}</li>
 * </ul>
 *
 * @see at.tugraz.xtext.metamodel.metamodel.MetamodelPackage#getRestriction()
 * @model
 * @generated
 */
public interface Restriction extends EObject
{
  /**
   * Returns the value of the '<em><b>Stringrestriction</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Stringrestriction</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Stringrestriction</em>' attribute.
   * @see #setStringrestriction(boolean)
   * @see at.tugraz.xtext.metamodel.metamodel.MetamodelPackage#getRestriction_Stringrestriction()
   * @model
   * @generated
   */
  boolean isStringrestriction();

  /**
   * Sets the value of the '{@link at.tugraz.xtext.metamodel.metamodel.Restriction#isStringrestriction <em>Stringrestriction</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Stringrestriction</em>' attribute.
   * @see #isStringrestriction()
   * @generated
   */
  void setStringrestriction(boolean value);

  /**
   * Returns the value of the '<em><b>Maxlength</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Maxlength</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Maxlength</em>' attribute.
   * @see #setMaxlength(int)
   * @see at.tugraz.xtext.metamodel.metamodel.MetamodelPackage#getRestriction_Maxlength()
   * @model
   * @generated
   */
  int getMaxlength();

  /**
   * Sets the value of the '{@link at.tugraz.xtext.metamodel.metamodel.Restriction#getMaxlength <em>Maxlength</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Maxlength</em>' attribute.
   * @see #getMaxlength()
   * @generated
   */
  void setMaxlength(int value);

  /**
   * Returns the value of the '<em><b>Minlength</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Minlength</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Minlength</em>' attribute.
   * @see #setMinlength(int)
   * @see at.tugraz.xtext.metamodel.metamodel.MetamodelPackage#getRestriction_Minlength()
   * @model
   * @generated
   */
  int getMinlength();

  /**
   * Sets the value of the '{@link at.tugraz.xtext.metamodel.metamodel.Restriction#getMinlength <em>Minlength</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Minlength</em>' attribute.
   * @see #getMinlength()
   * @generated
   */
  void setMinlength(int value);

  /**
   * Returns the value of the '<em><b>Valuerestriction</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Valuerestriction</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Valuerestriction</em>' attribute.
   * @see #setValuerestriction(boolean)
   * @see at.tugraz.xtext.metamodel.metamodel.MetamodelPackage#getRestriction_Valuerestriction()
   * @model
   * @generated
   */
  boolean isValuerestriction();

  /**
   * Sets the value of the '{@link at.tugraz.xtext.metamodel.metamodel.Restriction#isValuerestriction <em>Valuerestriction</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Valuerestriction</em>' attribute.
   * @see #isValuerestriction()
   * @generated
   */
  void setValuerestriction(boolean value);

  /**
   * Returns the value of the '<em><b>Maxvalue</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Maxvalue</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Maxvalue</em>' attribute.
   * @see #setMaxvalue(int)
   * @see at.tugraz.xtext.metamodel.metamodel.MetamodelPackage#getRestriction_Maxvalue()
   * @model
   * @generated
   */
  int getMaxvalue();

  /**
   * Sets the value of the '{@link at.tugraz.xtext.metamodel.metamodel.Restriction#getMaxvalue <em>Maxvalue</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Maxvalue</em>' attribute.
   * @see #getMaxvalue()
   * @generated
   */
  void setMaxvalue(int value);

  /**
   * Returns the value of the '<em><b>Minvalue</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Minvalue</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Minvalue</em>' attribute.
   * @see #setMinvalue(int)
   * @see at.tugraz.xtext.metamodel.metamodel.MetamodelPackage#getRestriction_Minvalue()
   * @model
   * @generated
   */
  int getMinvalue();

  /**
   * Sets the value of the '{@link at.tugraz.xtext.metamodel.metamodel.Restriction#getMinvalue <em>Minvalue</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Minvalue</em>' attribute.
   * @see #getMinvalue()
   * @generated
   */
  void setMinvalue(int value);

} // Restriction
