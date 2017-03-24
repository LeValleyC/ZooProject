
/**
 * Class Snake Description.
 * 
 * @author James Wang, Period 3
 * @version Version 1.0, 3/23/17
 */

public class Snake extends Animal implements Swim, Fly, Walk

{
    private String toy;
    public Snake()
    {
        super("Dolphin", "I'm Reporting You");
        this.toy = "Tattletale";
    }    

    public Snake(String species, String desc)
    {
        super(species, desc);
        toy = "k";
    }

    public String makeNoise(){
        return "The snake has summoned the supersnake.";
    }

    public String eat(){
        return "The snake eats in your confessions";
    }

    public String interact(){
        return "The snake is recording you.";
    }

    public String walk(){

        return "The snake walks around.";

    }

    public String fly(){

        return "The snake is flying to the national capitol.";

    }

    public String swim(){
        return "The snake is swimming into your nightmares.";
    }

}