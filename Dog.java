
/**
 * Write a description of class Dog here.
 * 
 * @author Ana Vukojevic P.03
 * @version 1.0
 */
public class Dog extends Animal implements Walk, Swim
{
    // instance variables - replace the example below with your own
    private String toy;

    /**
     * Constructor for objects of class Dog
     */
    public Dog()
    {
        // initialise instance variables
        super("Dog", "This is just an average dog.");
        this.toy = "A bone";
    }

    public Dog(String species, String desc)
    {
        super(species, desc);
        toy = "bone";
    }
    
    public String interact()
    {
        return "The dog licks your hand and barks happily";
    }
    
    public String makeNoise()
    {
        return "WOOF";
    }
    public String eat() 
    {
        return "WOOF WOOF!";
    }
    
    public String walk()
    {
        return "The dog runs around the backyard, chasing his tail";
    }
    
    public String swim()
    {
        return "The dog jumps in the pool and swims around";
    }
}
