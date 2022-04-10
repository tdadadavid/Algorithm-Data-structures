package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LC832_FlipAndInvertAnImageTest {

    @Test
    void checkIfImageIsFlippedAndInverted(){
        var flipAndInvert = new LC832_FlipAndInvertAnImage();
        assertArrayEquals(new int[][]{{1,0,0},{0,1,0},{1,1,1}} , flipAndInvert.flipAndInvertImage(new int[][]{{1,1,0},{1,0,1},{0,0,0}}));
        assertArrayEquals
                (new int[][]{{1,1,0,0},{0,1,1,0},{0,0,0,1},{1,0,1,0}} ,
                        flipAndInvert.flipAndInvertImage(new int[][]{{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}})
);
    }

}