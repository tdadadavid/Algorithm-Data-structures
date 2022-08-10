package solutions;

import java.util.HashMap;
import java.util.Map;

public class LC2001_NumberOfPairsOfInterchangeableRectangles {
    public static void main(String[] args) {
        int[][] rectangles = { {4,8},{3,6},{10,20},{15,30} };

        long ans = interChangableArray(rectangles);
        System.out.println(ans);
    }

    // brute force
    // works for only small sized testcases
    // extremely bad
    private static long interchangeableRectangles(int[][] rectangles){
        double ratio;
        long count = 0;
        Map<int[], Double> map = new HashMap<>();

        for (int[] smallRect : rectangles)
            for (int i = 1; i <= smallRect.length - 1; i++) {
                ratio = (double) smallRect[i - 1] / smallRect[i];
                map.put(smallRect , ratio);
            }

        double[] ratioStore = new double[map.size()];
        int index = 0;

        for (int[] arr : map.keySet()) {
            ratioStore[index] = map.get(arr);
            index++;
        }

        for (int i = 0; i <= ratioStore.length - 1; i++){
            for (int j = 0; j <= ratioStore.length - 1; j++)
                if (ratioStore[i] == ratioStore[j] && i < j)
                    count++;
        }

        return count;
    }

    private static long interChangeableRectangles(int[][] rectangles){
        // every index has an array
        // find the ratio of current index then store in the HashMap
        Map<Double , Double> map = new HashMap<>();
        long count = 0;

        for (int[] item : rectangles) {
            double ratio = (double) item[0] / (double) item[1];

            // if there is a ratio like that then increase the count
            if (map.containsKey(ratio))
                map.put(ratio , map.get(ratio) + 1.0);
            else
                map.put(ratio , 1.0);

        }

        // at the end add all the counts
        for (double i : map.keySet())
            count += map.get(i);

      return count;
    }

    private static long interChangableArray(int[][] rectangles){
        long counter = 0;
        Double ratio = 0.0;
        Map<Double, Integer> freqByFraction = new HashMap<>();
        for(int[] rectangle : rectangles) {
            ratio = ((double) rectangle[0] / (double) rectangle[1]);
            counter += freqByFraction.getOrDefault(ratio, 0);
            freqByFraction.put(ratio, (freqByFraction.getOrDefault(ratio, 0) + 1));
        }
        return counter;
    }
}
