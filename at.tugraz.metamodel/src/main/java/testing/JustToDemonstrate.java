package testing;

import instanceModel.CopyInstruction;
import instanceModel.DoSomeOtherStuff;

import java.util.ArrayList;

import at.tugraz.model.FunctionBlock;
import at.tugraz.model.ModelFactory;
import at.tugraz.model.Parameter;
import at.tugraz.model.ParameterType;
import generatedFromXtext.FunctionRestrictionStrategy;

public class JustToDemonstrate
{
  public static void main(String[] args) {
    
    /** 
     * This Code is just for demonstration purposes:
     * You do not need to take care about how these things are created.
     * This is done by someone else. You just need to perform the restriction
     * tests i.e. you get the tree of classes iterate over it an apply the
     * checks.
     */
    Parameter input = ModelFactory.eINSTANCE.createParameter();
    Parameter output = ModelFactory.eINSTANCE.createParameter();
    
    input.setName("Input");
    input.setType(ParameterType.CONST);
    input.setValue(new byte[] {(byte) 0xCA, (byte) 0xFE});
    
    output.setName("Output");
    output.setType(ParameterType.DATA);
    output.setValue(new byte[] {(byte) 0x00, (byte) 0x00});
    
    CopyInstruction ins = new CopyInstruction();
    ins.setInput(input);
    ins.setOutput(output);
    
    
    DoSomeOtherStuff doSomeOtherStuff = new DoSomeOtherStuff();
    doSomeOtherStuff.addCopyInstruction(ins);
    
    ArrayList<FunctionBlock> blocks = new ArrayList<>();
    blocks.add(doSomeOtherStuff);
    
    FunctionRestrictionStrategy f = FunctionRestrictionStrategy.getInstance();
    
    for(FunctionBlock block : blocks) {
      f.performRestrictionsFor(block);
    }
    
  }
}
