
/**
 * Write a description of class SpaceFox here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rabbit extends Animal implements Fly, Walk, Swim
{
    private String toy;
    public Rabbit()
    {
        //super() is implicitly called if no other
        //super call is explicitly called.
        //MUST BE THE FIRST LINE IN THE CONSTRUCTORS
        super("Rabbit", "This is just your average Rabbit.");
        //calls the superclass's constructor
        
        //this.species = species;  //these don't work
        //this.desc = desc;        //because we don't have access
                                   //to private members of
                                   //the superclass
        //Toy that default bears have
        this.toy = "Carrot";
    }
    
    //Pass-through constructor: it receives a species 
    // & description as parameters and just passes 
    // them straight up to the superclass to take care of
    public Rabbit(String species, String desc)
    {
        super(species, desc);
        toy = "Orange Carrot";
    }
    
    public String interact() 
    {
        return "Please give me a " + toy;
    }
    public String makeNoise() 
    {
        return "...";
    }
    public String eat() 
    {
        return "Nibble nibble.";
    }
    
    public String fly()
    {
        return "The bunny ejected out of the cage" +
                " right outta compton college.";
    }
    
    public String walk() 
    {
        return "Hop. Hop";
    }
    
    public String swim()
    {
        return "Don't.";
    }
}
