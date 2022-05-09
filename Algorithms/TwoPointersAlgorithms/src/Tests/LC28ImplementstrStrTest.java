package Tests;

import com.company.LC28_ImplementstrStr;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LC28ImplementstrStrTest {


    @Test
    void needleIsFound(){
        LC28_ImplementstrStr test = new LC28_ImplementstrStr();

//        assertEquals(2 , test.strStr2("hello", "ll"));
//        assertEquals(-1 , test.strStr2("aaaaa", "bba"));
//        assertEquals(0 , test.strStr2("hello", ""));
//        assertEquals(0 , test.strStr2("", "ba"));
//        assertEquals(0 , test.strStr2("a", "a"));
//        assertEquals(-1 , test.strStr2("mississippi", "issipi"));
        assertEquals(4 , test.strStr2("mississippi", "issippi"));

    }
}