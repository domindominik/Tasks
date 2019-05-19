package com.sda.sort;

public class BubbleSorting
{
    public static void bubblesorting(int matrix[])
    {
        boolean isSorted = false;

        int temp = 0;

        while (!isSorted)
        {
            isSorted = true;
            for (int i = 0; i < matrix.length - 1; i++)
            {
                if (matrix[i] > matrix[i+1])
                {
                    temp = matrix[i];
                    matrix[i] = matrix[i+1];
                    matrix[i + 1] = temp;
                    isSorted = false;
                }
            }

        }
    }
}
