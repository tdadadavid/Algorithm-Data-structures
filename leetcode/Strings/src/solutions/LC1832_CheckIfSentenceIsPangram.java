package com.company;

import java.util.HashSet;

public class LC1832_CheckIfSentenceIsPangram{
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        String sentence2 = "leetcode";
        System.out.println(checkIfPangram(sentence2));
    }

    public static boolean checkIfPangram(String sentence) {
        int englishAlphabets = 0;
        HashSet<Character> letter = new HashSet<>();

        for(char character : sentence.toCharArray()){
            if(!letter.contains(character)){
                letter.add(character);
                englishAlphabets++;
            }
        }

        return englishAlphabets == 26;
    }
}
