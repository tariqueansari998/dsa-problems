package org.example.challenges.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class ChessProblemTest {

    ChessProblem chessProblem = new ChessProblem();

    @Test
    public void testMoveChessPiece(){
       Assertions.assertEquals("8c", chessProblem.movePiece("3c", 5 , 8));
       Assertions.assertEquals("3d", chessProblem.movePiece("5h", 6 , 4));
       Assertions.assertEquals("3a", chessProblem.movePiece("5e", 6 , 4));
    }

}
