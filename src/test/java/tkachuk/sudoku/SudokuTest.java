package tkachuk.sudoku;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class SudokuTest
{
    @Test
    public void getErrors()
    {

        // board with errors
        int[][] nums = {
                {4, 3, 5, 2, 6, 9, 7, 8, 1},
                {6, 8, 2, 5, 7, 1, 4, 9, 3},
                {1, 9, 7, 8, 3, 4, 5, 6, 2},
                {8, 2, 6, 1, 9, 5, 3, 4, 7},
                {3, 5, 4, 7, 8, 2, 9, 1, 8},
                {9, 7, 1, 2, 4, 3, 6, 2, 5},
                {5, 1, 9, 3, 2, 6, 8, 7, 4},
                {2, 4, 8, 9, 5, 7, 1, 3, 6},
                {7, 6, 3, 4, 1, 8, 2, 5, 9}};

        Sudoku board = new Sudoku(nums);

        board.getErrors();

        List<String> expectedList = Arrays.asList(
                "Horiz.: column 3 row 5 duplicate 2",
                "Vertic.: column 8 row 4 duplicate 8",
                "Vertic.: column 7 row 5 duplicate 2",
                "Box: 5 duplicate 2"
        );

        assertEquals(expectedList, board.getErrors());

        // correct board
        int[][] nums2 = {
                {5, 3, 4, 6, 7, 8, 9, 1, 2},
                {6, 7, 2, 1, 9, 5, 3, 4, 8},
                {1, 9, 8, 3, 4, 2, 5, 6, 7},
                {8, 5, 9, 7, 6, 1, 4, 2, 3},
                {4, 2, 6, 8, 5, 3, 7, 9, 1},
                {7, 1, 3, 9, 2, 4, 8, 5, 6},
                {9, 6, 1, 5, 3, 7, 2, 8, 4},
                {2, 8, 7, 4, 1, 9, 6, 3, 5},
                {3, 4, 5, 2, 8, 6, 1, 7, 9}};

        Sudoku board2 = new Sudoku(nums2);

        board2.getErrors();

        List<String> expectedList2 = Arrays.asList();

        assertEquals(expectedList2, board2.getErrors());

    }

    @Test
    public void toStringTest()
    {

        int[][] nums = {
                {5, 3, 4, 6, 7, 8, 9, 1, 2},
                {6, 7, 2, 1, 9, 5, 3, 4, 8},
                {1, 9, 8, 3, 4, 2, 5, 6, 7},
                {8, 5, 9, 7, 6, 1, 4, 2, 3},
                {4, 2, 6, 8, 5, 3, 7, 9, 1},
                {7, 1, 3, 9, 2, 4, 8, 5, 6},
                {9, 6, 1, 5, 3, 7, 2, 8, 4},
                {2, 8, 7, 4, 1, 9, 6, 3, 5},
                {3, 4, 5, 2, 8, 6, 1, 7, 9}};

        Sudoku board = new Sudoku(nums);

        String expectedBoard =
                "\n-------------------------------------\n"
                        + "| 5 | 3 | 4 | 6 | 7 | 8 | 9 | 1 | 2 |\n"
                        + "-------------------------------------\n"
                        + "| 6 | 7 | 2 | 1 | 9 | 5 | 3 | 4 | 8 |\n"
                        + "-------------------------------------\n"
                        + "| 1 | 9 | 8 | 3 | 4 | 2 | 5 | 6 | 7 |\n"
                        + "-------------------------------------\n"
                        + "| 8 | 5 | 9 | 7 | 6 | 1 | 4 | 2 | 3 |\n"
                        + "-------------------------------------\n"
                        + "| 4 | 2 | 6 | 8 | 5 | 3 | 7 | 9 | 1 |\n"
                        + "-------------------------------------\n"
                        + "| 7 | 1 | 3 | 9 | 2 | 4 | 8 | 5 | 6 |\n"
                        + "-------------------------------------\n"
                        + "| 9 | 6 | 1 | 5 | 3 | 7 | 2 | 8 | 4 |\n"
                        + "-------------------------------------\n"
                        + "| 2 | 8 | 7 | 4 | 1 | 9 | 6 | 3 | 5 |\n"
                        + "-------------------------------------\n"
                        + "| 3 | 4 | 5 | 2 | 8 | 6 | 1 | 7 | 9 |\n"
                        + "---------------------------------------\n";

        assertEquals(expectedBoard, board.toString());

    }

}