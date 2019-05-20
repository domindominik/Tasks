package com.sda.prime;

public class IsPrimeChecker
{
    public static void isPrimeChecker(int matrix[])
    {
        IsPrime isPrime = new IsPrime();
        for (int i = 2; i < matrix.length; i++)
        {

            if (!isPrime.isPrime(matrix[i]))
            {
                matrix[i] = 0;
            }
        }
    }
}
