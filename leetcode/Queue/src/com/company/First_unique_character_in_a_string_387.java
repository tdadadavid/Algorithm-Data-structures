package com.company;

public class First_unique_character_in_a_string_387 {

    public static void main(String[] args) {

        String letters = "aabb";

        System.out.println(uniqueChar(letters));


    }


    public static int uniqueChar(String letters) {

        for (int i = 0; i <= letters.length() - 1; i++)
            if (letters.indexOf(letters.charAt(i)) == letters.lastIndexOf(letters.charAt(i)))
                return i;

        return -1;
    }
}


