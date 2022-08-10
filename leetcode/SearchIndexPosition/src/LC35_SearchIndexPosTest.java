import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LC35_SearchIndexPosTest {

    @Test
    void findIndexOfElement(){

        var index = new LC35_SearchIndexPos();

        assertEquals(2 , index.searchIndexPos(new int[]{1,3,5,6} , 5));
        assertEquals(1 , index.searchIndexPos(new int[]{1,3,5,6} , 2));
        assertEquals(4 , index.searchIndexPos(new int[]{1,3,5,6} , 7));
        assertEquals(0 , index.searchIndexPos(new int[]{1,3,5,6} , 0));
        assertEquals(1 , index.searchIndexPos(new int[]{1,3}, 2));

    }

}