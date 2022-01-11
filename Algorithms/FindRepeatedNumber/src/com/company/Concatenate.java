package com.company;

import java.util.LinkedList;

public class Concatenate<E> {

    LinkedList<E> linkedList;
    LinkedList<E> linkedList1;

    public Concatenate(LinkedList<E> firstLinkedList, LinkedList<E> secondLinkedList) {
        this.linkedList = firstLinkedList;
        this.linkedList1 = secondLinkedList;
    }

    public void concatenate() {
        for (E items : linkedList1) {
            linkedList.add(items);
        }
        linkedList1 = null;
    }
}
