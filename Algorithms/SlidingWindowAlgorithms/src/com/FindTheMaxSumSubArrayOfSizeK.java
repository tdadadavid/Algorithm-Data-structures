package com;

public class FindTheMaxSumSubArrayOfSizeK {
    public static void main(String[] args){
        int[] nums = {1,2,3,4,9,101,11,2};
        System.out.println(findMaxSum(nums , 3));
    }

    // Time complexity = O(n)...
    // Space complexity = O(1)
    private static int findMaxSum(int[] nums , int k){
        // iterate to the end of the array
        // by sliding a window of length k
        // compare each window sum and store
        // max length in a variable then return
        // the variable.

        // stores the sum of the current window
        int currentRunningSum = 0;

        // stores the max sum of the "max window"
        int maxSum = Integer.MIN_VALUE;

        // Marks the beginning of the window
        int windowStart = 0;

        // iterate for o to the last element in the array
        for(int i = 0; i < nums.length; i++){

            // if the current index is greater than the window length
            if (i > k-1) {

                // get the max sum by comparing the previous max sum
                // with the current window sum
                maxSum = Math.max(maxSum , currentRunningSum);

                // remove the first element in the particular window
                // because the window is sliding forward by 1 leaving
                // that element behind
                currentRunningSum -= nums[windowStart];

                // increment the window start ie. move the starting point
                // of the window forward
                windowStart++;
            }

            // add to the current sum of the window
            currentRunningSum += nums[i];
        }

        // the maximum sum
        return maxSum;
    }
}
