package com.company;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] unsortedArr = {3,2,1,4,9,10,-2};
        System.out.println(Arrays.toString(insertionSort(unsortedArr)));
    }

    public static int[] insertionSort(int[] unsortedArr){

        /**
         * We assume the first element in the array is sorted
         * since it is the only element in the array
         *
         *
         * Testcase = {3,2,1,4,9,10,-2}
         */
        for (int i = 1; i < unsortedArr.length; i++){

            /**
             * store the current element
             *
             *
             * FirstPass : currentElement = 2
             *
             * */
            int currentElement = unsortedArr[i];

            /**
             *  Since we are checking whether the values before the current
             *  value is either smaller or greater
             *  we create a variable j , which is going to constantly
             *  less than the current index i
             *
             *
             *  FirstPass: j = 0
             */
            int j = i - 1;

            /**
             * check whether the previous element is greater than the current
             * element, if it is , then shift that element to the right and continue
             * this as long as there is a previous value in the array greater than the
             * current item.
             *
             * the 'j>=0' is put to guard against negative index
             * since we are decrementing the j
             *
             *
             * FirstPass: j equals 0 && 3 > 1 ✔️
             *            {3,3,1,4,9,10,-2}
             *            j-- => -1.
             *            while loop ends
             */
            while (j >= 0 && unsortedArr[j] > currentElement){
                unsortedArr[j+1] = unsortedArr[j];
                j--;
            }

            /**
             * Once we've successfully shifted every element right
             * then store the current element in the right position
             *
             * FirstPass: j + 1 = -1 + 1
             *            j = 0
             *            {1,3,4,9,10,-2}
             */
            unsortedArr[j + 1] = currentElement;
        }

        return unsortedArr;
    }
}
