package com.company;

import java.util.ArrayList;
import java.util.HashMap;

public class MostRepeatedCharacter {
    public static void main(String[] args) {
        String str = "aabgchiujolbbbbp";
        char mostRepeatedChar = mostRepeatedChar(str);
        System.out.println(mostRepeatedChar);
    }

    private static char mostRepeatedChar(String str) {
        final int ASCII_SIZE = 256;
        char[] frequencies = new char[ASCII_SIZE];


        for (char character : str.toCharArray())
            frequencies[character]++;


        int max = 0;
        char result = ' ';
        for (int i = 0; i < frequencies.length; i++)
            if (frequencies[i] > max) {
                max = frequencies[i];
                result = (char) i;
            }

        return result;
    }
}
