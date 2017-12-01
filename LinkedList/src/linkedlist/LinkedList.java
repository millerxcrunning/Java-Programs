package linkedlist;

/**
 *
 * @author Michael Miller
 */
public class LinkedList {

    public static void display(Node tmp)
    {
        while(tmp != null)
        {
            //process data in node
            System.out.println(tmp.data);
            //advance tmp to the next node
            tmp = tmp.next;
        }
    }
    
    public static Node findPredecessor(Node ptr, int value)
    {
        if(ptr == null || value <= ptr.data)
        {
            return null;
        }
        while(ptr.next != null && value > ptr.next.data)
        {
            ptr = ptr.next;
        }
        
        return ptr;
    }
    
    public static void main(String[] args) {
        
        Node first = null;
        
        for(int i = 10; i>0; i-=2)
        {
            Node tmp = new Node(i, null);
            tmp.next = first;
            first = tmp;
        }
        
        display(first);
        
        System.out.printf("Predecessor of 5 is %d\n", findPredecessor(first,5).data);
        System.out.printf("Predecessor of 12 is %d\n", findPredecessor(first,12).data);
        
        for(int i = 1; i <= 11; i+=2)
        {
            Node tmp = new Node(i, null);
            Node pred = findPredecessor(first, i);
            if(pred != null)
            {
                tmp.next = pred.next;
                pred.next = tmp;
            }
            else
            {
                System.out.println("Got a null back from findPredecessor");
                tmp.next = first;
                first = tmp;
            }
        }
        System.out.println("After insertion...");
        display(first);
        
        Node pred = findPredecessor(first, 7);
        pred.next = pred.next.next;
        System.out.println("After removing 7");
        display(first);
        
        /*delete value 7
        findPredecessor of 7 gives ptr
        one statement that copies ptr.next.next = ptr.next */
        pred = findPredecessor(first, 1);
        if (pred== null)
        {
             //deleting the first item in the list
             first = first.next;
        }
        System.out.println("After removing 1");
        display(first);
        }
    
}

class Node
{
    int data;
    Node next;
    
    public Node(int data, Node next)
    {
        this.data = data;
        this.next = next;
        
    }
}