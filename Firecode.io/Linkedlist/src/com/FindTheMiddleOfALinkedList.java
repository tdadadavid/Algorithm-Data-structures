package com;

public class FindTheMiddleOfALinkedList {
    public static void main(String[] args){

    }
}

class ListNode{

/**
 * This class represents a node of a singly linked list.
 * The `data` field holds the data value of this node,
 * and the `next` field holds a reference to the next node
 * in the linked list, which is `null` if this is the last
 * node in the list.
 */
    int data;       // Data as an Integer
    ListNode next;  // Reference to the next node, null if this is the last node

    /**
     * Constructor
     *
     * @param data Integer data
     * @param next ListNode referencing the next node in the list, or null
     */
    ListNode(int data, ListNode next) {
        this.data = data;
        this.next = next;
    }

    /**
     * Constructor that sets the tail pointer to null
     *
     * @param data Integer data
     */
    ListNode(int data) {
        this(data, null);
    }

}
