/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miller_cs1181fa17lab10a;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Michael Miller
 */
public class Miller_CS1181FA17lab10aTest {
    
    public Miller_CS1181FA17lab10aTest() {
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
     * Test of main method, of class Miller_CS1181FA17lab10a.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Miller_CS1181FA17lab10a.main(args);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of selectionSort method, of class Miller_CS1181FA17lab10a.
     */
    @Test
    public void testSelectionSort1() {
        System.out.println("selectionSort1");
        Integer a = 5;
        Integer b = 2;
        Integer c = 1;
        Integer d = 4;
        Integer e = 3;
        Integer[] array = new Integer[5];
        array[0]=a;
        array[1]=b;
        array[2]=c;
        array[3]=d;
        array[4]=e;
        Integer[] expectedArrayResult = {1,2,3,4,5};
        Integer [] output1 = Miller_CS1181FA17lab10a.selectionSort(array);
        assertArrayEquals(expectedArrayResult, output1);
    }
    
    @Test
    public void testSelectionSort2() {
        System.out.println("selectionSort2");
        Double[] test = {1.0, 0.0, -4.0, -6.0, 2.0, 10.0};
        Double[] expectedTestResult = {-6.0,-4.0,0.0,1.0,2.0,10.0};
        Double[] output2 = Miller_CS1181FA17lab10a.selectionSort(test);
        assertArrayEquals(expectedTestResult, output2);
    }
    
    @Test
    public void testSelectionSort3() {
        System.out.println("selectionSort3");
        String [] test = {"Bob", "Alice", "Dan", "Mark", "Sue", "Jan"};
        String[] expectedTestResult = {"Alice", "Bob", "Dan", "Jan", "Mark", "Sue"};
        String [] output3 = Miller_CS1181FA17lab10a.selectionSort(test);
        assertArrayEquals(expectedTestResult, output3);
    }
    
}
