package com.company;

public class NonRepeatedValue {

    public static void main(String[] args) {

        /*
         * Find the unique element in the sorted array in
         * O(log n) time
         */


//        // worst algorithm O(n3) v.1.0
//        for(int i = 0; i <= numbers.length-1; i++)
//            for (int j = i + 1; j < numbers.length; j++)
//               if (numbers[i] == numbers[j]) {
//                   numbers[i] = numbers[j] = -1;
//                   break;
//               }
//
//        for (int i = 0; i <= numbers.length-1; i++)
//            if (numbers[i] != -1)
//                System.out.println(numbers[i]);


        // v.1.2 => optimized
        /* since the array is sorted, then pick the
            first value compare it to its adjacent value
            if they're the same move the zero index to the number
            after the duplicate and start the comparison, if a
            value occurs in which the next value to it (because the
            array is sorted) is not the same print out that number and break
            the loop else continue the loop

            first-iteration
            [ 1 , 1 , 2 , 2 , 3 , 4 , 4 , 5 , 5 ] = [ 2 , 2 , 3 , 4 , 4 , 5 , 5]
                      ^
            second-iteration
            [ 2 , 2 , 3 , 4 , 4 , 5 , 5] = [ 3 , 4 , 4 , 5 , 5]
                      ^

            since 3 == 4 is false then 3 is printed out and the loop breaks
         */

//        int arrayLength = numbers.length - 1;
//
//        for (int i = 0; i <= arrayLength; i+=2) { // O(n)
//            if (numbers[i] == numbers[i + 1]) {
//                arrayLength -= 2;
//                // how to shrink the array ?
//
//                int index = (numbers.length - 1) - arrayLength;
//                int[] newArray = new int[arrayLength];
//
//                // How to optimize this code
//                for (int j = 0; j <= newArray.length-1; j++) { // n + O(n)
//                    newArray[j] = numbers[index];
//                    index++;
//                }
//            }
//            else {
//                System.out.println("Non-repeated number is = " + numbers[i]);
//                break;
//            }
//        }


        /* v.1.3
         * Time complexity  = O(log n)
         * [ 1 , 1 , 2 , 2 , 3 , 4 , 4 , 5 , 5 ] = [ 2 , 2 , 3 , 4 , 4 ]
         *                   ^
         *   advantage 1: it is ordered
         *   advantage 2: every new number before the unique number starts with an even index
         *   advantage 3: every new number after the unique number starts with an odd index
         */


        int[] numbers = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5};


        // best solution O(log n) time complexity
        int start = 0;
        int end = numbers.length - 1;
        int mid;

        while (start <= end) {
            mid = (end - start) / 2;


            // check if we just have one item in the array
            if (start == end) {
                System.out.println(numbers[start] + " is the unique number");
                break;
            }

            // check the boundary values for unique number
            if (numbers[start] != numbers[start + 1]) {
                System.out.println(numbers[start] + " is the unique number");
                break;
            }

            if (numbers[end] != numbers[end - 1]) {
                System.out.println(numbers[end] + " is the unique number");
                break;
            }


            // check if the middle is the unique number
            if (numbers[mid] != numbers[mid + 1])
                if (numbers[mid] != numbers[mid - 1]) {
                    System.out.println(numbers[mid] + " is the unique number");
                    break;
                }

            // check whether the unique number is to the right
            if (numbers[mid] == numbers[mid + 1] && mid % 2 == 0)
                start = mid + 2;

            // check whether the unique number is to the left
            if (numbers[mid] == numbers[mid - 1] && (mid - 1) % 2 == 1)
                end = mid - 2;
        }


        // if there is no duplicate nkor?

    }

}



