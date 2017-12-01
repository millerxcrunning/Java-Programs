
package Employee_hierarchy;

import java.text.DecimalFormat;

/**
 *
 * @author VStarkey
 */
public class Employee
{
    private String name;
    private double salary;

    public Employee(String name, double salary)
    {
        this.name = name;
        this.salary = salary;

    }

    //need accessors
    
    

    //need mutators
    
    

    @Override
    public String toString()
    {
        DecimalFormat myFormat = new DecimalFormat("#,###.00");
        String strSalary = myFormat.format(this.salary);
        return "Name: " + this.name + ", " + "Salary: $" + strSalary;
    }

}
