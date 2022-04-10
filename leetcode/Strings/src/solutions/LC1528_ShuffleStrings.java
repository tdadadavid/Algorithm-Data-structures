package com.company;

import java.util.Arrays;
import java.util.HashMap;

public class LC1528_ShuffleStrings {
    public static void main(String[] args) {
        String string = "codeleet";
        int[] indices = {4,5,6,7,0,2,1,3};
        String string2 = "acb";
        int[] indices2 = {0,2,1};
        System.out.println(shuffle(string, indices));
        System.out.println(shuffle(string2, indices2));
    }

    // time complexity = O(n)
    // Space complexity = O(n)
    private static String shuffle(String word, int[] indices){

        StringBuilder stringBuilder = new StringBuilder();
        HashMap<Integer, Character> characterIndex = new HashMap<>();

        for (int i = 0; i < indices.length; i++) // O(n)
            characterIndex.put(indices[i], word.charAt(i));

        for (int index : characterIndex.keySet())
            stringBuilder.append(characterIndex.get(index)); // O(1)

        return String.valueOf(stringBuilder);
    }

    // Time complexity = O(n)
    // space complexity = O(n)
    public static String shuffle2(String s, int[] in) {
        char[] c = new char[in.length];
        for(int i = 0; i < in.length; i++)
            c[in[i]] = s.charAt(i);
        return new String(c);
    }
}
