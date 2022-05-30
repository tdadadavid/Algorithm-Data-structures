package com.company;

public class LC1464_MaximumProductOfTwoElementsInAArray {

    public int maxProduct(int[] nums) {
        // first thing to do is to iterate through
        // the array and look for the smallest and
        // the biggest values, then return their
        // multiplication.

        int smallNum = 0;
        int bigNum = 0;

        for(int num: nums){
            if(num > bigNum){
                smallNum = bigNum;
                bigNum = num;
            }else if (num > smallNum){
                smallNum = num;
            }
        }

        return (smallNum - 1) * (bigNum - 1);
    }

}
