package com;

public class MaxConsecutiveOnesIII {

    // this is a leetcode question
    // No: 1004 , Category: medium
    // under sliding window tag
    // (https://leetcode.com/tag/sliding-window/)

    public static void main(String[] args) {
        int[] nums = {1,1,1,0,0,0,1,1,1,1,0};
        int[] nums2 = {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
        System.out.println(longestOnes(nums , 2));
        System.out.println(longestOnes(nums2 , 3));
    }

    // COME BACK FOR THIS
    private static int longestOnes(int[] nums , int k){

        int windowStart = 0;
        int flipFrequency = 0;
        int oneFrequency = 0;
        int max =0;

        for (int i = 0; i < nums.length; i++){
            // check whether the current element is 0
            if (nums[i] == 0 ) {
                if (flipFrequency < k) {
                    flipFrequency++;
                    oneFrequency++;
                }
                else {
                    max = Math.max(max, oneFrequency);
                    flipFrequency--;
                    oneFrequency--;
                }
            }
            else
                oneFrequency++;
            // check whether the flipFrequency is greater
            // than the number of allowed flips
        }


        return max;
    }
}
