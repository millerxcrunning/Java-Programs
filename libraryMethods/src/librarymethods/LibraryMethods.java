/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymethods;

import java.util.Scanner;

/**
 *
 * @author alexisfletes
 */
public class LibraryMethods {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char ch;
        int a;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter a single character");
        ch = input.nextLine().charAt(0);
        
        
        if (Character.isLetter(ch))
        {
        System.out.println("It is " + Character.isLetter(ch) + " that your input"
                + " is a character");
        }
        
        while (Character.isLetter(ch))
                {
                    System.out.println("Please enter a correct character");
                    ch = input.nextLine().charAt(0);
                }
        
            
        
        
        
    }
    public static void main2(String[] args) {
        // TODO code application logic here
        String phrase;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter a single character");
    
}
}
