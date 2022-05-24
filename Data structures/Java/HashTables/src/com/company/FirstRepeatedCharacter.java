package com.company;

import java.util.HashSet;
import java.util.Set;

public class FirstRepeatedCharacter {

    public static void main(String[] args) {

        // work on this algorithm *it not perfectly correct*

        String sentence = "green apple";

        var sentenceArr = sentence.toCharArray();

        Set<Character> set = new HashSet<>();

        for (char item : sentenceArr){

            if (set.contains(item)) {
                System.out.println(item);
                break;
            }

            set.add(item);
        }

    }
}
