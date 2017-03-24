
/**
 * Write a description of class Husky here.
 * 
 * @author Ana Vukojevic P.03 
 * @version 1.0
 */
public class Husky extends Dog
{
    // instance variables - replace the example below with your own

    /**
     * Constructor for objects of class Husky
     */
    public Husky()
    {
        super("Husky", "This husky enjoys running around and \n" +
                        "playing with toys");
    }

    @Override
    public String interact()
    {
        System.out.println(super.eat());
        return "The husky barks happily at you";
    }
}
