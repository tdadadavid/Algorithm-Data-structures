package com.company;

public class LC2114_MaximumNumberOfWordsFoundInASentence {
    public static void main(String[] args) {
        String[] sentences1 = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        String[] sentences2 = {"please wait", "continue to fight", "continue to win"};
        System.out.println(mostWordFound(sentences2));

    }

    // time complexity is O(n²)
    private static int mostWordFound(String[] sentences){
        int max = 0;

        // iterate over the sentences to get each sentence
        for (String sentence : sentences) // O(n)
            max = Math.max(max, sentence.split(" ").length ); // O(n)

        return max;
    }
}
