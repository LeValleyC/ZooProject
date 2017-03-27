
/**
 * Write a description of class Mouse here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mouse extends Animal
{
    private String toy;
    public Mouse()
    {
        //super() is implicitly called if no other
        //super call is explicitly called.
        //MUST BE THE FIRST LINE IN THE CONSTRUCTORS
        super("Mouse", "This mouse will kill you!");
        //calls the superclass's constructor
        
        //this.species = species;  //these don't work
        //this.desc = desc;        //because we don't have access
                                   //to private members of
                                   //the superclass
        //Toy that default bears have
        this.toy = "Thunderbolt' QuickAttack";
    }
    
    //Pass-through constructor: it receives a species 
    // & description as parameters and just passes 
    // them straight up to the superclass to take care of
    public Mouse(String species, String desc)
    {
        super(species, desc);
        toy = "Chuu";
    }
    
    public String interact() 
    {
        return "PIIIKKKKAAAA" + toy;
    }
    public String makeNoise() 
    {
        return "Pika pi";
    }
    public String eat() 
    {
        return "chaa";
    }
    
    public String fly()
    {
        return "The mouse might attack you\n" +
                "While you touch it.";
    }
    
    public String walk() 
    {
        return "Pika Pika";
    }
}
