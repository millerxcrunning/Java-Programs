/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miller_lab6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Michael Miller
 */
public class rainfallFromFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
        int endNumberOfYears = 0;
        double rainfall = 0;
        int yearNumber;
        double rainfallPerMonth;
        int month;
        double yearlyTotalRainfall;
        double yearlyAverage = 0;
        double totalRainfall = 0;
        double sumAverage =0;

        // This initializes 
        Scanner keyboard = new Scanner(System.in);

        // This gets the input filename
        System.out.print("Enter a filename: ");
        String filename = keyboard.nextLine();
        System.out.println("You entered: " + filename);

        // Declare
        Scanner reader = null;
        File inputFile = new File(filename);
        // This tries only the validity of the input file
        try {
            reader = new Scanner(inputFile);
        } catch (FileNotFoundException e) {
            System.out.println("Unable to find file called: " + filename);
            System.exit(1);
        }

        File outputFile = new File("rainfall_stats.txt");
        PrintWriter output = null;
        //This tries only This tries only the validity of the ouput file 
        try {
            output = new PrintWriter(outputFile);
        } catch (FileNotFoundException ex) {
            System.out.println("The file, rainfall_stats.txt was not "
                    + "found.");
            System.exit(0);
        }

        while (reader.hasNextLine()) {
            
            endNumberOfYears = reader.nextInt();
        
        //This initializes variables used in calculations to come.
        sumAverage = 0;
        totalRainfall = 0;
        
        //This allos us to gather rainfall data for the specified number of years.
        for (yearNumber = 1, rainfallPerMonth = 0, yearlyTotalRainfall = 0; 
                yearNumber <= endNumberOfYears; yearNumber++)
        {
            //This initializes and resets these values every time this loop runs.
            yearlyAverage = 0;
            yearlyTotalRainfall = 0;
            
            //This allows us to gather rainfall data for each month of each year.
            for (month=1; month<=12; month++)
            {   
                rainfall = reader.nextInt();
                
                //This maintains a running total for yearly rainfall
                yearlyTotalRainfall = rainfall + yearlyTotalRainfall;
                
            }   
            //This maintains a running total for yearly average of rainfall
            yearlyAverage = yearlyTotalRainfall/12; 
                    
            output.println("The yearly average for year " + yearNumber + 
                        " is " + yearlyAverage + "\n");
            
            //This maintains a running total for the total and summation 
            //of the average rainfall.
            sumAverage = yearlyAverage + sumAverage;
            totalRainfall = yearlyTotalRainfall + totalRainfall;
        }
        //This tells the user the overall total amount of rain over the given time
        //period and the average rainfall per month of the whole duration as well.
        output.println("Total rainfall for the " + endNumberOfYears + " years: " 
                + totalRainfall + " inches.");
        rainfallPerMonth = sumAverage/endNumberOfYears;
        output.println("Monthly average rainfall over " + endNumberOfYears + 
                " years: " + rainfallPerMonth + " inches.");
    }
            
        

        // Release Resources
        reader.close();
        keyboard.close();
    }
}

        

 


