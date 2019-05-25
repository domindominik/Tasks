package com.sda.game;

import java.util.Random;
import java.util.Scanner;

public class Game
{
    public static void main(String[] args)
    {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);


        int number = random.nextInt(100); // 2000 - 1000

        for (int i = 0; i < 5; i++)
        {
            System.out.println("Please type your number: ");
            int userNumber = scanner.nextInt();

            if (userNumber == number)
            {
                System.out.println("Congratulations!");
                break;
            }
            if (userNumber < number)
            {
                System.out.println("So small");
            }
            else
            {
                System.out.println("So high");
            }
        }
        System.out.println("Numbers drawn by the computer: " + number);


    }
}
