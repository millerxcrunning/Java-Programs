/*
 * This is Lab 2 for CS1180 
 * This program asks information about the user and then proceeds to tell a 
 * story about the user using the information given.
 */
package miller_lab2;

import java.util.Scanner;

/**
 * @author Michael Miller
 * CS1180L
 * Instructor: V. Starkey
 * TA: Cogan Shimizu
 */
public class StoryAboutUser {

    /**
     * This prompts the user to enter values, and returns a story containing 
     * all of the given values
     */
    public static void main(String[] args) {
        //This initiates the main method 
        
        Scanner input = new Scanner(System.in);//This allows the user to input data, 
        //getting data from the input device (keyboard)
        
        String yourName;// This allocates memory for "yourName"
        int yourAge;// This allocates memory for "yourAge"
        String yourCity;// This allocates memory for "yourCity"
        String yourCollege;// This allocates memory for "yourCollege"
        String yourProfession;// This allocates memory for "yourProfession"
        String yourAnimalType;// This allocates memory for "yourAnimalType"
        String yourPetName;// This allocates memory for "yourPetName"
        
        System.out.println("ENTER YOUR NAME:");//This prompts the user for their name
        yourName = input.nextLine();//This stores the user's next input as "yourName"
        System.out.println("ENTER YOUR AGE:");//This prompts the user for their age
        yourAge = input.nextInt();//This stores the user's next input as "yourAge"
        input.nextLine();//This makes the computer start reading next after the user
        //hits the enter key, so the computer does not read the enter after the last input as
        //part of the next input
        System.out.println("ENTER YOUR CITY:");//This prompts the user for their city
        yourCity = input.nextLine();//This stores the user's next input as "yourCity"
        System.out.println("ENTER YOUR COLLEGE:");//This prompts the user for their college
        yourCollege = input.nextLine();//This stores the user's next input as "yourCollege"
        System.out.println("ENTER YOUR PROFESSION:");//This prompts the user for their profession
        yourProfession = input.nextLine();////This stores the user's next input as "yourProfession"
        System.out.println("ENTER THE TYPE OF ANIMAL YOU HAVE AS A PET:");//This prompts the 
        //user for their animal type
        yourAnimalType = input.nextLine();//This stores the user's next input as "yourAnimalType"
        System.out.println("ENTER YOUR PET'S NAME:");//This prompts the user for their pet's name
        yourPetName = input.nextLine();//This stores the user's next input as "yourPetName"
        
        //This outputs all of the inputs together in a story format.
        System.out.println("There once was a person named " + yourName + " who lived "
                + "in " + yourCity + ". \nAt the age of " + yourAge + ", " + yourName 
                + " went to college at " + yourCollege + ". \n" + yourName + " graduated and "
                + "went to work as a " + yourProfession + ". Then, \n" + yourName + 
                " adopted a " + yourAnimalType + " named " + yourPetName + ". " + 
                yourName + " and " + yourPetName + " lived happily ever after.");
        System.out.println("");
                
        
        
    }
    
}
