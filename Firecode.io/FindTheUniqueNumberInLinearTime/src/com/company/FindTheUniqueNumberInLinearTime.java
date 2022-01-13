package com.company;

import java.util.HashMap;
import java.util.Map;

public class FindTheUniqueNumberInLinearTime {
    public static void main(String[] args){
        int[] array = {1,1,2,2,3, 3,4,5,5};
        int uniqueNumber = uniqueNumber(array);
        System.out.println(uniqueNumber);
    }

    public static int uniqueNumber(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        int unique = 0;

        for (int i = 0; i < arr.length; i++){
            if (map.containsValue(arr[i]))
                map.remove(i-1);
            else
                map.put(i , arr[i]);
        }

       for (int item : map.keySet())
           unique = map.get(item);


       return unique;
    }
}
