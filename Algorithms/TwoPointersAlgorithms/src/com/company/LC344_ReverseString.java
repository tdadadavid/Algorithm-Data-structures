package com.company;

public class LC344_ReverseString {
    public static void main(String[] args) {
        char[] testcase1 = {'h','e','l','l','o'};
        char[] testcase2 = {'H','a','n','r','a','h'};

        reverseString(testcase1);
        reverseString(testcase2);

    }

    private static void reverseString(char[] s){

        int leftPointer = 0;

        // initialise the right pointer
        int rightPointer = s.length - 1;

        // "i" is used for the left pointer
        for (int i = 0; i < (s.length / 2); i++){
            char temp = s[leftPointer];
            s[leftPointer++] = s[rightPointer];
            s[rightPointer--] = temp;
        }

        System.out.println(s);
    }
}
