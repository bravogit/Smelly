/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proval;

import java.util.Collection;
import java.util.Iterator;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Eddy
 */
public class ProvaLTest {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    /**
     * Test of main method, of class ProvaL.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        ProvaL.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addFirst method, of class ProvaL.
     */
    @Test
    public void testAddFirst() {
        System.out.println("addFirst");
        Object e = null;
        ProvaL instance = new ProvaL();
        instance.addFirst(e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addLast method, of class ProvaL.
     */
    @Test
    public void testAddLast() {
        ProvaL l = new ProvaL();
        l.addLast("Uno");
        assertEquals("Puntatori dal primo al nuovo elemento elemento.",l.next.prev.next.prev.nome,"Uno");
        assertEquals("Puntatori dal penultimo al nuovo elemento elemento.",l.next.prev.prev.next.nome,"Uno");
    }

    /**
     * Test of offerFirst method, of class ProvaL.
     */
    @Test
    public void testOfferFirst() {
        System.out.println("offerFirst");
        Object e = null;
        ProvaL instance = new ProvaL();
        boolean expResult = false;
        boolean result = instance.offerFirst(e);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of offerLast method, of class ProvaL.
     */
    @Test
    public void testOfferLast() {
        System.out.println("offerLast");
        Object e = null;
        ProvaL instance = new ProvaL();
        boolean expResult = false;
        boolean result = instance.offerLast(e);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeFirst method, of class ProvaL.
     */
    @Test
    public void testRemoveFirst() {
        System.out.println("removeFirst");
        ProvaL instance = new ProvaL();
        Object expResult = null;
        Object result = instance.removeFirst();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeLast method, of class ProvaL.
     */
    @Test
    public void testRemoveLast() {
        System.out.println("removeLast");
        ProvaL instance = new ProvaL();
        Object expResult = null;
        Object result = instance.removeLast();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pollFirst method, of class ProvaL.
     */
    @Test
    public void testPollFirst() {
        System.out.println("pollFirst");
        ProvaL instance = new ProvaL();
        Object expResult = null;
        Object result = instance.pollFirst();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pollLast method, of class ProvaL.
     */
    @Test
    public void testPollLast() {
        System.out.println("pollLast");
        ProvaL instance = new ProvaL();
        Object expResult = null;
        Object result = instance.pollLast();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFirst method, of class ProvaL.
     */
    @Test
    public void testGetFirst() {
        System.out.println("getFirst");
        ProvaL instance = new ProvaL();
        Object expResult = null;
        Object result = instance.getFirst();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLast method, of class ProvaL.
     */
    @Test
    public void testGetLast() {
        System.out.println("getLast");
        ProvaL instance = new ProvaL();
        Object expResult = null;
        Object result = instance.getLast();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of peekFirst method, of class ProvaL.
     */
    @Test
    public void testPeekFirst() {
        System.out.println("peekFirst");
        ProvaL instance = new ProvaL();
        Object expResult = null;
        Object result = instance.peekFirst();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of peekLast method, of class ProvaL.
     */
    @Test
    public void testPeekLast() {
        System.out.println("peekLast");
        ProvaL instance = new ProvaL();
        Object expResult = null;
        Object result = instance.peekLast();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeFirstOccurrence method, of class ProvaL.
     */
    @Test
    public void testRemoveFirstOccurrence() {
        System.out.println("removeFirstOccurrence");
        Object o = null;
        ProvaL instance = new ProvaL();
        boolean expResult = false;
        boolean result = instance.removeFirstOccurrence(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeLastOccurrence method, of class ProvaL.
     */
    @Test
    public void testRemoveLastOccurrence() {
        System.out.println("removeLastOccurrence");
        Object o = null;
        ProvaL instance = new ProvaL();
        boolean expResult = false;
        boolean result = instance.removeLastOccurrence(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class ProvaL.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Object e = null;
        ProvaL instance = new ProvaL();
        boolean expResult = false;
        boolean result = instance.add(e);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of offer method, of class ProvaL.
     */
    @Test
    public void testOffer() {
        System.out.println("offer");
        Object e = null;
        ProvaL instance = new ProvaL();
        boolean expResult = false;
        boolean result = instance.offer(e);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class ProvaL.
     */
    @Test
    public void testRemove_0args() {
        System.out.println("remove");
        ProvaL instance = new ProvaL();
        Object expResult = null;
        Object result = instance.remove();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of poll method, of class ProvaL.
     */
    @Test
    public void testPoll() {
        System.out.println("poll");
        ProvaL instance = new ProvaL();
        Object expResult = null;
        Object result = instance.poll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of element method, of class ProvaL.
     */
    @Test
    public void testElement() {
        System.out.println("element");
        ProvaL instance = new ProvaL();
        Object expResult = null;
        Object result = instance.element();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of peek method, of class ProvaL.
     */
    @Test
    public void testPeek() {
        System.out.println("peek");
        ProvaL instance = new ProvaL();
        Object expResult = null;
        Object result = instance.peek();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of push method, of class ProvaL.
     */
    @Test
    public void testPush() {
        System.out.println("push");
        Object e = null;
        ProvaL instance = new ProvaL();
        instance.push(e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pop method, of class ProvaL.
     */
    @Test
    public void testPop() {
        System.out.println("pop");
        ProvaL instance = new ProvaL();
        Object expResult = null;
        Object result = instance.pop();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class ProvaL.
     */
    @Test
    public void testRemove_Object() {
        System.out.println("remove");
        Object o = null;
        ProvaL instance = new ProvaL();
        boolean expResult = false;
        boolean result = instance.remove(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of contains method, of class ProvaL.
     */
    @Test
    public void testContains() {
        System.out.println("contains");
        Object o = null;
        ProvaL instance = new ProvaL();
        boolean expResult = false;
        boolean result = instance.contains(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of size method, of class ProvaL.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        ProvaL instance = new ProvaL();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of iterator method, of class ProvaL.
     */
    @Test
    public void testIterator() {
        System.out.println("iterator");
        ProvaL instance = new ProvaL();
        Iterator expResult = null;
        Iterator result = instance.iterator();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of descendingIterator method, of class ProvaL.
     */
    @Test
    public void testDescendingIterator() {
        System.out.println("descendingIterator");
        ProvaL instance = new ProvaL();
        Iterator expResult = null;
        Iterator result = instance.descendingIterator();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isEmpty method, of class ProvaL.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        ProvaL instance = new ProvaL();
        boolean expResult = false;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toArray method, of class ProvaL.
     */
    @Test
    public void testToArray_0args() {
        System.out.println("toArray");
        ProvaL instance = new ProvaL();
        Object[] expResult = null;
        Object[] result = instance.toArray();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toArray method, of class ProvaL.
     */
    @Test
    public void testToArray_ObjectArr() {
        System.out.println("toArray");
        Object[] a = null;
        ProvaL instance = new ProvaL();
        Object[] expResult = null;
        Object[] result = instance.toArray(a);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of containsAll method, of class ProvaL.
     */
    @Test
    public void testContainsAll() {
        System.out.println("containsAll");
        Collection c = null;
        ProvaL instance = new ProvaL();
        boolean expResult = false;
        boolean result = instance.containsAll(c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addAll method, of class ProvaL.
     */
    @Test
    public void testAddAll() {
        System.out.println("addAll");
        Collection c = null;
        ProvaL instance = new ProvaL();
        boolean expResult = false;
        boolean result = instance.addAll(c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeAll method, of class ProvaL.
     */
    @Test
    public void testRemoveAll() {
        System.out.println("removeAll");
        Collection c = null;
        ProvaL instance = new ProvaL();
        boolean expResult = false;
        boolean result = instance.removeAll(c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of retainAll method, of class ProvaL.
     */
    @Test
    public void testRetainAll() {
        System.out.println("retainAll");
        Collection c = null;
        ProvaL instance = new ProvaL();
        boolean expResult = false;
        boolean result = instance.retainAll(c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of clear method, of class ProvaL.
     */
    @Test
    public void testClear() {
        System.out.println("clear");
        ProvaL instance = new ProvaL();
        instance.clear();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class ProvaL.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        ProvaL instance = new ProvaL();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
