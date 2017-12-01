/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miller_1181project4;

/**
 *
 * @author Michael Miller
 */
public class alreadySortedArray {
    
    int[] alreadySortedArray;
    
    public alreadySortedArray(int size)
    {
        alreadySortedArray = new int[size];
        for (int i = 1; i <= size; i++)
        {
            alreadySortedArray[i-1] = i;
        }
    }
    
}
