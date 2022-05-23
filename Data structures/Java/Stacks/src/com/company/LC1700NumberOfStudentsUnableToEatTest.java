package com.company;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class LC1700NumberOfStudentsUnableToEatTest {

    @Test
    void itShouldReturnTheNumberOfStudentWhoDidntEat(){
        LC1700_NumberOfStudentsUnableToEat test = new LC1700_NumberOfStudentsUnableToEat();

        assertEquals(0, test.countStudents(new int[]{1,1,0,0}, new int[] {0,1,0,1}));
        assertEquals(3, test.countStudents(new int[]{1,1,1,0,0,1}, new int[] {1,0,0,0,1,1}));
    }

}