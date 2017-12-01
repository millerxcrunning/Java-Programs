/*
 * This is Lab 3 for CS1180
 * This program calculates area of two shapes
 */
package miller_lab3;

import static java.lang.Math.PI;
import java.util.Scanner;

/**
 *@author Michael Miller
 * CS1180L
 * Instructor: V. Starkey
 * TA: Cogan Shimizu
 */
public class AreaCalculator {
    /**
     * This calculates the area of a circle and the area of the smallest square 
     * this circle will fit inside of. It will then calculate the difference of 
     * the two areas and output the results.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);      
        //This delcares the variables used.
        double radius;
        double circleArea;
        double sideLength;
        double squareArea;
        double PI;
        double areaDifference;
        //This calculates the area of a circle using A=π*r*r
        System.out.println("Input the radius of the circle in feet:");
        radius = input.nextDouble();
        PI = Math.PI;
        circleArea = PI * (radius * radius);
        System.out.printf("The area of the circle is %.2f square feet.\n",circleArea);
        //The side of the square is side=2r, along with the area of the 
        //square, A=s*s
        sideLength = radius * 2.00;
        squareArea = sideLength * sideLength;
        System.out.printf("The length of the side of the square is %.2f feet.\n",
                sideLength);
        System.out.printf("The area of the smallest square the circle will fit"
                + " inside of is %.2f square feet.\n",squareArea);
        //The difference of the area of the square and circle is
        //A=Asub1 - Asub2. Then, we calculate and display the area difference.
        areaDifference = squareArea - circleArea;
        System.out.printf("The difference in areas between the square with side"
                + " length of %.2f and a circle \nwith a radius of %.2f feet is "
                + "%.2f square feet.\n",sideLength,radius,areaDifference);   
    }   
}
