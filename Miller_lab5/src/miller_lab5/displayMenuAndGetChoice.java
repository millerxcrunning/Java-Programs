/*
 * This is Lab 5 for CS 1180
 * This program uses methods to convert measurements through a menu.
 */
package miller_lab5;

import java.util.Scanner;

/**
 * @author Michael Miller
 * CS1180L
 * Instructor: V. Starkey
 * TA: Cogan Shimizu
 */
public class displayMenuAndGetChoice {

    /**
     * This program displays a list of conversions that the user can choose from.
     * It then uses user input directed to formulas inside separate methods to 
     * calculate the conversions, and then displays the results back to the user
     * through the main method.
     */
    public static void main(String[] args) {

               
                double initValue, convertedValue;
                int choice;
                
                Scanner keyboard = new Scanner(System.in);
                
                choice = displayMenuAndGetChoice();
                
                while (choice != 5)
                {
                    //process choice
                    if (choice ==1)
                    {
                        System.out.print("\nEnter feet to be converted: ");
                        initValue = keyboard.nextDouble();
                        convertedValue = convertFeetToMeters(initValue);
                        outputResults(initValue, convertedValue, "feet", "meters");
                    }
                    else if (choice ==2)
                    {
                        System.out.print("\nEnter pounds to be converted: ");
                        initValue = keyboard.nextDouble();
                        convertedValue = convertPoundsToKilograms(initValue);
                        outputResults(initValue, convertedValue, "pounds", "kilograms");
                    }
                    else if (choice ==3)
                    {
                        System.out.print("\nEnter meters to be converted: ");
                        initValue = keyboard.nextDouble();
                        convertedValue = convertMetersToFeet(initValue);
                        outputResults(initValue, convertedValue, "meters", "feet");
                    }
                    else if (choice ==4)
                    {
                        System.out.print("\nEnter kilograms to be converted: ");
                        initValue = keyboard.nextDouble();
                        convertedValue = convertKilogramsToPounds(initValue);
                        outputResults(initValue, convertedValue, "kilograms", "pounds");
                    }
                    else 
                    {
                    
                    }
                    System.out.println("");
                    
                    //get next conversion choice
                    choice = displayMenuAndGetChoice();
                }
                
                System.out.println("End of program.");
    }
    //This method displays the results of the conversions.
    public static void outputResults(double originalValue, double convertedValue,
            String originalUnits,  String convertedUnits)
    {
    System.out.println(originalValue + " " + originalUnits + " is equivalent to "
            +  convertedValue+  " " + convertedUnits  +  ". ");
    }
    //This lets the user choose what conversion will be performed.
    public static int displayMenuAndGetChoice()
    {
        
        Scanner keyboard = new Scanner(System.in);
        
        int choice;
        
        System.out.println("Please choose from the following menu: ");
        System.out.println("1. Convert feet to meters");
        System.out.println("2. Convert pounds to kilograms");
        System.out.println("3. Convert meters to feet");
        System.out.println("4. Convert kilograms to pounds");
        System.out.println("5. Quit program");
        choice = keyboard.nextInt();
        
        //This ensures their input is valid.
        while (choice < 1 || choice > 5)
        {
            System.out.print("Valid choices are 1-5. Please re-enter: ");
            choice = keyboard.nextInt();
        }
        //This passes the valid user selection to the main method
        return choice;
        
    }
    //This takes feet and returns meters back to the main method.
    public static double convertFeetToMeters (double feet)
    {
        double convertedValue = feet * 0.3048;
        return convertedValue;
    }
    //This takes pounds and returns kilograms back to the main method.
    public static double convertPoundsToKilograms (double pounds)
    {
        double convertedValue = pounds * 0.45359237;
        return convertedValue;
    }
    //This takes meters and returns feet back to the main method.
    public static double convertMetersToFeet (double meters)
    {
        double convertedValue = meters * 3.28084;
        return convertedValue;
    }
    // This takes kilograms and returns pounds back to the main method.
    public static double convertKilogramsToPounds (double kilograms)
    {
        double convertedValue = kilograms * 2.20462;
        return convertedValue;
    }
    
}
