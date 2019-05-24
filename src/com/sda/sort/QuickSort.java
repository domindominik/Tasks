package com.sda.sort;

public class QuickSort
{
    private int matrix[];

    public QuickSort(int[] matrix)
    {
        this.matrix = matrix;
    }


    public void quickSort(int low, int high)
    {
        int i = low;
        int j = high;

        int pivot = matrix[low + (high - low) / 2];

        while (i <= j)
        {
            while (matrix[i] < pivot)
            {
                i++;
            }
            while (matrix[j] > pivot)
            {
                j--;
            }

            if (i <= j)
            {
                swop(i, j);
                i++;
                j--;
            }

        }

        if (low < j)
        {
            quickSort(low, j);
        }
        if (i < high)
        {
            quickSort(i, high);
        }
    }
//    public int pivot(int low, int high)
//    {
//        int pivot = matrix[low + (high - low) / 2];
//        return pivot;
//    }

    public void swop(int i, int j)
    {
        int temp = matrix[i];
        matrix[i] = matrix[j];
        matrix[j] = temp;
    }
}
