import java.util.LinkedList;
import java.util.Queue;

// The class name is Recent Counter on leetcode

/**
 * This question is really confusing. what it simply asks for
 * is to find the "pings" that occurred within the 3000 seconds
 * ago from that current "ping" time
 *
 * for example, if we perform a ping now, then we would have to
 * return the number of pings that occurred within 3000(3 ms) ago.
 *
 *
 * This question is practically a sliding window algorithm
 * [t1,t2,t3,t4,t5,t6,t7,t8,t9,t10] where the t -> time ping happened.
 * and each t = 1ms.
 *
 * Also, I am simulating the storage as a queue
 *
 * first ping: t1
 * [t1] =>  returns 1, since the number of pings within 3000(3 ms) is only one
 *
 * second ping: t2
 * [t2,t1] => returns 2, since the number of pings within 3ms is only 2
 *
 * third ping: t3
 * [t3,t2,t1] => returns 3, since the number of pings within 3ms is 3
 *
 * fourth ping: t4
 * [t4,t3,t2,t1] => return 1, since the number of pings within 3ms is 1
 *
 * fifth ping: t5
 * [t5,t4,t3,t2,t1] => return 2, since the number of pings within 3ms is 2
 *
 * sixth ping: t6
 * [t6,t5,t4,t3,t2,t1] => return 3, since the number of pings within 3ms is 3.
 *
 * seventh ping: t7
 * [t7,t6,t5,t4,t3,t2,t1] => return 1, since the number of pings within 3ms is 1
 *
 * eighth ping: t8
 * [t8,t7,t6,t5,t4,t3,t2,t1] => return 2, since the number of pings within 3ms is 2
 *
 * ninth ping: t9
 * [t9,t8,t7,t6,t5,t4,t3,t2,t1] => returns 3, since the number of pings within 3ms is 3
 *
 * tenth ping: t10
 * [t10,t9,t8,t7,t6,t5,t4,t3,t2,t1] => returns 1, since the number of pings within 3ms is 1.
 *
 * This is a simulation of this question, The number of Recent calls
 *
 */



public class LC933_NumberOfRecentCalls {

    Queue<Integer> slidingWindow;
    public LC933_NumberOfRecentCalls() {
        slidingWindow = new LinkedList<>();
    }

    public int ping(int t) {
        slidingWindow.add(t);

        final int threeThousandMilliSecondsTimeFrame = (t - 3000);

        while(slidingWindow.peek() < threeThousandMilliSecondsTimeFrame){
            slidingWindow.poll();
        }

        return slidingWindow.size();
    }
}
