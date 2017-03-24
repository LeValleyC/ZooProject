
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
        b.interact();
        BottlenoseDolphin d = new BottlenoseDolphin();
        System.out.println(d.interact());
    }
}
