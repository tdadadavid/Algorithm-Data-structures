package com.company;

public class LC1662_CheckIfTwoStringArraysAreEquivalent {
    public static void main(String[] args) {
        String[] word1 = {"abc","d", "defg"}, word2 = {"abcddefg"};
        System.out.println(arrayStringsAreEkual(word1, word2));
    }

    // time complexity O(n))
    // where n is the length of the word1 array
    private static boolean arrayStringsAreEqual(String[] word1, String[] word2){
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        for (String s : word1) sb.append(s);

        for (String s : word2) sb2.append(s);

        return String.valueOf(sb).equals(String.valueOf(sb2));
    }

    // Time complexity = O(min(n,m))
    private static boolean arrayStringsAreEkual(String[] word1, String[] word2) {
        // index for each character
        // in the string.. that is "Character counters"
        int i = 0;
        int j = 0;

        // index for each string in
        // the array.. that "String counters"
        int w1Token = 0;
        int w2Token = 0;

        // loop until the indices are equal to the length of the array
        while (w1Token < word1.length && w2Token < word2.length){
             if (word1[w1Token].charAt(i) != word2[w2Token].charAt(j))
                 return false;

             i++;  j++;

             if (i >= word1[w1Token].length()){
                 i = 0;
                 w1Token++;
             }
             if (j >= word2[w2Token].length()){
                 j = 0;
                 w2Token++;
             }
        }

        return w1Token == word1.length && w2Token == word2.length;
    }
}