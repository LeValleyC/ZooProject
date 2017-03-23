
/**
 * Write a description of class Dolphin here.
 * 
 * @author Ethan Alcantara, Period 4
 * @version Version 1.0, 3/23/17
 */
public class Dolphin extends Animal implements Swim, Fly, Walk
{
    private String toy;
    //Default constructor
    public Dolphin()
    {
        super("Dolphin", "An average dolphin.");
    }    
    //Pass-through constructor
    public Dolphin(String species, String desc)
    {
        super(species, desc);
    }
    //inherited Animal methods
    public String eat(){
        return "The dolphin eats the fish you throw towards it.";
    }
    public String makeNoise(){
        return "*clicks*\n" + "*other dolphin noises*";
    }
    public String interact(){
        return "The dolphin splashes water on you.";
    }
    //interface methods
    public String swim(){
        return "The dolphin swims around.";
    }
    public String fly(){
        return "The dolphin leaps into the air and\n" + 
                "floats away into the sky";
    }
    public String walk(){
        return "Dolphins can't walk, that'd be creepy.";
    }
}
