package solutions;

import java.util.LinkedList;
import java.util.Queue;

public class Dota2_senate_649 {
    public static void main(String[] args) {
        String senate = "RRDDD";
        System.out.println(predictPartyVictory(senate));
    }


    public static String predictPartyVictory(String senate) {

        Queue<Character> q = new LinkedList<>();
        int Radiant = 0, Dire = 0;                              // counters for no of Radiant and Dire
        int banR = 0, banD = 0;                                 // counters for no of banned Radiant and Dires

        for (char c : senate.toCharArray()) {                    // foreach senator in the senator array
            if (c == 'R') Radiant++;                             // check which senate at a particular iteration
            else Dire++;                                        // and increment the  senate's counter
            q.add(c);                                           // add that particular senate to the queue 'q'
        }

        while (Radiant > 0 && Dire > 0) {

            char curr = q.poll();                               // the first senate in the queue is stored on the senate

            if (curr == 'R') {                                   // if the current senate is a Radiant
                if (banD > 0) {                                  // if the no of banned Dire senators is greater than zero
                    banD--;                                     // decrease the no of banned Dire senators
                    Radiant--;                                  // decrease the no of banned Radiant senators
                } else {                                          // if the no of banned Dire senators is >= 0
                    banR++;                                     // then reduce the no of banned Radiant senators
                    q.add(curr);                                // and add the current senator(Dire) to the queue
                }
            } else {
                if (banR > 0) {
                    banR--;
                    Dire--;
                } else {
                    banD++;
                    q.add(curr);
                }
            }
        }

        return Radiant == 0 ? "Dire" : "Radiant";
    }
}
