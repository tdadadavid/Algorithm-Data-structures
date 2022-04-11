package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LC2000_ReversePrefixWordTest {

    @Test
    void testIfThePrefixIsReversed(){
        var test = new LC2000_ReversePrefixWord();
        assertEquals("dcbaefd" , test.reversePrefix("abcdefd" , 'd'));
        assertEquals("zxyxxe" , test.reversePrefix("xyxzxe" , 'z'));
        assertEquals("abcd" , test.reversePrefix("abcd" , 'z'));
    }

}