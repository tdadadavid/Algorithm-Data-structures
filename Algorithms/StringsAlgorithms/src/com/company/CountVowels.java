package com.company;

import java.util.HashMap;

public class CountVowels {
    public static void main(String[] args) {
        String word = "hello";
        System.out.println(countVowels(word));
    }

    private static int countVowels(String word){

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
}
