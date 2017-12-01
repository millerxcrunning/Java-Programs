/*
 * This program determines the number of combinational operations needed.
 */
package miller_lab7a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * @author Michael Miller
 * CS1181L-06
 * Instructor: C. Rodabough
 * TA: Steve Betts
 */
public class sweetnessOfCookies {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int sweetnessThreshold;
        int numberOfCookies;
        int numberOfOperations;
        PriorityQueue<Integer> cookies = new PriorityQueue<>();

        System.out.println("How many cookies are there?");
        numberOfCookies = Integer.parseInt(input.nextLine());
        //System.out.println(numberOfCookies);
        System.out.println("What is the desired minimum sweetness threshold?");
        sweetnessThreshold = Integer.parseInt(input.nextLine());
        System.out.println("What is the sweetness values of the cookies currently?");
        //cookies = input.nextLine();

//        while(input.hasNext())
//        {
//            cookies.add(input.nextInt());
//        }
//        input.nextLine();
//        
//        System.out.println(cookies);
//        for (int i = 0; i<numberOfCookies; i++)
//        {
//            cookies.add(input.nextInt());
//        }
        for (int i = 0; i < numberOfCookies; i++) 
        {
            cookies.offer(input.nextInt());
        }
        //System.out.println(cookies);

        numberOfOperations = 0;
        while (cookies.peek() < sweetnessThreshold && !(numberOfOperations == -1)) 
        {
            if (cookies.size() >= 2) 
            {
                numberOfOperations++;
                int firstCookie = cookies.poll();
                int secondCookie = cookies.poll();
                cookies.offer(firstCookie + (secondCookie * 2));
            } else {
                numberOfOperations = -1;
                System.out.println(numberOfOperations);
            }
        }
        
        if(numberOfOperations >=0)
        {
            System.out.println("The number of operations required to achieve this is " 
                + numberOfOperations + ".");
        }
    }

}
