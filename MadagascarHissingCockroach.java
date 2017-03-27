
/**
 * Write a description of class MadagascarHissingCockroach here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MadagascarHissingCockroach extends Cockroach
{
    public MadagascarHissingCockroach()
    {
        super("MadagascarHissingCockroach", "MadagascarHissingCockroach is from Madagaskar");
    }
    
      @Override
      public String interact()
      {
          //System.out.println(super.eat());
          return "MadagascarHissingCockroach is full";
      }
}
