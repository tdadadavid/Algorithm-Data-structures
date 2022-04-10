package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC448_FindAllNumbersDisappearedInAnArray {
    public static void main(String[] args){
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(nums));
    }


    public static List<Integer> findDisappearedNumbers(int[] nums){
        // sort the given array
        // first create a variable that checks the
        // consistency of a the progression by comparing
        // the varible with each element in the array

        ArrayList<Integer> disappearedNumbers = new ArrayList<>();
        int checkNumber = 1;

        Arrays.sort(nums);
        
        for(int element : nums){
            if(checkNumber != element){
                disappearedNumbers.add(checkNumber);
                checkNumber++;
            }
            else{
                checkNumber++;
            }
        }


        return disappearedNumbers;
    }
}
