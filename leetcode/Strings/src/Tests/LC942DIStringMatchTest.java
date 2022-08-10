package Tests;

import org.junit.jupiter.api.Test;
import solutions.LC942_DIStringMatch;

import static org.junit.jupiter.api.Assertions.*;

class LC942DIStringMatchTest {

    @Test
    void MatchString(){
        var test = new LC942_DIStringMatch();
//        assertArrayEquals(new int[]{0,4,1,3,2} , test.diStringMatch("IDID"));
//        assertArrayEquals(new int[]{0,1,2,3} , test.diStringMatch("III"));
//        assertArrayEquals(new int[]{3,2,0,1} , test.diStringMatch("DDI"));
        assertArrayEquals(new int[]{4,3,2,1} , test.diStringMatch("DDD"));
    }

}