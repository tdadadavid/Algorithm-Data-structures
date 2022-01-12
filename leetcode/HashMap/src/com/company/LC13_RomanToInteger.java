package com.company;

import java.text.CharacterIterator;
import java.text.StringCharacterIterator;
import java.util.HashMap;
import java.util.Map;

public class LC13_RomanToInteger {
    public static void main(String[] args) {

        String romanNumeral = "MCMXCIV";
        int answer = romanToInt(romanNumeral);
        System.out.println(answer);

    }

    /** my method
    *time = 53ms
     */
    public static int romanToInt(String romanNum){
        /**
         * 1. add the constraints first into the map
         *      constraints
         *      1. IV = 4
         *      2. IX = 9
         *      3. XL = 40
         *      4. XC = 90
         *      5. CD = 400
         *      6. CM = 900
         *
         *  2. then add the normal value for the individual letters
         *  3. Iterate over the string given check each character and
         *     the next one after it whether they match the constraint
         *     then convert using concatenation
         */

        Map<String , Integer> map = new HashMap<>();
        map.put("IV" , 4);
        map.put("IX" , 9);
        map.put("XL" , 40);
        map.put("XC" , 90);
        map.put("CD" , 400);
        map.put("CM" , 900);

        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);

        CharacterIterator characterIterator = new StringCharacterIterator(romanNum);
        int result = 0;

        while (characterIterator.current() != CharacterIterator.DONE) {

            String currentChar = String.valueOf(characterIterator.current());
            String nextChar = String.valueOf(characterIterator.next());
            String combinedChar = new StringBuilder(result).append(currentChar).append(nextChar).toString();

            if (map.containsKey(combinedChar)) {
                result += map.get(combinedChar);
                characterIterator.next();
            }
            else
                result += map.get(currentChar);

        }
        return result;
    }


    /**
     * @malinov method
     * time = 9ms
     */
    public int romanIntoInt(String s) {
        char[] stringArray = s.toCharArray();
        int size = s.length();
        int value = 0;

        for (int i = 0; i < size; i++) {
            switch (stringArray[i]) {
                case 'I':
                    if (i + 1 < size && stringArray[i + 1] == 'V') {
                        value += 4;
                        i++;
                    } else if (i + 1 < size && stringArray[i + 1] == 'X') {
                        value += 9;
                        i++;
                    } else
                        value += 1;
                    break;
                case 'V':
                    value += 5;
                    break;
                case 'X':
                    if (i + 1 < size && stringArray[i + 1] == 'L') {
                        value += 40;
                        i++;
                    } else if (i + 1 < size && stringArray[i + 1] == 'C') {
                        value += 90;
                        i++;
                    } else
                        value += 10;
                    break;
                case 'L':
                    value += 50;
                    break;
                case 'C':
                    if (i + 1 < size && stringArray[i + 1] == 'D') {
                        value += 400;
                        i++;
                    } else if (i + 1 < size && stringArray[i + 1] == 'M') {
                        value += 900;
                        i++;
                    } else
                        value += 100;
                    break;
                case 'D':
                    value += 500;
                    break;
                case 'M':
                    value += 1000;
                    break;
            }
        }
        return value;
    }

    // another solution entirely
    public static int romanInt(String s) {
        int val = 0,prev=0,sum=0;
        for(int i=0;i<s.length();i++) {
            switch(s.charAt(i)) {
                case 'I':
                    val = 1;
                    break;
                case 'V':
                    val = 5;
                    break;
                case 'X':
                    val = 10;
                    break;
                case 'L':
                    val = 50;
                    break;
                case 'C':
                    val = 100;
                    break;
                case 'D':
                    val = 500;
                    break;
                case 'M':
                    val = 1000;
                    break;

            }
            if(val>prev) {
                sum = sum - prev + val - prev;
            }else {
                sum = sum + val;
            }
            prev = val;
        }
        return sum;
    }
}
