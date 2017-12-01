/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miller_1181project4;

import java.util.Random;

/**
 *
 * @author Michael Miller
 */
public class randomOrderArray {
    
    Random r = new Random();
    int[] randomOrderArray;
        
    public randomOrderArray(int size)
    {
        randomOrderArray = new int[size];
        for(int i = 0; i < randomOrderArray.length; i++) {
            randomOrderArray[i] = r.nextInt(100);
        }
    }
}
    

