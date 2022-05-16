package com.company;

public class LC1721_SwappingNodesInALinkedList {
    /*
       * The list is 1-indexed keep that in mind
       *
       * The ideology is that we have to iterate
       * through the Linked-list to find the first
       * K-th node to swap, then move on to find the
       * next k-th node , after that swap their values
       * and return the head of the list
       *
       * the first k-th node is the node from the front
       * while the second k-th node is the node from the
       * back.
       *
       * Three pointers are enough for this solution
       * but for better understanding "secondNode" is
       * introduced.
     */
    public ListNode swapNodes2(ListNode list , int k){

        ListNode firstNode, secondNode, slowPointer, fastPointer;

        slowPointer = fastPointer = list;

        for (int i = 0; i < k; i++)
            fastPointer = fastPointer.next;

        firstNode = fastPointer;

        while (fastPointer.next != null){
            fastPointer = fastPointer.next;
            slowPointer = slowPointer.next;
        }

        secondNode = slowPointer;

        int temp = firstNode.val;
        firstNode.val = secondNode.val;
        secondNode.val = temp;

        return list;
    }
}
