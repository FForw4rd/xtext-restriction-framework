package generatedFromXtext;

import instanceModel.CopyInstruction;
import instanceModel.DoSomeOtherStuff;
import at.tugraz.model.impl.FunctionBlockRestrictionImpl;

/*
 * 
 * Maybe your Restriction is modeled in that way:
 * def FunctionBlockRestriction {
 *   ref DoSomeOtherStuff;
 *   check getCopyInstructions().size() > 2;
 *   check getXorInstruction() != null;
 * }
 * 
 * NOTE: This is just some brainfuck so feel free to change that.
 */
public class DoSomeOtherStuffRestriction extends FunctionBlockRestrictionImpl<DoSomeOtherStuff>
{
  @Override
  public void check(DoSomeOtherStuff param) {
    if(param.getCopyInstructions().size() > 2 &&
       param.getXorInstruction() != null) {
      for(CopyInstruction copy : param.getCopyInstructions()) {
        new CopyInstructionRestriction().check(copy);
      }
    }
    
    // Ugly but for demonstration ok ;)
    throw new IllegalArgumentException("Check failed!");
  }
}
