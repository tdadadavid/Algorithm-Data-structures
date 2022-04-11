package com.company;

public class MergeSortedArray {

    // Time complexity = O(m + n)
    // Space complexity = O(m + n)
    public int[] merge(int[] arr1 , int[] arr2){

        // first check for empty arrays in both arr given
        // then check the first element in each array for
        // the one that is lesser. Copy the contents of that
        // followed by the greater one into a new array


        if (arr1.length == 0 && arr2.length == 0)
            return new int[]{};

        if (arr1.length == 0)
            return arr2;

        if (arr2.length == 0)
            return arr1;

        int[] result = new int[arr1.length + arr2.length];

        int arr1Pointer = 0;
        int arr2Pointer = 0;


        for (int i = 0; i < result.length; i++){

            if(arr1Pointer <= arr1.length-1 && arr2Pointer <= arr2.length-1) {

                if (arr1[arr1Pointer] < arr2[arr2Pointer])
                    result[i] = arr1[arr1Pointer++];
                else if (arr1[arr1Pointer] > arr2[arr2Pointer])
                    result[i] = arr2[arr2Pointer++];
                else if (arr1[arr1Pointer] == arr2[arr2Pointer]) {
                    result[i] = arr1[arr1Pointer++];
                    result[++i] = arr2[arr2Pointer++];
                }
            }else{
               if (arr1Pointer > arr1.length-1)
                   result[i] = arr2[arr2Pointer++];
               else
                   result[i] = arr1[arr1Pointer++];
            }

        }

        return result;
    }

    // Time complexity = O(m + n)
    // Where m , n = length of first array, length of second array
    // Space Complexity = O(m + n)
    public int[] refactoredMerge(int[] arr1 , int[] arr2){

        if (arr1.length == 0) return arr2;
        if (arr2.length == 0) return arr1;

        int[] result = new int[arr1.length + arr2.length];

        int arr1Pointer = 0, arr2Pointer = 0 , index = 0;

        // while the two pointers have not exceeded their respective array length
        while (arr1Pointer < arr1.length && arr2Pointer < arr2.length)
            //insert into result if the element in arr1 is greater is less than arr2 element
            // else insert the element in arr2
            result[index++] = (arr1[arr1Pointer] < arr2[arr2Pointer]) ? arr1[arr1Pointer++] : arr2[arr2Pointer++];


        // if the pointer for arr1 didn't exceed
        // the length of the array then copy the
        // remaining elements into the result array
        while (arr1Pointer < arr1.length)
            result[index++] = arr1[arr1Pointer++];

        // if the pointer for arr2 didn't exceed
        // the length of the array then copy the
        // remaining elements into the result array
        while (arr2Pointer < arr2.length)
            result[index++] = arr2[arr2Pointer++];

        return result;
    }

}
