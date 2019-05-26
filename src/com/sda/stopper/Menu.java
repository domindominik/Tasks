package com.sda.stopper;

import java.util.ArrayList;
import java.util.List;

public class Menu
{
    public static void makeMultiplication(int matrix[])
    {
        for (int i = 0; i < matrix.length; i++)
        {
            matrix[i] *= 2;
        }
    }
    public static void main(String[] args)
    {
        int n = 1000000;
        int matrix[] = new int[n];

        for (int i = 0; i < n; i++)
        {
            matrix[i] = i;
        }

        Stopper stopper = new Stopper();
        List<Float> timeStatement = new ArrayList<>();

        for (int i = 0; i < 1000000; i++)
        {
            stopper.start();
            makeMultiplication(matrix);
            timeStatement.add(stopper.stop());

        }

    }
}
