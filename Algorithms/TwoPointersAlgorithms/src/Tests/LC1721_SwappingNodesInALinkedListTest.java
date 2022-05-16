package Tests;

import com.company.LC1721_SwappingNodesInALinkedList;
import com.company.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LC1721_SwappingNodesInALinkedListTest {

    @Test
    void itShouldSwapTheNodes(){
        // This test is not complete
        // this is just for debugging purposes.
        LC1721_SwappingNodesInALinkedList test = new LC1721_SwappingNodesInALinkedList();

        ListNode list4 = new ListNode(40);
        ListNode list3 = new ListNode(30, list4);
        ListNode list2 = new ListNode(20, list3);
        ListNode list = new ListNode(10, list2);

       ListNode result =  test.swapNodes2(list, 1);
    }

}