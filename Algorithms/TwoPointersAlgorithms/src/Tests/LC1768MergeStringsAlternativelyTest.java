package Tests;

import com.company.LC1768_MergeStringsAlternatively;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LC1768MergeStringsAlternativelyTest {

    @Test
    void MergeStringAlternatively(){

        var test = new LC1768_MergeStringsAlternatively();

        assertEquals("apbqcr", test.mergeAlternatively("abc" , "pqr"));
        assertEquals("apbqcd", test.mergeAlternatively("abcd", "pq"));
        assertEquals("apbqrs", test.mergeAlternatively("ab"  , "pqrs"));

    }

}