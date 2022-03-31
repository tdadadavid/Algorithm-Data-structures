package com;

public class NumberOfSubArraysOfSizeKAndAverageGreaterThanOrEqualToThreshold {

    // this is a leetcode question
    // No: 1343 , Category: medium
    // under sliding window tag (https://leetcode.com/tag/sliding-window/)


    public static void main(String[] args) {
        int[] arr = {2,2,2,2,5,5,5,8};
        System.out.println(numOfSubArrays(arr , 3 , 4));
        int[] arr2 = {11,13,17,23,29,31,7,5,2,3};
        System.out.println(numOfSubArrays(arr2 , 3 , 5));
    }

    // I have not tested all testcases on leetcode , remember to do that
    private static int numOfSubArrays(int[] nums, int k , int threshold){

        // iterate through the array and for each movement
        // add the elements in the window... once the movement
        // is equal to the window size given (k) find the average
        // (sum of elements)/k compare the result with the threshold
        // if the average is equal or greater than the threshold
        // increase the count ...

        int windowStart = 0;
        int currentRunningSum = 0;
        int count = 0;
        float average;

        // iterate through the array
        for (int i  = 0; i <= nums.length; i++){

            // if we've reached the window end
            if (i >= k){
                // find the average of the elements in the window
                average = currentRunningSum / k;

                // check if  the average is greater than the given threshold
                if(average >= threshold)
                    // then increase the count
                   count++;

                // shift the window forward by one
                currentRunningSum -= nums[windowStart++];
            }

            // if i is less than array length add to the current sum
            // this is here to avoid null pointer exception
            if (i < nums.length)
                currentRunningSum += nums[i];
        }

        return count;
    }

}
