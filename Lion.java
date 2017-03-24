
/**
 * Class Bear Description.
 * 
 * @author Akshit Mehta, Period 3
 * @version Version 1.0, 3/24/17
 */
public class Lion extends Animal implements Fly, Walk
{
    private String toy;
    public Lion()
    {
        super("Lion", "This is Fox loves your food at the park.");      
        this.toy = "Rabbit stuff toy";
    }
    
   
    public Lion(String species, String desc)
    {
        super(species, desc);
        toy = "Rabbit";
    }
    
    public String interact() 
    {
        return " " + toy;
    }
    public String makeNoise() 
    {
        return "RAWWR";
    }
    public String eat() 
    {
        return "RAWR THIS HUMAN IS DELICIOUS!";
    }
    
    public String fly()
    {
        return "The Tiger slaps on its Wings and flies away\n" +
                "while Iron Man plays in the background.";
    }
    
    public String walk() 
    {
        return "The Tiger dances to THE EYE OF A TIGER.";
    }
}
    