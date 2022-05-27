import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class MyQueue {
    public static void main(String[] args){
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);

        reverse2(queue);
        System.out.println(queue);
    }

    public static void reverse(Queue<Integer> queue){
        int arraySize = queue.size();
        int[] storageArr = new int[arraySize];

        while (!queue.isEmpty()){
            storageArr[--arraySize] = queue.remove();
        }

        for(int element : storageArr){
            queue.add(element);
        }
    }

    public static void reverse2(Queue<Integer> queue){
        List<Integer> storageList = new ArrayList<>();

        while (!queue.isEmpty())
            storageList.add(queue.remove());


        int sizeOfList = storageList.size();
        while (!storageList.isEmpty())
            queue.add(storageList.remove(--sizeOfList));
    }
}
