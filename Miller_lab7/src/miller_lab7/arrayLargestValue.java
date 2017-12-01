/*
 * This is Lab 7 for CS 1180
 * This lab works with arrays input and output.
 */
package miller_lab7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author Michael Miller
 * CS1180L
 * Instructor: V. Starkey
 * TA: Cogan Shimizu
 */
public class arrayLargestValue {

    /**
     * This program gets values from an input file and puts them into an array.
     * This array is then printed to the screen. The maximum value in the array 
     * is also found and displayed.
     */
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        //This is the declaration of variables.
        String filename;
        int value=0;
        
        // This gets the input file name.
        System.out.println("Please enter the name of the file: ");
        filename = keyboard.nextLine();

        //This creates an array with twenty zeros.
        int array[] = new int[20];
         
        value = readFromFileToArray(filename, array);
        
        //This 
        if (value == 0)
        {
        System.out.println(value + "values were read from the file.");
        }
        
        //This prints the array to the screen.
        printArray(array);
        
        //This prints the maximum value of the array given the array has values.
        if (array.length > 0)
        {
        returnMaximumValue(array);   
        }
        
        keyboard.close();

    }

    public static int readFromFileToArray(String filename, int[] array) {
        Scanner keyboard = new Scanner(System.in);
        Scanner reader = null;

        try 
        {
            File inputFile = new File(filename);
            reader = new Scanner(inputFile);
        }
        catch (FileNotFoundException e) 
        {
            System.out.println(filename + "was not found.");
            return 0;
        }
        int i = 0;
        while (reader.hasNextInt() && i < array.length)  
        {
            
            array[i] = reader.nextInt();
            i++;
                
            }
            reader.close();
            return 1;
        /*for (int i=0; i<20; i++)
        {
        System.out.println("next integer; ");
        int value = keyboard.nextInt();
        array [i] = value;
        }
        return 1;*/
    }


    public static void printArray(int[] array) {

        if (array.length == 0) 
        {
            System.out.println("array is empty");
        }

        for (int i = 0; i < array.length; i++) 
        {
             while(array[i] == 0)
             {
                 i++;
             }
             
            System.out.print(array[i] + " ");
        }
        System.out.println("");
    }

    public static void returnMaximumValue(int[] array) {
        int maximumValue = array[0];

        for (int i = 0; i < array.length; i++) 
        {
            if (array[i] > maximumValue) 
            {
                maximumValue = array[i];
            }
        }
        System.out.println("The maximum value in the array is "
             + maximumValue + ".");
    }

}
