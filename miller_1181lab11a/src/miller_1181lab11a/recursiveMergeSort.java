/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miller_1181lab11a;

import java.util.Arrays;

/**
 *
 * @author Michael Miller
 */
public class recursiveMergeSort {

    static int iterations;
    static int[] array;
    static int[] extraArray;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] test1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] test2 = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        mergeSort(test1);
        mergeSort(test2);
        System.out.println(Arrays.toString(test1));
        System.out.println("iterations for test 1: " + iterations);
        System.out.println(Arrays.toString(test2));
        System.out.println("iterations for test 2: " + iterations);

    }

//    public static void mergeSort(int[] array/*, int first, int last*/) 
//    {
//        if (array.length > 1) 
//        { // More than one element
//            int middle = (array.length / 2);
//            int [] firstHalf = new int[middle]; 
//            mergeSort(array, first, middle);
//            mergeSort(array, middle + 1, last);
//            
//        } // else just 1 element, so already sorted.
//    }
    public static void mergeSort(int[] list) 
    {
        array = list;
        int length = list.length;
        extraArray = new int[length];
        doMergeSort(0, length - 1);
    }

    private static void doMergeSort(int first, int last) 
    {
        //If first equals or greater than high, the array is sorted
        if (last > first) 
        {
            //Gets the index of the array position in the middle
            int middle = (first + (last - first) / 2);
            //Sorts the left side of the array
            doMergeSort(first, middle);
            //Sorts the right of the array
            doMergeSort(middle + 1, last);
            //Put the two arrays together
            merge(first, middle, last);
        }
    }

    private static void merge(int first, int middle, int last) 
    {

        iterations = 0;
        //Copies left and right into extra array
        for (int i = first; i <= last; i++) 
        {
            iterations++;
            extraArray[i] = array[i];
        }

        int a = first;
        int b = first;
        int c = middle + 1;
        
        //Copies the smallest back to array
        while (a <= middle && c <= last) 
        {
            iterations++;
            if (extraArray[a] <= extraArray[c]) 
            {
                //
                array[b] = extraArray[a];
                a++;
            } else {
                array[b] = extraArray[c];
                c++;
            }
            b++;
        }
        //Copies the rest of the left into array
        while (a <= middle) 
        {
            iterations++;
            array[b] = extraArray[a];
            b++;
            a++;
        }

    }
}
