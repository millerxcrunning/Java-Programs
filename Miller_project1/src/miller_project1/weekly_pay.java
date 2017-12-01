/*
 * This is project 1 for CS1180.
 *This program calculates a person's weekly pay and taxes that are due on that 
 *money.
 */
package miller_project1;

import java.util.Scanner;

/**
 * @author Michael Miller
 * CS1180L
 * Instructor: V. Starkey
 * TA: Cogan Shimizu
 */
public class weekly_pay {
    /**
     * This takes a person's hourly wage and hours worked per week, and figures
     * their total weekly pay (gross income). It also figures the user's taxes 
     * owed with them broke down into categories. It then gives the user their  
     * take home pay (net income). 
     */
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        //These are the variables needed for the calculations to function.
        String yourName;
        double hoursWorked;
        double payRate;
        double localIncomeTax;
        double stateIncomeTax;
        double ssIncomeTax;
        double fedIncomeTax;
        //These are the calculations that will be performed.
        double grossPay;
        double totalTax;
        double netPay;
        //These are the constants for these calculations.
        double localIncomeTaxRate = .02;
        double stateIncomeTaxRate = .0475;
        double ssIncomeTaxRate = .062;
        double fedIncomeTaxRate = .15;
        //I am getting input for calculations from the user.
        System.out.print("Please enter your full name: ");
        yourName = input.nextLine();
        System.out.print("Please enter your hourly pay rate: ");
        payRate = input.nextDouble();
        input.nextLine();
        System.out.print("Please enter the hours worked this pay period: ");
        hoursWorked = input.nextDouble();
        //I am calculating the pay and deducting for taxes as well.
        grossPay = payRate * hoursWorked;
        localIncomeTax = localIncomeTaxRate * grossPay;
        stateIncomeTax = stateIncomeTaxRate * grossPay;
        ssIncomeTax = ssIncomeTaxRate * grossPay;
        fedIncomeTax = fedIncomeTaxRate * grossPay;
        totalTax = localIncomeTax + stateIncomeTax + ssIncomeTax + fedIncomeTax;
        netPay = grossPay - totalTax;
        /*I am telling the user how much they made during the week specified and 
        also stating how much they owe in taxes based on this income.
         */
        System.out.println("\nEmployee Name: " + yourName);
        System.out.printf("Pay Rate: $%.2f\n", payRate);
        System.out.println("Hours worked: " + hoursWorked);
        System.out.printf("\nGross pay: $%.2f\n", grossPay);
        System.out.println("\nDeductions:");
        System.out.printf("\tSocial Security: $%.2f\n", ssIncomeTax);
        System.out.printf("     Federal income tax: $%.2f\n", fedIncomeTax);
        System.out.printf("     State income tax: $%.2f\n", stateIncomeTax);
        System.out.printf("     Local income tax: $%.2f\n\n", localIncomeTax);
        System.out.printf("Net pay: $%.2f\n", netPay);
    }
}
