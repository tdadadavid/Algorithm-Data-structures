package com.company;

import java.util.Arrays;

public class BubbleSort {

    /**
     *  Bubble sort is considerably fast sorting algorithm
     *  under some circumstances. It is used for mostly educational purposes
     *  Time complexity(worst case , average case ) =  O(n²) Quadratic time.
     *  Time complexity(best case) =  O(n) linear time if the list are already sorted.
     *  Space complexity = O(1)
     */

    public static void main(String[] args) {

        int[] unsortedArr = {1,5,11,6,2};
        System.out.println(Arrays.toString(bubbleSort(unsortedArr)));

    }

    public static int[] bubbleSort(int[] unsortedArr){

        for (int i = 0; i <= unsortedArr.length - 1; i++) {
            for (int j = 0; j < (unsortedArr.length - i - 1); j++){
                if (unsortedArr[j] > unsortedArr[j + 1]) {
                    int temp = unsortedArr[j];
                    unsortedArr[j] = unsortedArr[j + 1];
                    unsortedArr[j + 1] = temp;
                }
            }
        }
        return unsortedArr;
    }

    // Implement the recursive form for bubble sort
    public static int[] recursiveBubbleSort(int[] unsortedArr){
        // condition for breaking the recursion
    }



}
