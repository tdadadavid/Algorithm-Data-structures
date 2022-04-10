package com.company;

public class LC832_FlipAndInvertAnImage {

    // Time complexity = O(n)
    // Space complexity = O(1)
    public int[][] flipAndInvertImage(int[][] image){

        int lenOfRow;

        // iterate through each pixel in the image
        for (int i = 0; i < image.length; i++){

            lenOfRow = image[i].length;

            // Taking note of odd lengths of arrays
            if ((lenOfRow) % 2 != 0)
                image[i][(lenOfRow /2)] = image[i][(lenOfRow/2)] == 0 ?  1 :  0;

            --lenOfRow;

            // iterate through each bit in each pixel
            for (int j = 0; j < (image[i].length/ 2); j++){

                // switch each bit with its "mirror" bit
                int temp = (image[i][j] == 0) ? 1 : 0;
                image[i][j] = (image[i][lenOfRow] == 0) ? 1 : 0;
                image[i][lenOfRow--] = temp;

            }

        }

        return image;
    }

    // Time complexity = O(N)
    // Space complexity = O(n)
    // This approach uses BITWISE operators
    public int[][] flipAndInvertImage2(int[][] A){

            int C = A[0].length;
            for (int[] row: A)
                for (int i = 0; i < (C + 1) / 2; ++i) {
                    int tmp = row[i] ^ 1;
                    row[i] = row[C - 1 - i] ^ 1;
                    row[C - 1 - i] = tmp;
                }

            return A;

    }
}
