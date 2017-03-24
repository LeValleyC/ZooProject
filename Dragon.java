
/**
 * Write a description of class Dragon here.
 * 
 * Abigale Kim, 3rd period, Version 1
 * This is a Dragon class, which enables the user to create Dragon objects.
 * 
 */
public class Dragon extends Animal implements Walk, Fly
{
    private String toy;
    public Dragon()
    {
        super("Dragon", "This is just your average, 10 feet long, sometimes crazy dragon.");
        toy = "HUMAN FLESH";
    }
    public Dragon(String species, String desc)
    {
        super(species, desc);
        String a = species.toLowerCase();
        if (a.contains("chinese"))
        {
            toy = "Chinese dragons do not play with anything. They are celestial beings.";
        }
        else
        {
            toy = "HUMAN FLESH";
        }
    }
    public String interact()
    {
        String interactString;
        String a = getSpecies().toLowerCase();
        if (!a.contains("chinese"))
        {
            interactString = "It is late at night. You are running away from a loud\nroar heard from the distance. Suddenly, a large creature\npicks you up. In horror, you realize that it is a dragon.\nYou die. The end.";
        }
        else
        {
            interactString = "Chinese Dragons are divine mythical creatures that brings with it ultimate abundance, prosperity and good fortune.";
        }
        return interactString;
    }
    public String makeNoise()
    {
        return "ROARRRRR";
    }
    public String eat()
    {
        return "The dragon typically eats sheep, deer, cattle, fish, and of course, HUMAN FLESH.";
    }
    public String fly()
    {
        return "WHOOSH, WHOOSH. The dragon effortlessly lifts itself into the sky.";
    }
    public String walk()
    {
        return "STOMP STOMP.\nYeah... you should probably run.";
    }
    public String getInformation()
    {
        return "A dragon is a legendary creature, typically scaled or fire-spewing and with serpentine, \nreptilian or avian traits, that features in the myths of many cultures around world.";
    }
    public String taunt()
    {
        return "Catch me if you can!";
    }
}
