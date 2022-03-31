package com;

import java.util.Arrays;

public class FindTheSubArrayHavingAGivenSum {
    public static void main(String[] args) {
        int[] nums = {0,1,2,4,3,7,7,8,10,12};
        System.out.println(Arrays.toString(findTheSubArray(nums , 3)));
    }

    // time complexity = O(n)
    // space complexity = O(1)
    // this algorithm won't work for a negative sum
    private static int[] findTheSubArray(int[] nums , int sum){
        
        // initialize a variable called currentRunningSum
        // if the sum in a particular window is less than
        // the given sum then increase the window length
        // else shrink the window until the given sum is meet

        if (nums.length == 0)
            return new int[]{-1,-1};

        int currentRunningSum = 0;
        int windowStart = 0;
        int windowEnd;

        // iterate till the end of the array
        for(windowEnd = 0; windowEnd < nums.length; windowEnd++){
            // get the sum of the window as it increases
            currentRunningSum += nums[windowEnd];

            // while the current sum is greater than or equal to the given sum
            while (currentRunningSum >= sum) {
                // shrink the array by 1 (ie move the window forward)
                // delete the first element in the window(ie leave it
                // as par say we are moving the window forward)
                currentRunningSum -= nums[windowStart++];

                // if the current sum in the window is equal to the
                // given sum, then print the initial index and final
                // index of the current window.
                if (currentRunningSum == sum)
                    return new int[]{windowStart, windowEnd};
            }

        }

        // if no subArray is found then
        // return -1 for initialand final
        // index for the current window
        return new int[]{-1, -1};
    }
}
