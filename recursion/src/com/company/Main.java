package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println("1.String reversing");
        RecursiveManipulations Stringreverser = new RecursiveManipulations();
        var reversed = Stringreverser.reverse("so what is going on right now?");
        System.out.println(reversed);

        System.out.println();

        System.out.println("2.Palindrome");
        RecursiveManipulations word = new RecursiveManipulations();
        System.out.println(word.isPalindrome("rakceckar"));

        System.out.println();

        System.out.println("3.Recursive Sum");
        RecursiveManipulations sum = new RecursiveManipulations();
        System.out.println(sum.recursiveSum(10));

        System.out.println();

        System.out.println("4.Factorial");
        RecursiveManipulations factorial = new RecursiveManipulations();
        System.out.println(factorial.factorial(4));
    }
}
