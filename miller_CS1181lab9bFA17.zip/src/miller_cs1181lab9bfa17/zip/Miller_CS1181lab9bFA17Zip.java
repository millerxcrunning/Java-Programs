/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miller_cs1181lab9bfa17.zip;

import java.util.Arrays;

/**
 *
 * @author Michael Miller
 */
public class Miller_CS1181lab9bFA17Zip {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //arr1
        //[14, 28, 17, 74, 32, 16, 5, 9, 41]
        //[14, 17, 28, 74, 32, 16, 5, 9, 41]
        //[14, 17, 28, 74, 32, 16, 5, 9, 41]
        //[14, 17, 28, 32, 74, 16, 5, 9, 41]
        //[14, 16, 17, 28, 32, 74, 5, 9, 41]
        //[5, 14, 16, 17, 28, 32, 74, 9, 41]
        //[5, 9, 14, 16, 17, 28, 32, 74, 41]
        //[5, 9, 14, 16, 17, 28, 32, 41, 74]
        
        //arr2
        //[2, 14, 17, 23, 31, 36, 42, 47, 49]
        //[2, 14, 17, 23, 31, 36, 42, 47, 49]
        //[2, 14, 17, 23, 31, 36, 42, 47, 49]
        //[2, 14, 17, 23, 31, 36, 42, 47, 49]
        //[2, 14, 17, 23, 31, 36, 42, 47, 49]
        //[2, 14, 17, 23, 31, 36, 42, 47, 49]
        //[2, 14, 17, 23, 31, 36, 42, 47, 49]
        //[2, 14, 17, 23, 31, 36, 42, 47, 49]
        
        //arr3
        //[81, 97, 74, 68, 62, 54, 50, 41, 13]
        //[74, 81, 97, 68, 62, 54, 50, 41, 13]
        //[68, 74, 81, 97, 62, 54, 50, 41, 13]
        //[62, 68, 74, 81, 97, 54, 50, 41, 13]
        //[54, 62, 68, 74, 81, 97, 50, 41, 13]
        //[50, 54, 62, 68, 74, 81, 97, 41, 13]
        //[41, 50, 54, 62, 68, 74, 81, 97, 13]
        //[13, 41, 50, 54, 62, 68, 74, 81, 97]
        
        int[]	arr1 = {14,	28,	17,	74,	32,	16,	5,	9,	41};
        int[]	arr2 = {2,	14,	17,	23,	31,	36,	42,	47,	49};
        int[]	arr3 = {97,	81,	74,	68,	62,	54,	50,	41,	13};
        
        System.out.println("arr1 is:\n" + Arrays.toString(arr1) + "\n");
        //System.out.println("\nInsertion sort on arr1 produced " + doInsertionSort(arr1) + " passes\n");
        System.out.println("The contents of arr1 after each pass is");
        doInsertionSort(arr1);
        
        System.out.println("\narr2 is:\n" + Arrays.toString(arr2) + "\n");
        //System.out.println("\nInsertion sort on arr2 produced " + doInsertionSort(arr2) + " passes\n");
        System.out.println("The contents of arr2 after each pass is");
        doInsertionSort(arr2);
        
        System.out.println("\narr3 is:\n" + Arrays.toString(arr3) + "\n");
        //System.out.println("\nInsertion sort on arr3 produced " + doInsertionSort(arr3) + " passes\n");
        System.out.println("The contents of arr3 after each pass is");
        doInsertionSort(arr3);
    }
    
    public static int doInsertionSort(int[] arr)
    {
        int numOfLoops = 0;
        
        if (arr == null) 
        {
            return numOfLoops;
        }
        if (arr.length == 1)
        {
            return numOfLoops++;
        }
         
        int temp;
        for (int i = 1; i < arr.length; i++) 
        {
            for(int j = i ; j > 0 ; j--)
            {
                numOfLoops++;
                if(arr[j] < arr[j-1])
                {
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
            System.out.println(Arrays.toString(arr));
        }
        return numOfLoops;
    }
    
}
