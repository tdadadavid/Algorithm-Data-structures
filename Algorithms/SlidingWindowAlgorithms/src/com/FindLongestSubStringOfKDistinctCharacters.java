package com;

import java.util.HashMap;
import java.util.HashSet;

public class FindLongestSubStringOfKDistinctCharacters {
    public static void main(String[] args) {
        String word = "abcbdbdbbdcdabd";
        System.out.println(findLongestSubString(word, 2));
    }

    private static String findLongestSubString(String word , int k){
          // check if the k is longer than the word
         // then return the whole string or if  k is
        // less than or equal to zero.

        if(k <= 0 || k >= word.length())
            return word;

        return "";
    }

}
