package com.company;

import java.util.HashMap;
import java.util.HashSet;

public class CountVowels {
    public static void main(String[] args) {
        String word = "   E      nkll"; // returns 1
        System.out.println(countVowel(word));
    }

    private static int countVowels(String word){
        if(word == null)
            return 0;

        word = word.toLowerCase();

        HashMap<Character, Character> vowels = new HashMap<>();
        vowels.put('a' , 'A');
        vowels.put('e' , 'E');
        vowels.put('i' , 'I');
        vowels.put('o' , 'O');
        vowels.put('u' , 'U');

        int count  = 0;

        for (char character : word.toCharArray())
            if(vowels.containsKey(character))
                count++;

        return count;
    }

    private static int countVowel(String sentence){
        if (sentence == null)
            return 0;

        int count = 0;

        HashSet<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

        for (char character : sentence.toLowerCase().toCharArray())
            if (vowels.contains(character))
                count++;

        return count;
    }
}
