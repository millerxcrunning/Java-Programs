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
public class reverseOrderArray {
    
    int[] reverseOrderArray;
    
    public reverseOrderArray(int size)
    {
            reverseOrderArray = new int[size];
            for(int i = size; i >= 1; i--)
            {
                reverseOrderArray[i-1] = i;
            }
    }
}
