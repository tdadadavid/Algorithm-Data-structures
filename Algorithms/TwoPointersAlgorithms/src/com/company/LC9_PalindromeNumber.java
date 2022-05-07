package com.company;

public class LC9_PalindromeNumber {
    public static void main(String[] args) {
        int testcase1 = 122;
        int testcase2 = 121;
        int testcase3 = 123;
        int testcase4 = 11;
        int testcase5 = 12;
        int testcase6 = 1;
        int testcase7 = 0;
        int testcase8 = -121;

        System.out.println(isPalindrom(testcase1));
        System.out.println(isPalindrom(testcase2));
        System.out.println(isPalindrom(testcase3));
        System.out.println(isPalindrom(testcase4));
        System.out.println(isPalindrom(testcase5));
        System.out.println(isPalindrom(testcase6));
        System.out.println(isPalindrom(testcase7));
        System.out.println(isPalindrom(testcase8));

    }

    // Time complexity = O(log n)
    // Space complexity = O(1)
    // The problem with this approach is that
    // if the reversed int is greater than INTEGER.MAXVALUE
    // there will with be an overflow error because the
    // computer won't be able to handle that large value
    private static boolean isPalindrome(int num){

        // Assuming negatives are not palindrome
        if (num < 0)
            return false;


        int remainder;
        int quotient = num;
        int rev = 0;

        // while the quotient is not zero
        while (quotient != 0){
            // get the remainder of the current number
            remainder = quotient %  10;
            // add the remainder to the product of the reversed value and 10
            rev = (rev * 10) + remainder;
            quotient /=  10;
        }

        // compare the reversed num to the original
        return rev == num;
    }

    // Time complexity = O(log n)
    // Space complexity = O(1)
    // This approach solves the above problem. How?
    // Debug and see for yourself ...
    private static boolean isPalindrom(int x){

        // if x is less than zero return false eg
        // -121 =/= 12-1 (though inti
        // or if the remainder after dividing x by
        // 10 is 0 and x itself is not zero eg 120 =/= (012)
        // return false;

        if(x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int revertedNumber = 0;
        // while the revertedNum is less than x
        while(x > revertedNumber) {
            // add the remainder of the quotient to the revertedNum* 10
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }

        // check if they're the same or if the number length is
        // odd divide by 10 again and compare because of middle values
        return  x == revertedNumber || x == revertedNumber/10;
    }
}
