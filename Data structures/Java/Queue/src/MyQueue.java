import java.util.*;

/**
 *  A Queue is a fifo data structure, meaning the first element
 *  that gets into the queue gets out first (first in first out)
 *
 *  OPERATION IN A QUEUE
 *
 *  1. Enqueue: Adds an element to the front of the queue.
 *      Time complexity: Constant time O(1).
 *
 *  2. Dequeue: Removes and returns an element from the front of the queue.
 *              Throws error if there is no element in the queue.
 *      Time complexity: Constant time O(1)
 *
 * 3. Peek: Same as Dequeue (returns null if there is no element in the queue).
 *
 * 4. Poll: Returns first element in the queue (returns null queue is empty)
 *          Doesn't remove the element *
 *     Time complexity: Constant time O(1)
 *
 *  Classes that implement Queues in Java
 *      - linked-list
 *      - ArrayDequeue (Array double ended queue)
 *      - And many more
 *
 *
 *  Real Life use cases for a queue includes
 *  1. Web servers: Queues are used to handle request and task
 *                  sent to web servers example of real life application
 *                  is RabbitMQ
 *
 *  2. Operating System:  Queues alongside with stacks are used to manage processes
 *                        in the system
 *
 *  3. Printers: Have you ever printed multiple documents or files before? how were
 *               they printed in the order you sent them? Here is the power of queue😎😎
 *               The printer queue stores the order in which they come and attends to each
 *               process in that order, then when the file has been printer it moves on to
 *               the next file sent (dequeue)
 *
**/

public class MyQueue {
    public static void main(String[] args){

        ArrayQueue<Integer> numbers = new ArrayQueue<>(7);
        numbers.enqueue(20);
        numbers.enqueue(10);
        numbers.enqueue(30);
        numbers.enqueue(19);
        numbers.enqueue(39);
        numbers.enqueue(129);
        numbers.enqueue(309);

        // should remove the two first values from the queue
        int firstValue = numbers.dequeue();
        int secondValue = numbers.dequeue();
        System.out.println("First value(dequeue): " + firstValue);
        System.out.println("First value(dequeue): " + secondValue);

        // it should return the same number
        // since it doesn't remove the first element
        // in the queue

        int firstElement = numbers.peek();
        int stillFirstElement = numbers.peek();
        int stillTheSameFirstElement = numbers.peek();
        System.out.println("First element(peek): " + firstElement);
        System.out.println("First element(peek): " + stillFirstElement);
        System.out.println("First element(peek): " + stillTheSameFirstElement);


        // should remove the element at the front
        // of the queue

        int firstInQueue = numbers.poll();
        System.out.println("First element(poll): " + firstInQueue);
        int newFirstInQueue = numbers.poll();
        System.out.println("First element(poll): " + newFirstInQueue);
        numbers.poll();
        numbers.poll();
        int lastElement = numbers.poll();
        System.out.println("First element(poll): " + lastElement);

        // return null since no element is in the queue
        System.out.println(numbers.poll());
        System.out.println(numbers.poll());
        System.out.println(numbers.poll());

        // should return null since no element is in the queue
        System.out.println(numbers.peek());

        // should throw illegalStateException since
        // there is no element in the queue

        System.out.println(numbers.dequeue());

        System.out.println(numbers);

    }

    // Using an array
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

    // Using an array list
    public static void reverse2(Queue<Integer> queue){
        List<Integer> storageList = new ArrayList<>();

        while (!queue.isEmpty())
            storageList.add(queue.remove());


        int sizeOfList = storageList.size();
        while (!storageList.isEmpty())
            queue.add(storageList.remove(--sizeOfList));
    }

    //  Using a stack
    public static void reverse3(Queue<Integer> queue){
        Stack<Integer> storage = new Stack<>();

        while(!queue.isEmpty()){
            storage.push(queue.remove());
        }

        while(!storage.isEmpty()){
            queue.add(storage.pop());
        }
    }
}
