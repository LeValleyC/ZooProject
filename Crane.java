/**
 * Class of Crane, subclass of Bird
 * 
 * @author Jaimie Jin, Period 3
 * @version Version 1.0, 3/23/17
 */
public class Crane extends Bird
{
    public Crane()
    {
        super("Steven", "This is a free bird that \n" +
                                "comes and go at his own will.");
    }
    
      @Override
      public String interact()
      {
          System.out.println(super.eat());
          return "The crane would rather get its own food.";
      }
    
}
