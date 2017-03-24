
/**
 * Class of Huskie, subclass of Dog
 * 
 * @author Jaimie Jin, Period 3
 * @version Version 1.0, 3/23/17
 */
public class Huskie extends Dog
{
    public Huskie()
    {
        super("Tundra", "This is a retired sled dog that lazes \n" +
                                "around all day long.");
    }
    
      @Override
      public String interact()
      {
          System.out.println(super.eat());
          return "The dog wants more.";
      }
    
}
