package miller_1181fa17_lab3a;

import java.util.Scanner;

/**
 * @author Michael Miller
 * CS1181L-06
 * Instructor: C. Rodabough
 * TA: Steve Betts
 */
public class Miller_1181FA17_lab3a {
    
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
    
    
    public static int getUserHours() throws InvalidHourException{
        System.out.print("What hour should the clock be set to? ");
        int hours = input.nextInt();
        input.nextLine(); // consumes the trailing newline
        while(hours<1 || hours >12)
        {
            throw new InvalidHourException();
        }
        return hours;
    }
    
    public static int getUserMinutes() throws InvalidMinuteException{
        System.out.print("What minute should the clock be set to? ");
        int min = input.nextInt();
        input.nextLine(); // consumes the trailing newline
        while(min<0 || min >59)
        {
            throw new InvalidMinuteException();
        }
        return min;
    }
    
    public static String getUserMeridian() {
        System.out.print("Is it a.m. (a) or p.m. (p)? " );
        String answer = input.nextLine();
        if (answer.toLowerCase().startsWith("a")) {
            return "a.m.";
        } else {
            return "p.m.";
        }
    }

}
