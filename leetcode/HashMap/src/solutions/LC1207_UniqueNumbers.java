package solutions;

import java.util.ArrayList;
import java.util.HashMap;

public class LC1207_UniqueNumbers {
    public static void main(String[] args) {
        int[] firstTestCase = {-3,0,1,-3,1,1,1,-3,10,0};
        System.out.println(uniqueOccurrences(firstTestCase));
    }

    public static boolean uniqueOccurrences(int[] arr){

        // lets use a hashmap and an array
        // for the hashmap.. we store the elements as
        // the key and their count as the value
        // then we're gonna get all key and then
        // insert them into an hashset checking if the hashset already ahs the value
        // then return false

        HashMap<Integer , Integer> elementsAndCount = new HashMap<>();

        for (int element : arr) {
            if (elementsAndCount.containsKey(element))
                elementsAndCount.put(element, elementsAndCount.get(element) + 1);
            else
                elementsAndCount.put(element, 1);
        }

        ArrayList<Integer> distinctValues = new ArrayList<>();

        for (int item : elementsAndCount.values()) {
            if (distinctValues.contains(item))
                return false;
            distinctValues.add(item);
        }

        return true;
    }
}
