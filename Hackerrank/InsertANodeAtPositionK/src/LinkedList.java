import java.util.HashSet;
import java.util.Set;

public class LinkedList {
    SinglyLinkedList node;
    public LinkedList(SinglyLinkedList node){
        this.node  = node;
    }

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

    public static SinglyLinkedListNode deleteNode(SinglyLinkedListNode llist, int position) {
        // check if the linked-list is null
        if(llist  == null)
            return null;

        if(position == 0)
            return llist.next;

        int count = 0;
        SinglyLinkedListNode currentNode = llist;

        while(currentNode != null){
            if(count == position-1){
                currentNode.next = currentNode.next.next;
            }

            count++;
            currentNode = currentNode.next;
        }
        return llist;
    }

    public SinglyLinkedListNode reverse(SinglyLinkedListNode head) {
        if(head == null) return null;

        SinglyLinkedListNode currentNode = head;
        SinglyLinkedListNode previousNode = null;
        SinglyLinkedListNode temporaryNode;

        while(currentNode != null){
            // store the address of the next node "first"
            // because it would be lost as current node points to  previous node
            temporaryNode = currentNode.next;
            // reverse the current node to point to previous node
            currentNode.next = previousNode;
            // move the previous node to the current node
            previousNode = currentNode;
            // move the current node to the next node
            // since we stored the address of the next
            // node  we can move forward
            currentNode = temporaryNode;
        }

        // make the head pointer point to the reversed list
        head = previousNode;

        return head;
    }

    public void IterativeReversePrint(SinglyLinkedListNode head) {

        // check if the head is empty
        if (head == null) return;

        // reverse the linked-list
        SinglyLinkedListNode reversedNode = this.reverse(head);

        // iterate through the reversed list and print
        // out every node's data
        while (reversedNode != null){
            System.out.println(reversedNode.data);
            reversedNode = reversedNode.next;
        }

    }

    // RECURSIVE SOLUTION (CAN BE VERY COSTLY)
    public void recursiveReversePrint(SinglyLinkedListNode head){
        // check if the head is not null
        if (head == null) return;

        recursiveReversePrint(head.next);
        System.out.println(head.data);
    }

    public boolean compareLists(SinglyLinkedListNode list1, SinglyLinkedListNode list2){

        // if "both" lists are null return true
        if(list1 == null && list2 == null) return true;

        // if "either" of the list is null return false
        if (list1 == null || list2 == null) return false;

        while (list1 != null && list2 != null){

            // if the node's data are not the same return false
            if (list1.data != list2.data) return false;

            // check if the lists are of equal length
            if (list1.next == null && list2.next != null)
                return false;

            if (list1.next != null && list2.next == null)
                return false;

            list1 = list1.next;
            list2 = list2.next;
        }

        return true;
    }


    public boolean compareList2(SinglyLinkedListNode headA, SinglyLinkedListNode headB){

        while( headA != null && headB != null && headA.data == headB.data){
            headA = headA.next;
            headB = headB.next;
        }

        return headA == headB;
    }

    public int getNodeData(SinglyLinkedListNode head, int positionFromTail){

        int twoPointerDistance = 0;
        SinglyLinkedListNode slowPointer = head;
        SinglyLinkedListNode fastPointer = head;


        while (twoPointerDistance < positionFromTail){
            fastPointer = fastPointer.next;
            twoPointerDistance++;
        }

        while (fastPointer.next != null) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next;
        }

        return slowPointer.data;
    }

    public SinglyLinkedListNode mergeLists(SinglyLinkedListNode firstHead, SinglyLinkedListNode secondHead){

        return firstHead;

    }

    public boolean hasCycle(SinglyLinkedListNode head){
        // check if its null
        if (head == null)
            return false;


        // use  hashset
        Set<SinglyLinkedListNode> visitedNodes = new HashSet<>();

        // iterate through the list
        while (head != null){
            // if the hashset contains a value return true
            if (visitedNodes.contains(head))
                return true;

            visitedNodes.add(head);
            head = head.next;
        }

        // else return false
        return false;
    }

}


