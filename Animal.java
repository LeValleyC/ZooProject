
/**
 * The Animal class for the whole Zoo
 */
public abstract class Animal
{
    private String species;
    private String desc;

    //public Animal() {}   This is a constructor this is autogenerated
    //IFF no other constructors have been defined in the class, 
    //public or private
    
    /**
     * Constructor for Animal that accepts species & desc
     */
    public Animal(String species, String desc)
    {
        //calls the constructor of the superclass
        this.species = species;
        this.desc = desc;
    }
    
    //Getters
    public String getSpecies()
    {
        return species;
    }
    
    public String getDesc() 
    {
        return desc;
    }
    
    //Remaining methods are abstract
    public abstract String eat();
    public abstract String makeNoise();
    public abstract String interact();

}