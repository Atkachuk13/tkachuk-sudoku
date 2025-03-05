package tkachuk.sudoku;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Sudoku
{
    List<String> list = new ArrayList<String>();

    public List<String> getList()
    {
        return list;
    }

    private int[][] arr;

    public Sudoku(int[][] arr)
    {
        this.arr = arr;
    }

    public int[][] getArr()
    {
        return arr;
    }

    public void setArr(int i, int j, int num)
    {
        arr[i][j] = num;
    }

    public List<String> getErrors()
    {
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
        for (int i = 0; i < arr.length; i++)
        {
            System.out.println('\n' + "-------------------------------------");

            for (int j = 0; j < arr[0].length; j++)
            {
                System.out.print("| " + arr[i][j] + ' ');
            }
            System.out.print("|");
        }
        System.out.println('\n' + "---------------------------------------");
        return null;
    }

}
