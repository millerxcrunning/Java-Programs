/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionhandling;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alexisfletes
 */
public class ExceptionHandling {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InputMismatchException, ArithmeticException {
        
        System.out.println(dividend());
        
    }
    
    /**
     *
     * @return
     * @throws java.lang.Exception
     * @throws ArithmeticException
     */
    public static int dividend() throws InputMismatchException, ArithmeticException
    {
        int dividend=0;
        int one=0;
        int two;
        Scanner keyboard = new Scanner(System.in);
        try
        {
            System.out.println("Enter integer 1: ");
            one = keyboard.nextInt();
            keyboard.nextLine();
            System.out.println("Enter integer 2: ");
            two = keyboard.nextInt();
            keyboard.nextLine();
            dividend=0;
            dividend = one/two;
        }
        catch (ArithmeticException e)
        {
            System.err.println("Error: You cannot " + e.getMessage());
        }
        catch (InputMismatchException e)
        {
            System.err.println("Error: You cannot " + e.getMessage());
            System.err.println("Error: You cannot " + e.getCause());
            System.err.println("Error: You cannot " + e.getStackTrace());
        }
        
        System.out.println("Yu are now outside the try catch block.");
        System.out.println("This is a filler line.");
        System.out.println("You will now see the dividend.");
        return dividend;
    }
    
    A
}
