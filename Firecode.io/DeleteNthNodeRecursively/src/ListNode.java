public class ListNode {
    int data;       // Data as an Integer
    ListNode next;  // Reference to the next node, null if this is the last node

    /**
     * Constructor
     *
     * @param data Integer data
     * @param next ListNode referencing the next node in the list, or null
     */
    ListNode(int data, ListNode next) {
        this.data = data;
        this.next = next;
    }

    /**
     * Constructor that sets the tail pointer to null
     *
     * @param data Integer data
     */
    ListNode(int data) {
        this(data, null);
    }

}
