/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miller_1181lab7b;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Michael Miller
 */
public class balancedInputUsingStack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        String string;
        boolean balanced;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter any combination of parenthesis, brackets, and "
                + "curly braces with nothing in between them:");
        string = input.nextLine().trim();
//        ArrayList<Character> aList = new ArrayList<Character>();
//        for(int i=0; i<string.length(); i++)
//        {
//            aList.add((char) Character.codePointAt(string, i));
//        }
        balanced = checkIfBalanced(string);
        //System.out.println("made it to if else");
        
        if (balanced)
            System.out.println(string + " is balanced");
        else
            System.out.println(string + " is not balanced");
        
    }
    public static boolean checkIfBalanced(String string)
    {
        char [] array = string.toCharArray();
        
        Stack stack = new Stack();
        
        for (int i = 0; i < array.length; i++)
        {
            if(array[i] == '[' || array[i] == '{' || array[i] == '(')
                stack.push(array[i]);
            
            else if (array[i] == ')') 
            {
                if (stack.isEmpty())
                    return false;
                
                if ((Character)stack.pop() != '(') 
                    return false;
            }

            else if (array[i] == ']') 
            {
                if (stack.isEmpty()) 
                    return false;
                
                if ((Character)stack.pop() != '[') 
                    return false;
            }

            else if (array[i] == '}') 
            {
                if (stack.isEmpty())
                    return false;
                
                if ((Character)stack.pop() != '{') 
                    return false;
            }
        }
        return stack.isEmpty();
        
    }
    
}
