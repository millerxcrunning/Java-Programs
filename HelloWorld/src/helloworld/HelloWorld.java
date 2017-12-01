/*
 * Introduction program CS1180
 * 5/18/2016
 */
package helloworld;

import java.util.Scanner;

/**
 *
 * @author Michael Miller           
 */
public class HelloWorld {

    /**
     * This program introduces itself to the user and gets to know him/her. 
     */
    public static void main(String[] args) {
        //  
        
        Scanner input = new Scanner (System.in);//This gets information from input device
        
        System.out.println("Please enter your name:");//This asks the user for their name
        String yourName;// This allocates memory for "yourName"
        yourName = input.nextLine();//This stores the user's next input as "yourName"
        System.out.println("");//This skips a line
        System.out.print("Hello ");
        System.out.print(yourName);//This inserts the user's name into the output statement
        System.out.println("...");
        System.out.println("Welcome to your world!");
        System.out.printf("How old are you, %s, ",yourName);//This inserts the users name
        //into the output statement
        System.out.println("?");
        int yourAge;//This allocates memory for "yourAge"
        yourAge = input.nextInt();//This stores the user's next input as "yourAge"
        input.nextLine();//This makes the computer start reading next after the user
        //hits the enter key, so the computer does not read the enter after the last input as
        //part of the next input
        System.out.printf("My goodness, you are %d years old, %s?\n\n",yourAge,yourName);
        System.out.printf("What school did you attend, %s?\n\n",yourName);
        String yourSchool = input.next();
        input.nextLine();
        System.out.println("What was your major?");
        String yourMajor = input.nextLine();
        System.out.printf("Wow, you earned a degree in %s",yourMajor);
        System.out.printf(" from %s?\n",yourSchool);
        System.out.printf("That is awesome!\n\n");
        
        System.out.println("what is your age?");
        input.
        
    }
    
}
