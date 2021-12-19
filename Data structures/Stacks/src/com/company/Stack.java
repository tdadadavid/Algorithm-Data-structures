package com.company;

import java.util.Arrays;

public class Stack<E> {

    E[] array;
    private int index;
    private int top = -1;
    private int arraySize;

    public Stack(int size){
        this.arraySize = size;
        this.array = (E[]) new Object[arraySize];
    }

    public void push(E element) {
        if (index == arraySize)
            throw new StackOverflowError();

        array[index++] = element;
    }

    public E pop(){
        if (index == 0)
            throw new IllegalStateException();

        return array[--index];
    }

    public boolean isEmpty(){
        return index == 0;
    }

    public E peek(){
        if (index == 0)
            throw new IllegalStateException();

        return array[index - 1];
    }

    @Override
    public String toString(){
        var content = Arrays.copyOfRange(array , 0  , index);
       return Arrays.toString(content);
    }
}
