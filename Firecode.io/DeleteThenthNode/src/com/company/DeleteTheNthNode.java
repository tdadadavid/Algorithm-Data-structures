package com.company;

public class DeleteTheNthNode {
    public static void main(String[] args) {

    }

    // solution for deleting at an index
//    private static void deleteAtIndex(){
//        public ListNode deleteAtIndex(ListNode head, int n) {
//            if (n == 0) {
//                return head == null ? null : head.next;
//            }
//
//            ListNode iterator = head, previous = new ListNode(0, head);
//            while (iterator != null && n > 0) {
//                previous = iterator;
//                iterator = iterator.next;
//                n--;
//            }
//            previous.next = iterator == null ? null : iterator.next;
//            return head;
//        }
//    }


//    private static void deleteAtIndex(){
//        if(head == null)
//            return null;
//
//        if(n == 0)
//            return head.next;
//
//        int count = 0;
//        ListNode currentNode = head;
//        ListNode slowNode = head;
//
//        while(currentNode != null){
//
//            if((count + 1) == n){
//                slowNode = currentNode;
//                slowNode.next = currentNode.next.next;
//                break;
//            }
//
//            currentNode = currentNode.next;
//            count++;
//        }
//
//        return head;
//    }
}
