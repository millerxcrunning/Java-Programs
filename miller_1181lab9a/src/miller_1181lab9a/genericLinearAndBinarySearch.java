/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miller_1181lab9a;

import java.util.Arrays;

/**
 * @author Michael Miller
 * CS1181L-06
 * Instructor: C. Rodabough
 * TA: Steve Betts
 */
public class genericLinearAndBinarySearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GenericLinearSearch linearSearch = new GenericLinearSearch();
        GenericBinarySearch binarySearch = new GenericBinarySearch();

        Double[] a = {12.8, 28.4, 49.3, 47.2, 99.8, 14.7, 55.4, 28.6, 49.1, 57.0};

        System.out.println("Linear Search of " + Arrays.toString(a) + " with target " + 57.0);

        System.out.println("Result is: " + linearSearch.genericLinearSearch(a, 57.0, 0, 9) + "\n");

        Double[] a1 = {12.8, 14.7, 28.4, 28.6, 47.2, 49.1, 49.3, 55.4, 57.0, 99.8};

        System.out.println("Binary Search of " + Arrays.toString(a1) + " with target " + 57.0);

        System.out.println("Result is: " + binarySearch.genericBinarySearch(a1, 57.0, 0, 9));

    }
}


