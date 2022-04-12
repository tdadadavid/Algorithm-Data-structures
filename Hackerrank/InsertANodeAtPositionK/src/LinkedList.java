import com.company.SinglyLinkedListNode;

public class LinkedList {
    public static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode llist, int data, int position) {

        // if head the null return the data as the head
        if(llist == null)
            return new SinglyLinkedListNode(data);

        int count = 0; // pointer
        SinglyLinkedListNode currentNode = llist;
        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);

        while(currentNode !=  null) {
            if(count == position-1){
                SinglyLinkedListNode temporaryStorage = currentNode.next;
                currentNode.next = newNode;
                newNode.next = temporaryStorage;
            }

            count++;
            currentNode = currentNode.next;
        }

        return llist;
    }

    static void printLinkedList(SinglyLinkedListNode head) {
        while(head!= null){
            System.out.println(head.data);
            head = head.next;
        }

    }

    static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
        if(head == null)
            return new SinglyLinkedListNode(data);

        SinglyLinkedListNode previousTailNode = getTailNode(head);
        previousTailNode.next = new SinglyLinkedListNode(data);

        return head;
    }

    private static SinglyLinkedListNode getTailNode(SinglyLinkedListNode node){

        while(node != null){
            if(node.next == null)
                break;
            node = node.next;
        }
        return node;
    }

    static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode llist, int data) {
        if(llist == null)
            return new SinglyLinkedListNode(data);

        SinglyLinkedListNode newHead = new SinglyLinkedListNode(data);
        SinglyLinkedListNode previousHead = llist;

        newHead.next = previousHead; // for readability sake

        return newHead;
    }
}


