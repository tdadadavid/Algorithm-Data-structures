package com.company;

public class LinkedListStack<E> extends SinglyLinkedList_2<E> {
    private final SinglyLinkedList_2<E> list = new SinglyLinkedList_2();

    public LinkedListStack() {

    }

    public void push(E value) {
        list.addFirst(value);
    }

    public E pop() {
        return list.removeFirst();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int size() {
        return list.size();
    }

    public void peek() {

    }

    public boolean isHTMLMatched(String html) {
        LinkedListStack<String> buffer = new LinkedListStack();

        int j = html.indexOf("<");

        while (j != -1) {
            int k = html.indexOf('>', j + 1);
            if (k == -1)
                return false;
            String tag = html.substring(j + 1, k);
            if (!tag.startsWith("/"))
                buffer.push(tag);
            else {
                if (buffer.isEmpty())
                    return false;
                if (!tag.substring(1).equals(buffer.pop()))
                    return false;
            }
            j = html.indexOf('<', k + 1);
        }

        return buffer.isEmpty();
    }

}
