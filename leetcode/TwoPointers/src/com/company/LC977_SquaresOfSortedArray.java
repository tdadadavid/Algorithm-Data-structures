package com.company;

import java.util.*;

public class LC977_SquaresOfSortedArray {
    public static void main(String[] args){
        int[] testcase = {-4,-1,0,3,10};
        int[] testcase2 = {-7,-3,2,3,11};
        int[] testcase3 = {-14,2,4,5,8};
        int[] testcase4 = {-5,-3,-2,-1};
        int[] testcase5 = {-10000,-9999,-7,-5,0,0,10000};
        System.out.println(Arrays.toString(sortedSkue(testcase)));
        System.out.println(Arrays.toString(sortedSkue(testcase2)));
        System.out.println(Arrays.toString(sortedSkue(testcase3)));
        System.out.println(Arrays.toString(sortedSkue(testcase4)));
        System.out.println(Arrays.toString(sortedSkue(testcase5)));
    }

    // Time complexity = O(n log n)
    // Space Complexity = O(1)
    private static int[] sortedSquares(int[] nums){

        int count = 0;

        for(int num : nums){
            nums[count++] = num * num;
        }

        Arrays.sort(nums);

        return nums;
    }

    // Time complexity = O(n)
    // Space complexity = O(n)
    private static int[] sortedSquarez(int[] nums){

        // initailize the pointers
        int left = 0;
        int right = nums.length - 1;

        int leftSquared;
        int rightSquared;

        int[] result = new int[nums.length];
        int count = 0;

        while(left <= right){

            // square the elements at left and right index
            leftSquared = nums[left] * nums[left];
            rightSquared = nums[right] * nums[right];

            // if the square of the left index is
            // greater then the right . ie the square
            // of the negative value is greater than the
            // square of the largest positive number
            if (leftSquared > rightSquared) {
                // then append the left value the new array
                result[count++] = leftSquared;
                // increase the pointer
                left++;
            }
            else {
                // append the right value to the new array
                result[count++] = rightSquared;
                // decrease the right pointer
                right--;
            }
        }


        // reverse the array
        int l = 0;
        int r = nums.length-1;

        while (l < r){
            int temp = result[r];
            result[r] = result[l];
            result[l] = temp;
            r--;
            l++;
        }

        return result;
    }

    private static int[] sortedSkue(int[] nums){

        // initialise the array
        int[] result = new int[nums.length];

        // initialise the two pointers
        int left = 0, right = nums.length-1;

        // iterate from the last element to the first
        for (int i = nums.length - 1; i >= 0; i--){
            // check if the first element is greater than the last
            if (Math.abs(nums[left]) > Math.abs(nums[right])) {
                // store the square of the first element
                // at the last index
                result[i] = nums[left] * nums[left];
                // shift the pointer by one
                left++;
            }else{
                // store the square last element at the last index
                result[i] = nums[right] * nums[right];
                // shift the last pointer forward
                right--;
            }
        }

        return result;
    }

}
