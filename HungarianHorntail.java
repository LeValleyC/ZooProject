
/**
 * Write a description of class HungarianHorntail here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HungarianHorntail extends Dragon implements Fly, Walk
{
    private String name;
    public HungarianHorntail()
    {
        super("Hungarian Horntail", "This fictional dragon is found in the PotterVerse, and is incredibly dangerous.");
        name = "unidentified";
    }
    public HungarianHorntail(String name1)
    {
        super("Hungarian Horntail", "This fictional dragon is found in the PotterVerse, and is incredibly dangerous.");
        name = name1;
    }
    public String interact()
    {
        String interactString;
        interactString = name + ", the Hungarian Horntail ferociously chases after you. Since the dragon\ncan fly at 150 mph, you are likely to be dead in a matter of minutes.\nThey are vicious, aggressive, and nasty. GOOD LUCK.";
        return interactString;
    }
    public String makeNoise()
    {
        return "ROARRRRR, the Hungarian Horntail SCREECHHESSS";
    }
    public String eat()
    {
        return "The Hungarian Horntail typically eats sheep, goats, cattle, and of course, HUMAN FLESH.";
    }
    public String fly()
    {
        return "WHOOSH, WHOOSH. " + name + " effortlessly lifts itself into the sky.";
    }
    public String walk()
    {
        return "STOMP STOMP.\nYeah... you should probably run.";
    }
    public String getInformation()
    {
        return "The Hungarian Horntail has yellow eyes and a black hide. It is \nnative to Hungary, and the average length of one is 50 feet long. It is \nknown because Harry Potter fought one during the 1994 Triwizard Tournament.\nHorntails are extremely fast in their flight and aggressive when protecting\ntheir young. Their eggs are cement colored and hard-shelled. They can travel\nat 150 mph and their flames can reach 50 feet.";
    }
    public String taunt()
    {
        return "Hi, " + name + ", I'm here to fight you ;)";
    }
}
