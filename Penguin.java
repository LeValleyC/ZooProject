
/**
 * Write a description of class Penguin here.
 * 
Conner LeValley
v1.0
 */
public class Penguin extends Animal implements Walk, Swim
{
    private String toy;
    public Penguin()
    {
        super("Penguin", "The simple penguin waddles through its meaningless life...");
        this.toy = "A Rubber Fish";
    }
    public Penguin(String species, String desc)
    {
        super(species, desc);
        toy = "A Rubber Fish";
    }
    public String interact() 
    {
        return "ACK ACK English: Dont touch my " + toy+ "!";
    }
    public String makeNoise() 
    {
        return "ACK";
    }
    public String eat() 
    {
        return "The penguin decides to eat a raw fish";
    }
    
    public String walk() 
    {
        return "The penguin waddles and falls and just lays there";
    }
    public String swim() {
        return "The penguin dives into the cold artic water";
    }
}
