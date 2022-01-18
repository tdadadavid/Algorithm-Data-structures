package com.company;

public class FibonacciSeriesRecursive {
    public static void main(String[] args){
        System.out.println(fibonacci(7));
    }

    public static int fibonacci(int value){
        //There must be a condition for this
        // recursion to break

        if (value == 1 || value == 0)
            return value;

        return fibonacci(value - 1) + fibonacci(value - 2);
    }

}
