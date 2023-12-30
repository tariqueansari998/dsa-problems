package org.example.challenges.arrays;

/**
 * Problem statement : Given a 2D array, the function should return a transpose of the input
 * i.e. the rows will become columns & vice versa
 */

public class TransposeMatrix {

    public int[][] transpose(int[][] inputMatrix){
        int rows = inputMatrix.length;
        int columns = inputMatrix[0].length;
        int[][] resultMatrix = new int[columns][rows];

        for(int i=0;i<inputMatrix.length;i++){
            for(int j=0;j<inputMatrix[i].length;j++){
                resultMatrix[j][i] = inputMatrix[i][j];
            }
        }
        return resultMatrix;
    }
}
