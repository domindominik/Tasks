package com.sda.list;

public class ArrayList2x<T> implements IList<T>
{
    private T[] array;
    private final int arraySizeValue = 2;
    private int size;
    public ArrayList2x()
    {
        array = (T[]) new Object[arraySizeValue];
    }


    @Override
    public boolean isEmpty()
    {
        return size == 0;
    }

    @Override
    public int size()
    {
        return size;
    }

    @Override
    public void add(T value)
    {
        if (array.length > size)
        {
            array[size] = value;
            ++size;
            return;
        }

        int newArraySize = array.length * arraySizeValue;
        T[] temp = (T[]) new Object[newArraySize];

        for (int i = 0; i < array.length; i++)
        {
            temp[i] = array[i];
        }

        temp[size] = value;
        array = temp;
        ++size;

    }

    @Override
    public void add(int index, T value)
    {
        if (index > size)
        {
            throw new IndexOutOfBoundsException();
        }
        int newArraySize = array.length > size ? array.length : array.length * arraySizeValue;
        if (array.length > size)
        {
            newArraySize += arraySizeValue;
        }
        T[] temp = (T[]) new Object[newArraySize];
        for (int i = 0; i < index; i++)
        {
            temp[i] = array[i];
        }
        temp[index] = value;
        for (int i = index + 1; i < array.length; i++)
        {
            temp[i] = array[i - 1];
        }
        array = temp;
        ++size;
    }

    @Override
    public T get(int index)
    {
        if (index >= size)
        {
            throw new IndexOutOfBoundsException();
        }
        return array[index];
    }

    @Override
    public void remove(int index)
    {
        if (index > size)
        {
            throw new IndexOutOfBoundsException();
        }
        T[] temp = (T[]) new Object[array.length];
        for (int i = 0; i < index; i++)
        {
            temp[i] = array[i];
        }
        for (int i = index; i < array.length; i++)
        {
            temp[i - 1] = array[i];
        }
        array = temp;
        --size;

    }
}
