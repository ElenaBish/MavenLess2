import static org.junit.Assert.*;


import org.junit.Test;
import testproject.Kub;

/**
 * Created by elena on 31.03.2017.
 */
public class TestKub {

    @Test
    public void EqualTest(){
        Kub kub = new Kub(10.0d, 10.0d, 10.0d, "Red");
        Kub kub2 = new Kub(10.0d, 10.0d, 10.0d, "Red");
        //System.out.println(kub.equals(kub2));
        assertEquals(kub,kub2);

    }





}
