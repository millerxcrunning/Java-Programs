/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayactivity1;

import java.util.Scanner;

/**
 *
 * @author alexisfletes
 */
public class ArrayActivity1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);

        
        
        int [] array = new int [10];
        array [0] = 25;
        array [9] = 15;
        
        
        for (int i=0; i<array.length; i++)
            System.out.println(array[i]);
    }
    public static void fillArray(int[] array){
            for (int i=0; i<array.length; i++)
            System.out.println("position " + i + ":");
}
}