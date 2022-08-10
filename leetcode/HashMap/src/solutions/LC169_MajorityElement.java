package solutions;

import java.util.HashMap;

public class LC169_MajorityElement {
    public static void main(String[] args) {
        int[] nums = {3,2,3};
        Object answer = majorityElement(nums);
        System.out.println(answer);
    }


    // brute force
    private static Object majorityElement(int[] nums){

        HashMap<Integer , Integer> map = new HashMap<>();
        int len = nums.length-1;

        for (int i = 0; i <= len; i++){
            int val = nums[i];

            if (map.containsKey(val))
                map.put(val , map.get(val) + 1);
            else
                map.put(val , 0);

        }

        int floorVal = Math.floorDiv(len , 2);

        for(int item : map.keySet())
            if (map.get(item) >= floorVal)
                return item;

        return null;
    }
}
