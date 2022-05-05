package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LC234_PalindromeLinkedListTest {

    @Test
    void testIsPalindrome(){
        ListNode firstList = new ListNode(10);
        ListNode secondList = new ListNode(20);
        ListNode thirdList = new ListNode(20);
        ListNode fourthList = new ListNode(10);

        firstList.next = secondList;
        secondList.next = thirdList;
        thirdList.next = fourthList;
        fourthList.next = null;

        ListNode firstNode = new ListNode(10);
        ListNode secondNode = new ListNode(20);
        ListNode thirdNode = new ListNode(20);
        ListNode fourthNode = new ListNode(10);

        firstNode.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = fourthNode;
        fourthNode.next = null;


        LC234_PalindromeLinkedList test = new LC234_PalindromeLinkedList();

        assertTrue(test.isPalindrome2(firstNode));


    }

}