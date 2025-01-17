package org.example.challenges;

/**
 * Problem statement :  Given a position in a chess board which is represented by a string of row & column e.g. "2b" where 2 is the row
 * and b is the 2nd column. The program takes a row count & column count as input and return the final position after adding the row & column
 */


public class ChessProblem {

    public String movePiece(String startPosition, int rowCount, int columnCount){
        int startRow = Integer.parseInt(String.valueOf(startPosition.charAt(0)));
        int startColumn = startPosition.charAt(1) - 96;

        int rowModulo = (startRow + rowCount) % 8;
        int columnModulo = (startColumn + columnCount) % 8;

        int endRow = rowModulo == 0 ? 8 : rowModulo;
        char endColumn = (char) (columnModulo + 96);


        return endRow + "" + endColumn;
    }

}
