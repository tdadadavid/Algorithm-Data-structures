package solutions;

import java.util.HashMap;
import java.util.Map;

public class LC141_LinkedListCycle {

    public static void main(String[] args){

        ListNode listNode = new ListNode(20);




        boolean answer = floydHasCycle(listNode);
        System.out.println(answer);

    }


    public static boolean hasCycle(ListNode head){
        // using HashMap (brute force)
        // store each visited node in a Hashmap
        // check every node if it has been visited
        // time = O(n) .. no to good

        if(head == null)
            return false;

        Map<ListNode , Integer> map = new HashMap<>();

        ListNode currentNode = head;



        while(currentNode.next != null){
            if(map.containsKey(currentNode))
                return true;
            else
                map.put(currentNode , currentNode.val);

            currentNode = currentNode.next;
        }

        return false;

    }

    public static boolean floydHasCycle(ListNode head){
        // floyd tortoise and hare algorithm
        // time complexity is O(1)

        ListNode hare = head;
        ListNode tortoise = head;

        while (hare != null && hare.next != null){

            tortoise = tortoise.next;
            hare = hare.next.next;

            if (hare == tortoise)
                return true;
        }

        return false;
    }

}

