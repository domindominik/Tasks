package com.sda.list;

public class LinkedList<T> implements IList<T>
{
    private Node<T> firstNode, lastNode;
    private int size;

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
        add(size, value);
        /*Node<T> tempNode = new Node(value);

        if (size == 0)
        {
            firstNode = tempNode;
            lastNode = firstNode;
        }
        else if (size == 1)
        {
            lastNode = tempNode;
            firstNode.setNextNode(lastNode);
        }
        else
        {
            lastNode.setNextNode(tempNode);
            lastNode = tempNode;
        }
        ++size;*/
    }

    @Override
    public void add(int index, T value)
    {
        if (index > size)
        {
            throw new IndexOutOfBoundsException();
        }
        else if (size == 1)
        {
            if (index == 0)
            {
                firstNode = new Node<>(value, firstNode);
            }
            if (index == 1)
            {
                lastNode = new Node<>(value);
                firstNode.setNextNode(lastNode);
            }
            Node<T> iterNode = firstNode;
            for (int i = 0; i < index; i++)
            {
                iterNode = iterNode.getNextNode();
            }
            Node<T> newNode = new Node<>(value, iterNode.getNextNode());
            iterNode.setNextNode(newNode);
        }
        else
        {
            if (index == 0)
            {
                Node<T> newNode = new Node<>(value, firstNode);
                firstNode = newNode;
            }
            else if (index == size)
            {
                Node<T> newNode = new Node<T>(value);
                lastNode.setNextNode(newNode);
                lastNode = newNode;
            }
            else
            {
                Node<T> iterNode = firstNode;
                for (int i = 1; i < index; i++)
                {
                    iterNode = iterNode.getNextNode();
                }
                Node<T> newNode = new Node<>(value, iterNode.getNextNode());
                iterNode.setNextNode(newNode);
            }

        }
        ++size;
    }

    @Override
    public T get(int index)
    {
        if (index > size)
        {
            throw new IndexOutOfBoundsException();
        }
        Node<T> iterNode = firstNode;
        for (int i = 1; i <= index; i++)
        {
            iterNode = iterNode.getNextNode();
        }
        return iterNode.getValue();
    }

    @Override
    public void remove(int index)
    {
        if (index >= size)
        {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0)
        {
            firstNode = firstNode.getNextNode();
            size--;
            return;
        }
        Node<T> iterNode = firstNode;
        for (int i = 1; i < index; i++)
        {
            iterNode = iterNode.getNextNode();
        }
        if (index < size)
        {
            iterNode.setNextNode(iterNode.getNextNode().getNextNode());
        }
        else
        {
            iterNode.setNextNode(null);
            lastNode = iterNode;
        }
        size--;
    }
}
