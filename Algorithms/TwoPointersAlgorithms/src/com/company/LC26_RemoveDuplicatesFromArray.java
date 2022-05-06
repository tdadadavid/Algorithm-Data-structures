package com.company;

public class LC26_RemoveDuplicatesFromArray {
    public int removeDuplicates(int[] nums){

        int length = nums.length;
        if(length == 1 || length == 0) return 1;

        int fastPointer;
        int slowPointer = 0;

        for(fastPointer = 1; fastPointer < nums.length-1; fastPointer++){

            if (nums[slowPointer] != nums[fastPointer]){
                slowPointer++;
                nums[slowPointer] = nums[fastPointer];
            }

        }

        return slowPointer+1;
    }

}
