package com.company;

import java.util.Arrays;

public class FlipAnImageOnItsHorizontalAxis {
    public static void main(String[] args) {
        int[][] image = {{255,255,255},  {0,0,0}};
        int[][] flippedImage = flipImage1(image);
        System.out.println(Arrays.deepToString(flippedImage));
    }

    // my code
    public static String flipAnImage(int[][] image){

        for (int i = 1; i <= image.length -1; i++){
            int[] pixel = image[i];
            image[i] = image[i-1];
            image[i-1] = pixel;
        }

        return Arrays.deepToString(image);
    }

    // my code ... second way .. it think it is better
    public static int[][] flipImage1(int[][] image){
        int[][] flippedImage = new int[image.length][image[0].length];
        int count = image.length-1;

        for (int[] i : image){
            flippedImage[count] = i;
            count--;
        }

        return flippedImage;
    }

    // someone else code
    public static String flipImage(int[][] image) {

        int row = image.length;
        int col = image[0].length;

        for (int i=0; i<row/2; i++) {
            for (int j=0; j<col; j++) {
                int temp = image[i][j];
                image[i][j] = image[row-1-i][j];
                image[row-1-i][j] = temp;
            }
        }

        return Arrays.deepToString(image);
    }
}
