package com.company;

import java.util.Arrays;
import java.util.Collections;

public class ReverseWord {
    public static void main(String[] args) {
        String ans = reverseWord3("                  Trees      ....              ");
        System.out.println("'" + ans + "'");
    }

    private static String reverseWord(String str){
        if (str == null || str.equals(""))
            return "";

        String[] strArr = str.trim().split(" ");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < strArr.length/2; i++) { // O(log n)
            String temp = strArr[i];
            strArr[i] = strArr[strArr.length-1];
            strArr[strArr.length-1] = temp;
        }

        for (String eachWord : strArr) // O(n)
            sb.append(eachWord + " ");


        return String.valueOf(sb);
    }

    // better , buh triming whitespaces
    private static String reverseWord2(String str){
        if (str == null)
            return "";

        StringBuilder reversed = new StringBuilder();
        String[] words = str.split(" ");

        for (int i = words.length-1; i >= 0; i--)
            reversed.append(words[i] + " ");

        return reversed.toString().trim();
    }

    private static String reverseWord3(String str){
        if (str == null)
            return "";

        String[] words = str.trim().split(" ");
        Collections.reverse(Arrays.asList(words));
        return String.join(" " , words);
    }
}
