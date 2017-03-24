
/**
 * Write a description of class Panda here.
 * 
 * @author Devin Mui
 * @version 1
 * period 3
 * @desc panda
 */
public class Flea extends Animal implements Fly
{
    /**
     * Constructor for objects of class Panda
     */
    public String toy = null;
    public Flea()
    {
        super("Panda", "The Asian bear everyone likes");
        this.toy = "Dogs";
    }

    public Flea(String species, String desc)
    {
        super(species, desc);
        this.toy = "Dogs";
    }
    
    public String interact() 
    {
        return "*Buzz*";
    }
    public String makeNoise() 
    {
        return "Buzzzz";
    }
    public String eat() 
    {
        return "*Eats " + toy + "*";
    }
    
    public String fly() 
    {
        return "*buzz buzz buzzzzz*";
    }
}
