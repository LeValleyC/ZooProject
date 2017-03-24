public class Cat extends Animal implements Walk
{
    private String toy;
    public Cat()
    {
        super("Cat", "This is just your average cat.");
        this.toy = "A 49ers Ball of String";
    }
    //Pass-through constructor: it receives a species 
    // & description as parameters and just passes 
    // them straight up to the superclass to take care of
    
    public Cat(String species, String desc)
    {
        super(species, desc);
        toy = "string";
    }
    public String interact() 
    {
        return "Meow, do not touch my " + toy;
    }
    public String makeNoise() 
    {
        return "Meeow";
    }
    public String eat() 
    {
        return "MEOW THIS IS DELICIOUS!";
    }
    
    public String fly()
    {
        return "The cat mutates and grows a pair of wings, and flies away";
    }
    public String swim()
    {
        return "The cat does a backstroke";
    }
    public String walk() 
    {
        return "The cat walks";
    }
}
