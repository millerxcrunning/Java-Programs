/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nestedloop2;

import java.util.Scanner;

/**
 *
 * @author alexisfletes
 */
public class Nestedloop2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int a;
        int b;
        int c;
        
        System.out.println("enter value");
        c = input.nextInt();
        
        for (a = 1; a < c; a++)
        {
            System.out.println("Red");
            
            for (b = 1; b < 5; b++)
            {
                System.out.println("Blue");
            }
        }
    }
    
}
