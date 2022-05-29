
// A queue can be implemented using
//  - An array
//  - A linked-list
//  - A stack

// Here I'm using an array to make a queue

import java.util.Arrays;

public class ArrayQueue<E> {

    private int front = 0;
    private int rear = 0;

    private E[] element;

    public ArrayQueue(int size){
        this.element =  (E[]) new Object[size];
    }
    public ArrayQueue(){
        this(10);
    }

    // [10,20,30,0]

    // enqueue
    public void enqueue(E value){
        if (isFull()) throw new IllegalStateException("Queue is already full");

        this.element[rear++] = value;
    }

    // dequeue
    public E dequeue(){
        if (isEmpty()) throw new IllegalStateException("Queue is empty");

        // remove the first element from the queue
        E elementAtFrontOfQueue = this.element[front];

        // move the pointer forward to simulate
        // the removal of the first element
        front++;

        return elementAtFrontOfQueue;
    }

    // poll
    public E poll(){
        if(isEmpty()) return null;

        // remove the first element from the queue
        E elementAtFrontOfQueue = this.element[front];

        // move the pointer forward to simulate
        // the removal of the first element
        front++;

        return elementAtFrontOfQueue;
    }

    // peek
    public E peek(){
        if (isEmpty()) return null;

        E elementAtFrontOfQueue = this.element[front];

        return elementAtFrontOfQueue;
    }

    // isEmpty
    public boolean isEmpty(){
        return front == rear;
    }

    // isFull
    public boolean isFull(){
        return rear > this.element.length-1;
    }

    public String toString(){
        return Arrays.toString(this.element);
    }

}
