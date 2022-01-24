package com.company;

import java.util.Arrays;

public class TransposeASquareImage {
    public static void main(String[] args){
        int[][] image = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int[][] image2 = {{1,4,7} , {2,5,8} , {3,6,9}};

        System.out.println(transpose(image));
    }


    /**
     *
     * When transposing a square matrix (image) we take note of the diagonals
     * because they're not gonna change position(index)
     * for example if we have a 3×3 matrix then values at
     * matrix[0][0], matrix[1][1],and matrix[2][2]
     * then we can write a condition to check when index i and j are the same
     * and ignore the value(s) at that index
     *
     */
    public static String transpose(int[][] image){

        int lengthOfImage = image.length;
        int lengthOfPixel;

        for (int i = 0; i < lengthOfImage; i++){
            lengthOfPixel = image[i].length;

            for (int j = i+1; j < lengthOfPixel; j++){
                int temp = image[i][j];
                image[i][j] = image[j][i];
                image[j][i] = temp;
            }
        }

        return Arrays.deepToString(image);
    }

    // someone else's code
    public static String transposeTwo(int[][] image) {
        final int rows = image.length;
        final int cols = image[0].length;

        final int[][] transposed = new int[cols][rows];

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                transposed[col][row] = image[row][col];
            }
        }

        return Arrays.deepToString(transposed);
    }
}
