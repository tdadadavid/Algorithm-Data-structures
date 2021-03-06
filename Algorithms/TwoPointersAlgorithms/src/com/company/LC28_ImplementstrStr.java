package com.company;

public class LC28_ImplementstrStr {

    public int strStr(String haystack, String needle){

        // check if both are empty
        if (haystack.isEmpty() || needle.isEmpty()) return 0;

        if (haystack.length() < needle.length()) return -1;

        int needlePointer = 0;
        int haystackPointer = 0;

        char[] haystackArr = haystack.toCharArray();
        char[] needleArr = needle.toCharArray();

        for (int i = 0; i < haystack.length(); i++){

            // check if the current character is equal to the character in the needle
            if (haystackArr[haystackPointer] == needleArr[needlePointer]){

                // get the length of the needle
                int lengthOfNeedle = needleArr.length - 1;

                int j = haystackPointer;

                // loop through the needle array checking each
                // character against each character in the haystack array.
                while(needlePointer >= 0){
                    // check if we've exceeded the length of the haystack
                    if (j >= haystackArr.length) return -1;

                    // if there is any mismatch break the loop
                    if (haystackArr[j] != needleArr[needlePointer]) break;

                    // if we've reached the end of the loop return
                    // the current position in the hayStack
                    if (needlePointer == lengthOfNeedle) return i;

                    needlePointer++;
                    j++;
                }
                // set the pointer back to the starting point
                // in the needleArray
                needlePointer = 0;
            }
            haystackPointer++;
        }

        return -1;
    }

    // work on this later.
    public int strStr2(String haystack , String needle){

        if (haystack.isEmpty() || needle.isEmpty()) return 0;

        if (haystack.length() < needle.length()) return -1;

        int needlePointer = 0;
        int haystackPointer = 0;

        char[] haystackArr = haystack.toCharArray();
        char[] needleArr = needle.toCharArray();

        for(int i = 0; i < haystackArr.length; i++){

            if(haystackArr[haystackPointer] == needleArr[needlePointer]){

                int lenOfNeedle = needleArr.length - 1;

                int j = haystackPointer;

                while(needlePointer >= 0){
                    if (j >= haystackArr.length) return -1;

                    if (haystackArr[j] != needleArr[needlePointer]){
                        haystackPointer += needlePointer;
                        break;
                    }

                    if (needlePointer == lenOfNeedle) return i;

                    j++;
                    needlePointer++;
                }

                needlePointer = 0;

            }

            haystackPointer++;
        }


        return -1;
    }
}
