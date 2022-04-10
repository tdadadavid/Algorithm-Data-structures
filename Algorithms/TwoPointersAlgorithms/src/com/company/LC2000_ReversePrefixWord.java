package com.company;

public class LC2000_ReversePrefixWord {
    public String reversePrefix(String word, char c){
        char[] letters = word.toCharArray();
        StringBuilder builder = new StringBuilder();
        int len;

        for (char letter : letters) {
            builder.append(letter);

            if (letter == c) {
                len = String.valueOf(builder).length();
                return String.valueOf(builder.reverse().append(word.substring(len)));
            }

        }

        return word;
    }
}
