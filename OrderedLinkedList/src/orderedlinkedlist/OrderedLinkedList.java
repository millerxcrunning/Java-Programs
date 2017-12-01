/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orderedlinkedlist;

/**
 *
 * @author alexisfletes
 */
public class OrderedLinkedList {

    public class Node
{
        public String payload;
	public int keyValue;
	public Node next;
        
	// Explicit value constructor for the Node class
	public Node(String payload, int value, Node next)
        {
            this.payload = payload;
            this.keyValue = keyValue;
            this.next = next;
        }
    }
    
    public OrderedLinkedList()
    {
        
    }

    private Node first;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Node first = null;
        System.out.println(first);
    }
    
    
    
}




