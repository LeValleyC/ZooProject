
/**
 * Write a description of class Cockroach here.
 *
 * @author Pranav Konduru, Period 4
 * @version Version 4.0.0, 3/24/2017
 */
public class Cockroach extends Animal implements Fly, Walk
{
    private String toy;

    public Cockroach()
    {
        super("Cockroach", "This cockroach likes to have fun");
        toy = "Flea stuff toy";
    }
    
    public Cockroach(String species, String desc)
    {
        super(species, desc);
        toy = "Flea";
    }

    public String interact()
    {
        return toy;
    }
    
    public String fly()
    {
        return "The cockroach used its wings to fly away from the rat.";
    }
    
    public String makeNoise()
    {
        return "NOISE!!!";
    }
    
    public String eat()
    {
        return "The cockroach likes to eat worms.";
    }
    
    public String walk()
    {
        return "The cockroach walked up the wall.";
    }
}
