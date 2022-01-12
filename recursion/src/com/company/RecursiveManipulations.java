package com.company;


public class RecursiveManipulations {

    // Bolu => ulob
    public String reverse(String input) {
        // Base condition
        if (input.equals(""))
            return "";

        return reverse(input.substring(1)) + input.charAt(0);

    }

    // racecar
    public boolean isPalindrome(String input) {
        // Base condition
        if (input.length() == 1 || input.length() == 0)
            return true;

        if (input.charAt(0) == input.charAt(input.length() - 1))
            return isPalindrome(input.substring(1, input.length() - 1));

        return false;
    }

    public int recursiveSum(int input) {
        // Base condition
        if (input <= 1)
            return input;

        return input + recursiveSum(input - 1);
    }

    public int factorial(int input) {
        // Base condition
        if (input == 1 || input == 0)
            return 1;

        return input * factorial(input - 1);
    }
}
