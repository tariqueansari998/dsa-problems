package org.example.challenges;

import java.util.HashMap;
import java.util.Map;

/*
Given an array of int, find the most frequent number.
The solution is to maintain a map with key value pair, with key as the element and value as its frequency
 */
public class MostFrequentNumberInArray {

    public int getMostFrequentNumberInArray(final int[] input) {
        Map<Integer,Integer> freq = new HashMap<Integer, Integer>();
        int mostFrequentvalue = 0, maxFrequency = 0;
        for(int inp:input){
             if(freq.containsKey(inp)){
                 int currentElementFrequency = freq.get(inp)+1;
                 freq.put(inp, currentElementFrequency);
                 if(currentElementFrequency > maxFrequency){
                     mostFrequentvalue = inp;
                     maxFrequency = currentElementFrequency;
                 }
             }else {
                 freq.put(inp, 1);
             }
        }
        System.out.println("frequency:"+maxFrequency);
        return mostFrequentvalue;
    }

}
