/**
 * Class of Bird, superclass of Crane and subclass of Animal
 * 
 * @author Jaimie Jin, Period 3
 * @version Version 1.0, 3/23/17
 */
public class Bird extends Animal implements Fly, Swim
{
    private String toy;
    public Bird()
    {
        super("Bird", "This is just your average bird.");
        this.toy = "pretty wing";
    }

    public Bird(String species, String desc)
    {
        super(species, desc);
        toy = "feather";
    }
    
    public String interact() 
    {
        return "Give me " + toy + " and let me leave";
    }
    public String makeNoise() 
    {
        return "CAW";
    }
    public String eat() 
    {
        return "FISH!!";
    }
    
    public String fly() 
    {
        return "The bird leaves you behind";
    }
    
    public String swim() 
    {
        return "The bird does a dive.";
    }
}