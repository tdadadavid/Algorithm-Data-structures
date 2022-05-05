package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class LC234_PalindromeLinkedList {

    // Time complexity = O(n)
    // Space complexity = O(n)

    public boolean isPalindrome(ListNode list){

        List<Integer> values = new ArrayList<>();

        while (list != null){
            values.add(list.val);
            list = list.next;
        }

        int length = values.size()-1;

        for (Integer value : values) {
            if (!Objects.equals(value, values.get(length))) return false;

            length--;
        }

        return true;
    }


    public boolean isPalindrome2(ListNode listNode){

        if (listNode.next == null) return true;

        ListNode slowPointer = listNode;
        ListNode fastPointer = listNode;

        // find the middle of the list
        while (fastPointer != null && fastPointer.next != null){
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }

        // reverse the half
        ListNode reversed = reverse(slowPointer);

        // compare the first half and second
        while (listNode != null && reversed != null){

            if (listNode.val != reversed.val)
                return false;

            listNode = listNode.next;
            reversed = reversed.next;
        }

        return true;
    }

    public ListNode reverse(ListNode node){

        ListNode currentNode = node;
        ListNode previousNode = null;
        ListNode nextNode;

        while(currentNode != null){
            nextNode = currentNode.next;
            currentNode.next = previousNode;
            previousNode = currentNode;

            currentNode = nextNode;
        }

        node = previousNode;

        return node;
    }

}

