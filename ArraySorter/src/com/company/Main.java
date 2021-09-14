package com.company;
import java.util.Random;
public class Main
{
    public static void main(String[] args)
    {
        //initalize arrays
        int[] array1 = new int [10];
        int[] array2 = new int [10];

        Random rand = new Random();

        // create array1
        for(int i = 0; i < array1.length; i++)
        {
            array1[i] = rand.nextInt(20);
        }

        //Print array 1 before selection sort
        System.out.println("Array 1 before selection sort");
        for(int b = 0; b < array1.length; b++)
        {
            System.out.print(array1[b] + " ");
        }
        System.out.println();
        System.out.println();

        //selection sorts array1
        ArraySorter.selectionSort(array1);

        //print selection sorted array1
        System.out.println("Array 1 after selection sort");
        for(int i = 0; i < array1.length; i++)
        {
            System.out.print(i + " ");
        }

        //create array2
        for(int i = 0; i < array2.length; i++)
        {
            array2[i] = rand.nextInt(20);
        }

        System.out.println();
        System.out.println();

        //print array2 before inseration sort
        System.out.println("Array 2 before insertion sort");
        for(int b = 0; b < array2.length; b++)
        {
            System.out.print(array2[b] + " ");
        }

        System.out.println();
        System.out.println();
        //insertion sort array2
        ArraySorter.insertionSort(array2);
        System.out.println("Array 2 after insertion sort");
        for(int i = 0; i < array2.length; i++)
        {
            System.out.print(array2[i] + " ");
        }
    }
}
