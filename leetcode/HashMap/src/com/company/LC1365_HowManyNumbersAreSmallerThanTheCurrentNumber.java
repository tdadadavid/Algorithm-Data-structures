package com.company;

import java.util.Arrays;

public class LC1365_HowManyNumbersAreSmallerThanTheCurrentNumber {
    public static void main(String[] args) {
        int[] nums = {7,7,7,7};
        int[] frequency = smallerNumsThanCurrent(nums);
        System.out.println(Arrays.toString(frequency));

    }

    public static int[] smallerNumsThanCurrent(int[] arr){
        // [1,2,3]
        // pick an element and compare it to other elements (brute force)

        int[] frequency = new int[arr.length];
        int count = 0;

        for (int i = 0; i <= arr.length -1; i++){
            for (int j = 0; j <= arr.length -1; j++){
                if (arr[i] > arr[j])
                    count++;
            }

            frequency[i] = count;
            count = 0;
        }

        return frequency;
    }
}
