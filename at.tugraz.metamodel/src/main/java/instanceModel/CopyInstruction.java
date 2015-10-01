package instanceModel;

import org.eclipse.emf.common.util.EList;

import at.tugraz.model.Parameter;
import at.tugraz.model.impl.GenericInstructionImpl;

/*
 * This is generated from somewhere else e.g. a xtext dsl, or it could be
 * an instance model of emf / ecore
 * 
 * e.g. A xtext definition of that could look like this:
 * def GenericInstruction CopyInstruction {
 *   insNr = 47;
 *   params = {output, input};
 * }
 * 
 * NOTE: This is just some brainfuck so feel free to change that.
 */
public class CopyInstruction extends GenericInstructionImpl {
  private Parameter output;
  private Parameter input;
  
  public CopyInstruction() {
    insNr = 17; // What ever
  }
  
  public void setInput(Parameter input) {
    this.input = input;
  }
  
  public Parameter getInput() {
    return input;
  }
  
  public void setOutput(Parameter output) {
    this.output = output;
  }
  
  public Parameter getOutput() {
    return output;
  }
  
  @Override
  public EList<Parameter> getParams()
  {
    EList<Parameter> params = super.getParams();
    params.clear(); // Could have been altered in the meantime..
    
    params.add(output);
    params.add(input);
    return params;
  }
}
