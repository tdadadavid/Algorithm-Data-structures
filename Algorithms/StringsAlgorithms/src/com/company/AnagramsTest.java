package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramsTest {

    @Test
    void  theyShouldBeAnagrams(){
        var anagram = new Anagrams();
        assertTrue(anagram.isAnagram("" , ""));
        assertTrue(anagram.isAnagram("bab", "abb"));
        assertFalse(anagram.isAnagram("baba", "abb"));
        assertFalse(anagram.isAnagram("bac", "zbb"));
        assertFalse(anagram.isAnagram("b", "abb"));
    }

}