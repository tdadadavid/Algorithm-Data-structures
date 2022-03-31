package com.company;

import java.util.HashSet;
import java.util.Set;

public class ContainsASCIICharacters {

    public static void main(String[] args) {
        System.out.println(areAllASCIICharactersUnique("ahsbk"));
    }

    // using set(since all elements in a set are unique)
    public static boolean areAllASCIICharactersUnique(String str) {
        Set<Character> hasSet = new HashSet<>(256);

        // worst case O(n)
        // if all characters are unique
        for (Character character : str.toCharArray()) {
            if (hasSet.contains(character))
                return false;
            hasSet.add(character);
        }
        return true;
    }
}
