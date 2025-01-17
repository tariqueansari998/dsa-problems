package org.example.challenges;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.Array;

import static org.junit.jupiter.api.Assertions.*;

class MostFrequentNumberInArrayTest {

    MostFrequentNumberInArray testInstance = new MostFrequentNumberInArray();

    @Test
    void testMostFrequentnumberInArray(){
        Assertions.assertEquals(2, testInstance.getMostFrequentNumberInArray(new int[]{2, 2, 1, 3, 1, 2, 2}));
        Assertions.assertEquals(3, testInstance.getMostFrequentNumberInArray(new int[]{2, 2, 2, 3, 1, 3, 4, 3, 5,3}));
        Assertions.assertEquals(3, testInstance.getMostFrequentNumberInArray(new int[]{3, 2, 2, 3, 1, 3, 4, 3, 5,3}));
        Assertions.assertEquals(20, testInstance.getMostFrequentNumberInArray(new int[]{10, 20, 10, 20, 30, 20, 20,6}));
        Assertions.assertEquals(1, testInstance.getMostFrequentNumberInArray(new int[]{1, 3, 2, 1, 4, 1,8}));
    }

}