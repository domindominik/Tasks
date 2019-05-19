package com.sda.prime;

import java.util.Scanner;

public class Menu
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pleas insert the number ");

        int number = scanner.nextInt();

        IsPrime isPrime = new IsPrime();

        System.out.println(number + " Is prime? " + isPrime.isPrime(number));
    }
}
