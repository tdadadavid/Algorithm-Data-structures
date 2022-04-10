import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SplitAStringInBalancedStringsTest {

    @Test
    void splitIntoBalancedStrings(){
        var test = new LC1221_SplitAStringInBalancedStrings();

        assertEquals(4 , test.balancedStringSplit("RLRRLLRLRL"));
        assertEquals(3 , test.balancedStringSplit("RLLLLRRRLR"));
        assertEquals(1 , test.balancedStringSplit("LLLLRRRR"));

    }

}