package com.company;

import java.util.Arrays;

public class Add3DArray {
    public static void main(String[] args) {
        int[][][] firstArr = {{{1, 2}, {3, 4}}, {{5, 6}, {7, 8}}};
        int[][][] secondArr = {{{9, 10}, {11, 12}}, {{13, 14}, {15, 16}}};

        add3DArray(firstArr, secondArr);

    }

    public static void add3DArray(int[][][] array1, int[][][] array2) {
        int[][][] result = new int[2][2][2];

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1.length; j++) {
                for (int k = 0; k < array1.length; k++) {
                    result[i][j][k] = array1[i][j][k] + array2[i][j][k];
                    System.out.println(Arrays.toString(new int[]{result[i][j][k]}));
                }
            }
        }
    }

}
