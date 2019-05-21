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

        MakeGCD makeGCD = new MakeGCD();
        System.out.println("GCD iteration = " + makeGCD.makeGDC(numberOne, numberTwo));

        GCDrecursiveMethod gcDrecursiveMethod = new GCDrecursiveMethod();
        System.out.println("GDC recursion = " + gcDrecursiveMethod.recursiveMethod(numberOne, numberTwo));

    }
}