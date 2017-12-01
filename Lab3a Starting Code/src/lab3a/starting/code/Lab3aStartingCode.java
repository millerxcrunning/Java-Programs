package lab3a.starting.code;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Lab3aStartingCode {

    static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        try {
            Clock appointmentTime = new Clock(12, 30, "p.m.");
            Clock userTime = new Clock(getUserHours(), getUserMinutes(),
                    getUserMeridian());
            
            if (Clock.getEarlier(userTime, appointmentTime) == userTime) {
                System.out.println("You're not late!");
            } else {
                System.out.println("You're late!");
            }
        } catch (InvalidHourException | InvalidMinuteException ex) {
            System.out.println(ex);
            System.exit(0);
        }
        
    }
    
    
    public static int getUserHours() throws InvalidHourException {
        System.out.print("What hour should the clock be set to? ");
        if(input.hasNextInt())
        {
            int hours = Integer.parseInt(input.nextLine());
            while(hours<1 || hours >12)
            {
                throw new InvalidHourException();
            }
            return hours;
        }
        
        else {
            throw new InvalidHourException();
        }
    }
    
    public static int getUserMinutes() throws InvalidMinuteException {
        System.out.print("What minute should the clock be set to? ");
        if (input.hasNextInt())
        {
            int minutes = Integer.parseInt(input.nextLine());
            while(minutes<0 || minutes>59)
            {
                throw new InvalidMinuteException();
            }
            return minutes;
        }
        
        else {
            throw new InvalidMinuteException();
        }

    }
    
    public static String getUserMeridian() {
        System.out.print("Is it a.m. (a) or p.m. (p)? " );
        String answer = input.nextLine();
        if (answer.toLowerCase().startsWith("a")) 
        {
            return "a.m.";
        }  else {
            return "p.m.";
        }
        
//      I came up with the following as maybe a better alternative to catch invalid input
//      without throwing a new exception if you delete lines 73-74. I agree however,
//      that an exception or try catch block would be best.

//        else if (answer.toLowerCase().startsWith("p"))
//        {
//            return "p.m.";
//        }
//        else
//        {
//            System.out.println("That was not a valid meridian value.\n"
//                    + "Next time, please enter a.m. (a) or p.m. (p)\n");
//            System.exit(0);
//            return null;
//        }
    }

}
