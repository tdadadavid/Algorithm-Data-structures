import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {

    @Test
    void itReversesTheList(){
        var list = new SinglyLinkedList();

        SinglyLinkedListNode head = list.insertNode(10);
        list.insertNode(20);
        list.insertNode(30);
        list.insertNode(40);
        list.insertNode(50);
        list.insertNode(60);
        list.insertNode(70);

        var test = new LinkedList(list);
        test.reverse(head);

        assertEquals(list.head.data, list.tail.data);
    }

}