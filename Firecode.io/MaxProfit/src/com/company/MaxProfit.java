package com.company;

import java.util.LinkedList;

public class MaxProfit {
    public static void main(String[] args) {
        int[] arr1 = {30,25,20,15};
        int[] arr2 = {50,0,10,100};
        int[] arr3 = {30,50,10,100};
        int[] arr4 = {7,6,4,3,1};
        int[] arr5 = {30,25,20,15,100,0};
        int[] arr6 = {102,105,99,98,102,99};

//        System.out.println(maxProfit(arr1));
//        System.out.println(maxProfit(arr2));
//        System.out.println(maxProfit(arr3));
//        System.out.println(maxProfit(arr4));
        System.out.println(maxProfit2(arr5));
        System.out.println(maxProfit2(arr6));

    }

    private static int maxProfit(int[] prices){

        // iterate through the array and keep check
        // of the min and max (also their index)
        // check if the index of min is greater than
        // max then there is a no profit else there is profit

        int minValue = Integer.MAX_VALUE;
        int maxValue = Integer.MIN_VALUE;

        int minIndex = -1;
        int maxIndex = -1;

        int check = 0;

        for (int i = 0; i < prices.length; i++){

            check = prices[i];

            if (check < minValue) {
                minValue = check;
                minIndex = i;
            }

            if (check > maxValue){
                maxValue = check;
                maxIndex = i;
            }
        }

        if (minIndex > maxIndex)
            return 0;


        return maxValue - minValue;
    }

    private static int maxProfit2(int[] prices){

        int min = prices[0];
        int maxProfit = 0;

        // come back for this
        for (int i = 0; i < prices.length; i++){
            if ((prices[i] - min) > maxProfit)
                maxProfit = prices[i] - min;
            if ((prices[i] - min) < maxProfit)
                min = prices[i];
        }

        return maxProfit;
    }
}
