package com.company;

import java.util.HashMap;
import java.util.Map;

public class LC771_JewelsAndStones {
    public static void main(String[] args){
        String jewels = "aA";
        String stones = "aAAbbbb";

        int num = numJewelInStones(jewels , stones);
        System.out.println(num);

    }


    // using HashMap
    /*public static int numJewelInStones(String jewels, String stones){

        Map<Character , Integer> stoneMap = new HashMap<>();
        int count = 0;

        char[] jewelsArr = jewels.toCharArray();
        char[] stonesArr = stones.toCharArray();

        for (char stone : stonesArr) {
            if (stoneMap.containsKey(stone))
                stoneMap.put(stone, stoneMap.get(stone) + 1);
            else
                stoneMap.put(stone, 1);
        }

        for (char jewel : jewelsArr)
            if (stoneMap.containsKey(jewel))
                count += stoneMap.get(jewel);


        return count;
    }

     */

    private static int numJewelInStones(String jewels , String stones){
        int num = 0;

        for (int i = 0 ; i < stones.length(); i ++)
            if(jewels.indexOf(stones.charAt(i)) != -1)
                num++;

        return num;
    }
}
