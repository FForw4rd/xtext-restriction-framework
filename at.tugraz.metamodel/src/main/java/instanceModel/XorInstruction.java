package instanceModel;

import org.eclipse.emf.common.util.EList;

import at.tugraz.model.Parameter;
import at.tugraz.model.impl.GenericInstructionImpl;

/*
 * This is generated from somewhere else e.g. a xtext dsl, or it could be
 * an instance model of emf / ecore
 * 
 * e.g. A xtext definition of that could look like this:
 * def GenericInstruction XorInstruction {
 *   insNr = 32;
 *   params = {output, left, right};
 * }
 * 
 * NOTE: This is just some brainfuck so feel free to change that.
 */
public class XorInstruction extends GenericInstructionImpl
{
  private Parameter output;
  private Parameter left;
  private Parameter right;
  
  public XorInstruction() {
    insNr = 32; // What ever
  }
  
  public void setLeft(Parameter input) {
    this.left = input;
  }
  
  public Parameter getLeft() {
    return left;
  }
  
  public void setRight(Parameter input) {
    this.right = input;
  }
  
  public Parameter getRight() {
    return right;
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
    params.add(left);
    params.add(right);
    return params;
  }
}
