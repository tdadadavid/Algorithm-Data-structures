package com;

import java.util.Arrays;

public class MinimumDifferenceBetweenHighAndLowestKScores {
    public static void main(String[] args){
        int[] testcase1 = {90};
        System.out.println(minimumScore(testcase1 , 1));
        int[] testcase2 = {9,4,1,7};
        System.out.println(minimumScore(testcase2 , 2));
        int[] testcase3 = {87063,61094,44530,21297,95857,93551,9918};
        System.out.println(minimumScore(testcase3 , 6));
    }


    // brute force
    private static int minimumScore(int[] nums , int k){

        if (nums.length == 1)
            return 0;

        int minScore = Integer.MAX_VALUE;
        int windowStart = 0;
        int windowEnd = k-1;


        Arrays.sort(nums);

       for (int i = 0; i < nums.length; i++){
           if (windowEnd < nums.length)
             minScore = Math.min(minScore , (nums[windowEnd] - nums[windowStart]));
           windowEnd++; windowStart++;
       }

        return minScore;
    }

}
