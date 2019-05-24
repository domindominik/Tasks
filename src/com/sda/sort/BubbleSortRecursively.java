package com.sda.sort;

public class BubbleSortRecursively
{
    public void bubbleSortR (int matrix[])
    {
        for (int i = 0; i < matrix.length - 1; i++)
        {
            if (matrix[i] > matrix[i +1])
            {
                swop(i, matrix);
            }
        }
        bubbleSortR(matrix);
    }
    public void swop(int i, int matrix[])
    {
        int temp = matrix[i];
        matrix[i] = matrix[i + 1];
        matrix[1 + 1] = temp;
    }
}
