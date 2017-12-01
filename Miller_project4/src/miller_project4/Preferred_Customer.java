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
public class Preferred_Customer extends Customer{
    
    private String email;
    
    public Preferred_Customer(String firstName, String lastName, String email)
    {
        super(firstName, lastName);
        this.email = email;
    }
    
    public void setEmail(String email)
    {
        this.email = email;
    }
    
    public String getEmail()
    {
        return this.email;
    }
    
    @Override
    public String toString()
    {
        return super.toString() + " " + this.email;
    }
    
    
    
    
    
    
}
