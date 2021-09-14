package com.company;
import java.util.Scanner;
import java.util.Arrays;
public class Main
{

    public static void main(String[] args)
    {
        int numElements;
        int element;

        Scanner scan = new Scanner(System.in);

        //initiate array
        System.out.println("How many values will be in the array");
        numElements = scan.nextInt();

        int [] myArray = new int [numElements];

        //Enter values into array

        for(int i = 0; i < numElements; i++)
        {
            System.out.println("Enter a integer for the array");
            element = scan.nextInt();
            myArray[i] = element;
        }
        System.out.println("Original Array");
        System.out.println(Arrays.toString(myArray));

        int j = myArray.length - 1;
        int middle = myArray.length / 2;

        for(int i = 0; i < middle; i++)
        {
            int temp = myArray[i];
            myArray[i] = myArray[j];
            myArray[j] = temp;
            j--;
        }
        System.out.println("The array will now be reversed");
        System.out.println(Arrays.toString(myArray));
    }
}
