package com;

import java.util.HashSet;

public class FindDuplicatesWithinARangeKInArray {

    public static void main(String[] args) {

        int[] testcase1 = {5, 6, 8, 2, 4, 6, 9};
        System.out.println(findDuplicates(testcase1, 4));

        int[] testcase2 = { 5, 6, 8, 2, 2, 6, 9 };
        System.out.println(findDuplicates(testcase2 ,2));

        int[] testcase3 = { 1, 2, 3, 2, 1 };
        findDuplicates(testcase3 , 7);

        int[] testcase4 = {1,2,1};
        System.out.println(findDuplicates2(testcase4 , 3));

        int[] testcase5 = {1,2,3,4,5,6,7,8,9,1,10,11,1,12};
        System.out.println(findDuplicates(testcase5 , 3));
    }

    private static boolean findDuplicates(int[] nums , int k){

        // iterate through the array and move the window

        // if the window size is
        // zero or less return false
        if (k <= 0)
            return false;

        int windowStart = 0;
        int firstElement = nums[windowStart];

        HashSet<Integer> uniqueElements = new HashSet<>();

        // iterate through the array
        for (int i = 0; i < nums.length; i++){

            // if the window contains duplicate
            // return true else add  it to the set
            if (!uniqueElements.add(nums[i]))
                return true;

            // if "i" is greater than window length
            if (i >= k-1){
                // remove the first element in the window
                uniqueElements.remove(firstElement);
                // shift the window and store the new first element
                firstElement = nums[++windowStart];
            }
        }

        return false;
    }

    private static boolean findDuplicates2(int[] nums , int k){

        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i < nums.length; i++){

            if(i > k) set.remove(nums[i-k-1]);

            if(!set.add(nums[i])) return true;

        }

        return false;
    }
}
