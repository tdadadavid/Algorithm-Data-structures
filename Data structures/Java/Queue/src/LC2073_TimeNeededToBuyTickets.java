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
    public int timeRequiredToBuy2(int[] tickets, int k) {
        if(tickets == null || tickets.length == 0) {
            return 0;
        }
        int count = 0;
        for (int i = 0 ; i < tickets.length; i++) {
            if(i <= k) {
                count += Math.min(tickets[i], tickets[k]);
            } else {
                count += Math.min(tickets[i], tickets[k] - 1);
            }

        }
        return count;
    }
}
