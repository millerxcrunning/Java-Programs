
package Employee_hierarchy;

/**
 *
 * @author VStarkey
 */
public class Executive extends Employee
{
   String title;

   /**
      Make an executive  with a given name, salary, and title
      @param name the name
      @param salary the salary
      @param title the title
   */
   public Executive(String name, double salary, String title)
   {
      super(name, salary);
      this.title = title;
   }

   
   
 
}
