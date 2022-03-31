package com;

import java.util.Arrays;
import java.util.HashSet;

public class PrintAllSubArraysHavingDistinctElements {

    public static void main(String[] args){
        int[] nums = {5, 2, 3, 5, 4, 9,9};
        print(nums);
    }

    private static void print(int[] nums){
        // iterate through the whole array
        // and shift the window,

        int windowStart = 0;
        int firstElement = nums[windowStart];
        HashSet<Integer> uniqueElements = new HashSet<>();

        // iterate through the array
        for (int i = 0; i < nums.length; i++){

            // check if current element is in the set
            if (uniqueElements.contains(nums[i])) {
                // print elements in the window
                System.out.println(Arrays.toString(uniqueElements.toArray()));

                // if the first element in the window
                // is not the same as this current element
                // remove this current element.
                if (firstElement != nums[i])
                    uniqueElements.remove(nums[i]);

                // remove the first element
                uniqueElements.remove(firstElement);

                // shift the window by one
                // update the value of the "firstElement" variable
                firstElement = nums[++windowStart];
            }

            // add this element to the hashset
            uniqueElements.add(nums[i]);
        }

        // print the last set of unique elements
        System.out.println(Arrays.toString(uniqueElements.toArray()));

    }
}
