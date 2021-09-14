package com.company;

public class ArraySorter
{
    public static void selectionSort(int[] anArray)
    {
        for (int i = 0; i < anArray.length-1; i++)
        {
            int index = i;

            for(int j = i + 1; j < anArray.length; j++)
            {
                if(anArray[j] < anArray[index])
                {
                    index = j; //searching for lowest index
                }
            }
            int smallerNumber = anArray[index];
            anArray[index] = anArray[i];
            anArray[i] = smallerNumber;

        }
    }

    public static void insertionSort(int[] array)
    {
        int n = array.length;
        for(int j = 1; j < n; j++)
        {
            int key = array[j];
            int i = j -1;
            while((i > -1) && ( array[i] > key))
            {
                array[i + 1] = array[i];
                i--;
            }
            array[i + 1] = key;
        }
    }
}
