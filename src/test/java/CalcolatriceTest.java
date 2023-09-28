import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class CalcolatriceTest {

    Calcolatrice calcolatrice;

    @Before
    public final void setUp(){
        calcolatrice = new Calcolatrice();
    }

    @Test
    public void TestSomma(){
        assertTrue("somma corretta", calcolatrice.somma(11,1) == 12);
    }

    @Test
    public void TestMoltiplicazione(){
        assertTrue("moltiplicazione corretta", calcolatrice.moltiplicazione(10,2)==20);
    }

    @Test
    public void TestSottrazione(){
        assertTrue("sottrazione corretta", calcolatrice.sottrazione(5, 3)==2);
    }

    @Test
    public void TestDivisione(){
        assertTrue("divisione corretta", calcolatrice.sottrazione(10, 2)==5);
    }

    @Test
    public void TestDivisionePerZero(){
        assertTrue("divisione corretta", calcolatrice.sottrazione(5, 0)==0);
    }

}
