/**
 */
package at.tugraz.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instruction Restriction</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see at.tugraz.model.ModelPackage#getInstructionRestriction()
 * @model
 * @generated
 */
public interface InstructionRestriction<T extends GenericInstruction>
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model
   * @generated
   */
  void check(T param);

} // InstructionRestriction
