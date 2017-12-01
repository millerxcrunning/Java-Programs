/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deque;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 *
 * @author Michael Miller
 */
public class Deque {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayDeque <String> deque = new ArrayDeque();
        deque.offer("a");
        deque.offer("b");
        deque.offer("c");
        deque.offer("d");
        deque.offer("e");
        deque.offer("f");
        deque.offerFirst("aa");
        deque.offerFirst("bb");
        deque.offerFirst("cc");
        //for (int i=0; i<deque.size(); i++)
        while(!deque.isEmpty())
        {
            System.out.println(deque.pollFirst());
            while(!deque.isEmpty())
            {
            System.out.println(deque.pollLast());
            }
        }
    }
    
}
