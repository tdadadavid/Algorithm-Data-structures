import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeleteNthNodeRecursivelyTest {

    @Test
    void deleteAtIndexRecursively(){
        var test = new DeleteNthNodeRecursively();
        ListNode fifthNode = new ListNode(5);
        ListNode fourthNode = new ListNode(4, fifthNode);
        ListNode thirdNode = new ListNode(3, fourthNode);
        ListNode secondNode = new ListNode(2, thirdNode);
        ListNode head = new ListNode(1, secondNode);

        ListNode tailNode = new ListNode(5);
        ListNode secNode = new ListNode(3, tailNode);
        ListNode firNode = new ListNode(2, secondNode);
        ListNode result = new ListNode(1, firNode);


        assertEquals(result.toString(), (test.deleteAtIndex(head , 3)).toString());
    }

}