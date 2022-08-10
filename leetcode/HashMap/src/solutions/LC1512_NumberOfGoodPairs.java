package solutions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LC1512_NumberOfGoodPairs {
    public static void main(String[] args){
        int[] nums = {1,2,3,1,1,3};
        int ans = numIdenticalPaairs(nums);
        System.out.println(ans);
    }

    // brute force O(n²)
    private static int numIdenticalPairs(int[] nums){

        int count = 0;

        for (int i = 0; i <= nums.length - 1; i++)
            for (int j = 1; j <= nums.length - 1; j++)
                if (nums[i] == nums[j] && i < j)
                    count++;

        return count;
    }

    // O(nlogn)
    private static int numIdenticalPairz(int[] nums){
        int count = 0;
        int j = 0;
        Arrays.sort(nums);  // O(nlogn)
        // this sort function is using Quick sort algorithm

        for (int i = 1; i < nums.length; i++){ // O(n)
            if(nums[i] == nums[j])
                count += i - j;
            else
                j = i;
        }

        return count;
    }

    // O(n)
    private static int numIdenticalPear(int[] nums){
        int count =0;
        int[] freq = new int[100];

        for(int num : nums) // o(n)
            count += freq[num]++;

        return count;
    }

    // O(n)
    private static int numIdenticalPaairs(int[] nums){
        Map<Integer, Integer> integerToFrequency = new HashMap<>();
        int count = 0;

        for (int num : nums){
            if (integerToFrequency.containsKey(num))
                count += integerToFrequency.get(num);
            integerToFrequency.put(num , integerToFrequency.getOrDefault(num , 0) + 1);
        }

        return count;
    }
}
