/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addition;

/**
 *
 * @author Michael Miller
 */
public class Adder {
    
    int total;
    
    public Adder () 
    {
        
        this.total = 0;
    }
    
    public void add (int value)
    {
       total += value; 
    }
    
    @Override
    public String toString()
    {
        return "Total: " + String.valueOf(this.total);
    }
            
}
