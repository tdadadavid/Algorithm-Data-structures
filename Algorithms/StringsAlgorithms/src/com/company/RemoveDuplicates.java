package com.company;

import java.util.HashSet;
import java.util.TreeSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "Trees are wonderful";
        String ans = removeDuplicates(str);
        System.out.println(ans);
    }

    public static String removeDuplicates(String str){
        if (str == null)
            return "";

        HashSet<Character> uniqueCharacters = new HashSet<>();
        StringBuilder uniqueString = new StringBuilder();

        for (char character : str.toCharArray()) { // O(n)
            if (!uniqueCharacters.contains(character)) {
                uniqueCharacters.add(character);
                uniqueString.append(character);
            }
        }


        return String.valueOf(uniqueString);
    }
}
