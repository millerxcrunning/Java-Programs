/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miller_1181lab10a;

import java.util.Random;

/**
 *
 * @author Michael Miller
 */
public class selectionBubbleAndInsertionSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] tenSorted = {1,2,3,4,5,6,7,8,9,10};
        int[] tenOpposite = {10,9,8,7,6,5,4,3,2,1};
        int[] tenRandom = {3,7,1,99,46,81,17,9,55,11};
        int[] oneHundredSorted = new int[100];
        for (int i = 1; i<=100; i++)
        {
            oneHundredSorted[i-1] = i;
        }
        int[] oneHundredOpposite = new int[100];
        for (int i = 100; i>=1; i--)
        {
            oneHundredOpposite[i-1] = i;
        }
        Random r = new Random();
        int[] oneHundredRandom = new int[100];
        for(int i = 0; i < oneHundredRandom.length; i++) {
            oneHundredRandom[i] = r.nextInt(100);
        }
        
	int tenSortedSelectionSortNumOfLoops = doSelectionSort(tenSorted);
        System.out.println("tenSortedSelectionSortNumOfLoops = " + tenSortedSelectionSortNumOfLoops);
        
        int tenSortedBubbleSortNumOfLoops = doBubbleSort(tenSorted);
        System.out.println("tenSortedBubbleSortNumOfLoops = " + tenSortedBubbleSortNumOfLoops);
        
        int tenSortedInsertionSortNumOfLoops = doInsertionSort(tenSorted);
        System.out.println("tenSortedInsertionSortNumOfLoops = " + tenSortedInsertionSortNumOfLoops);
        
        int tenOppositeSelectionSortNumOfLoops = doSelectionSort(tenOpposite);
        System.out.println("tenOppositeSelectionSortNumOfLoops = " + tenOppositeSelectionSortNumOfLoops);
        
        int tenOppositeBubbleSortNumOfLoops = doBubbleSort(tenOpposite);
        System.out.println("tenOppositeBubbleSortNumOfLoops = " + tenOppositeBubbleSortNumOfLoops);
        
        int tenOppositeInsertionSortNumOfLoops = doInsertionSort(tenOpposite);
        System.out.println("tenOppositeInsertionSortNumOfLoops = " + tenOppositeInsertionSortNumOfLoops);
        
        int tenRandomSelectionSortNumOfLoops = doSelectionSort(tenRandom);
        System.out.println("tenRandomSelectionSortNumOfLoops = " + tenRandomSelectionSortNumOfLoops);
        
        int tenRandomBubbleSortNumOfLoops = doBubbleSort(tenRandom);
        System.out.println("tenRandomBubbleSortNumOfLoops = " + tenRandomBubbleSortNumOfLoops);
        
        int tenRandomInsertionSortNumOfLoops = doInsertionSort(tenRandom);
        System.out.println("tenRandomInsertionSortNumOfLoops = " + tenRandomInsertionSortNumOfLoops);
        
        int oneHundredSortedSelectionSortNumOfLoops = doSelectionSort(oneHundredSorted);
        System.out.println("oneHundredSortedSelectionSortNumOfLoops = " + oneHundredSortedSelectionSortNumOfLoops);
        
        int oneHundredSortedBubbleSortNumOfLoops = doBubbleSort(oneHundredSorted);
        System.out.println("oneHundredSortedBubbleSortNumOfLoops = " + oneHundredSortedBubbleSortNumOfLoops);
        
        int oneHundredSortedInsertionSortNumOfLoops = doInsertionSort(oneHundredSorted);
        System.out.println("oneHundredSortedInsertionSortNumOfLoops = " + oneHundredSortedInsertionSortNumOfLoops);
        int oneHundredOppositeSelectionSortNumOfLoops = doSelectionSort(oneHundredOpposite);
        System.out.println("oneHundredOppositeSelectionSortNumOfLoops = " + oneHundredOppositeSelectionSortNumOfLoops);
        
        int oneHundredOppositeBubbleSortNumOfLoops = doBubbleSort(oneHundredOpposite);
        System.out.println("oneHundredOppositeBubbleSortNumOfLoops = " + oneHundredOppositeBubbleSortNumOfLoops);
        
        int oneHundredOppositeInsertionSortNumOfLoops = doInsertionSort(oneHundredOpposite);
        System.out.println("oneHundredOppositeInsertionSortNumOfLoops = " + oneHundredOppositeInsertionSortNumOfLoops);
        
        int oneHundredRandomSelectionSortNumOfLoops = doSelectionSort(oneHundredRandom);
        System.out.println("oneHundredRandomSelectionSortNumOfLoops = " + oneHundredRandomSelectionSortNumOfLoops);
        
        int oneHundredRandomBubbleSortNumOfLoops = doBubbleSort(oneHundredRandom);
        System.out.println("oneHundredRandomBubbleSortNumOfLoops = " + oneHundredRandomBubbleSortNumOfLoops);
        
        int oneHundredRandomInsertionSortNumOfLoops = doInsertionSort(oneHundredRandom);
        System.out.println("oneHundredRandomInsertionSortNumOfLoops = " + oneHundredRandomInsertionSortNumOfLoops);
        
        
        
    }
    
    public static int doSelectionSort(int[] arr)
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
        
	    for (int i = 0; i < arr.length - 1; i++)
	    {
	        int index = i;
	        for (int j = i + 1; j < arr.length; j++)
                {
                    numOfLoops++;
	            if (arr[j] < arr[index]) 
	                index = j;
                }
	        int smallerNumber = arr[index];  
	        arr[index] = arr[i];
	        arr[i] = smallerNumber;
	    }
	    return numOfLoops;
	}
    
    public static int doBubbleSort(int[] arr) 
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

        for (int i = 0; i < arr.length; i++) 
        {
            for (int j = 1; j < arr.length - i; j++) 
            {
                numOfLoops++;
                if (arr[j - 1] > arr[j]) 
                {
                    arr[j] = arr[j] + arr[j - 1];
                    arr[j - 1] = arr[j] - arr[j - 1];
                    arr[j] = arr[j] - arr[j - 1];
                }
            }
        }
    return numOfLoops; 
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
        }
        return numOfLoops;
    }

}
