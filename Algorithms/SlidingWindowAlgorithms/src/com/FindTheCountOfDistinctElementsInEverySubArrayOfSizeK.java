package com;

import java.util.HashMap;
import java.util.HashSet;

public class FindTheCountOfDistinctElementsInEverySubArrayOfSizeK {
    public static void main(String[] args) {
        int[] nums = {2, 1, 2, 3, 2, 1, 4, 5};
        slidingWindowTechnique(nums , 3);
    }

    // first approach = Brute force.
    // Time complexity = O(n * k)
    // Space complexity = O(k)
    // This is not sliding window technique though
    // I am just using the "window" terminology.
    private static void distinctElementsCount(int[] nums, int k){

        // iterate from the first element to the last
        // for each window count the elements that has
        // not been seen

        if (k > nums.length)
            System.out.println("Window size "  + k +  " is greater than array length " + nums.length);

        HashSet<Integer> distinctElements = new HashSet<>();

        // iterate to the second to the last element in the array
        for (int i = 0; i < nums.length - k + 1; i++){

            // iterate over all element in the window frame
            for (int j = 0; j < k; j++){
                // check if the set contains this current element
                if (!distinctElements.contains(nums[j+i]))
                    // if it doesn't add the element
                    distinctElements.add(nums[j+i]);

                // check to see if we have reached
                // to the subarray size
                if (j == k-1) {
                    int windowEnd = j + i;
                    System.out.println("{" + i + " - " + windowEnd + "}" + " = " + distinctElements.size());
                }

            }

            // reset the hashset
            distinctElements.clear();
        }
    }


    // Time complexity = O(n)
    // space complexity = O(k)
    private static void slidingWindowTechnique(int[] nums , int k){

        HashMap<Integer , Integer> elementsAndFreq = new HashMap<>();
        int windowStart = 0;
        int firstElementInWindow = nums[windowStart];


        // iterate through the element
        for (int i = 0; i < nums.length; i++){

            // check if the hashmap contains the element
            // then increment its frequency of appearance
            // else add the element to the hashmap and put
            // 1 as its frequency
            elementsAndFreq.put(nums[i], elementsAndFreq.getOrDefault(nums[i] , 0) + 1);

            // if "i" is greater than
            // the window size (k)
            if (i >= k-1) {

                // print the window and the number of
                // distinct elements in the window
                System.out.println("{" + windowStart + " - " + i + "}" + " = " + elementsAndFreq.size());

                // get the first element in this particular window
                int firstElementFrequency = elementsAndFreq.get(firstElementInWindow);

                // if the first element has a frequency
                // ie there is no duplication in the next
                // window. check below for more explanation why
               if (firstElementFrequency == 1)
                   // remove the first element
                   elementsAndFreq.remove(firstElementInWindow);
               else
                   // else decrease the first element frequency
                   elementsAndFreq.put(firstElementInWindow , firstElementFrequency - 1);

                // update the firstElement to the current
                // window's first element
                firstElementInWindow = nums[++windowStart];

            }

        }
    }

}
