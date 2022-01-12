package com.company;

public class isPairAnagram {

    public static void main(String[] args) {
        // write your code here
    }

    public boolean isPairAnagram(String s1, String s2) {

        // convert the two strings to lower-case
        // because our search is case-insensitive
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        // check whether they have similar elements
        for (int i = 0; i <= s1.length() - 1; i++) {
            String item = Character.toString((s1.charAt(i)));

            if (!s2.contains(item))
                return false;
        }

        return true;
    }
}
