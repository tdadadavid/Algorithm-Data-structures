package com;

public class FindTheLengthOfTheSmallestSubArrayWhoseSumIsGreaterThanK {
    public static void main(String[] args){
        int[] nums = {1,2,3,4,5,6,7,8};
        System.out.println(smallestSubArray(nums , 4));
    }

    private static int smallestSubArray(int[] nums , int sum){

        // iterate over the elements in the array
        // as the window size increases then check the
        // sum of the elements in the window if it is
        // greater than the target then compare the
        // length to former window that has its element greater
        // the target. return -1 if there is no subarray

        // if the array is empty return -1
        if (nums.length == 0)
            return -1;

        // initialize the current sum for each window to zero
        // initialize the starting point of the window
        // initialize the len of the smallest subArray
        // to a very high value
        int currentRunningSum = 0;
        int windowStart = 0;
        int smallestWindowLength = Integer.MAX_VALUE;


        // iterate to the end of the array
        for (int windowEnd = 0; windowEnd < nums.length; windowEnd++){
            // add each element to the current sum
            currentRunningSum += nums[windowEnd];

            // if the current running sum is greater than the target sum ,
            while (currentRunningSum > sum){
                // then find the length of the window and compare with previous window length
                smallestWindowLength = Math.min(smallestWindowLength , windowEnd - windowStart + 1);
                // shift the window by one
                currentRunningSum -= nums[windowStart++];
            }

        }

        // check if the window length is greater
        // than the array length(for a case where
        // there is no subArray then return -1)
        if (smallestWindowLength >= nums.length)
            return -1;

        // else return the smallest window len
        return smallestWindowLength;
    }
}
