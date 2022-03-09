package com.company;

import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

public class PatternMatching {
    public static void main(String[] args){
        String text = "Pattern matching requires great thinking";
        String pattern = "to the";
        slidingWindowAlgorithm(text , pattern);
    }


    // time complexity = O(N*M)
    // where N = len of text, M = len of pattern
    private static int findBruteForce(@NotNull String text, @NotNull String pattern){
        char[] textArr = text.toCharArray();
        char[] patternArr = pattern.toCharArray();

        int textLength = textArr.length; // n
        int patternLength = patternArr.length; // m

        //reason for the +1 is for a case whereby
        // the pattern length is equal to the
        // text length, so it will run once
        for (int i = 0; i < textLength - patternLength + 1; i++){ // O(n - m + 1)  times
            int k = 0;

            while (k < patternLength && textArr[i + k] == patternArr[k]) // O(m) times
                k++;

            if (k == patternLength)
                return i;
        }

        return  -1;
    }

    private static int findBoyerMoore(String text ,String pattern){
        char[] textArr = text.toCharArray();
        char[] patternArr = pattern.toCharArray();

        int textLen = textArr.length;
        int patternLen = patternArr.length;

        // check if the pattern is an empty string
        if (patternLen == 0)
            return  0;

        // look up table
        Map<Character, Integer> last = new HashMap<>();

        for (int i = 0; i < textLen; i++)
            last.put(textArr[i] , -1);

        for (int k = 0; k < patternLen; k++)
            last.put(patternArr[k], k);

        int i = textLen - 1;
        int k = patternLen - 1;

        while (i < textLen){
            if (textArr[i] == patternArr[k]){
                if (k == 0)
                    return i;
                i--;
                k--;
            }
            else {
                i += patternLen - Math.min(k , 1 + last.get(textArr[i]));
                k = patternLen - 1;
            }
        }

        return -1;
    }

    private static boolean boyerMooreAlgorithm(String text , String pattern){
        //check whether the pattern is an empty string
        if (pattern.length() == 0)
            return false;

        // get the pattern length
        int patternLen = pattern.length();

        // convert the string to char array for convinence
        char[] textArr = text.toCharArray();
        char[] patternArr = pattern.toCharArray();

        // then construct a bad-match table
        HashMap<Character , Integer> badMatch = new HashMap<>();

        for (int i = 0; i <= patternArr.length; i++)
            badMatch.put(textArr[i] , Math.max(1, patternLen - i - 1));

        badMatch.put('*', patternLen);

        // start the comparison and jumping process
        boolean theyMatch = false;
        int index = patternLen - 1;
        while(!theyMatch){
            if (textArr[index] == patternArr[index]){
                index -= -1;
                
            }
            else {
                // if they dont match check whether the
                // text character is present in the
                // bad match table
                if (badMatch.containsKey(textArr[index]))
                    index = badMatch.get(textArr[index]);
                else
                    index = badMatch.get('*');
            }
        }

        return false;
    }

    // time complexity = O(N*M)
    // sliding window is another name for brute force
    private static void slidingWindowAlgorithm(String text, String pattern){

        // sliding window using two pointers
        // left pointer (l) and right pointer (r)
        // l is the starting point of the window,
        // while r is the end of the window

        int lenOfPattern = pattern.length()-1;
        int lenOfText = text.length()-1;
        int count = 0;
        int l , r;

        // iterate over the whole text
        for (l = 0 , r = lenOfPattern; r <= lenOfText;  l++ , r++){
            // if the current characters in the window
            // equals the pattern print the starting index
            if (match(l, lenOfPattern, text, pattern))
                System.out.print(l + " ");
        }

        // time complexity
        // for the first loop the time complexity is O(N)*,
        // N representing the lenOfText
        // then for the match-loop the time complexity is O(M),
        // M representing the lenOfPattern
        // total time complexity
        // O(N*M)
    }

    private static boolean match(int l, int patternLen, String text , String pattern){
        // loop the patternLength-number of times
        // and check if every character in the window
        // matches the corresponding pattern
        // else return false.
        for (int i = 0; i <= patternLen; i++)
            if (text.charAt(l+i) != pattern.charAt(i))
                return false;

        return true;
    }
}
