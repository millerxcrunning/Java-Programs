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
public class ClockTest {
    
    public ClockTest() {
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
     * Test of toString method, of class Clock.
     */
//    @Test
//    public void testToString() {
//        System.out.println("toString");
//        Clock instance = new Clock();
//        String expResult = "";
//        String result = instance.toString();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of getEarlier method, of class Clock.
     */
    @Test
    public void testGetEarlier() {
        System.out.println("Earlier");
        Clock c1 = new Clock(1, 00, "p.m.");
        Clock c2 = new Clock(2, 00, "p.m.");
        Clock result = Clock.getEarlier(c1, c2);
        assertEquals(result, c1);
//        System.out.println("getEarlier");
//        Clock c1 = null;
//        Clock c2 = null;
//        Clock expResult = null;
//        Clock result = Clock.getEarlier(c1, c2);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    @Test
    public void testMainLater() {
        System.out.println("Later");
        Clock c1 = new Clock(2, 00, "p.m.");
        Clock c2 = new Clock(1, 00, "p.m.");
        Clock result = Clock.getEarlier(c1, c2);
        assertEquals(result, c2);
    }
    
    @Test
    public void testMain12Before1() {
        System.out.println("12Before1");
        Clock c1 = new Clock(12, 00, "p.m.");
        Clock c2 = new Clock(1, 00, "p.m.");
        Clock result = Clock.getEarlier(c1, c2);
        assertEquals(result, c1);
    }
    
    @Test
    public void testMain1Before12() {
        System.out.println("1Before12");
        Clock c1 = new Clock(1, 00, "p.m.");
        Clock c2 = new Clock(12, 00, "p.m.");
        Clock result = Clock.getEarlier(c1, c2);
        assertEquals(result, c2);
    }
    
    @Test
    public void testMainAmVsPm() {
        System.out.println("AmVsPm");
        Clock c1 = new Clock(2, 00, "a.m.");
        Clock c2 = new Clock(2, 00, "p.m.");
        Clock result = Clock.getEarlier(c1, c2);
        assertEquals(result, c1);
    }
    
    @Test
    public void testMainPmVsAm() {
        System.out.println("PmVsAm");
        Clock c1 = new Clock(2, 00, "p.m.");
        Clock c2 = new Clock(2, 00, "a.m.");
        Clock result = Clock.getEarlier(c1, c2);
        assertEquals(result, c2);
    }
    
    @Test
    public void testMainMinutesEarlier() {
        System.out.println("MinutesEarlier");
        Clock c1 = new Clock(2, 10, "p.m.");
        Clock c2 = new Clock(2, 20, "p.m.");
        Clock result = Clock.getEarlier(c1, c2);
        assertEquals(result, c1);
    }
    
    @Test
    public void testMainMinutesLater() {
        System.out.println("MinutesLater");
        Clock c1 = new Clock(2, 20, "p.m.");
        Clock c2 = new Clock(2, 10, "p.m.");
        Clock result = Clock.getEarlier(c1, c2);
        assertEquals(result, c2);
    }
    
    @Test
    public void testMainEqual() {
        System.out.println("EqualTime");
        Clock c1 = new Clock(12, 00, "p.m.");
        Clock c2 = new Clock(12, 00, "p.m.");
        Clock result = Clock.getEarlier(c1, c2);
        assertEquals(result, c1);
    }
    @Test
    public void testMainEarlierIsInvalid() {
        System.out.println("EarlierIsInvalid");
        Clock c1 = new Clock(0, 00, "a.m.");
        Clock c2 = new Clock(12, 00, "p.m.");
        Clock result = Clock.getEarlier(c1, c2);
        assertEquals(result, c1);
    }
    @Test
    public void testMainLaterIsInvalid() {
        System.out.println("LaterIsInvalid");
        Clock c1 = new Clock(12, 00, "a.m.");
        Clock c2 = new Clock(0, 00, "p.m.");
        Clock result = Clock.getEarlier(c1, c2);
        assertEquals(result, c1);
    }
    
}
