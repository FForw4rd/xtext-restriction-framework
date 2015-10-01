package instanceModel;

import java.util.ArrayList;
import java.util.List;

import at.tugraz.model.impl.FunctionBlockImpl;

/*
 * This is generated from somewhere else e.g. a xtext dsl, or it could be
 * an instance model of emf / ecore
 * 
 * e.g. A xtext definition of that could look like this:
 * def FunctionBlock DoSomeOtherStuff {
 *   seq CopyInstruction;
 *   XorInstruction;
 * }
 * 
 * NOTE: This is just some brainfuck so feel free to change that.
 */
public class DoSomeOtherStuff extends FunctionBlockImpl
{
  public ArrayList<CopyInstruction> copyInstructions;
  public XorInstruction             xorInstruction;
  
  public DoSomeOtherStuff() {
    setName("DoSomeOtherStuff");
    copyInstructions = new ArrayList<CopyInstruction>();
  }
  
  public List<CopyInstruction> getCopyInstructions() {
    return copyInstructions;
  }
  
  public void addCopyInstruction(CopyInstruction copy) {
    copyInstructions.add(copy);
    getInstructions().add(copy);
  }
  
  public XorInstruction getXorInstruction() {
    return xorInstruction;
  }
  
  public void setXorInstruction(XorInstruction xor) {
    xorInstruction = xor;
    getInstructions().add(xor);
  }
  
}
