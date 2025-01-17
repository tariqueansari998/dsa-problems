package org.example.challenges;

/**
 * Problem statement :  Given an array of sorted int, write a function which would return a sorted array of the squared numbers
 * Input : [0,1,2,3]  Output:[0,1,4,9]
 * Input : [-2,-1,0,1,2]  Output:[0,1,1,4,4]
 *
 * Solution :  Keep track of high & low index. Loop through the length of input array.
 * Check if SQ of the lowIdx item in array is greater than highIdx item. Place the higher value item in new Squared array at i.
 * Move the idx of the item already placed in squared array.
 **/

public class SortedSquaredArray {
        public int[] sortedSquaredArray(int[] array) {
            int highestIdx = array.length-1, lowestIdx = 0;

            // Write your code here.
            int[] sqArray = new int[array.length];

            for(int i= array.length - 1 ; i>= 0 ; i--){
                int highIdxSquare = array[highestIdx]*array[highestIdx];
                int lowIdxSquare = array[lowestIdx]*array[lowestIdx];

                if(lowIdxSquare > highIdxSquare){
                    sqArray[i] = lowIdxSquare ;
                    lowestIdx++;
                }else {
                    sqArray[i] = highIdxSquare ;
                    highestIdx--;
                }
            }
            System.out.println("");
            for(int i=0;i<sqArray.length;i++){
                System.out.print(" "+sqArray[i]);
            }
            System.out.println("");

            return sqArray;
        }


}
