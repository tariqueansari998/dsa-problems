package org.example.challenges;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TransposeMatrixTest {

    TransposeMatrix transposeMatrix = new TransposeMatrix();

    @Test
    public void shouldReturnValidTransposedMatrix(){

        int[][] inputMatrix,expectedMatrix,actualMatrix;

        inputMatrix = new int[][]{{1,2,3},{4,5,6}};
        expectedMatrix = new int[][]{ {1,4},{2,5},{3,6}};

        actualMatrix = transposeMatrix.transpose(inputMatrix);

        for(int i=0; i < expectedMatrix.length;i++){
            for(int j=0; j<expectedMatrix[i].length;j++){
                Assertions.assertTrue(actualMatrix[i][j] == expectedMatrix[i][j]);
            }
        }


        inputMatrix = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        expectedMatrix = new int[][]{ {1,4,7},{2,5,8},{3,6,9}};

        actualMatrix = transposeMatrix.transpose(inputMatrix);

        for(int i=0; i < expectedMatrix.length;i++){
            for(int j=0; j<expectedMatrix[i].length;j++){
                Assertions.assertTrue(actualMatrix[i][j] == expectedMatrix[i][j]);
            }
        }

    }
}
