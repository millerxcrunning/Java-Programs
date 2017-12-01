
package Employee_hierarchy;


/**
 *
 * @author VStarkey
 */

public class Manager extends Employee
{
   private String department;

   /**
      Make a manager  with a given name, salary, and department
      @param name the name
      @param salary the salary
      @param department the department
   */
   public Manager(String name, int salary, String department)
   {
      super(name, salary);
      this.department = department;
   }

  
   
    @Override
    public String toString()
    {
        return super.toString() + ", Department: " + department;
    }
}

