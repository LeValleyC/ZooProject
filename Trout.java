
/**
 * Write a description of class Trout here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Trout extends Fish
{  public Trout()
    {
        super("Jesus Disciple", "This is a holy fish that has been graced by god. Pray to the fish master.");
    }
    
      @Override
      public String interact()
      {
          System.out.println(super.eat());
          return "The fish drinks from the cup.";
      }
}
