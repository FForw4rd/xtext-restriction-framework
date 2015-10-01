package generatedFromXtext;

import instanceModel.DoSomeOtherStuff;
import instanceModel.DoSomeStuff;

import java.util.HashMap;
import java.util.Map;

import at.tugraz.model.FunctionBlock;
import at.tugraz.model.FunctionBlockRestriction;

/*
 * How you really do this is up to you, but in fact you could generate something
 * like that (although that is not really model based, but hey I am open for
 * everything :))
 */
public class FunctionRestrictionStrategy
{
  private static FunctionRestrictionStrategy instance = new FunctionRestrictionStrategy();
  private static Map<Class<? extends FunctionBlock>, FunctionBlockRestriction<? extends FunctionBlock>> restrictions_;
  
  private FunctionRestrictionStrategy() {
    restrictions_ = new HashMap<Class<? extends FunctionBlock>, FunctionBlockRestriction<? extends FunctionBlock>>();
  
    restrictions_.put(DoSomeStuff.class, new DoSomeStuffRestriction());
    restrictions_.put(DoSomeOtherStuff.class, new DoSomeOtherStuffRestriction());
  }
  
  public static FunctionRestrictionStrategy getInstance() {
    return instance;
  }
  
  @SuppressWarnings("unchecked")
  public <T extends FunctionBlock> void performRestrictionsFor(T clazz) {
    FunctionBlockRestriction<T> block = (FunctionBlockRestriction<T>)restrictions_.get(clazz.getClass());
    
    // associated 
    if(block == null) {
      System.out.println("Wuhu nothing to check :)");
      return;
    }
    
    System.out.println("Performing nice checks!");
    block.check(clazz);
  }
}
