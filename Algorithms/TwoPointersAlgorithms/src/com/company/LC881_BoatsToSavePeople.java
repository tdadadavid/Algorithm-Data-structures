package com.company;

import java.util.Arrays;

public class LC881_BoatsToSavePeople {
    /*
     * Sort the people according to their weight so that
     * the lightest people will be at the front and the
     * heaviest ones will be at the back.
     *
     * While we aren't picking the same people again
     * ie the pointer don't cross each other, they can
     * over-lap but not cross.
     *
     * Add the weight of the person at the back
     * to the weight of the person at the front
     * then check if the added weight is less than
     * or equal to the limit the boat can carry
     * if this is the case carry both of them
     * (shift the two pointers forward).
     * if that's not the case carry only the heaviest
     * person ie the person at the back (shift the
     * atBack pointer backwards( to the previous heaviest person).
     *
     * Increment the number of boats every time since,
     * no single person's weight is greater than the limit
     *
     * Time complexity to sort = O(n log(n)).
     * Time Complexity to iterate = O(log n).
     * Total Time complexity = O(n log(n)) + O(log n) => O(n log(n)).
     *
     * Space complexity = O(1) constant-space.
     */

    public int numRescueBoats(int[] people, int limit) {

        int atFront = 0;
        int atBack = people.length - 1;
        int boats = 0;
        int currentWeight;

        Arrays.sort(people);

        while (atFront <= atBack){

            currentWeight = people[atFront] + people[atBack];

            if (currentWeight  <= limit)
                atFront++;

            atBack--;
            boats++;
        }

        return boats;
    }
}
