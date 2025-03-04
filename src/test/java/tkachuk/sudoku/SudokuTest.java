package tkachuk.sudoku;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class SudokuTest
{
    @Test
    public void getErrors()
    {
        int [] num = {4,3,5,2,6,9,7,8,1,
                6,8,2,5,7,1,4,9,3,
                1,9,7,8,3,4,5,6,2,
                8,2,6,1,9,5,3,4,7,
                3,5,1,7,4,3,6,2,8,
                9,5,1,7,4,3,6,2,8,
                5,1,9,3,2,6,8,7,4,
                2,4,8,9,5,7,1,3,6,
                7,6,3,4,1,8,2,5,9};
        Sudoku board = new Sudoku(new int[9][9]);

        int count = 0;
        for(int ii = 0; ii < board.getArr().length; ii++)
        {
            for (int jj = 0; jj < board.getArr()[0].length; jj++)
            {
                board.setArr(ii, jj, num[count]);
                count++;
            }
        }

        board.toString();

    }

}