package com.company;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {

        Queue<String> printer = new LinkedList<>();
        printer.offer("first.pdf");
        printer.offer("second.pdf");
        printer.offer("third.pdf");

        printer.poll();

        System.out.println(printer.poll());
    }
}
