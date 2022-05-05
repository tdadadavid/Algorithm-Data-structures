package com.company;

public class LC905_SortArrayByParity {

    // Time complexity = O(n)
    // Space complexity = O(1)
    public int[] sortArrayByParity(int[] nums){

        int oddPointer = 0;

        for(int currentPointer = 0; currentPointer < nums.length; currentPointer++){

            if(nums[currentPointer] % 2 == 0){
                int temp = nums[oddPointer];
                nums[oddPointer] = nums[currentPointer];
                nums[currentPointer] = temp;

                oddPointer++;
            }

        }


        return nums;
    }


}
