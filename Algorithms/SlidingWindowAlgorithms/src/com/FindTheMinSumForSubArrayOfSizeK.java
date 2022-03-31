package com;

public class FindTheMinSumForSubArrayOfSizeK {
    public static void main(String[] args){
        int[] nums = {-2,3,-1,0,2,9};
        System.out.println(findMinSum(nums , 2));
    }

    // time complexity = O(n)
    // space complexity = O(1)
    private static int findMinSum(int[] nums , int k){
        // it is the same max question

        // have a current sum that changes as the
        // window slides and have a max sum that is
        // constant which only changes when there is
        // a values less than it

        int currentRunningSum = 0;
        int minSum = Integer.MAX_VALUE;
        int windowStart = 0;

        for (int i = 0; i < nums.length; i++){

            currentRunningSum += nums[i];

            if (i >= k-1){
                minSum = Math.min(minSum, currentRunningSum);
                currentRunningSum -= nums[windowStart];
                windowStart++;
            }

        }

        return minSum;
    }
}
