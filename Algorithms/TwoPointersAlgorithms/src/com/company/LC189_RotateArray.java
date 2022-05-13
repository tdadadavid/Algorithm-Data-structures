package com.company;

public class LC189_RotateArray {

    public void rotate(int[] nums,  int k){

        if (k == 0) return;

        int length = nums.length-1;
        int lastElement;
        int firstPosition = 0;

        while(k > 0){

            lastElement = nums[length];
            shiftBackWard(nums);
            nums[firstPosition] = lastElement;

            k--;
        }

    }
    public void shiftBackWard(int[] arr){

        int len = arr.length-1;
        while (len > 0){
            arr[len] = arr[len-1];
            len--;
        }
    }


    public void rotate2(int[] nums, int k){

        if (nums.length-1 == 0 || k == 0 ) return;

        k = k % nums.length -1;
        int leftPointer = 0, rightPointer = nums.length-1;

        while (leftPointer < rightPointer){
            int temp = nums[leftPointer];
            nums[leftPointer++] = nums[rightPointer];
            nums[rightPointer++] = temp;
        }

        leftPointer = 0; rightPointer = k-1;
        while (leftPointer < rightPointer){
            int temp = nums[leftPointer];
            nums[leftPointer++] = nums[rightPointer];
            nums[rightPointer++] = temp;
        }

        leftPointer = k; rightPointer = nums.length-1;
        while (leftPointer < rightPointer){
            int temp = nums[leftPointer];
            nums[leftPointer++] = nums[rightPointer];
            nums[rightPointer++] = temp;
        }

    }
}
