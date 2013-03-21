/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package smelly;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author Eddy
 */
public class CerchioTest {
    
    @Test
    public void testCerchio() {
        System.out.println("Cerchio.");
        Cerchio c = new Cerchio();
        c.setRaggio(2.2f);
        assertEquals(15.2f,c.getArea(),0.1);
    }
}
