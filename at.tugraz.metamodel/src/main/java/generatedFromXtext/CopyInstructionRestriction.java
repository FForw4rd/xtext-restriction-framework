package generatedFromXtext;

import instanceModel.CopyInstruction;
import at.tugraz.model.impl.InstructionRestrictionImpl;

/*
 * How you really do this is up to you, but in fact you could generate something
 * like that (although that is not really model based, but hey I am open for
 * everything :))
 */
public class CopyInstructionRestriction extends InstructionRestrictionImpl<CopyInstruction>
{
  @Override
  public void check(CopyInstruction param)
  {
    new NoSecretTypeCheck().check(param.getInput());
    new NoSecretTypeCheck().check(param.getOutput());
  }
}
