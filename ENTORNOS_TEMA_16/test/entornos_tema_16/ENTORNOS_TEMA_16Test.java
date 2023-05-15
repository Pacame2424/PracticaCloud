package entornos_tema_16;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ENTORNOS_TEMA_16Test {
    
    public ENTORNOS_TEMA_16Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        ENTORNOS_TEMA_16.main(args);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    @Test
    public void testSumar() {
        System.out.println("sumar");
        int num1 = 5;
        int num2 = 6;
        int expResult = 11;
        int result = ENTORNOS_TEMA_16.sumar(num1, num2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    @Test
    public void testRestar() {
        System.out.println("restar");
        int num1 = 22;
        int num2 = 5;
        int expResult = 17;
        int result = ENTORNOS_TEMA_16.restar(num1, num2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       //  fail("The test case is a prototype.");
    }

    @Test
    public void testMultiplicar() {
        System.out.println("multiplicar");
        int num1 = 4;
        int num2 = 3;
        int expResult = 12;
        int result = ENTORNOS_TEMA_16.multiplicar(num1, num2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       //  fail("The test case is a prototype.");
    }

    /**
     * Test of dividir method, of class ENTORNOS_TEMA_16.
     */
    @Test
    public void testDividir() {
        System.out.println("dividir");
        int num1 = 9;
        int num2 = 2;
        double expResult =4.5 ;
        double result = ENTORNOS_TEMA_16.dividir(num1, num2);
        assertEquals(expResult, result,0.001 );
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype."); TODOS LOS FAIL COMENTADOS.
    }
    
}
