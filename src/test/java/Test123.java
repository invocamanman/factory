import org.junit.Before;
import org.junit.Test;

public class Test123 {

    @Test
    public void testcommand(){

        try {
            Factory.getInstance().getCommand("C1").execute();
            Factory.getInstance().getCommand("C1").execute();
            Factory.getInstance().getCommand("C2").execute();
            Factory.getInstance().getCommand("HOLAAA").execute();
        }
        catch(NullPointerException e){
            System.out.println("esto NO es c1 ni c2 ni c3 ni c4 D:");
        }

    }

}
