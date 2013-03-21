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
public class CilindroTest {
    
    @Test
    public void testCilindro() {
        System.out.println("Cilindro.");
        Cilindro c = new Cilindro();
        c.setAltezza(2.0f);
        c.setRaggio(7.0f);
        assertEquals(395.8f,c.getArea(),0.1);
        assertEquals(307.8f,c.getVolume(),0.1);
    }
}
