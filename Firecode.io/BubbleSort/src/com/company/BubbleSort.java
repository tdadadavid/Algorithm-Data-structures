package com.company;

import java.util.Arrays;

public class BubbleSort<T> {

    T[] Arr;

    public BubbleSort(T[] array){
        this.Arr = array;
    }

    public String sort(){

        boolean flag =  true;

        for (int i = 0; i <= Arr.length-1; i++){
            for (int j = 0; j <= Arr.length - i - 2; j ++){
                if(Arr[j] >  Arr[j + 1]){
                    int temp = Arr[j];
                    Arr[j] = Arr[j + 1];
                    Arr[j + 1] = temp;

                    flag = true;
                }

                // my flag is not working
                // i need my flag to break the loop sometimes
                if (!flag)
                    break;

            }
        }

        return Arrays.toString(Arr);
    }


    // override the java default
    // toString method for this class

//    @Override
//    public String toString(){
//        for (T element: Arr) {
//            if (element.)
//        }
//    }
}
