/**
 */
package at.tugraz.xtext.metamodel.metamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.tugraz.xtext.metamodel.metamodel.Type#getRestrictions <em>Restrictions</em>}</li>
 * </ul>
 *
 * @see at.tugraz.xtext.metamodel.metamodel.MetamodelPackage#getType()
 * @model
 * @generated
 */
public interface Type extends AbstractElement
{
  /**
   * Returns the value of the '<em><b>Restrictions</b></em>' containment reference list.
   * The list contents are of type {@link at.tugraz.xtext.metamodel.metamodel.Restriction}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Restrictions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Restrictions</em>' containment reference list.
   * @see at.tugraz.xtext.metamodel.metamodel.MetamodelPackage#getType_Restrictions()
   * @model containment="true"
   * @generated
   */
  EList<Restriction> getRestrictions();

} // Type
