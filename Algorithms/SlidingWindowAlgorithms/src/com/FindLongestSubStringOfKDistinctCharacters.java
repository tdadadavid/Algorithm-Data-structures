package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class FindLongestSubStringOfKDistinctCharacters {
    public static void main(String[] args) {
        String word = "aabafxzcdaef";
        System.out.println(findLongestSubString(word, 2));
    }

    private static String findLongestSubString(String word , int noOfDistinctChar){

        // check whther the word is null and return an empty char
        if (word.isEmpty())
            return "";
        // check whether the noOfDistinct is greater than the word
        if(word.length() < noOfDistinctChar)
        // and return the word as the result
            return word;

        // we are gonna iterate from 0 to length of word
        // while iterating we increase our window-end by
        // 1 until we see a more than the number of distinct
        // character then add previous characters to a hashset
        // and shift the window by 1

        // the structure of the hashmap should be that we map
        // the length of the string to the string itself

        StringBuilder sb = new StringBuilder();
        HashMap<Integer , String> wordsAndLen = new HashMap<>();
        HashSet<Character> uniqueChar = new HashSet<>();
        int distinctCharCount = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < word.length(); i++){
            if (!uniqueChar.contains(word.charAt(i))){

                uniqueChar.add(word.charAt(i));

                distinctCharCount++;

                sb.append(word.charAt(i));

                if (distinctCharCount >= noOfDistinctChar-1){
                    max = Math.max(max , String.valueOf(sb).length());
                    wordsAndLen.put(String.valueOf(sb).length() , String.valueOf(sb));
                    sb.delete(0,String.valueOf(sb).length());
                    distinctCharCount = 0;
                }
            }
            else
                sb.append(word.charAt(i));

        }

        return wordsAndLen.get(max);
    }

}
