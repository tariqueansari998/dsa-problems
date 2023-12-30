package org.example.challenges.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NonConstructibleChangeTest {

    NonConstructibleChange nonConstructibleChange = new NonConstructibleChange();

    @Test
    public void shouldReturnMinimumNonConstructibleChange(){
        Assertions.assertEquals(4,nonConstructibleChange.getMinNonConstructibleChane(new int[]{1,2,5}));
        Assertions.assertEquals(4,nonConstructibleChange.getMinNonConstructibleChane(new int[]{5,1,2}));
        Assertions.assertEquals(20,nonConstructibleChange.getMinNonConstructibleChane(new int[]{5,7,1,1,2,3,22}));
        Assertions.assertEquals(8,nonConstructibleChange.getMinNonConstructibleChane(new int[]{1,2,4}));
        Assertions.assertEquals(1,nonConstructibleChange.getMinNonConstructibleChane(new int[]{}));
    }
}
