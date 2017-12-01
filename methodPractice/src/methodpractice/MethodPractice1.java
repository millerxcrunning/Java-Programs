/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodpractice;

import java.util.Scanner;

/**
 *
 * @author alexisfletes
 */
public class MethodPractice1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double rain;
        double extraRain;
        double totalRain;
        
        rain = 0;
        extraRain = 5;
        totalRain = rainfall(rain, extraRain);
        
        System.out.println("The total rainfall is " + totalRain + " inches.");
        
    }
    
    public static double rainfall(double rain, double extraRain)
    {
        double totalRain = rain + extraRain;
        return totalRain;
    }
}
