package com.company;

public class Main {

    public static void main(String[] args) {
         //Find the repeated numbers
	    int[] numbers = {1 , 2 , 9 , 4 , 5 , 5 , 7 , 2 , 1 , 4  , 9 };
        for(int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j <= numbers.length - 1; j++){
                if (numbers[i] == numbers[j]) {
                    System.out.println(numbers[i]);
                    break;
                }
            }
        }


    }

}
