public class Solution {

    public DoublyLinkedListNode sortedInsert(DoublyLinkedListNode linkedListNode, int data) {
        DoublyLinkedListNode newNode = new DoublyLinkedListNode(data);

        if (linkedListNode == null) return newNode;

        DoublyLinkedListNode pointer = linkedListNode;

        while (linkedListNode.next != null){

            if (linkedListNode.data > data){

                if (linkedListNode.prev == null) {
                    newNode.next = linkedListNode;
                    return newNode;
                }else{
                    insert(linkedListNode, newNode);
                    return pointer;
                }
            }

            linkedListNode = linkedListNode.next;
        }

        if (linkedListNode.data > data) insert(linkedListNode, newNode);
        else linkedListNode.next = newNode;

        return pointer;
    }


    public static void insert(DoublyLinkedListNode linkedListNode, DoublyLinkedListNode newNode) {
        DoublyLinkedListNode previousNode = linkedListNode.prev;
        previousNode.next = newNode;
        newNode.next = linkedListNode;
    }
}




















class DoublyLinkedListNode {
    public int data;
    public DoublyLinkedListNode next;
    public DoublyLinkedListNode prev;

    public DoublyLinkedListNode(int nodeData) {
        this.data = nodeData;
        this.next = null;
        this.prev = null;
    }
}

class DoublyLinkedList {
    public DoublyLinkedListNode head;
    public DoublyLinkedListNode tail;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void insertNode(int nodeData) {
        DoublyLinkedListNode node = new DoublyLinkedListNode(nodeData);

        if (this.head == null) {
            this.head = node;
        } else {
            this.tail.next = node;
            node.prev = this.tail;
        }

        this.tail = node;
    }

    public DoublyLinkedListNode reverse(DoublyLinkedListNode head){

        if (head == null) return null;

        DoublyLinkedListNode currentNode = head;
        DoublyLinkedListNode previousNode;
        DoublyLinkedListNode newHead = head;

        while (currentNode != null){

            previousNode = currentNode.prev;
            currentNode.prev = currentNode.next;
            currentNode.next = previousNode;

            newHead = currentNode;
            currentNode = currentNode.next;
        }

        return newHead;
    }
}public static void testFunction(){}
