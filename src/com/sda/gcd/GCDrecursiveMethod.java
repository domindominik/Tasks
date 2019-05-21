package com.sda.gcd;

public class GCDrecursiveMethod
{
    public int recursiveMethod(int numberOne, int numberTwo)
    {
        if (numberTwo == 0)
        {
            return numberOne;
        }
        else
        {
            return recursiveMethod(numberTwo, numberOne % numberTwo);
        }

    }
}
