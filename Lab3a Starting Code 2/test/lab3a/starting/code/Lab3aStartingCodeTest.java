/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3a.starting.code;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alexisfletes
 */
public class Lab3aStartingCodeTest {
    
    public Lab3aStartingCodeTest() {
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
     * Test of main method, of class Lab3aStartingCode.
     */
    @Test
    public void testMainEarlier() {
        System.out.println("main");
        Clock c1 = new Clock(12, 00, "a.m.");
        Clock c2 = new Clock(12, 00, "p.m.");
        Clock result = Clock.getEarlier(c1, c2);
        assertEquals(result, c1);
//        String[] args = null;
//        Lab3aStartingCode.main(args);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    public void testMainLater() {
        System.out.println("main");
        Clock c1 = new Clock(12, 00, "p.m.");
        Clock c2 = new Clock(12, 00, "a.m.");
        Clock result = Clock.getEarlier(c1, c2);
        assertEquals(result, c1);
    }
    
    public void testMainEqual() {
        System.out.println("main");
        Clock c1 = new Clock(12, 00, "p.m.");
        Clock c2 = new Clock(12, 00, "p.m.");
        Clock result = Clock.getEarlier(c1, c2);
        assertEquals(result, c1);
    }
    
    public void testMainEarlierIsInvalid() {
        System.out.println("main");
        Clock c1 = new Clock(0, 00, "a.m.");
        Clock c2 = new Clock(12, 00, "p.m.");
        Clock result = Clock.getEarlier(c1, c2);
        assertEquals(result, c1);
    }
    
    public void testMainLaterIsInvalid() {
        System.out.println("main");
        Clock c1 = new Clock(12, 00, "a.m.");
        Clock c2 = new Clock(0, 00, "p.m.");
        Clock result = Clock.getEarlier(c1, c2);
        assertEquals(result, c1);
    }
    /**
     * Test of getUserHours method, of class Lab3aStartingCode.
     */
//    @Test
//    public void testGetUserHours() {
//        System.out.println("getUserHours");
//        int expResult = 0;
//        int result = Lab3aStartingCode.getUserHours();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getUserMinutes method, of class Lab3aStartingCode.
//     */
//    @Test
//    public void testGetUserMinutes() {
//        System.out.println("getUserMinutes");
//        int expResult = 0;
//        int result = Lab3aStartingCode.getUserMinutes();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getUserMeridian method, of class Lab3aStartingCode.
//     */
//    @Test
//    public void testGetUserMeridian() {
//        System.out.println("getUserMeridian");
//        String expResult = "";
//        String result = Lab3aStartingCode.getUserMeridian();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
}
