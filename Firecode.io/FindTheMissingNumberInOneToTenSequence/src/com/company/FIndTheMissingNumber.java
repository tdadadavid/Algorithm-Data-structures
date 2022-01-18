package com.company;

import java.util.Arrays;

public class FIndTheMissingNumber {
    public static void main(String[] args) {
        int[] numbers = {10,3,2,4,7,8,9,5,1};
        System.out.println(findMissingNum(numbers));
    }

    // method 1
    public static int findMissingNumber(int[] arr){
        // take note that the question is specifically checking
        // for the missing number between 1 and 10
        // find the total sum in the array

        int expectedOutput = 1+2+3+4+5+6+7+8+9+10;
        int actualOutput = 0;

        for (int number : arr)
            actualOutput += number;


        return expectedOutput - actualOutput;
    }

    // method 2
    public static int findMissingNum(int[] numbers){
        Arrays.sort(numbers);

        int nextNumber = 1;

        for (int num : numbers) {
            if (nextNumber != num)
                return nextNumber;
            nextNumber++;
        }

        return -1;
    }
}
