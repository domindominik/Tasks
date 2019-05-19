package com.sda.powtorka;

import java.util.Scanner;

public class PowtorkaMain
{

    //TODO
    //napisać trójkąt
    public static void main(String[] args)
    {
        System.out.println("To write rectangle 1");
        System.out.print(", To write square 2");
        System.out.print(", To write triangle 3");

        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        switch (number)
        {
            case 1:
                System.out.println("Please insert side A ");
                int sideA = scanner.nextInt();
                System.out.println("Please insert side B ");
                int sideB = scanner.nextInt();
                Rectangle rectangle = new Rectangle(sideA, sideB);
                rectangle.draw();
                break;

            case 2:
                System.out.println("Pleas insert side A ");
                int side = scanner.nextInt();
                Square square = new Square(side);
                square.draw();
                break;

            case 3:
                break;
        }
    }
}
