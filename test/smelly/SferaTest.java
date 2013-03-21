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
public class SferaTest {
    
    @Test
    public void testSfera() {
        System.out.println("Sfera.");
        Sfera s = new Sfera();
        s.setRaggio(5.3f);
        assertEquals(352.9f,s.getArea(),0.1);
        assertEquals(467.7f,s.getVolume(),0.1);
    }
}
