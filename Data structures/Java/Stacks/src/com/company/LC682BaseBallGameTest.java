package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LC682BaseBallGameTest {

    @Test
    void isShouldReturnTheSum(){
        LC682_BaseBallGame test = new LC682_BaseBallGame();
        assertEquals(30, test.countCal(new String[]{"5", "2", "C", "D", "+"}));
    }

}