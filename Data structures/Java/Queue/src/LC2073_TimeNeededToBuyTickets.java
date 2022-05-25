public class LC2073_TimeNeededToBuyTickets {

    //region Description
    /*
      *
      * The idea behind this algorithm is to constantly
      * move through each person on the queue till the
      * person being watched ( person at index k in the tickets queue)
      * has bought all he/her desired tickets (ie the number of tickets
      * left to buy is 0).
      *
      * While doing this check for those who have finshed
      * buying their tickets and ignore (because in they've
      * left the queue already).
      *
      * Time complexity = O(tickets[k]) => O(N)
      * As the number of tickets the user wants to buy
      * increases the algorithm is going to increase
      *
      * Space Complexity = O(1).
      * No extra space is used.
    */
    //endregion


    public int timeRequiredToBuy(int[] tickets, int k) {

        int counter = 0;
        int timeInSeconds = 0;

        int currentPerson = 0;
        int personBeingWatched = tickets[k];

        final int HAS_BOUGHT_ALL_TICKETS = 0;
        final int NUM_OF_PEOPLE = tickets.length-1;

        while(personBeingWatched != HAS_BOUGHT_ALL_TICKETS){

            currentPerson = tickets[counter];
            if (currentPerson != HAS_BOUGHT_ALL_TICKETS){
                tickets[counter]--;
                timeInSeconds++;
            }

            counter++;
            if (counter > NUM_OF_PEOPLE){
                counter = 0;
            }

            personBeingWatched = tickets[k];
        }

        return timeInSeconds;
    }

    // Someone solution

    /*

    <!-- My Explanation (understanding) -->

    // The idea behind this solution is to find the number of seconds
    // it takes every one before and after the person being watched
    // to buy ticket.

    // For example [2,9,3,4] , the personAtIndex(2) = 4 is the person being watched

    <!-- Explanation -->
    // When ever a person goes to the back that is equal to one cycle(in my own words)
    // The cycle stops for each person when each person has bought all tickets (0 tickets needed)
    // A cycle is equal to one second
    // Total time needed to buy tickets = total number of cycles that occurred before
    // the person being watched bought all needed tickets

    <!-- Example of a cycle -->
    // [2,9,3,4] -> [9,3,4,1] -> personAtIndex(0) = 2 has bought one ticket and still
    // has one ticket to buy so personAtIndex(0) goes to the back . This is one cycle

    <!-- process -->
    // it will take the personAtIndex(0) = 2, 2-cycles to buy a ticket before
    // the person being watched (3) will finish buying all tickets

    <!-- process -->
    // it will take the personAtIndex(1) = 9, 3-cycles to buy 3 tickets before
    // the person being(personAtIndex(2) = 3) watched would have finished buying all tickets

    <!-- Explanation -->
    // Imagine they're going to the back of the line when they've not finished buying their tickets
    // so the person who desires 9 tickets will go to the back of the line 9 times BUT!!!, the person
    // being watched(3) would have bought all tickets when this person (9) goes to the back of the line
    // the third time

    <!-- Process -->
    // it will take the personAtIndex(2) = 3 , 3-cycles to buy all the tickets

    <!-- Process -->
    // It will take personAtIndex(3) = 4, 2-cycles before the person being watched(personAtIndex(2) = 3)
    // buys all needed tickets

    <!-- Diagrammatic flow of the code -->
    // The person being watched = personAtIndex(2) => 3 [2,9,3*,4]
    // [2,9,3*,4] -> [1,9,3*,4](buys) ->[9,3*,4,1](goes to the back of the line) -> 1 cycle
    // [9,3*,4,1] -> [8,3*,4,1](buys) ->[3*,4,1,8](goes to the back of the line) -> 1 cycle
    // [3*,4,1,8] -> [2*,4,1,8](buys) ->[4,1,8,2*](goes to the back of the line) -> 1 cycle
    // [4,1,8,2*] -> [3,1,8,2*](buys) ->[1,8,2*,3](goes to the back of the line) -> 1 cycle
    // [1,8,2*,3] -> [0,8,2*,3](buys) ->[8,2*,3](leaves the line since all tickets has been bought) -> 1 cycle
    // [8,2*,3] -> [7,2*,3](buys) ->[2*,3,7](goes to the back of the line) -> 1 cycle
    // [2*,3,7] -> [1*,3,7](buys) ->[3,7,1*](goes to the back of the line) -> 1 cycle
    // [3,7,1*] -> [2,7,1*](buys) ->[7,1*,2](goes to the back of the line) -> 1 cycle
    // [7,1*,2] -> [6,1*,2](buys) ->[1*,2,6](goes to the back of the line) -> 1 cycle
    // [1*,2,6] -> [0*,2,6](buys) ->[2,6](leaves the line since all tickets has been bought) -> 1 cycle
    // The person being watched has finished buying all needed tickets

    // Test passed (check test file LC2073TimeNeededToBuyTicketsTest).

    // Time total taken = (1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1) cycles = 10 cycles
     */
    public int timeRequiredToBuy2(int[] tickets, int k) {
        if(tickets == null || tickets.length == 0) {
            return 0;
        }

        int timeInSeconds = 0;
        for (int i = 0 ; i < tickets.length; i++) {
            if(i <= k) {
                timeInSeconds += Math.min(tickets[i], tickets[k]);
            } else {
                timeInSeconds += Math.min(tickets[i], tickets[k] - 1);
            }
        }
        return timeInSeconds;
    }
}
