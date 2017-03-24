
/**
 * Write a description of class Fish here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fish extends Animal
{
     private String toy;
    public Fish()
    {
        //super() is implicitly called if no other
        //super call is explicitly called.
        //MUST BE THE FIRST LINE IN THE CONSTRUCTORS
        super("Fish", "This is just your average fish.");
        //calls the superclass's constructor
        
        //this.species = species;  //these don't work
        //this.desc = desc;        //because we don't have access
                                   //to private members of
                                   //the superclass
        //Toy that default bears have
        this.toy = "A Jesus net";
    }
    
    //Pass-through constructor: it receives a species 
    // & description as parameters and just passes 
    // them straight up to the superclass to take care of
    public Fish(String species, String desc)
    {
        super(species, desc);
        toy = "Jesus net";
    }
    
    public String interact() 
    {
        return "SPLASH, do not touch my " + toy;
    }
    public String makeNoise() 
    {
        return "SPLASH";
    }
    public String eat() 
    {
        return "SPLASH THIS IS DELICIOUS!";
    }
    
    public String fly()
    {
        return "The fish is touched by Jesus and flies away\n" +
                "while Silent Night plays in the background.";
    }
    
    public String swim() 
    {
        return "The fish swims to its holy father.";
    }
    
}
