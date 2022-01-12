package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class BalancedExpression {

    private final List<Character> rightBracket = Arrays.asList('(', '[', '{', '<');
    private final List<Character> leftBracket = Arrays.asList(')', ']', '{', '>');
    Stack<Character> stack = new Stack<>();
    String stringValue;

    public BalancedExpression(String stringValue) {
        this.stringValue = stringValue;
    }

    public boolean isBalanced() {
        for (char character : stringValue.toCharArray()) {
            if (isLeftBracket(character))
                stack.push(character);

            if (isRightBracket(character)) {
                if (stack.empty()) return false;

                var top = stack.pop();
                if (bracketsMatch(top, character)) return false;
            }
        }

        return stack.empty();
    }

    private boolean isRightBracket(char character) {
        return rightBracket.contains(character);
    }

    private boolean isLeftBracket(char character) {
        return leftBracket.contains(character);
    }

    private boolean bracketsMatch(char left, char right) {
        return leftBracket.indexOf(left) == rightBracket.indexOf(right);
    }
}
