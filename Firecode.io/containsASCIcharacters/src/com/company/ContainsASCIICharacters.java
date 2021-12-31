package com.company;

import java.util.HashSet;
import java.util.Set;

public class ContainsASCIICharacters {

    public static void main(String[] args) {
        System.out.println(areAllAsciiCharactersUnique("ahsbak"));
    }

    // Brute force
    public static boolean areAllAsciiCharactersUnique(String str) {
        boolean flag = true;

        if(str.isEmpty()){
            flag = true;
        }

        char[] letters = str.toCharArray();

        int start = 0;
        int end = letters.length - 1;


        while(start < end){
            if(str.charAt(start) == str.charAt(end)){
                flag = false;
            }
            start++;
            end--;
        }

        return flag;
    }

    // using set(since all elements ina set are unique)
    public static boolean areAllASCIICharactersUnique(String str){
        Set<Character> hasSet = new HashSet<>(256);

        for(Character character : str.toCharArray()){
            if(hasSet.contains(character))
                return false;
            hasSet.add(character);
        }
        return true;
    }
}
