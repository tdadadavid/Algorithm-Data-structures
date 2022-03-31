package com;

import java.util.HashSet;

public class SubStringsOfSizeThreeWithDistinctCharacters {
    public static void main(String[] args) {
        String sentence = "xyzzaz";
        System.out.println(countGoodStrings(sentence));
    }

    // work on this
    public static int countGoodStrings(String sentence){

        int windowSize = 3;
        int windowStart = 0;
        int distinctCharCount = 0;

        HashSet<Character> uniqueElements = new HashSet<>();

        for (int i = 0; i < sentence.length(); i++){
            if (!uniqueElements.add(sentence.charAt(i)))
                windowStart++;

            if (i >= windowSize) {
                uniqueElements.remove(sentence.charAt(windowStart-1));
                distinctCharCount++;
            }
        }

        return distinctCharCount;
    }
}
