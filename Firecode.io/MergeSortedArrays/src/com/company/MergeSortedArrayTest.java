package com.company;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MergeSortedArrayTest {

    @Test
    void mergedArrayMustBeSorted(){
        MergeSortedArray merge = new MergeSortedArray();
        assertArrayEquals(new int[]{2,2,4,5,7,7,8,12,32} , merge.refactoredMerge(new int[]{2,4,7,12,32}, new int[]{2,5,7,8}));
        assertArrayEquals(new int[]{2, 5,7, 8, 9 , 9}, merge.refactoredMerge(new int[]{9} ,new int[]{2, 5, 7, 8, 9}));
        assertArrayEquals(new int[]{1,2,7,8} , merge.refactoredMerge(new int[]{1,2} ,new int[]{7,8}));
        assertArrayEquals(new int[]{2} , merge.refactoredMerge(new int[]{} , new int[]{2}));
    }

}