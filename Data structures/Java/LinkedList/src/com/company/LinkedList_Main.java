package com.company;

public class LinkedList_Main {

    public static void main(String[] args) {
        DoubleLinkedList<Integer> doubleLinkedList = new DoubleLinkedList<>();
        doubleLinkedList.addLast(1);
        doubleLinkedList.addLast(2);
        doubleLinkedList.addLast(3);
        doubleLinkedList.addLast(4);
        doubleLinkedList.addLast(5);

        DoubleLinkedList<Integer> doubleLinkedList1 = new DoubleLinkedList<>();
        doubleLinkedList1.addLast(6);
        doubleLinkedList1.addLast(7);
        doubleLinkedList1.addLast(8);
        doubleLinkedList1.addLast(9);
        doubleLinkedList1.addLast(10);

        doubleLinkedList.concatenate(doubleLinkedList1);
    }
}
