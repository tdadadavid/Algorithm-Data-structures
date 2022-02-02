package com.company;

import java.util.Arrays;

public class MaximumSubArrayOfSizeK {
    public static void main(String[] args){
        int[] testcase1 = {2,1,5,1,3};
        int maxSum = maxSum(testcase1 , 3);
        System.out.println(maxSum);

    }

    private static int maxSum(int[] arr , int k){

        // use sliding window algorithmic model

        // set the maximum sum to the smallest value
        int maxSum = Integer.MIN_VALUE;
        int tracker = 0;

        // iterate from the start of the array to the end
        for (int i = 0; i < arr.length; i++){
            // for each iteration add it to tracker
            tracker += arr[i];

            // check whether current position
            // in the array (which is index i) is equal
            // or greater than the window size
            // the window size is

            if (i >= (k -1)){
                maxSum = Math.max(tracker , maxSum);
                tracker -= arr[i - (k - 1)];
            }

        }

        return maxSum;
    }
}
