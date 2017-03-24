
/**
 * Write a description of class Labrador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Labrador extends Dog
{
    public Labrador()
    {
        super("Retreverus Laboradorus", "This is a fat dog that \n" +
                                        "eats all day.");
    }
    
    @Override
    public String interact()
    {
        System.out.println(super.swim());
        return "The dog sinks because it is too fat.";
    }
}