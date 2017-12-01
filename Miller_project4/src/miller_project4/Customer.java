/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miller_project4;

/**
 *
 * @author Michael Miller
 */
public class Customer extends Person implements Comparable{
    
    public Customer(String firstName, String lastName)
    {
        super(firstName, lastName);
        
    }
    
    @Override
    public boolean equals(Object o)
    {
       Customer name = (Customer) o;
        
       if (!o.equals("Customer"))
       {
            throw new IllegalArgumentException("The argument should be of Customer Type");
       } 
       
       if(this.getLastName().equalsIgnoreCase(name.getLastName())
           && this.getFirstName().equalsIgnoreCase(name.getFirstName()))      
           {
           return true;
           }
       
       else
       {
           return false;
       }
       
    }
    
    @Override
    public int compareTo(Object o)
    {
        if (o instanceof Customer)
        {
            Customer name = (Customer) o;
            
            int result = this.getLastName().compareToIgnoreCase(name.getLastName());
            
            if (result != 0)
            {
                return result;
            }
            
            return this.getFirstName().compareToIgnoreCase(name.getFirstName());
        }
       
        else
        {
            throw new IllegalArgumentException("The argument should be of Customer Type");
        }
    }
}
