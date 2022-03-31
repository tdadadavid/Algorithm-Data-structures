package com.company;

public class ReverseAnInteger{

    public static void main(String[] args) {
        int input = 98780978;

        System.out.println(reverse2(input));
    }

    // how to preserve the trailing zeros
    private static int reverse(int input){

        int divisor = 10;
        int quotient = input / divisor;
        int remainder = input % divisor;
        int reversed = 0;
        int length = String.valueOf(input).length();

       for (int i = 0; i < length; i++){
            reversed = (reversed * 10) + remainder;
            remainder = quotient % divisor;
            quotient /= divisor;
       }

        return reversed;
    }

    // A more concise solution
    public static int reverse2(int input) {

         int reversed = 0;
        while (input > 0) {
            reversed = (reversed * 10) + (input % 10);
            input = input / 10;
        }

        return reversed;
    }

}
