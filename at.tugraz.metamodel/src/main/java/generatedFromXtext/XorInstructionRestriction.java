package generatedFromXtext;

import instanceModel.XorInstruction;
import at.tugraz.model.ParameterType;
import at.tugraz.model.impl.InstructionRestrictionImpl;

/*
 * Maybe your Restriction is modeled in that way:
 * def InstructionRestriction {
 *   ref XorInstruction;
 *   check output == DATA;
 *   ...
 * }
 */
public class XorInstructionRestriction extends InstructionRestrictionImpl<XorInstruction>
{
  @Override
  public void check(XorInstruction param)
  {
    new TypeCheck(ParameterType.DATA).check(param.getOutput());
    // etc.
  }
}
