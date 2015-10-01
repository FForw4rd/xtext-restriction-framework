package generatedFromXtext;

import at.tugraz.model.Parameter;
import at.tugraz.model.ParameterType;
import at.tugraz.model.impl.ParameterRestrictionImpl;

public class NoSecretTypeCheck extends ParameterRestrictionImpl
{
  
  @Override
  public void check(Parameter param)
  {
    if(param.getType() == ParameterType.SECRET)
      throw new RuntimeException("Error the parameter is not allowed to be of type secret!");
  }
}
