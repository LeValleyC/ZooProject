
/**
 * Write a description of class SpaceFox here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SpaceFox extends Animal implements Fly, Walk, Swim
{
    private String toy;
    public SpaceFox()
    {
        //super() is implicitly called if no other
        //super call is explicitly called.
        //MUST BE THE FIRST LINE IN THE CONSTRUCTORS
        super("Fox", "This is no ordinary Fox.");
        //calls the superclass's constructor
        
        //this.species = species;  //these don't work
        //this.desc = desc;        //because we don't have access
                                   //to private members of
                                   //the superclass
        //Toy that default bears have
        this.toy = "Fire";
    }
    
    //Pass-through constructor: it receives a species 
    // & description as parameters and just passes 
    // them straight up to the superclass to take care of
    public SpaceFox(String species, String desc)
    {
        super(species, desc);
        toy = "Fire!";
    }
    
    public String interact() 
    {
        return "This is Fox Mccloud reporting for duty. " + toy;
    }
    public String makeNoise() 
    {
        return "WHAT DOES THE FOX SAY!?!?\nRING DING DING DING DING DING-DING DING-DING";
    }
    public String eat() 
    {
        return "(stomach grumbling)I sense a disturbance in the force.";
    }
    
    public String fly()
    {
        return "This is Starfox returning to base\n" +
                "while Harambe jumps over the moon.";
    }
    
    public String walk() 
    {
        return "Come on.";
    }
    
    public String swim()
    {
        return "Oxygen is over rated.";
    }
}
