package com;

public class FindTheSumOfAllSubArraysOfSizeK {
    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5,6};
        int[] nums2 = {1,-2,3,-4,5,6};

        findSum(nums2, 2);

    }

    private static void findSum(int[] nums , int k){

        int windowEnd;
        int windowStart = 0;
        int currentRunningSum = 0;

        for (windowEnd = 0; windowEnd <= nums.length; windowEnd++){

            if (windowEnd > k-1){
                System.out.println(currentRunningSum);
                currentRunningSum -= nums[windowStart++];
            }

            if (windowEnd < nums.length)
                currentRunningSum += nums[windowEnd];
        }

    }
}
