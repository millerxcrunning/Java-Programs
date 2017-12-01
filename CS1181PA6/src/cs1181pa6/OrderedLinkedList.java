/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs1181pa6;

import java.util.NoSuchElementException;

/**
 *
 * @author Michael Miller
 */
public class OrderedLinkedList {

    public class Node {

        public String payload;
        public int keyValue;
        public Node next;

        public Node() {

        }

        // Explicit value constructor for the Node class
        public Node(String payload, int value) {
            this.payload = payload;
            this.keyValue = keyValue;
            this.next = null;
        }
    }

    private Node first;

    public OrderedLinkedList() {
        first = null;
    }

    public boolean empty() {
        return (first == null);
    }

    public String getFirst() throws NoSuchElementException {
        Node tmp = first;
        if (tmp == null) {
            throw new NoSuchElementException();
        }
        String target = tmp.payload;
        first = first.next;
        return target;
    }

    public String getLast() throws NoSuchElementException {
        Node tmp = first;
        if (tmp == null) {
            throw new NoSuchElementException();
        }
        Node predecessor = null;
        while (tmp.next != null) {
            predecessor = tmp;
            tmp = tmp.next;
        }
        String target = tmp.payload;
        predecessor.next = null;
        return target;
    }

    public void insert(String payload, int keyValue) throws Exception {
        Node tmp = first;
        Node newNode = new Node(payload, keyValue);

        if (tmp == null) {
            tmp = newNode;
            return;
        } else if (tmp.next == null) {
            if (keyValue < tmp.keyValue) {
                newNode.next = tmp;
                first = newNode;
            } else if (keyValue > tmp.keyValue) {
                tmp.next = newNode;
            } else {
                throw new Exception("This keyValue is already in the list.");
            }

        } else if (tmp.keyValue > keyValue) {
            newNode.next = tmp;
            first = newNode;
        } else {
            while (tmp.next != null && tmp.next.keyValue > keyValue) {
                tmp = tmp.next;
            }
            if (tmp.next == null) {
                tmp.next = newNode;
            } else {
                newNode.next = tmp.next;
                tmp.next = newNode;
            }

        }
    }

    /**
     *
     * @param key
     * @throws Exception
     */
    public void remove(int keyValue) throws Exception {
        Node tmp = first;
        //empty list
        if (tmp == null) {
            throw new Exception("This keyValue doesn't exist in the list");
        } //In the case of one node in the linkedList
        else if (tmp.next == null) {
            if (keyValue == tmp.keyValue) {
                tmp = null;
                first = null;
            } else {
                throw new Exception("This keyValue doesn't exist in the list");
            }

        } //This is the case for two or more nodes in the linkedList
        else if (tmp.keyValue == keyValue) {
            tmp = tmp.next;
            first = tmp;
        } else {
            while (tmp.next != null && tmp.next.keyValue != keyValue) {
                tmp = tmp.next;
            }
            if (tmp.next == null) {
                throw new Exception("This keyValue doesn't exist in the list");
            }

        }
    }
}
