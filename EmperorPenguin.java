
/**
 * Write a description of class EmperorPenguin here.
 * 
Conner LeValley P3
v1.0
 */
public class EmperorPenguin extends Penguin
{
    public EmperorPenguin()
    {
        super("Emperor Penguin" , "This is Glen the Emperor Penguin");
    }
    
    @Override
    public String interact() {
        System.out.println(super.eat());
        return "ACK ACK \nEnglish: *Swears in Penguin Slang that degrades humans*";
    }
}
