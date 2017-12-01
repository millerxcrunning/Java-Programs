/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursionexample;

/**
 *
 * @author Michael Miller
 */
public class RecursionExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //System.out.println(reverse("hello"));
        //System.out.println(mirror("hello"));
        System.out.println(isPalendrome("aceca"));
        System.out.println(isPalendrome("racecar"));
        System.out.println(isPalendrome("Michael"));
        System.out.println(isPalendrome("Alton"));
        System.out.println(isPalendrome("al"));
        System.out.println(compute(2));
        System.out.println(compute(4));

    }
    
        
        public static String reverse(String s)
        {
            //base case -- simplest version
            if(s.length() == 1)
            {
                return s;
            }
            
            //recurseive step -- call on anything but the 
            //whole string, then finish up the rest of the work
            //reverse ("ello") -> olle
            return reverse(s.substring(1, s.length()) + s.charAt(0));
            
            //s= s.substring(1, s.length);
            
        }
        
        public static boolean isPalendrome(String s)
        {
            if(s.length() <=1 )
                return true;
            
            else if(s.length() == 2 ) 
            {
                if(s.charAt(0) == s.charAt(1)) 
                {
                    return true;
                }
                else
                {
                return false;
                }
            }
            
            return isPalendrome(s.substring(1, s.length()));
            //aceca is a palendrome 
            //how do we know if racecar is a palendrome?
            
        }
        
        public static String mirror(String s)
        {
            System.out.println(s);
           if (s.length() == 1)
           {
               return s+s;
           }
           //String t = s.charAt(0) + mirror(s.substring(1, s.length()) + s.charAt(0));
           //System.out.println(t);
           return s.charAt(0) + mirror(s.substring(1, s.length()) + s.charAt(0));
           
        }
        
        public static int compute(int n)
        {
            if(n==1)
            {
                int x=2;
                return x;
            }
            
            return 2*compute(n-1);
        }
}

    

