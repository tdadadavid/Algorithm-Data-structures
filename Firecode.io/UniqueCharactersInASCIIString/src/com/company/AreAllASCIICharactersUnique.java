package com.company;

import java.util.HashSet;
import java.util.Set;

public class AreAllASCIICharactersUnique {
    public static void main(String[] args) {
        String ASCIIString = "madam";
        System.out.println(areAllASCIICharactersUnique(ASCIIString));

    }

    public static boolean areAllASCIICharactersUnique(String str){

        Set<Character> set = new HashSet<>();

        for (char letter : str.toCharArray()) {
            if (set.contains(letter))
                return false;
            else
                set.add(letter);
        }

        return true;
    }
}
