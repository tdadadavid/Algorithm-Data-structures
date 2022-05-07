package Tests;

import com.company.LC28_ImplementstrStr;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LC28ImplementstrStrTest {


    @Test
    void needleIsFound(){
        LC28_ImplementstrStr test = new LC28_ImplementstrStr();

        assertEquals(2 , test.strStr("hello", "ll"));
        assertEquals(-1 , test.strStr("aaaaa", "bba"));
        assertEquals(0 , test.strStr("hello", ""));
        assertEquals(0 , test.strStr("", "ba"));
        assertEquals(0 , test.strStr("a", "a"));
        assertEquals(-1 , test.strStr("mississippi", "issipi"));
        assertEquals(4 , test.strStr("mississippi", "issippi"));

    }
}