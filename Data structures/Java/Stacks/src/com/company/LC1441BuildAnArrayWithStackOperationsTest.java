package com.company;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LC1441BuildAnArrayWithStackOperationsTest {

    @Test
    void itReturnsStackOperations(){
        LC1441_BuildAnArrayWithStackOperations test = new LC1441_BuildAnArrayWithStackOperations();

        List<String> ops = new ArrayList<>();

        ops.add("Push");
        ops.add("Push");
        ops.add("Pop");
        ops.add("Push");

        List<String> ops1 = new ArrayList<>();

        ops1.add("Push");
        ops1.add("Push");
        ops1.add("Push");

        List<String> ops2 = new ArrayList<>();

        ops2.add("Push");
        ops2.add("Push");

        assertArrayEquals(ops.toArray(), test.buildArray(new int[]{1, 3}, 3).toArray());
        assertArrayEquals(ops1.toArray(), test.buildArray(new int[]{1,2,3}, 3).toArray());
        assertArrayEquals(ops2.toArray(), test.buildArray(new int[]{1,2}, 4).toArray());
    }

}