package com.company;

import java.util.List;

public class Main {

    public static void main(String[] args) {

    }


    public static int diagonalDifference(List<List<Integer>> arr){
        int leftdiagonal = 0, rightdiagonal = 0;
        for(int i = 0, j = arr.get(0).size()-1; i < arr.get(0).size(); i++, j--){
            leftdiagonal = leftdiagonal + arr.get(i).get(i);
            rightdiagonal = rightdiagonal + arr.get(i).get(j);
        }
    return Math.abs(leftdiagonal - rightdiagonal);
    }

}
