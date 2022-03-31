package com;

import java.util.HashSet;

public class CountDistinctAbsoluteValuesInASortedArray {
    public static void main(String[] args) {
        int[] nums1 = {-1, -1, 0, 1, 1, 1};
        int[] nums2 = {-2, -1, 0, 1, 2, 3};
        int[] nums3 = {-1, -1, -1, -1};
        int[] nums4 = {-1, -1, 0, 1, 1, 1};
        System.out.println(countDistinct(nums4));
    }

    private static int countDistinct(int[] nums){
        // create a variable to keep track of absolute
        // values. for each value check the number if
        // it is less than 0(not absolute) or is O or greater

        int windowStart = 0;
        int windowEnd;
        int distinctCount = 0;
        HashSet<Integer> absoluteValues = new HashSet<>();


        for (windowEnd= 0; windowEnd < nums.length; windowEnd++) {

            if (nums[windowEnd] < 0)
                windowStart++;
            else {
                if (!absoluteValues.contains(nums[windowEnd])) {
                    distinctCount++;
                    absoluteValues.add(nums[windowEnd]);
                }
            }
        }
        return distinctCount;
    }
}
