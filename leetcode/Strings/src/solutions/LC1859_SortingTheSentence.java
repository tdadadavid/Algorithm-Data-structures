package solutions;

import java.util.Arrays;

public class LC1859_SortingTheSentence {
    public static void main(String[] args) {
        String s = "is2 sentence4 This1 a3";
        System.out.println(sortSentence(s));

    }

    // Time complexity = O(n)
    // Space complexity = O(n)
    private static String sortSentence(String s){

        String[] strings = s.split(" ");

        String[] orderedArr = new String[strings.length];
        StringBuilder builder = new StringBuilder();

        int index;
        int wordLen;

        for (String word : strings){

            wordLen = word.length() - 1;

            index = Integer.parseInt(String.valueOf(word.charAt(wordLen)));
            orderedArr[--index] = word.substring(0 , wordLen);

        }

        for (String word : orderedArr)
            builder.append(word).append(" ");

        return String.valueOf(builder);
    }
}
