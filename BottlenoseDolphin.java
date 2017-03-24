
/**
 * Write a description of class BottlenoseDolphin here.
 * 
 * @author Ethan Alcantara
 * @version Version 1.0, 3/23/17
 */
public class BottlenoseDolphin extends Dolphin
{
    //Constructor
    public BottlenoseDolphin()
    {
        super("Bottlenose Dolphin", "If it's a dolphin, it's probably a \n" +
                                    "bottlenose anyway", "beach ball");
    }

    @Override
    public String interact()
    {
        return "The bottlenose dolphin tells you about how it was taken \n" +
                "from its family and enslaved purely for the purpose of \n" +
                "entertaining humans. \n" +
                "You reply that it's a nice story.";
    }
    
    @Override
    public String walk(){
        return "The bottlenose dolphin grows legs and walks around \n" +
                "just because it can.";
    }
    
    public String play(){
        return "You throw the " + getToy() + " at the bottlenose dolphin and it \n" +
                "smacks it back at you.";
    }
}
