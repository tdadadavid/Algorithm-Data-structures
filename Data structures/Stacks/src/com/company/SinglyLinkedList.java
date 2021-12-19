package com.company;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class SinglyLinkedList<E> {
    private class Node<E> {
        private Node next;
        private E value;

        public Node(E value){
            this.value = value;
        }

        public E NodeToString(){
            return this.value;
        }

    }

    private Node head = null;
    private Node tail = null;
    private Node newNode;
    private int size;

    public void addFirst(E element) {
        newNode = new Node(element);
        if (isEmpty()){
            head = tail = newNode;
        }
        else{
            newNode.next = head; //new node is pointing to the former head now
            head = newNode; // head is now the new node added
        }

        size++;
    }

    public void addLast(E element) {
       newNode = new Node(element);
       if(isEmpty())
            head = tail = newNode;
       else {
           tail.next = newNode;
           tail = newNode;
       }

       size++;
    }

    public E removeFirst() throws NoSuchElementException {
        Node tmpNode = head;
        if(isEmpty() )
            throw new NoSuchElementException();
        else if(head == tail){
            head = tail = null;
        }
        else {
            tmpNode = head;
            head = head.next;
        }

        size--;
        return (E) tmpNode.value;
    }

    public void removeLast() throws NoSuchElementException{
        if (isEmpty())
            throw new NoSuchElementException();

        if (head == tail){
            head = tail = null;
            return;
        }

        Node previous = getPreviousNode(tail);
        tail = previous;
        tail.next = null;

        size--;
    }

    public void rotate(){
       Node tmp = head;
       Node previous = getPreviousNode(tail);
       head = tail;
       tail = previous;
       tail.next = null;
       head.next = tmp;
    }

    public boolean contains(E element){
        return indexOf(element) != -1;

        // my solution
//        boolean flag = true;
//        Node currentNode = new Node(element);
//        Node thisNode = this.head;
//        while (thisNode.next != null || thisNode == tail){
//            if (thisNode.value == currentNode.value) {
//                return true;
//            }
//            if(thisNode == tail){
//                break;
//            }else
//                thisNode = thisNode.next;
//        }
//        return false;
    }

    public int indexOf(E element) throws IndexOutOfBoundsException{
        int index = 0;
        Node thisNode = head;
        while (thisNode != null)
            if(thisNode.value == element)
                return index;
            else{
                thisNode = thisNode.next;
                index++;
            }
    return -1;
    }

    public int size(){
        return size;

        //My solution
//        Node currentNode = this.head;
//        int count = 0;
//
//        while(currentNode != null){
//            count++;
//            currentNode = currentNode.next;
//        }
//    return count;
    }

    public String toArray(){
        if(isEmpty())
            throw new NullPointerException("No element in the list");

        E array[] = (E[]) new Object[size];
        int length = 0;

        var currentNode = this.head;
        while (currentNode != null ){
            array[length++] = (E) currentNode.value;
            currentNode = currentNode.next;
        }
        return Arrays.toString(array);
    }

    public void reverse() {
        if (isEmpty()) return;

        var previousNode = head;
        var currentNode = head.next;
        while (currentNode != null){
            var tmpNode = currentNode.next;
            currentNode.next = previousNode;
            previousNode = currentNode;
            currentNode = tmpNode;
        }

        tail = head;
        tail.next = null;
        head = previousNode;
    }

    public E getKthNodeFromTheEnd(int k){
        if (isEmpty()) throw new IllegalStateException();

        if(k > size) throw new IllegalArgumentException();

        Node first = head;
        Node second = head;

        //creating the accurate distance between them
        for (int i = 0; i < k - 1; i++)
            second = second.next;

        while (second != tail){
            first = first.next;
            second = second.next;
        }

        return (E) first.value;
    }

    private Node getPreviousNode(Node node){
        Node currentNode = head;

        while (currentNode != null){
            if(currentNode.next == node) return currentNode;
            currentNode = currentNode.next;
        }
        return null;
    }

    protected boolean isEmpty(){
        return this.head == null;
    }

}
