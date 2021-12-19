package com.company;

public class CircularLinkedList<E> {
    private class Node<E> {
        public Node next;
        private E value;

        public Node(E value){
            this.value = value;
        }

        public E NodeToString(){
            return this.value;
        }
    }

    private Node head;
    private Node tail;
    private Node tmp;
    private Node newNode;
    private int size;

    public void addFirst(E element){
        newNode = new Node(element);
        if (!isEmpty()) {
            tmp = head;
            tail.next = newNode;
            head = newNode;
            head.next = tmp;
        }
        else
            head = tail = newNode;


        size++;
    }

    public void addLast(E element){
        newNode = new Node(element);
        if (!isEmpty()) {
            tmp = tail;
            tail = newNode;
            tmp.next = newNode;
            tail.next = head;
        }
        else
            head = tail = newNode;


        size++;
    }

    public void removeFirst(){
        if (isEmpty())
            throw new IllegalStateException();

        if (head == tail)
            head = tail = null;
        else {
            tail.next = head.next;
            head = head.next;
        }

        size--;
    }

    public void removeLast(){
        Node previous = getPreviousNode(tail);

        if (isEmpty())
            throw new IllegalStateException();

        if (head == tail)
            head = tail = null;
        else {
            previous.next = head;
            tail = previous;
        }

        size--;
    }

    public void rotate(){
        if (isEmpty())
            throw new IllegalStateException();

       tail = tail.next;
       head = head.next;
    }

    public int indexOf(E element){
        Node currentNode = head;
        int index = 0;

        if (head == tail)
            return index;

        while (currentNode.next != head || currentNode == tail) {
            if (currentNode.value == element)
                return index;
            else {
                currentNode = currentNode.next;
                index++;
            }
        }

      return -1;
    }

    public  void split(){
        boolean even = (size % 2) == 0;
        int mid = size % 2;
        int check = 0;


    }

    public int size(){
        return size;
    }

    private Node<E> getPreviousNode(Node node){
        Node currentNode = head;

        while (currentNode != tail) {
            if (currentNode.next == node) return currentNode;
            currentNode = currentNode.next;
        }
        return null;
    }

    private boolean isEmpty(){
        return head == null;
    }

}
