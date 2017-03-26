
/**
 * Write a description of class FoxMccloud here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CuteRabbit extends Rabbit
{
    public CuteRabbit()
    {
        super("CuteRabbit", "This is a cute bunny.\n" +
                                "It is cute, but lazy.");
    }
    
      @Override
      public String fly()
      {
          System.out.println(super.fly());
          return "The bunny accidently presses the red button.";
      }
      @Override
      public String interact()
      {
          System.out.println(super.interact());
          return "Hi bunny!";
      }
      @Override
      public String walk()
      {
          System.out.println(super.walk());
          return "The rabbit heads toward the carrot.";
      }
      @Override
      public String swim()
      {
          System.out.println(super.swim());
          return "It's a river.";
      }
    
}
