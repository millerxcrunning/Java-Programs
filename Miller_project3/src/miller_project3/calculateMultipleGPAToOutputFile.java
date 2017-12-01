/*
 * This is Project 3 for CS1180 
 * This program calculates and outputs GPA for students
 */
package miller_project3;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * @author Michael Miller 
 * CS1180L 
 * Instructor: V. Starkey 
 * TA: Cogan Shimizu
 */
public class calculateMultipleGPAToOutputFile {

    /**
     * This program uses separate methods to take multiple students' information, 
     * calculate their GPA for multiple courses, and then output the results to 
     * a file, all of which are being called from the main method.
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {

        Scanner input = new Scanner(System.in);

        //This is the variable declarations.
        int numberOfStudents;
        String studentName;
        int numberOfCourses;
        int courseNumber;
        String course;
        char letterGrade;
        double courseCreditHours;
        double qualityPoints = 0;
        double totalQualityPoints = 0;
        double totalCreditHours = 0;
        double gpa;
        final int ARRAY_SIZE = 20;
        
        //This initializes arrays 
        String[] studentNames = new String[ARRAY_SIZE];
        double[] creditHoursCompleted = new double[ARRAY_SIZE];
        double[] GPA = new double[ARRAY_SIZE];

        numberOfStudents = getNumberOfStudents(input);
        
        //This discards the return from the end of the getNumberOfStudents input
        input.nextLine();

        //This gathers all the students' information.
        for (int student = 1; student <= numberOfStudents; student++) 
        {
            studentName = getStudentName(input, student);

            numberOfCourses = getNumberOfCoursesTaken(input, studentName);

            //This takes individual student credit hours and grade, then calculates 
            //and displays quality points for each course
            for (courseNumber = 1; courseNumber <= numberOfCourses; courseNumber++) 
            {
                course = getCourse(input, studentName, courseNumber);

                courseCreditHours = getCreditHours(input, course);

                letterGrade = getLetterGrade(input, course);

                System.out.println("");

                qualityPoints = calculateQualityPoints(input, course, letterGrade,
                        courseCreditHours);

                displayCourseInformationAndQualityPoints(input, course, courseCreditHours,
                        letterGrade, qualityPoints);

                //These keep running totals for totalCreditHours and totalQualityPoints
                totalCreditHours += courseCreditHours;
                totalQualityPoints += qualityPoints;
            }

            gpa = calculateAndReturngpa(totalQualityPoints, totalCreditHours);

            displayCourseInformationAndGPA(studentName, totalCreditHours, totalQualityPoints,
                    gpa);
            
            //This fills the studentNames array at postition student-1 
            //with the name of user entered student. 
            studentNames[student-1] = studentName;
            
            //This fills the creditHoursCompleted array at position student-1
            //with the credit hours completed of user entered student. 
            creditHoursCompleted[student-1] = totalCreditHours;
            
            //This fills the GPA array at position student-1 with the 
            //gpa of user entered student.
            GPA[student-1] = gpa;
        }
        
        input.close();
        
        outputStudentInformationToFile(numberOfStudents, studentNames,
                creditHoursCompleted, GPA);
    }

    /**
     * This gets the number of students from the user
     * @param input
     * @return the number of students
     */
    public static int getNumberOfStudents(Scanner input) 
    {
        System.out.println("Please enter the number of students to be processed: ");
        return input.nextInt();
    }

    /**
     * This gets the name of the student
     * @param input
     * @param student
     * @return the name of the student
     */
    public static String getStudentName(Scanner input, int student) 
    {
        System.out.println("Please enter the name of student " + student + ": ");
        return input.nextLine();
    }

    /**
     * This gets a number greater than 0 from the user.
     *
     * @param input
     * @param studentName
     * @return the number of courses taken
     */
    public static int getNumberOfCoursesTaken(Scanner input, String studentName) 
    {

        int numberOfCourses;
        
        //This is obtaining the number of courses taken, making sure input is valid.
        System.out.println("Please enter the number of courses " + studentName + " completed "
                + "last semester: ");

        numberOfCourses = input.nextInt();

        //This forces the user to enter a positive number for the number of courses taken.
        while (numberOfCourses <= 0) 
        {
            System.out.println("You must enter a non-negative number.");
            System.out.println("Please enter the number of courses " + studentName + 
                    " completed last semester: ");
            numberOfCourses = input.nextInt();
        }
        
        //This discards the new line from the Scanner object.
        input.nextLine();

        return numberOfCourses;
    }

    /**
     * This prompts for and gets a user-entered course number
     *
     * @param input
     * @param studentName
     * @param courseNumber
     * @return the user entered course number
     */
    public static String getCourse(Scanner input, String studentName, int courseNumber) 
    {
        String course;

        System.out.print("\nPlease enter the course number " + courseNumber
                + " for " + studentName + ": ");

        course = input.nextLine();

        return course;
    }

    /**
     * gets the number of credit hours that the course named in the parameter
     *
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

        //This ensures the credit hours entered is inside the acceptable range of
        //.5 to 9.0
        while (courseCreditHours < .5 || courseCreditHours > 9.0) 
        {
            System.out.print("Credit hours cannot be less than .5 or more than"
                    + " 9. Please re-enter the credit hours for " + course + ": ");

            courseCreditHours = input.nextDouble();
        }
        
        //This discards the new line from the Scanner object.
        input.nextLine();

        return courseCreditHours;
    }

    /**
     * calculates quality points by multiplying creditHours * the letter grade
     * point value point value.
     *
     * @param input
     * @param letterGrade which must be A,B,C,D,F,or X
     * @param course
     * @param courseCreditHours
     * @return quality points
     */
    public static double calculateQualityPoints(Scanner input, String course,
            char letterGrade, double courseCreditHours) 
    {

        double qualityPoints = 0;
        final double GRADE_A = 4.0;
        final double GRADE_B = 3.0;
        final double GRADE_C = 2.0;
        final double GRADE_D = 1.0;
        final double GRADE_F = 0.0;
        final double GRADE_X = 0.0;

        if (letterGrade == 'A')
        {
            qualityPoints = courseCreditHours * GRADE_A;
        }
        
        else if (letterGrade == 'B') 
        {
            qualityPoints = courseCreditHours * GRADE_B;
        }
        
        else if (letterGrade == 'C')
        {
            qualityPoints = courseCreditHours * GRADE_C;
        }
        else if (letterGrade == 'D') 
        {
            qualityPoints = courseCreditHours * GRADE_D;
        }
        
        else if (letterGrade == 'F') 
        {
            qualityPoints = courseCreditHours * GRADE_F;
        } 
        
        else 
        {
            qualityPoints = courseCreditHours * GRADE_X;
        }

        return qualityPoints;
    }

    /**
     * This gets the grade received from the user and ensures it is a valid letter
     * grade before returning it.
     * @param input
     * @param course
     * @return the letter grade achieved
     */
    public static char getLetterGrade(Scanner input, String course) 
    {
        char letterGrade;

        System.out.print("Please enter the grade received in " + course + ": ");

        letterGrade = input.nextLine().toUpperCase().charAt(0);

        while (letterGrade != 'A' && letterGrade != 'B' && letterGrade != 'C'
                && letterGrade != 'D' && letterGrade != 'F' && letterGrade != 'X') 
        {
            System.out.println("Letter grade must be A, B, C, D, F, or X.");
            System.out.print("Please re-enter a valid letter grade for "
                    + course + ": ");

            letterGrade = input.nextLine().toUpperCase().charAt(0);
        }
        
        return letterGrade;
    }

    /**
     * This prints the course number, course credit hours, the letter grade in 
     * the class, and the quality points to the screen
     *
     * @param input
     * @param course
     * @param courseCreditHours
     * @param letterGrade
     * @param qualityPoints
     */
    public static void displayCourseInformationAndQualityPoints(Scanner input,
            String course, double courseCreditHours, char letterGrade, double qualityPoints) 
    {
        System.out.println("Course: " + course);
        System.out.println("Credit Hours: " + courseCreditHours);
        System.out.println("Letter Grade: " + letterGrade);
        System.out.println("Quality points earned: " + qualityPoints);
    }

    /**
     * This calculates their GPA
     *
     * @param totalQualityPoints
     * @param totalCreditHours
     * @return the student's overall GPA
     */
    public static double calculateAndReturngpa(double totalQualityPoints, double totalCreditHours) 
    {
        return totalQualityPoints / totalCreditHours;
    }

    /**
     * This prints to the screen the student's name, credit hours completed, quality
     * points earned, and the student's gpa.
     * @param studentName
     * @param totalCreditHours
     * @param totalQualityPoints
     * @param gpa
     * 
     */
    public static void displayCourseInformationAndGPA(String studentName, double totalCreditHours,
            double totalQualityPoints, double gpa) 
    {
        
        System.out.println("Student name: " + studentName);
        System.out.println("Total credit hours completed this semester: "
                    + totalCreditHours);
        System.out.println("Total quality points earned this semester: "
                    + totalQualityPoints);
        System.out.printf("Your GPA this semester is %.2f\n\n", gpa);
        
    }

    /**
     * This writes the student information including name, credit hours completed,
     * and gpa to the output file name GPA_summary.txt
     * @param numberOfStudents
     * @param studentNames
     * @param creditHoursCompleted
     * @param GPA
     * @throws FileNotFoundException 
     */
    public static void outputStudentInformationToFile(int numberOfStudents, String studentNames[],
            double creditHoursCompleted[], double GPA[]) throws FileNotFoundException
    {
        //This opens the output file and initializes the Printwriter
        PrintWriter output = new PrintWriter("GPA_summary.txt");

        //This outputs the headers of the columns
        output.println("Name\t\t\tCredit Hours Completed\t\tGPA");
        
        //This inserts a blank row between the headers and student information
        output.println();
        
        //This outputs each student's information in a row, formatted to fit in 
        //line with the columns. This continues for as many rows as there are students
        //information for.
        for (int i = 0; i < numberOfStudents; i++) 
        {
            output.printf("%s\t\t\t%.1f\t\t\t%.2f\n", studentNames[i], creditHoursCompleted[i], GPA[i]);
        }
        
        //This closes the Printwriter and empties the buffer of information, 
        //forcing the information to be written to the output file, so not to lose it.
        output.close();
    }
}
