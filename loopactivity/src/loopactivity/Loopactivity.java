/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loopactivity;

import java.util.Scanner;

/**
 *
 * @author alexisfletes
 */
public class Loopactivity {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyboard = new Scanner(System.in);
        
    int count;
    int start;
    int finish;
    int total = 0;
    
        System.out.println("Enter the starting value");
        start = keyboard.nextInt();
    
        System.out.println("Enter the ending value for the sum");
        finish = keyboard.nextInt();
        
        while (finish <= start)
        {   
            System.out.println("Your ending value must be greater than "
                    + start + ". Please re-enter:");
            finish = keyboard.nextInt();
        }
        
        count = start;
        
        while (count <= finish)
    {
        total = total + count;
        count++;
    }
    
        System.out.println("The total of the sum of the integers from " + start + " "
                + finish + " is " + total);
    
    
    
    }
    
}
