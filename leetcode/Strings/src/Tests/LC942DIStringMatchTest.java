package Tests;

import org.junit.jupiter.api.Test;
import solutions.LC942_DIStringMatch;

import static org.junit.jupiter.api.Assertions.*;

class LC942_DIStringMatchTest {

    @Test
    void MatchString(){
        var test = new LC942_DIStringMatch();
        assertEquals(new int[]{0,4,1,3,2} , test.diStringMatch("IDID"));
        assertEquals(new int[]{0,1,2,3} , test.diStringMatch("III"));
        assertEquals(new int[]{0,4,1,3,2} , test.diStringMatch("IDID"));
        assertEquals(new int[]{0,4,1,3,2} , test.diStringMatch("IDID"));
        assertEquals(new int[]{0,4,1,3,2} , test.diStringMatch("IDID"));
    }

}