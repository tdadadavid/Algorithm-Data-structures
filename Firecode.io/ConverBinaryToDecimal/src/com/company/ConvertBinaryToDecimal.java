package com.company;

public class ConvertBinaryToDecimal {

    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        ListNode secondNode;
        head.next = secondNode = new ListNode(1);
//        secondNode.next = new ListNode(0);

        int answer = getDecimalValue(head);
        System.out.println(answer);

    }

    public static int getDecimalValue(ListNode head) {


        // work on this hard coded length of array
        // because it will give wrong result
        ListNode current = head;
        int[] binary = new int[3]; // don't hard code the size of this array.
        int decimal = 0;
        int index = 0;

        // copying the values in the ListNode into an array(binary)
        while (current != null) {

            binary[index] = current.val;
            index++;
            current = current.next;
        }

        int arrayLength = binary.length - 1;

        for (int i : binary) {
            decimal += i * Math.pow(2, arrayLength);
            arrayLength--;
        }

        return decimal;
    }

}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
