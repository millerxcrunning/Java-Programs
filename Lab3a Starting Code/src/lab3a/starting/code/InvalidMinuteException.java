/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3a.starting.code;

/**
 *
 * @author Michael Miller
 */
class InvalidMinuteException extends Exception {

    public InvalidMinuteException() {
        super("The value entered is not valid. Next time, please enter\n"
                + "a value that is between 0 and 59 inclusive.\n");
    }
    
}
