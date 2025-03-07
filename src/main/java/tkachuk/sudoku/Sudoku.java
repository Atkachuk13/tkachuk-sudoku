package tkachuk.sudoku;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Sudoku
{

    private int[][] arr;

    public Sudoku(int[][] arr)
    {
        this.arr = arr;
    }

    public List<String> getErrors()
    {
        List<String> list = new ArrayList<String>();

        // check horizontally
        for (int col = 0; col < arr[0].length; col++)
        {
            HashSet<Integer> set = new HashSet<Integer>();
            for (int row = 0; row < arr.length; row++)
            {
                if (set.contains(arr[row][col]))
                {
                    list.add("Horiz.: " + "column " + col + " row " + row + " duplicate " + arr[row][col]);
                }
                set.add(arr[row][col]);
            }

        }

        // check vertically
        for (int row = 0; row < arr.length; row++)
        {
            HashSet<Integer> set = new HashSet<Integer>();
            for (int col = 0; col < arr[0].length; col++)
            {
                if (set.contains(arr[row][col]))
                {
                    list.add("Vertic.: " + "column " + col + " row " + row + " duplicate " + arr[row][col]);
                }
                set.add(arr[row][col]);

            }

        }

        // check boxes
        int countRow = 0;
        int countCol = 0;

        for (int box = 1; box < 10; box++)
        {
            HashSet<Integer> set = new HashSet<Integer>();

            for (int col = 0; col < 3; col++)
            {
                for (int row = 0; row < 3; row++)
                {
                    if (set.contains(arr[row + countRow][col + countCol]))
                    {
                        list.add("Box: " + box + " duplicate " + arr[row + countRow][col + countCol]);
                    }
                    set.add(arr[row + countRow][col + countCol]);

                }

            }
            countCol += 3;
            if (countCol > 6)
            {
                countCol = 0;
                countRow += 3;
            }
            if (countRow > 6)
            {
                countRow = 0;
            }

        }

        System.out.println(list.toString());
        return list;
    }

    @Override
    public String toString()
    {
        StringBuilder board = new StringBuilder();

        for (int i = 0; i < arr.length; i++)
        {
            board.append('\n' + "-------------------------------------" + '\n');

            for (int j = 0; j < arr[0].length; j++)
            {
                board.append("| " + arr[i][j] + ' ');
            }
            board.append("|");
        }
        board.append('\n' + "---------------------------------------" + '\n');
        return board.toString();
    }

}
