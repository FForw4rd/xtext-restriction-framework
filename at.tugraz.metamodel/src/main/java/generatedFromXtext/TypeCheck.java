package generatedFromXtext;

import at.tugraz.model.Parameter;
import at.tugraz.model.ParameterType;
import at.tugraz.model.impl.ParameterRestrictionImpl;

public class TypeCheck extends ParameterRestrictionImpl
{
  private ParameterType t;
  
  public TypeCheck(ParameterType t) {
    this.t = t;
  }
  
  @Override
  public void check(Parameter param)
  {
    if(param.getType() != t)
      throw new RuntimeException("Error parameter type should be " + t.toString());
  }
}
