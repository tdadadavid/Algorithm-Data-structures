package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleSortedStringCompressionTest {

    @Test
    void stringShouldBeCompressed(){
        var compress = new SimpleSortedStringCompression();

        assertEquals("A4a3b5c4", compress.compress2("AAAAaaabbbbbcccc"));
        assertEquals("abc", compress.compress2("abc"));
        assertEquals("a2b4c3", compress.compress2("aabbbbccc"));
        assertEquals("a2b3cd4e5f", compress.compress2("aabbbcddddeeeeef"));
    }

}