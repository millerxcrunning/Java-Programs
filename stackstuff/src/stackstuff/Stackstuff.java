/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackstuff;

/**
 *
 * @author alexisfletes
 */
public class Stackstuff {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        AStack stack = new AStack(5);
        LinkedListStack stack2 = new LinkedListStack();
        
        for (int i = 0; i<5; i++)
            stack.push("Value " + i);
        if (stack.push("Too much") == false)
            System.out.println("Push when stack was full return false");
        else
            System.out.println("Push when stack was full return true");
        
        System.out.printf("peek return %s\n", stack.peek());
        
        for (int i = 0; i<5; i++)
            System.out.printf("pop return %s\n", stack.pop());
        
        if (stack.pop() == null)
            System.out.println("Pop when stack was empty return null");
        else
            System.out.println("Pop when stack was empty return not null");
        
        System.out.println("Now test the linked stack\n");
        
        for (int i = 0; i<5; i++)
            stack2.push("Value " + i);
        
        System.out.printf("peek return %s\n", stack2.peek());
        
        for (int i = 0; i<5; i++)
            System.out.printf("pop return %s\n", stack2.pop());
        
        if (stack2.pop() == null)
            System.out.println("Pop when stack was empty return null");
        else
            System.out.println("Pop when stack was empty return not null");
    }
    
}
