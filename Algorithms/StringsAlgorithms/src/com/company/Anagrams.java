package com.company;

public class Anagrams {

    public boolean isAnagram(String firstWord, String secondWord){
        // check if the length of the words are equal else return false
        if(firstWord.length() != secondWord.length()) return false;

        // ensure all the strings are in lowercase
        firstWord = firstWord.toLowerCase();
        secondWord = secondWord.toLowerCase();

        // make an array with the length of 256 using 8bit system
        int[] frequencies = new int[256];

        // iterate through the first string
        for (char letter: firstWord.toCharArray())
            // count the frequency of each character in the string
            frequencies[letter]++;

        // iterate through the second string
        for (char letter: secondWord.toCharArray())
            // decrement the frequency of each character that
            // corresponds to the same character in the first string
            frequencies[letter]--;

        // iterate through the array of letter check if the frequency
        // of any letter is greater than zero , then return false
        for (int frequency : frequencies)
            if (frequency > 0) return false;

     return true;
    }
}
