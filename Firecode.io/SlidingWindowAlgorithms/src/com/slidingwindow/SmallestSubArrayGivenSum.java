package com.slidingwindow;

public class SmallestSubArrayGivenSum {
    public static void main(String[] args) {
        int[] arr = new int[]{4,2,2,7,1,2,10};
        int target = 8;
        System.out.println(smallestSubArray(target , arr));

    }

    // work on this haaaaaa

    public static int smallestSubArray(int target , int[] arr){
        int windowStart = 0;
        int windowEnd;
        int minlength = Integer.MAX_VALUE;
        int currentRunningSum = 0;

        for(windowEnd  = 0; windowEnd < arr.length; windowEnd++) {
            currentRunningSum += arr[windowEnd];
            int previousLength = minlength;

            while (windowStart <= windowEnd) {

                if (currentRunningSum > target) {
                    minlength = Math.min(minlength, (windowEnd - windowStart));

                    if (minlength == 1) return minlength;

                    currentRunningSum -= arr[windowEnd - minlength];
                    windowStart++;
                }
                else
                    break;

            }
        }

        return minlength;
    }
}
