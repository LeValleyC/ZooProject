
/**
 * Write a description of class Panda here.
 * 
 * @author Devin Mui
 * @version 1
 * period 3
 * @desc panda
 */
public class Panda extends Animal implements Walk
{
    /**
     * Constructor for objects of class Panda
     */
    public String toy = null;
    public Panda()
    {
        super("Panda", "The Asian bear everyone likes");
        this.toy = "Bamboo";
    }

    public Panda(String species, String desc)
    {
        super(species, desc);
        this.toy = "Bamboo";
    }
    
    public String interact() 
    {
        return "*Shuffle*";
    }
    public String makeNoise() 
    {
        return "Whatever noise pandas make";
    }
    public String eat() 
    {
        return "*Munches on " + toy + "*";
    }
    
    public String walk() 
    {
        return "*Slowly walks away*";
    }
}
