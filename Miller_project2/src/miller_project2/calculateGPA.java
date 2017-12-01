/*
 * This is Project 2 for CS1180
 * This program calculates a student's GPA.
 */
package miller_project2;

import java.util.Scanner;

/**
 *@author Michael Miller
 * CS1180L
 * Instructor: V. Starkey
 * TA: Cogan Shimizu
 */
public class calculateGPA {

    /**
     * This program takes user input and calculates their GPA for multiple courses,
     * all within a main method. 
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        //This is the variable declarations.
        int numberOfCourses;
        int courseNumber;
        String course;
        char letterGrade;
        double courseCreditHours;
        double qualityPoints = 0;
        double totalQualityPoints = 0;
        double totalCreditHours = 0;
        double gpa;
        
        numberOfCourses = getNumberOfCoursesTaken(input);

        //This takes their credit hours and grade and calculates their quality points.
        for (courseNumber = 1; courseNumber <= numberOfCourses; courseNumber++) 
        {
            course = getCourse(input);

            courseCreditHours = getCreditHours(input, course);

            while (courseCreditHours < .5 || courseCreditHours > 9.0) 
            {
                System.out.print("Credit hours cannot be less than .5 or more than"
                        + " 9. Please re-enter the credit hours for " + course + ": ");

                courseCreditHours = input.nextDouble();
            }

            letterGrade = getLetterGrade(input, course);
            
            qualityPoints = calculateQualityPoints(input, course, letterGrade);

            displayCourseInformationAndQualityPoints(input, course, courseCreditHours,
                    letterGrade, qualityPoints);

            totalCreditHours += courseCreditHours;
            totalQualityPoints += qualityPoints;
        }

        gpa = calculateAndReturngpa(totalQualityPoints, totalCreditHours);
        
        displayCourseInformationAndGPA(totalCreditHours, totalQualityPoints, gpa);
        
    }
    
    /**
     * This gets a number greater than 0 from the user.
     * @param input
     * @return 
     */
    public static int getNumberOfCoursesTaken(Scanner input)
    {
        
        int numberOfCourses;
            //This is obtaining the number of courses taken, making sure input is valid.
        System.out.println("Please enter the number of courses you completed "
                + "last semester: ");

        numberOfCourses = input.nextInt();

        while (numberOfCourses <= 0) 
        {
            System.out.println("You must enter a non-negative number.");
            System.out.println("Please enter the number of courses you completed"
                    + " last semester: ");
            numberOfCourses = input.nextInt();
        }
        //This discards the new line from the Scanner object.
        input.nextLine();
        
        return numberOfCourses;
    }
    
    /**
     * prompts for and gets a user-entered course number
     * @param input
     * @return the user enter
     */
    public static String getCourse(Scanner input)
    {
        String course;
        
        System.out.print("\nPlease enter the course number:");

            course = input.nextLine();
        
            return course;
    }
    
    /**
     * gets the number of credit hours that the course named in the parameter
     * @param input
     * @param course
     * @return 
     */
    public static double getCreditHours(Scanner input, String course)
    {
        double courseCreditHours;
        
        System.out.print("Please enter the number of credit hours for "
                    + course + ":");

            courseCreditHours = input.nextDouble();

            while (courseCreditHours < .5 || courseCreditHours > 9.0) 
            {
                System.out.print("Credit hours cannot be less than .5 or more than"
                        + " 9. Please re-enter the credit hours for " + course + ": ");

                courseCreditHours = input.nextDouble();
            }

            input.nextLine();
            
            return courseCreditHours;
    }
    
    /**
     * calculates quality points by multiplying creditHours * the letter grade point value
     * point values are declared as static class-level variables.
     * @param input
     * @param letterGrade
     * @param course
     * @return quality points
     */
    public static double calculateQualityPoints(Scanner input, String course, 
            char letterGrade)
    {
    
    double courseCreditHours = 0;
    double qualityPoints = 0;
    final double A = 4.0;
    final double B = 3.0;
    final double C = 2.0;
    final double D = 1.0;
    final double F = 0.0;
    final double X = 0.0;
    
        if (letterGrade == 'A')          
            {
                qualityPoints = courseCreditHours * A;
            } 
        else if (letterGrade == 'B')           
            {
                qualityPoints = courseCreditHours * B;
            } 
        else if (letterGrade == 'C')             
            {
                qualityPoints = courseCreditHours * C;
            }
        else if (letterGrade == 'D')             
            {
                qualityPoints = courseCreditHours * D;
            }
        else if (letterGrade == 'F')            
            {
                qualityPoints = courseCreditHours * F;
            } 
        else            
            {
                qualityPoints = courseCreditHours * X;
            } 
            
        return qualityPoints;
    }
    
    public static char getLetterGrade(Scanner input, String course)
    {
            char letterGrade;
            
            System.out.println("Please enter the grade received in " + course + ": ");

            letterGrade = input.nextLine().toUpperCase().charAt(0);
            
            while (letterGrade != 'A' || letterGrade != 'B' || letterGrade != 'C'  || 
                      letterGrade != 'D'  || letterGrade != 'F'  || letterGrade != 'X' )
                {
                   System.out.println("Letter grade must be A, B, C, D, F, or X.");
                   System.out.print("Please re-enter a valid letter grade for "
                        + course + ": ");
                   
                   letterGrade = input.nextLine().toUpperCase().charAt(0);
                }
            return letterGrade;
    }
    
    public static void displayCourseInformationAndQualityPoints(Scanner input, 
            String course, double courseCreditHours, char letterGrade, double
                    qualityPoints)
    {
        System.out.println("Course: " + course);
        System.out.println("Credit Hours: " + courseCreditHours);
        System.out.println("Letter Grade: " + letterGrade);
        System.out.println("Quality points earned: " + qualityPoints + "\n");
    }
    /**
     * This calculates their GPA
     * @param totalQualityPoints
     * @param totalCreditHours
     * @return the student's overall GPA out two decimal places
     */
    public static double calculateAndReturngpa(double totalQualityPoints, double
            totalCreditHours)
    {
        return totalQualityPoints / totalCreditHours;
    }
    
    public static void displayCourseInformationAndGPA(double totalCreditHours, 
            double totalQualityPoints, double gpa)
    {
        System.out.println("Total credit hours completed this semester: " + 
                totalCreditHours);
        System.out.println("Total quality points earned this semester: " + 
                totalQualityPoints);
        System.out.printf("Your GPA this semester is %.2f\n\n", gpa);
    }
}
