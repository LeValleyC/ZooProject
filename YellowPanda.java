
/**
 * Write a description of class YellowPanda here.
 * 
 * @author Devin Mui
 * @version 1
 * period 3
 * @desc yellow panda
 */
public class YellowPanda extends Panda
{
    public YellowPanda()
    {
        super("Yellow Panda", "An even more Asian panda");
    }
    
      @Override
      public String interact()
      {
          System.out.println(super.eat());
          return "PLS GIMME MOAR BAMBOO";
      }
    
}

