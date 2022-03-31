package com.company;

import java.util.Arrays;
import java.util.HashMap;

public class LC1528_ShuffleStrings {
    public static void main(String[] args) {
        String string = "codeleet";
        String string2 = "acb";
        int[] indices = {4,5,6,7,0,2,1,3};
        int[] indices2 = {0,2,1};
        System.out.println(shuffle2(string, indices));
    }

    // time complexity = O(n²)
    private static String shuffle(String word, int[] indices){

        StringBuilder stringBuilder = new StringBuilder();
        HashMap<Integer, Character> characterIndex = new HashMap<>();

        for (int i = 0; i < indices.length; i++) // O(n)
            characterIndex.put(indices[i], word.charAt(i));

        for (int index : characterIndex.keySet()) // O(n)
            stringBuilder.append(characterIndex.get(index)); // O(1)

        return String.valueOf(stringBuilder);
    }

    // O(n)
    public static String shuffle2(String s, int[] in) {
        char[] c = new char[in.length];
        for(int i = 0; i < in.length; i++)
            c[in[i]] = s.charAt(i);
        return new String(c);
    }
}
