package com.company;

import java.util.Iterator;
import java.util.LinkedList;

public class DoubleLinkedList<E> {
    private class Node{
        private Node next;
        private Node prev;
        private E value;

        public Node(E element){
            this.value = element;
        }
    }

    private Node header;
    private Node trailer;
    private Node head;
    private Node tail;
    private int size;

    public DoubleLinkedList(){
        this.header = new Node(null);
        this.trailer = new Node(null);
    }

    public void addFirst(E element){
        Node newNode = new Node(element);
        if (isEmpty()){
            addIfEmpty(newNode);
        }
        else {
            header.next = newNode;
            newNode.prev = header;
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }

        size++;
    }

    public void addLast(E element){
        Node newNode = new Node(element);
        if (isEmpty())
            addIfEmpty(newNode);
        else {
            trailer.prev = newNode;
            newNode.next = trailer;
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }


        size++;
    }

    public void addBetween(E predecessor , E value){
    }

    public E removeFirst(){
        if (isEmpty())
            return null;

        var tmpNode = head;
        header.next = head.next;
        head = head.next;
        head.prev = header;

        size--;

        return tmpNode.value;
    }

    public E removeLast(){
        if (isEmpty())
            return null;

        var tmpNode = tail;
        trailer.prev = tail.prev;
        tail = tail.prev;
        tail.next = trailer;

        size--;

        return tmpNode.value;
    }

    public E head(){
        if (isEmpty())
            return null;
        return head.value;
    }

    public E tail(){
        if (isEmpty())
            return null;
        return tail.value;
    }

    public int size(){
        return size;
    }

    public int indexOf(E element) throws IndexOutOfBoundsException{
        int index = 0;
        Node currentNode = head;
        while (currentNode != null)
            if(currentNode.value == element)
                return index;
            else{
                currentNode = currentNode.next;
                index++;
            }
        return -1;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void concatenate(DoubleLinkedList<E> otherLinkedList){
        otherLinkedList.head.prev = tail;
        tail.next = otherLinkedList.head;
        otherLinkedList.tail.next = trailer;
        trailer.prev = otherLinkedList.tail;
        tail = otherLinkedList.tail;
    }

    private void addIfEmpty(Node newNode) {
        head = tail =  newNode;
        head.prev = header;
        head.next = trailer;
        tail.prev = header;
        tail.next = trailer;
        header.next = head;
        trailer.prev = tail;
        newNode.next = trailer;
    }


}
