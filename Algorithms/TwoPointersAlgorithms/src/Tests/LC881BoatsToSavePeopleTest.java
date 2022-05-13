package Tests;

import com.company.LC881_BoatsToSavePeople;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LC881BoatsToSavePeopleTest {

    @Test
    void numberOfBoatsUsedIsReturned(){
        LC881_BoatsToSavePeople test = new LC881_BoatsToSavePeople();

        assertEquals(2,test.numRescueBoats(new int[]{5,1,4,2}, 6));
        assertEquals(3,test.numRescueBoats(new int[]{3,8,7,1,4}, 9));
    }

}