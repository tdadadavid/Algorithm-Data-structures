package com.company;

public class LC2011_FindTheValueOfVariableAfterPerformingOperations {
    public static void main(String[] args){
        String[] operations = {"++X", "--X", "X++", "X++"};
        System.out.println(findValuesAfterOperations(operations));
    }


    public static int findValuesAfterOperations(String[] words){
        int value = 0;

        for (String word : words){
            if (word.contains("++"))
                value++;
            else
                value--;
        }

        return value;
    }
}
