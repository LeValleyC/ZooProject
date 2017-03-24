
/**
 * Write a description of class AnimalTester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AnimalTester
{
    public static void main(String[] args) 
    {
        Animal b = new CircusBear();
        Animal panda = new YellowPanda();
        System.out.println(panda.interact());
        
        b.interact();
    }
}
