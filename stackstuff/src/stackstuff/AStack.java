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
public class AStack implements MyStackIntf{

    private String [] stack;
    private int top;
    
    public AStack(int size)
    {
        stack = new String[size];
        top = 0;
    }
    @Override
    public boolean isEmpty() {
        return top == 0;
    }

    @Override
    public boolean push(String value) {
        if (top == stack.length)
            return false;
        stack[top++] = value;
        return true;
    }

    @Override
    public String peek() {
        if (isEmpty())
           return null;
       else 
            return stack[top-1];
    }

    @Override
    public String pop() {
       if (isEmpty())
           return null;
       else 
           return stack[--top];
       
    }
    
}
