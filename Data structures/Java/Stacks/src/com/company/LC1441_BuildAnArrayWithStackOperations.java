package com.company;

import java.util.ArrayList;
import java.util.List;

public class LC1441_BuildAnArrayWithStackOperations {
    public List<String> buildArray(int[] target, int n) {

        int i = 0;
        int count = 1;
        int length = target[target.length-1];
        List<String> operations = new ArrayList<>();

        // This is to make the code more readable;
        final String PUSH = "Push";
        final String POP = "Pop";

        while (length > 0){
            if (count != target[i]){
                operations.add(PUSH);
                operations.add(POP);
            }else{
                operations.add(PUSH);
                i++;
            }

            count++;
            length--;
        }

        return operations;
    }
}
