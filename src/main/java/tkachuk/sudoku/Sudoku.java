package tkachuk.sudoku;

import java.util.List;

public class Sudoku
{
    private int [][] arr;

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
        // return a list of strings
        // tells you where the errors in the board are
        // column # row # duplicate x
        // (number that is duplicated)
        // Book N dyplicate x

        // check horizontally
        int [] row = new int[9];
        int count = 0;
        int num1;
        int num2;
        for(int ix = 0; ix < arr.length; ix++)
        {
            for(int jx = 0; ix < arr[0].length; jx++)
            {
//                arr[ix][jx].equals(arr[ix][jx++]);
//                row[count] = arr[ix][jx];
//                count++;

                if(count == 8)
                {
                    // check for mistakes
                    for(int ii = 0; ii < row.length; ii++)
                    {
                        num1 = row[ii];
                        num2 = row[ii + 1];

                    }

                    count = 0;
                }

            }

        }

        // check vertically
        int [] column = new int[9];
       // count = 0;

        for(int jx = 0; jx < arr[0].length; jx++)
        {
            for(int ix = 0; ix < arr.length; ix++)
            {
                column[count] = arr[jx][ix];
                count++;

                if(count == 8)
                {
                    // check for mistakes

                    count = 0;
                }

            }
        }


        // check boxes
        int [] box = new int[9];
        for(int ix = 0; ix < 2; ix++)
            for(int jx = 0; jx < 2; jx++)
            {
                box[count] = arr[ix][jx];
            }

        return null;
    }

    @Override
    public String toString()
    {
        for(int i = 0; i < arr.length; i++)
        {
            System.out.println('\n' + "-------------------------------------");

            for(int j = 0; j < arr[0].length; j++)
            {
                System.out.print("| " + arr[i][j] + ' ');
            }
            System.out.print("|");
        }
        System.out.println('\n' + "---------------------------------------");
        return null;
    }

}
