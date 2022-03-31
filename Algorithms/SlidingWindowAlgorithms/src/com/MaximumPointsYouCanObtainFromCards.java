package com;

public class MaximumPointsYouCanObtainFromCards {

    public static void main(String[] args) {

//        int[] cardPoints = {1,2,3,4,5,6,1};
//        System.out.println(maxScore(cardPoints , 3));

        int[] cardPoints2 = {2,2,2};
        System.out.println(maxScore(cardPoints2, 2));

    }

    private static int maxScore(int[] nums, int k){

        // i think we're gonna use two windows for this
        // one starting from the end

        int currentRunningSum = 0;
        int max = Integer.MIN_VALUE;
        int windowStart = 0;

        for (int i = 0; i < nums.length; i++){

            if (i >= k){
                max = Math.max(max, currentRunningSum);
                currentRunningSum -= nums[windowStart++];
            }

            currentRunningSum += nums[i];
        }

        return max;
    }
}
