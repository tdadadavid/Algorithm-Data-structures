package com.company;

import java.util.HashMap;

public class SimpleSortedStringCompression {
    public String compress2(String input){

        int count = 1;
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < input.length() - 1; i++){

            if (input.charAt(i) == input.charAt(i+1)) count++;
            else {

                if (count<= 1)
                    builder.append(input.charAt(i));
                else
                    builder.append(input.charAt(i))
                           .append(count);

                count = 1;
            }
        }

        if (count <= 1)
            builder.append(input.charAt(input.length()-1));
        else
            builder.append(input.charAt(input.length()-1))
                   .append(count);

        return String.valueOf(builder);
    }



    private static String compress(String input){

        // create a hashmap that maps each letter
        // to its frequency. then iterate over the
        // hashmap to get the keys and their value
        // and concatenate them

        HashMap<Character , Integer> frequencyOfChar = new HashMap<>();
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < input.length(); i++){

            if (frequencyOfChar.containsKey(input.charAt(i)))
                frequencyOfChar.put(input.charAt(i) , frequencyOfChar.get(input.charAt(i)) + 1);
            else
                frequencyOfChar.put(input.charAt(i), 1);
        }

        for (char key : frequencyOfChar.keySet()) {
            if (frequencyOfChar.get(key) == 1)
                builder.append(key);
            else
                builder.append(key ).append(frequencyOfChar.get(key));
        }

        return String.valueOf(builder);
    }




    // this is more readable than this upper one
    private static String compressString(String input) {

        StringBuilder sb = new StringBuilder();

        int currCount = 0;

        for(int i = 0; i < input.length(); i++){

            currCount++;

            if (i + 1 == input.length() || input.charAt(i) != input.charAt(i + 1)) {
                sb.append(input.charAt(i));
                if(currCount > 1) sb.append(currCount);
                currCount = 0;
            }
        }

        return sb.toString();
    }

}
