package com.sda.sort;

public class SelectSort
{
    public static void selectSort(int matrix[])
    {
        int minimalIndex;

        for (int i = 0; i < matrix.length-1; i++)
        {
            minimalIndex = i;

            for (int j = i+1; j < matrix.length; j++)
            {
                if (matrix[j] < matrix[minimalIndex])
                {
                    minimalIndex = j;
                }
            }
            if (minimalIndex != i)
            {
                int temp = matrix[minimalIndex];
                matrix[minimalIndex] = matrix[i];
                matrix[i] = temp;
            }
        }
    }
}

