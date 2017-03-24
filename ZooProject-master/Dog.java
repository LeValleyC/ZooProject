public class Dog extends Animal implements Swim, Walk
{
    private String toy;
    public Dog()
    {
        super("Dog", "This is just your average dog.");
        this.toy = "A Warriors Basketball";
    }
    //Pass-through constructor: it receives a species 
    // & description as parameters and just passes 
    // them straight up to the superclass to take care of
    
    public Dog(String species, String desc)
    {
        super(species, desc);
        toy = "ball";
    }

    public String interact() 
    {
        return "WOOF, do not touch my " + toy;
    }
    public String makeNoise() 
    {
        return "WOOOF";
    }
    public String eat() 
    {
        return "WOOF THIS IS DELICIOUS!";
    }
    
    public String fly()
    {
        return "The dog mutates and grows a pair of wings, and flies away";
    }
    public String swim()
    {
        return "The dog does a backstroke";
    }
    public String walk() 
    {
        return "The dog walks";
    }
}
