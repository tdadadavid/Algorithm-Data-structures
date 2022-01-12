package com.company;

import java.util.Arrays;

public class BubbleSort_Main {

    public static void main(String[] args) {
        int[] scores = {9, 3, 120, 5, 34, 2, -1, 88, 0};

        boolean flag = false;

        for (int i = 0; i <= scores.length - 1; i++) {
            for (int j = 0; j <= scores.length - i - 2; j++) {
                if (scores[j] > scores[j + 1]) {
                    int temp = scores[j];
                    scores[j] = scores[j + 1];
                    scores[j + 1] = temp;

                    flag = true;
                }

                // my flag is not working
                // i need my flag to break the loop sometimes
                if (!flag)
                    break;

            }
        }

        System.out.println(Arrays.toString(scores));
    }
}

