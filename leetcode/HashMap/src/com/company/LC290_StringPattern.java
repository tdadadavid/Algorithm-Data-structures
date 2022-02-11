package com.company;

import java.text.CharacterIterator;
import java.text.StringCharacterIterator;
import java.util.Arrays;
import java.util.HashMap;

public class LC290_StringPattern {
    public static void main(String[] args){
        String word = "acbc";
        String sentence = "dog fish dog dog";
        System.out.println(isThereAPattern(word, sentence));

    }

    private static boolean isThereAPattern(String word, String sentence){

        // convert word and sentence to array
        char[] wordArr = word.toCharArray();
        String[] sentenceArr = sentence.split(" ");

        HashMap<Character , String> hashPattern = new HashMap<>();

        for (int i = 0; i < wordArr.length; i++){
            char key = wordArr[i];
            if (hashPattern.containsKey(key)) {
                String sentenceEquivalent = sentenceArr[i];


                String value = hashPattern.get(key);

                if (!sentenceEquivalent.equalsIgnoreCase(value))
                    return false;

            }
            else
                hashPattern.put(wordArr[i] , sentenceArr[i]);
        }

        return true;
    }
}
