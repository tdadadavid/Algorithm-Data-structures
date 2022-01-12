package com.company;

public class LC1512_NumberOfGoodPairs {
    public static void main(String[] args){
        int[] nums = {1,2,3};
        int ans = numIdenticalPairs(nums);
        System.out.println(ans);
    }

    // brute force
    private static int numIdenticalPairs(int[] nums){

        int count = 0;

        for (int i = 0; i <= nums.length - 1; i++)
            for (int j = 1; j <= nums.length - 1; j++)
                if (nums[i] == nums[j] && i < j)
                    count++;



        return count;
    }

    // best case scenario
    // (N * (N-1))/2
}
