
/**
 * Write a description of class FoxMccloud here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FoxMccloud extends SpaceFox
{
    public FoxMccloud()
    {
        super("FoxMccloud", "This is Fox McCloud, the leader of team Starfox.");
    }
    
      @Override
      public String fly()
      {
          System.out.println(super.fly());
          return "Fox jumps into the Arwing.";
      }
      @Override
      public String interact()
      {
          System.out.println(super.interact());
          return "You're here Fox.";
      }
      @Override
      public String walk()
      {
          System.out.println(super.walk());
          return "This is the year of 20XX.";
      }
      @Override
      public String swim()
      {
          System.out.println(super.swim());
          return "I usually don't swim, but when I do...";
      }
    
}
