/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miller_1181fa17_lab3a;

/**
 *
 * @author Michael Miller
 */
public class InvalidHourException extends Exception{
    
    public InvalidHourException() {
        
        super("You entered a value that is not valid. Please enter "
                + "a value that is between 1 and 12 inclusive.");
    }
    
    
}
