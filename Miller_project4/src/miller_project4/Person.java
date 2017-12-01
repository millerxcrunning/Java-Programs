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
public abstract class Person {
    
    String firstName;
    String lastName;
  
    public Person(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;   
    }
    
    public void setFirstName()
    {
        this.firstName = firstName;
    }
    
    public String getFirstName()
    {
        return firstName;
    }
    
    public void setLastName()
    {
        this.lastName = lastName;
    }
    
    public String getLastName()
    {
        return lastName;
    }
    
    @Override
    public String toString()
    {
        return  this.firstName + "\t" + this.lastName + "\t";
    }
    
}


