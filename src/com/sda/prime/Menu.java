package com.sda.prime;

import java.util.Scanner;

import static com.sda.prime.IsPrimeChecker.isPrimeChecker;
import static com.sda.prime.SieveOfEratosthenes.showMatrix;
import static com.sda.prime.SieveOfEratosthenes.sieveOfEratosthenes;

public class Menu
{
    public static int [] makeMatrix(int number)
    {
        int matrix[] = new int[number+1];

        for (int i = 2; i < matrix.length; i++)
        {
            matrix[i] = i;
        }
        return matrix;
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pleas insert the number ");

        int number = scanner.nextInt();
        scanner.close();

        IsPrime isPrime = new IsPrime();

        System.out.println(number + " Is prime? " + isPrime.isPrime(number));


        System.out.println("\nSieve method:");
        int matrix[] = makeMatrix(number);
        showMatrix(matrix);

        System.out.println("\nAfter sieve:");
        //sieveOfEratosthenes(matrix);



        isPrimeChecker(matrix);
        showMatrix(matrix);
    }
}
