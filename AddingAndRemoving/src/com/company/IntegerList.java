package com.company;

public class IntegerList
{
    int[] list; //values in the list
    int numElements;
    //-------------------------------------------------------
    //create a list of the given size
    //-------------------------------------------------------
    public IntegerList(int size)
    {
        list = new int[size];
        numElements = size;
    }

    //-------------------------------------------------------
    //fill array with integers between 1 and 100, inclusive
    //-------------------------------------------------------
    public void randomize()
    {
        for (int i=0; i<list.length; i++)
        {
            list[i] = (int)(Math.random() * 100) + 1;
        }
    }

    //-------------------------------------------------------
    //print array elements with indices
    //-------------------------------------------------------
    public void print()
    {
        for (int i=0; i<list.length; i++)
        {
            System.out.println(i + ":\t" + list[i]);
        }
    }

    public void addElement(int newVal)
    {
        if(list.length == numElements)
        {
            increaseSize();
            list[numElements] = newVal;
            numElements++;
        }
        else
            list[numElements-1] = newVal;
        numElements++;
    }

    public void increaseSize()
    {
        //Double the size of the array & move elements from old to new
        int[] temp = new int[list.length * 2];
        for(int a = 0; a < list.length; a++)
            temp[a] = list[a];
        list = temp;
    }

    public void removeFirst(int newVal)
    {
        for(int b = 0; b < list.length; b++)
        {
            if(list[b] == newVal)
            {
                increaseSize();
                //remove value and shift elements
                for(int c = b; c < numElements; c++)
                {
                    list[c] = list[c+1]; //value found is replaced by value at next index
                    //shift values to right 1 space over left
                }
                list[numElements] = 0;
                numElements--;
            }
        }
    }

    public void removeAll(int newVal)
    {
        for(int i = 0; i < list.length; i++)
        {
            if(list[i] == newVal)
            {
                for(int c = i; c < numElements; c++)
                {
                    if(list[c + 1] == newVal)
                    {
                        list[c] = newVal + 2;
                    }
                    else if(c + 1 > numElements)
                    {
                        list[c] = newVal + 2;
                    }
                    else
                    {
                        list[c] = list[c + 1];
                    }
                }
            }
        }
    }
}
