
/**
 * Write a description of class Pikachu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pikachu extends Mouse
{
    public Pikachu()
    {
        super("Ursus Circusus", "Pikachu is bery emotional\n" +
                                "with all the problems it faces.");
    }
    
      @Override
      public String interact()
      {
          System.out.println(super.eat());
          return "Pikachu is judging you!";
      }
}
