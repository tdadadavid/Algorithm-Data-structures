package com.company;

import java.util.*;

public class FindDuplicateNumbers {

    public static void main(String[] args) {
        int[] duplicates = {4,3,1,4,2,1,4};
        System.out.println(Arrays.toString(findDuplicates(duplicates)));
    }

    // come back for this question
    public static int[] findDuplicates(int[] arr){
        // map
        // hashset
        // array

        Map<Integer , Integer> map = new HashMap<>();
        TreeSet<Integer> set = new TreeSet<>();

        for (int i = 0; i < arr.length; i++){
            if (map.containsValue(arr[i]))
                set.add(arr[i]);
            else
                map.put(i , arr[i]);
        }

        int[] mapArr = new int[set.size()];
        int count = 0;

        for (int i : set) {
            mapArr[count] = i;
            count++;
        }

        return mapArr;
    }
}
