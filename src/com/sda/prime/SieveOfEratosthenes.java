package com.sda.prime;

public class SieveOfEratosthenes
{
    public static void sieveOfEratosthenes(int matrix[])
    {

        for (int i = 2; i < matrix.length; i++)
        {
            if (matrix[i] != 0)
            {
                for(int j = i+1; j < matrix.length; j++)
                {
                    if(matrix[j] % matrix[i] == 0)
                    {
                        matrix[j] = 0;
                    }
                }
            }

        }
    }

    public static void showMatrix(int matrix[])
    {
        for (int i = 2; i < matrix.length; i++)
        {
            if (matrix[i] != 0)
            {
                System.out.print(matrix[i] + "\t");
                if (i % 20 == 0)
                {
                    System.out.println();
                }
            }
            else
            {
                System.out.print("");
            }
        }
    }
}
