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
public class InvalidMinuteException extends Exception{
    
    public InvalidMinuteException() {
        
        super("You entered a value that is not valid. Please enter "
                + "a value that is between 0 and 59 inclusive.");
    }
    
}
