/*
 *This is Lab 4 for CS1180
 *This program calculates average rainfall using nested loops.
*/

package miller_lab4;

import java.util.Scanner;

/**
 *@author Michael Miller
 * CS1180L
 * Instructor: V. Starkey
 * TA: Cogan Shimizu
 */
public class measuredRainfall {

    /**
     * This program calculates average rainfall for each year the user inputs and 
     * also calculate average rainfall over the entire period.
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        //This declares the variables used.
        int yearNumber;
        int endNumberOfYears;
        double rainfallPerMonth;
        int month;
        double rainfall;
        double yearlyTotalRainfall;
        double yearlyAverage;
        double totalRainfall;
        double sumAverage;  
        
        //This obtains how long the period is that data is being collected for.
        System.out.println("Enter the number of years rainfall data"
                + " is being collected for: ");
        endNumberOfYears = input.nextInt();
        
        //This initializes variables used in calculations to come.
        sumAverage = 0;
        totalRainfall = 0;
        
        //This allows us to gather rainfall data for the specified number of years,
        for (yearNumber = 1, rainfallPerMonth = 0, yearlyTotalRainfall = 0; 
                yearNumber <= endNumberOfYears; yearNumber++)
        {
            //This initializes and resets these values every time this loop runs.
            yearlyAverage = 0;
            yearlyTotalRainfall = 0;
            
            //This allows us to gather rainfall data for each month of each year.
            for (month=1; month<=12; month++)
            {
                System.out.print("Enter the rainfall for year " + yearNumber +
                         ", month " + month + ": ");
                
                rainfall = input.nextInt();
                
                //This maintains a running total for yearly rainfall
                yearlyTotalRainfall = rainfall + yearlyTotalRainfall;
                
            }   
            //This maintains a running total for yearly average of rainfall
            yearlyAverage = yearlyTotalRainfall/12; 
                    
            System.out.println("The yearly average is " 
                    + yearlyAverage + "\n");
            
            //This maintains a running total for the total rainfall and summation 
            //of the average rainfall.
            sumAverage = yearlyAverage + sumAverage;
            totalRainfall = yearlyTotalRainfall + totalRainfall;
        }
        
        //This tells the user the overall total amount of rain over the given time
        //period and the average rainfall per month of the whole duration as well.
        System.out.println("Total rainfall for the " + endNumberOfYears + " years: " 
                + totalRainfall + " inches.");
        
        rainfallPerMonth = sumAverage/endNumberOfYears;
        
        System.out.println("Monthly average rainfall over " + endNumberOfYears + 
                " years: " + rainfallPerMonth + " inches.");
    }
}
