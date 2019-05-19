package com.sda.bunny;

import java.util.Scanner;

public class BunnyCounter
{
    static int i = 2;

    static int bunnyCounterRecurence(int n, int bNo, int bNop) {
        int temp = 0;

        temp = bNo + bNop;
        bNop = bNo;
        bNo = temp;

        i++;

        if (i < n) {
            return bunnyCounterRecurence(n, bNo, bNop);
        } else {
            return bNo;

        }
    }

    static int bunnyCounterItteration(int n, int bNo, int bNop)
    {
        for (i = 2; i < n; i++)
        {
            int temp = bNo + bNop;
            bNop = bNo;
            bNo = temp;

        }
        return bNo;
    }
    public static void main(String[] args)
    {
        System.out.println("Pleas insert n ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int bNop = 0, bNo = 1;

        System.out.println(bunnyCounterRecurence(n, bNo, bNop));
        System.out.println(bunnyCounterItteration(n, bNo, bNop));
    }

}
