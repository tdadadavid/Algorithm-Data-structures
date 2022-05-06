package Tests;

import com.company.LC26_RemoveDuplicatesFromArray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LC26RemoveDuplicatesFromArrayTest {

    @Test
    void duplicatesAreRemoved(){

        int[] duplicates = {0,0,1,1,2,2,3,3,4};
        int[] duplicates2 = {1,1,2};
        int[] duplicates3 = {1};
        int[] duplicates4 = {0,0,1,1,2,2,3,3,4,9};

        LC26_RemoveDuplicatesFromArray test = new LC26_RemoveDuplicatesFromArray();
        assertEquals(5, test.removeDuplicates(duplicates));
        assertEquals(2, test.removeDuplicates(duplicates2));
        assertEquals(0, test.removeDuplicates(duplicates3));
        assertEquals(6, test.removeDuplicates(duplicates4));
    }

}