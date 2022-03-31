package com;

import java.util.Arrays;

public class FindTheAverageOfContiguousSubArraysOfSizeK {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,};
        int[] nums2 = {1,12,-5,-6,50,3};

        System.out.println(Arrays.toString(average(nums , 3)));
        System.out.println(Arrays.toString(average(nums2 , 4)));
    }

    private static double[] average(int[] nums , int k){

        double currentRunningSum = 0;
        int windowStart = 0;
        double[] averages = new double[nums.length - k + 1];

        // iterate from the 0th index to the last index
        for (int i = 0; i <= nums.length; i++){

            // if i is greater than
            // window size given (k)
            if (i > k-1) {
                // assign each average computed into the array
                averages[windowStart] = currentRunningSum / k;
                // shift the window forward by subtracting
                // the 0th element in the window
                currentRunningSum -= nums[windowStart++];
            }

            // to avoid NullPointerException
            if (i < nums.length)
                currentRunningSum += nums[i];
        }

        return averages;
    }
}
