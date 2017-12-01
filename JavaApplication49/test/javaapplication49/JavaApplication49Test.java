/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication49;

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
public class JavaApplication49Test {
    
    public JavaApplication49Test() {
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
     * Test of main method, of class JavaApplication49.
     */
    @Test
    public void testMain() {
        /*System.out.println("main");
        String[] args = null;
        JavaApplication49.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    */}

    /**
     * Test of numberOfPositiveValues method, of class JavaApplication49.
     */
    @Test
    public void testNumberOfPositiveValues1() {
        System.out.println("numberOfPositiveValues- all negatives");
        int[] integerArray = {-1, -2, -3, -4};
        int expResult = 0;
        int result = JavaApplication49.numberOfPositiveValues(integerArray);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    public void testNumberOfPositiveValues2() {
        System.out.println("numberOfPositiveValues- all positives");
        int[] integerArray = {1, 2, 3, 4};
        int expResult = 4;
        int result = JavaApplication49.numberOfPositiveValues(integerArray);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    public void testNumberOfPositiveValues3() {
        System.out.println("numberOfPositiveValues- all zeros");
        int[] integerArray = {0, 0, 0, 0};
        int expResult = 0;
        int result = JavaApplication49.numberOfPositiveValues(integerArray);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    public void testNumberOfPositiveValues4() {
        System.out.println("numberOfPositiveValues");
        int[] integerArray = {-1, -2, -3, -4};
        int expResult = 0;
        int result = JavaApplication49.numberOfPositiveValues(integerArray);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
}
