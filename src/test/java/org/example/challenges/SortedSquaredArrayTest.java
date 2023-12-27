package org.example.challenges;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SortedSquaredArrayTest {

    SortedSquaredArray sqArray = new SortedSquaredArray();

    @Test
    public void shouldReturnSquaredArray(){
        var intput = new int[]{1,2,3,5,6,8,9};
        var expected = new int[]{1,4,9,25,36,64,81};
        var result = sqArray.sortedSquaredArray(intput);

        for(int i=0;i<expected.length;i++){
            Assertions.assertTrue(result[i]==expected[i]);
        }

        intput = new int[]{-5,-4,-3,0,3,4,5};
        expected = new int[]{0,9,9,16,16,25,25};
        result = sqArray.sortedSquaredArray(intput);

        for(int i=0;i<expected.length;i++){
            Assertions.assertTrue(result[i]==expected[i]);
        }
    }


}
