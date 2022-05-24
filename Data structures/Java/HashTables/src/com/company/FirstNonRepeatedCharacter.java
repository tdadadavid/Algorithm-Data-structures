package com.company;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatedCharacter {

    public static void main(String[] args) {

        // Solution 1. ( Without map)


        String sentence = "a green apple";
        char[] sentenceArr = sentence.toCharArray();
        int index = 0;

//        for (char character : sentenceArr){
//            if (index == sentence.lastIndexOf(character)) {
//                System.out.println(character);
//                break;
//            }
//            index++;
//        }


        // Solution 2

        // Solution 2 using HashMap
        Map<Character, Integer> checker = new HashMap<>();

        for (char character : sentenceArr) {

            // get the count value for this key and if it does not have return 0
            int count = checker.getOrDefault(character, 0);

            // if the key was present in the Hashmap increment it count value,
            // or if it just being added , then it's count should be 1
            checker.put(character, count + 1);
        }

        for (char chars : sentenceArr)
            if (checker.get(chars) == 1) {
                System.out.println(chars);
                break;
            }

    }
}
