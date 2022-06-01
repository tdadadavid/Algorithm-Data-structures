import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * Here I used a stack to implement a stack.
 * A stack is a fifo (first-in-last-out) data structure
 *
 * Operations in a stack:
 * pop: removes and returns the top of the stack.
 * push: pushes the element into the stack.
 *
 */


public class StackQueue<E> {

    private Stack<E> store;
    private int length = 0;
    public StackQueue(){
        this.store = new Stack<E>();
    }

    public void enqueue(E element){
        this.store.push(element);
        length++;
    }

    /**
     * Note this is a stack implementation
     * so the front of the queue is at the bottom
     * of the stack, so we have to get the last element
     * in the stack (the bottom-most, the first)
     *
     * this operation is Linear Time O(n).
     */
    public E dequeue(){
        if (isEmpty()) throw new IllegalStateException("Queue is empty");

        List<E> keeper = getKeeper();

        while (!store.isEmpty()){
            E top = store.pop();
            keeper.add(top);
        }

        int lengthOfKeeper = keeper.toArray().length - 1;
        E front = keeper.get(lengthOfKeeper);

        // ignore the top element.
        lengthOfKeeper--;
        while (lengthOfKeeper >= 0){
            store.push(keeper.remove(lengthOfKeeper--));

        }

        this.length--;
        return front;
    }

    private ArrayList<E> getKeeper() {
        return new ArrayList<>();
    }

    public E poll(){
        if (isEmpty()) return null;

        List<E> keeper = getKeeper();
        while (!store.isEmpty()){
            E top = store.pop();
            keeper.add(top);
        }

        int len = keeper.toArray().length - 1;
        E front = keeper.get(len);
        keeper.remove(0);


        len--;
        while (len >= 0){
            store.push(keeper.remove(len--));

        }

        this.length--;
        return front;

    }

    public E peek(){
        if (isEmpty()) return  null;
        return this.store.peek();
    }

    public int length(){
        return this.length;
    }


    private boolean isEmpty(){
        return this.store.isEmpty();
    }

    public String toString(){
        return Arrays.toString(this.store.toArray());
    }
}
