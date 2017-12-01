/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackstuff;

/**
 *
 * @author Michael Miller
 */
public class LinkedListStack implements MyStackIntf{

    private class Node
    {
        public String value;
        public Node next;
    
    
        public Node(String data, Node reference)
        {
            value = data;
            next = reference;
        }
    
    }
    
    private Node stackTop = null;
    
    public LinkedListStack()
    {
        
    }
    
    @Override
    public boolean isEmpty() {
       return stackTop ==null;
    }

    @Override
    public boolean push(String value) {
        Node tmp = new Node(value, stackTop);
        //stackTop = new Node(value, stackTop)... then no need for next line
        stackTop = tmp;
        return true;
    }

    @Override
    public String peek() {
        if (isEmpty())
            return null;
        else
            return stackTop.value;
    }

    @Override
    public String pop() {
        if (isEmpty())
            return null;
        else
        {
            Node tmp = stackTop;
            stackTop = stackTop.next;
            return tmp.value;
    }
    
}
}
