package com.company;

import java.util.Stack;

public class LC20_ValidParentheses {

    // Time complexity = O(n)
    // Space complexity = O(n)
    public boolean isValid2(String s){

        if(s.charAt(0) == '}' || s.charAt(0) == ')' || s.charAt(0) == ']')
            return false;

        Stack<Character> characters = new Stack<>();

        for (char letter : s.toCharArray()){

            switch (letter) {
                case '{', '(', '[' -> characters.push(letter);
                case '}' -> {
                    if (!characters.empty() && characters.peek() == '{')
                        characters.pop();
                    else  characters.push(letter);
                }
                case ')' -> {
                    if (!characters.empty() && characters.peek() == '(') characters.pop();
                    else characters.push(letter);
                }
                case ']' -> {
                    if (!characters.empty() && characters.peek() == '[') characters.pop();
                    else characters.push(letter);
                }
            }

        }

        return characters.empty();
    }

    // Time complexity = O(n)
    // Space complexity = O(n)
    public boolean isValid(String s){

        // return false if starts with a closing bracket
        if(s.charAt(0) == '}' || s.charAt(0) == ')' || s.charAt(0) == ']')
            return false;

        Stack<Character> characters = new Stack<>();

        // iterate over the character array
        for (char letter : s.toCharArray()){
            // push to the stack if it's an opening bracket
            if (letter == '{' || letter == '(' || letter == '[')
                characters.push(letter);
            else {
                // if the letter is equal to a closing bracket and the stack is not
                // empty and the bracket at the top of the stack is it's opening
                // bracket pop it  else push it to the stack
                if (letter == '}' && !characters.empty() && characters.peek() == '{')
                    characters.pop();
                else if (letter == ')' && !characters.empty() && characters.peek() == '(')
                    characters.pop();
                else if (letter == ']' && !characters.empty() && characters.peek() == '[')
                    characters.pop();
                else
                    characters.push(letter);
            }
        }

        // return true if the stack is empty else false.
        return characters.isEmpty();
    }
}
