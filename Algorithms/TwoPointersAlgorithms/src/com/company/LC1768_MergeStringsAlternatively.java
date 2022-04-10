package com.company;

public class LC1768_MergeStringsAlternatively {
    public String mergeAlternatively(String word1, String word2){

        int longestString = Math.max(word1.length()-1 , word2.length()-1);

        StringBuilder stringBuilder = new StringBuilder();

        for(int i = 0; i <= longestString; i++){
            //if "i" is greater than the word1 length
            if (i > word1.length()-1)
                // then add only characters from word1
                stringBuilder.append(word2.charAt(i));
            //if "i" is greater than the word2 length
            else if(i > word2.length()-1)
                // then add only characters from word1
                stringBuilder.append(word1.charAt(i));
            else
                // add character at index i in word1 and word2
                stringBuilder.append(word1.charAt(i)).append(word2.charAt(i));
        }

        return String.valueOf(stringBuilder);
    }
}
