package com.sda.list;

import com.sda.stopper.Stopper;

import java.util.ArrayList;
import java.util.List;

public class Menu
{
    public static void makeLinkedList(IList linkedList, int n)
    {

        for (int i = 0; i < n - 1; i++)
        {
                linkedList.add(i);
        }

    }
    public static void main(String[] args)
    {
        List<Float> timeStatement = new ArrayList<>();
        Stopper stopper = new  Stopper();
        LinkedList linkedList = new LinkedList();

        int n = 1000;

        stopper.start();
        for (int i = 0; i < 100; i++)
        {

            makeLinkedList(linkedList, n);

        }
        System.out.println(stopper.stop());


    }
}
