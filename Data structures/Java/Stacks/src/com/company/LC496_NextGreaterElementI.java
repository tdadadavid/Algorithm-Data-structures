package com.company;

import java.util.Arrays;
import java.util.HashMap;

public class LC496_NextGreaterElementI {

    /**
     * The problem statement was to find the next
     * greater element for each value in the first
     * array which is nums1.
     *
     * The first thing to do is to create a hashmap
     * to map the numbers in nums1 to its index,
     * after initialize an array to the size to of nums1
     *
     * Fill it up with -1 to avoid manually putting
     * -1 by ourselves when a number in nums1 doesn't
     * have a greater value.
     *
     * now iterate through the second array nums2,
     * First check if the current element at every
     * iteration is present in the first array nums1
     *
     * if this is the case iterate from the current
     * element position in num2 to find the next greater
     * element, fix the next greater element in the result
     * array, (at the index of the element in nums1)
     *
     *
     * Time complexity = O(m*n)
     * where m is the length of the second array
     * accurately the length it takes to find the next
     * greater value and "n" is the length of the first array
     * Space complexity = O(n)
     * where "n" is the length of the first array.
     */


    public int[] nextGreaterElement(int[] nums1, int[] nums2){

        HashMap<Integer, Integer> numberToIndex = new HashMap<>();

        for (int i = 0; i < nums1.length; i++){
            numberToIndex.put(nums1[i], i);
        }

        int[] result = new int[nums1.length];

        Arrays.fill(result, -1);

        for (int i = 0; i < nums2.length; i++){
            if (numberToIndex.containsKey(nums2[i])) {
                for (int j = i + 1; j < nums2.length; j++){
                    if (nums2[j] > nums2[i]){
                        int index = numberToIndex.get(nums2[i]);
                        result[index] = nums2[j];
                        break;
                    }
                }
            }
        }

        return result;
    }
}
