/*
 * Program for CS1161 Module 5 (Inheritance) Lab 1
 */
package Employee_hierarchy;

/**
 *
 * @author VStarkey
 */
public class TestEmployeeClasses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //test constructors
        Employee e1 = new Employee("Jeff Smith", 30000);
        Manager e2 = new Manager("Larry Jones", 80000, "Sales");
        Executive e3 = new Executive("Jayne White", 80000000, "Regional VP");

        //test toString methods
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
        
        //write code to change the name and salary of Employee e1
        
        //write code to change the name, salary, and department of Manager e2
        
        //write code to change the name, salary, and title of Executive e3
        
        //display all fields of e1, e2, and e3 using the accessor method

    }
}
