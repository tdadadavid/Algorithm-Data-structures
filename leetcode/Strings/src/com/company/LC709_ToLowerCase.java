package com.company;

import java.util.Arrays;

public class LC709_ToLowerCase {
    public static void main(String[] args){
        String word = "LOVELY";
        String word2 = "al&phaBET";
        System.out.println(toLower(word2));
    }

    // time complexity = O(n)
    public static String toLowerCase(String s){

        // initialize a string builder, to work with mutable strings
        StringBuilder lowerCaseBuilder = new StringBuilder();

        // iterate over each character in the sentence
        for (int i = 0; i < s.length(); i++){
            // check if the character is an
            // uppercase of lower case character
            // lowercase character range (97-122)
            // uppercase character range (65-90)
            // special characters range (66-96)
            if (s.charAt(i) >= 65 && s.charAt(i) < 97 ) {
                // check again if there are special characters
                // in the word that are between 91 and 96
                // if they're there just append them
                if (s.charAt(i) >= 91 && s.charAt(i) <= 96)
                    lowerCaseBuilder.append(s.charAt(i));
                else
                    // add 32 to the integer value of the capital letter
                    // and convert it back into a character
                    lowerCaseBuilder.append((char) (s.charAt(i) + 32));
            }
            else
                // append the lowercase character to the mutable string
                lowerCaseBuilder.append(s.charAt(i));
        }

        // return the string value of the string builder
        return String.valueOf(lowerCaseBuilder);
    }

    // how ??
    public static String toLower(String str) {
        char[] a = str.toCharArray();
        for (int i = 0; i < a.length; i++)
            if ('A' <= a[i] && a[i] <= 'Z')
                a[i] = (char) (a[i] - 'A' + 'a');
        return new String(a);
    }
}
