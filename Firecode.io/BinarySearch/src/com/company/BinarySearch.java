package com.company;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {2,8,9,10,12};
        System.out.println(binarySearch(nums ,16));
    }

    private static boolean binarySearch(int[] arr, int n){
        if(arr.length == 0)
            return false;


        int left = 0;
        int right = arr.length -1;
        int mid;

        while (left < right) {

            mid = ((left + right) / 2);

            if(arr[mid] == n)
                return true;


            if(arr[mid] < n)
                left = mid + 1;

            if(arr[mid] > n)
                right = mid - 1;

        }

        return false;
    }
}
