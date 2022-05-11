package Tests;

import com.company.LC189_RotateArray;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;


class LC189RotateArrayTest {

    @Test
    void arrayIsRotated(){
        LC189_RotateArray test = new LC189_RotateArray();

         test.rotate2(new int[]{1,2,3,4,5,6,7}, 3);
         test.rotate2(new int[]{-1,-100,3,99}, 2);
         test.rotate2(new int[]{1, 2}, 3);

    }

}