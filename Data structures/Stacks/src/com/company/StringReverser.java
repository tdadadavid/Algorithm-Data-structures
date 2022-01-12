package com.company;

import java.util.Stack;

public class StringReverser {
    private Stack<Character> stack = new Stack<>();

    public String reverse(String string) {
        if (string == null)
            throw new IllegalArgumentException("Wrong Argument given");

        for (char character : string.toCharArray()) {
            stack.push(character);
        }

        StringBuffer reversedString = new StringBuffer();
        while (!stack.isEmpty())
            reversedString.append(stack.pop());

        return reversedString.toString();
    }
}
