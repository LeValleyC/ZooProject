
/**
 * Class of Dog, superclass of Huskie and subclass of Animal
 * 
 * @author Jaimie Jin, Period 3
 * @version Version 1.0, 3/23/17
 */
public class Dog extends Animal implements Walk
{
    private String toy;
    public Dog()
    {
        super("Dog", "This is just your average dog.");
        this.toy = "fancy ball";
    }

    public Dog(String species, String desc)
    {
        super(species, desc);
        toy = "ball";
    }
    
    public String interact() 
    {
        return "Play with me using " + toy;
    }
    public String makeNoise() 
    {
        return "BARK";
    }
    public String eat() 
    {
        return "MORE!!";
    }
    
    public String walk() 
    {
        return "The dog goes on a walk with you.";
    }
}
