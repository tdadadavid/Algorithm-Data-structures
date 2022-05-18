package com.company;

import java.util.Objects;
import java.util.Stack;

public class LC682_BaseBallGame {
    public int countCal(String[] opts){

        int value;
        int sum = 0;

        Stack<Integer> records = new Stack<>();

        for (String element : opts){
            if (Objects.equals(element, "D")){
                value = records.peek() * 2;
                records.push(value);
            }else if (Objects.equals(element, "C")){
                records.pop();
            }else if(Objects.equals(element, "+")){
                int firstPrevious = records.pop();
                int secondPrevious = records.peek();

                value = firstPrevious + secondPrevious;
                records.push(firstPrevious);
                records.push(value);
            }else{
                records.push(Integer.valueOf(element));
            }
        }


        while (!records.isEmpty())
            sum += records.pop();


        return sum;
    }
}
