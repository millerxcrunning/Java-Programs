/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package measuredrainfallpractice;

import java.util.Scanner;

/**
 *
 * @author alexisfletes
 */
public class measuredRainfallPracticeUsingWhileLoops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int yearNumber;
        int endNumberOfYears;
        double rainfallPerMonth;
        int month;
        double rainfall;
        double yearlyTotalRainfall;
        double yearlyAverage;
        double totalRainfall;
        double sumAverage;

        System.out.println("How many years did you collect data for?");
        endNumberOfYears = input.nextInt();
        yearNumber = 1;
        month = 1;
        yearlyTotalRainfall = 0;
        totalRainfall = 0;
        yearlyAverage =0;
        sumAverage = 0;
        
        while (yearNumber <= endNumberOfYears) 
        {
            while (month <= 12) 
            {
                System.out.print("Enter the amount of rain you received during month " + month
                        + ", year " + yearNumber + ": ");
                rainfall = input.nextDouble();
                yearlyTotalRainfall += rainfall;
                month += 1;

                
            }
            month = 1;
            yearlyAverage = yearlyTotalRainfall/12;
            System.out.println("yearly average is " + yearlyAverage + "\n");
            totalRainfall += yearlyTotalRainfall;
            sumAverage += yearlyAverage;
            yearNumber +=1;
            yearlyTotalRainfall = 0;
            
        }
        
        rainfallPerMonth = totalRainfall/(endNumberOfYears*12);
        
        System.out.println(month);
        System.out.println(yearNumber);
        System.out.println(yearlyTotalRainfall);
        System.out.println(yearlyAverage);
        
        System.out.println("total rainfall is " + totalRainfall);
        System.out.println("rainfall per month is " + rainfallPerMonth);
        

    }

}
