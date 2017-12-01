/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodactivity1;

import java.util.Scanner;

/**
 *
 * @author alexisfletes
 */
public class MethodActivity1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        int spacePosition1, spacePosition2;
        
        String firstName, middleName, lastName, fullName;
        
        System.out.println("Please enter your full name");
        fullName = input.nextLine();
        
        spacePosition1 = fullName.indexOf('');
        spacePosition2 = fullName.indexOf(' ', spacePosition1+1); 
        firstName = fullName.substring(0, spacePosition);
        lastName = fullName.substring(spacePosition+1);
        System.out.println("Hello" + "!");
        System.out.println("your last name is " + lastName + ".");
        
        
        
    }
    
}
