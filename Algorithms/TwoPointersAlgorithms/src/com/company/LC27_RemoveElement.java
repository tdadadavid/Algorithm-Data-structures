package com.company;

public class LC27_RemoveElement {
    public int removeElement(int[] nums, int val) {

        if(nums.length <= 0) return 0;

        int valPointer = 0;
        int currentPointer;


        for(currentPointer = 0; currentPointer < nums.length; currentPointer++){

            if(nums[currentPointer] != val){
                int temp = nums[valPointer];
                nums[valPointer++] = nums[currentPointer];
                nums[currentPointer] = temp;
            }

        }

        return valPointer;

    }
}
