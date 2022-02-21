package com.company;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        String word = "";
        System.out.println(reverseStrings(word));
    }

    // very bad approach
    private static String reverseString(String string){
        if (string == null)
            return "";

        // convert string to array
        char[] stringArray = string.toCharArray(); // O(n)
        int j = stringArray.length-1;

        // reverse the array then
        for(int i = 0; i < stringArray.length / 2; i++){  // O(logn)
            char temp = stringArray[j];
            stringArray[j] = stringArray[i];
            stringArray[i] = temp;
            --j;
        }

        StringBuilder stringBuilder = new StringBuilder();

        for (char character : stringArray) // O(n)
            stringBuilder.append(character); // O(1)


        // convert the array back to string
        return String.valueOf(stringBuilder); // total time = O(n) + O(log n) + O(n)
    }

    // best approach
    private static String reverseStrings(String string)
    {
        if (string == null || string.equals(""))
            return "";

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = string.length() -1; i >= 0; i--) // O(n)
            stringBuilder.append(string.charAt(i)); // O(1)

        return stringBuilder.toString(); // total= O(n) + O(1)
    }
}
