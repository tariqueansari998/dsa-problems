package org.example.challenges;

import java.util.Arrays;

/**
 * Problem statement :  Given a non-sorted array of coins, write a function to find the minimum
 * change that cannot be constructed from the combination of coins.
 * e.g. coins [1,2,5] minimum change that cannot be constructed is 4
 *
 *
 * Solution :
 *  Sort the input array
 *  Iterate through the input array
 *  Check if the array item is greater than current sum of all items +1
 *  If yes, return the current sum +1.
 *  Else add the array item to the current sum of all items
 */

public class NonConstructibleChange {

    public int getMinNonConstructibleChane(int[] coins){
        int[] sortedArray = Arrays.stream(coins).sorted().toArray();

        int minNonConstructibleValue = 0;

        for(int i=0;i<sortedArray.length;i++){
            minNonConstructibleValue =
                    sortedArray[i] <= minNonConstructibleValue+1 ?
                            minNonConstructibleValue += sortedArray[i] : minNonConstructibleValue;
        }
        return ++minNonConstructibleValue;
    }

}
