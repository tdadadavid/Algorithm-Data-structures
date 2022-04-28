import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {

    @Test
    void mergePointFound(){

        var list = new SinglyLinkedList();

        SinglyLinkedListNode head
                = list.insertNode(1);

        list.insertNode(2);
        list.insertNode(3);

        var list1 = new SinglyLinkedList();

        SinglyLinkedListNode head2
                = list1.insertNode(9);

        list1.insertNode(3);

        var test = new LinkedList();

        SinglyLinkedListNode result = test.findMergeNode(head, head2);

//        assertEquals( , result);

    }

    //    @Test
//    void itReversesTheList(){
//        var list = new SinglyLinkedList();
//
//        SinglyLinkedListNode head
//                = list.insertNode(10);
//
//
//        list.insertNode(20);
//        list.insertNode(30);
//        list.insertNode(40);
//        list.insertNode(50);
//        list.insertNode(60);
//        list.insertNode(70);
//
//        var test = new LinkedList(list);
//        SinglyLinkedListNode node = test.reverse(head);
//
//        assertEquals(node.data , list.tail.data);
//    }


//    @Test
//    void duplicatesAreRemoved(){
//        var list = new SinglyLinkedList();
//
//        SinglyLinkedListNode head
//                = list.insertNode(10);
//
//
//        list.insertNode(20);
//        list.insertNode(20);
//        list.insertNode(20);
//        list.insertNode(50);
//        list.insertNode(30);
//        list.insertNode(30);
//
//        var uniqueValues = new SinglyLinkedList();
//
//        SinglyLinkedListNode head2 = uniqueValues.insertNode(10);
//        uniqueValues.insertNode(20);
//        uniqueValues.insertNode(50);
//        uniqueValues.insertNode(30);
//
//        var test = new LinkedList(list);
//        assertEquals(head2, test.removeDuplicates(head));
//    }

}