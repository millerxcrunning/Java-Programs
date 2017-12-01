/*
 * Lab 2 for CS 1180
 * This program tells a story about the user.
 * This program will prompt the user for specific inputs about their life. It
 * will take this information and make it into a story in paragraph form.
 */
package evaluating.arithmetic.expressions.in.java; 
import java.util.Scanner;

/**
 * @author Michael Miller
 * CSL1180-C01
 * Instructor: V. Starkey
 * TA:  Cogan Shimizu
 */
public class Miller_prelab2 {

    /**
     * 
     * 
     * @param args the command line arguments
     */
    
     
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        
        System.out.println("What is your name?");
        String name = input.next();
        
        System.out.println("How old are you?");
        int age = input.nextInt();
        input.nextLine(); //consume a newline
        
        System.out.println("What city do you live in?");
        String city = input.next();
        
        System.out.println("Where did you attend college?");
        String college = input.next();
        
        System.out.println("What is your profession?");
        String profession = input.next();
        
        System.out.println("What kind of animal do you have as a pet? ");
        String animal = input.next();
        
        System.out.println("What is the name of your pet?");
        String petName = input.next();
        
        System.in 
       
        //
    }

    
}
