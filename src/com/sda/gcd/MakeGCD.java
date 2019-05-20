package com.sda.gcd;

public class MakeGCD
{
    public int makeGDC(int numberOne, int numberTwo)
    {
        while (numberOne != numberTwo)
        {
            if (numberOne > numberTwo)
            {
                numberOne -= numberTwo;
            }
            else
            {
                numberTwo -= numberOne;
            }
        }
        return numberOne;
    }
}
