package com.sda.gcd;

import java.util.Scanner;

public class Menu
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pleas insert first number: ");
        int numberOne = scanner.nextInt();

        System.out.println("Pleas insert second number: ");
        int numberTwo = scanner.nextInt();
        scanner.close();

        MakeGCD makeGCD = new MakeGCD();
        long start = System.nanoTime();
        System.out.println("GCD iteration = " + makeGCD.makeGDC(numberOne, numberTwo));
        long stop = System.nanoTime();
        System.out.println("Executive time: " + (stop - start) + "\n");


        GCDrecursiveMethod gcDrecursiveMethod = new GCDrecursiveMethod();
        long start1 = System.nanoTime();
        System.out.println("GDC recursion = " + gcDrecursiveMethod.recursiveMethod(numberOne, numberTwo));
        long stop2 = System.nanoTime();
        System.out.println("Executive time: " + (stop2 - start1) + "\n");
    }
}
