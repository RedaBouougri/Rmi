/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author redab
 */
public class MachineTest {
    
    public MachineTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getId method, of class Machine.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Machine instance = new Machine();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Machine.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Machine instance = new Machine();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRef method, of class Machine.
     */
    @Test
    public void testGetRef() {
        System.out.println("getRef");
        Machine instance = new Machine();
        String expResult = "";
        String result = instance.getRef();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRef method, of class Machine.
     */
    @Test
    public void testSetRef() {
        System.out.println("setRef");
        String ref = "";
        Machine instance = new Machine();
        instance.setRef(ref);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMarque method, of class Machine.
     */
    @Test
    public void testGetMarque() {
        System.out.println("getMarque");
        Machine instance = new Machine();
        String expResult = "";
        String result = instance.getMarque();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMarque method, of class Machine.
     */
    @Test
    public void testSetMarque() {
        System.out.println("setMarque");
        String marque = "";
        Machine instance = new Machine();
        instance.setMarque(marque);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrix method, of class Machine.
     */
    @Test
    public void testGetPrix() {
        System.out.println("getPrix");
        Machine instance = new Machine();
        double expResult = 0.0;
        double result = instance.getPrix();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPrix method, of class Machine.
     */
    @Test
    public void testSetPrix() {
        System.out.println("setPrix");
        double prix = 0.0;
        Machine instance = new Machine();
        instance.setPrix(prix);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSalle method, of class Machine.
     */
    @Test
    public void testGetSalle() {
        System.out.println("getSalle");
        Machine instance = new Machine();
        Salle expResult = null;
        Salle result = instance.getSalle();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSalle method, of class Machine.
     */
    @Test
    public void testSetSalle() {
        System.out.println("setSalle");
        Salle salle = null;
        Machine instance = new Machine();
        instance.setSalle(salle);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Machine.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Machine instance = new Machine();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
