/*
 * 
 */
package miller_1181lab11b;

import java.util.Scanner;

/**
 *
 * @author Michael Miller
 */
public class Miller_1181lab11b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("What number would you like to find the super digit of?");
        long digits = Long.parseLong(keyboard.nextLine());
        
        long superDigit = sumDigits(digits);
        
        //If the superDigit returned from sumDigits is still not one digit,
        //then sumDigits needs to be called again on these digits.
        //So, if 20 is the superDigit, then it will call sumDigits again on 20,
        //returning 2.
        if (superDigit >= 10) 
        {
            superDigit = sumDigits(superDigit);
        }
        
        System.out.println(superDigit + " is the super digit of " + digits);
    }

    public static long sumDigits(long n) {

        long sum = 0;
        //Base case
        if (n == 0) 
        {
            return sum;
        }
        
//        //Gets the last digit
//        String last = String.valueOf(n);
//        last = last.substring(last.lastIndexOf(last));
//        //gets the rest of the digits
//        String rest = String.valueOf(n);
//        rest = rest.substring(0, rest.length()-2);
//        sum = Long.parseLong(last) + sumDigits(Long.parseLong(rest));

        //Recursive step
        //Gets the right most digit and adds it to recursively called method on the rest of the input
        //So, input = 3854 would get 4 and add it to (385 recursively put in the method.)
        //The sum would then be 4+5+ (38 recursively put in the method)
        //The sum would then be 4+5+8+ (3 recursively put in the method)
        //The sum would then be 4+5+8+3 + (0 recursively put in the method because 0.3 is 0)
        //Since input then == 0, it will return, then the sum will be 20
        return (Math.abs(n) % 10 + sumDigits(n / 10));
        
    }

}

