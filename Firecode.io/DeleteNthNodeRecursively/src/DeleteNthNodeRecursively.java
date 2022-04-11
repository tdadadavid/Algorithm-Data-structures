public class DeleteNthNodeRecursively {
    public ListNode deleteAtIndex(ListNode head , int n){

        // if the head is null return null
        if (head == null) return null;

        // if at a point n == 0 return the
        // next element after the current index (n)
        if(n == 0) return head.next;

        // decrease the value of n
        head.next = deleteAtIndex(head.next , --n);

        return head;

    }
}

