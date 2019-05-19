package com.sda.prime;

public class SieveOfEratosthenes
{
    public static void sieveOfEratosthenes(int matrix[], int number)
    {
        int j =2;
        for (int i = 2; i < number; i++)
        {
            if (matrix[i] != 0)
            {
                while (j < number)

                    if (number % j == 0)
                    {
                        matrix[i] = 0;
                    }
            }

        }
    }

    public static void showMatrix(int matrix[])
    {
        for (int i = 2; i < matrix.length; i++)
        {
            System.out.print(matrix[i] + "\t");
            if (i % 20 == 0)
            {
                System.out.println();
            }
        }
    }
}
