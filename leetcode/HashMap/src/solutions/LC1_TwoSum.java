package solutions;

import java.util.Arrays;
import java.util.HashMap;

public class LC1_TwoSum {
    public static void main(String[] args) {

        int[] numbers = {2,7,11,15};
        int target = 9;

        int[] result = twoSum(numbers, target);

        System.out.println(Arrays.toString(result));


    }

    /**Brute force
     * O(n²)
     *
     * time = 92 ms
     */

//    public static int[] twoSum(int[] nums, int target) {
//        int[] answer = new int[2];
//
//        for (int i = 0; i <= nums.length - 1; i++) {
//            for (int j = i + 1; j <= nums.length - 1; j++) {
//                int check = nums[i] + nums[j];
//
//                if (check == target) {
//                    answer[0] = i;
//                    answer[1] = j;
//                    return answer;
//                }
//            }
//        }
//
//        return answer;
//    }

    // Using HashMap
    // O(n)



    /**
     *  let nums[i] = a and nums[j] = b
     *  a + b = target
     *  a = target - b
     *  target - b = compliment
     *
     *  O(log n)
     *  time = 3 ms
     */

    public static int[] twoSum(int[] numbers, int target){

        HashMap<Integer , Integer> map = new HashMap<>();
      //HashMap<ValueInArray , IndexOfValue>  map = new HashMap<ValueInArray, IndexOfValue>();

        for (int i = 0; i <= numbers.length - 1; i++){
            int compliment = target - numbers[i];

            if (map.containsKey(compliment))
                return new int[]{map.get(compliment) , i};
            map.put(numbers[i] , i);
        }

        return new int[]{};
    }
}
