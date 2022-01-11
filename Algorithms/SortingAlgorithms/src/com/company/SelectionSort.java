package com.company;

import java.util.Arrays;

public class SelectionSort {

    /**
     * Selection Sort
     * Time complexity (best case , average case , worst case) = O(n²)
     * space complexity = O(1)
     *
     */

    public static void main(String[] args){
        int[] unsortedArr = {1,5,11,6,2};
        System.out.println(Arrays.toString(selectionSort(unsortedArr)));
    }

    public static int[] selectionSort(int[] unsortedArr){
        /** initialize the minVal to the first element in the array
         * @minVal = unsorted[0]
         * */

        int minVal = unsortedArr[0];
        int index  = 0;


        for (int i = 0; i <= unsortedArr.length - 1; i++){          /** iterate from the 0th to the (n-1)th index* */
            for (int j = i + 1; j <= unsortedArr.length - 1; j++){  /** iterate from the next element from index i to the (n-1)th index */
                if (unsortedArr[j] < unsortedArr[i]) {              /** if the element at index j is < i then */
                    minVal = unsortedArr[j];                        /** update minVal to the element at index j */

                    int temp = unsortedArr[i];                      /** store the previous minVal in a temp variable */
                    unsortedArr[i] = minVal;                        /** put the new minVal in the index of the previous minVal */
                    unsortedArr[j] = temp;                          /** put the old minVal in the index of the new minVal */
                }
            }
        }

        return unsortedArr;                                         /** return the sorted array */
    }
}
