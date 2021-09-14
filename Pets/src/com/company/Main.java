package com.company;
import java.util.Scanner;
import java.util.ArrayList;
public class Main
{

    public static void main(String[] args)
    {
        String name, color, type;

        PetsList list = new PetsList();
        Scanner scan = new Scanner(System.in);

        System.out.println("You will input 4 pets");

        for(int i = 0; i < 4; i++)
        {
            System.out.println("Enter pet's name?");
            name = scan.nextLine();
            System.out.println("Enter pet's color?");
            color = scan.nextLine();
            System.out.println("Enter pet type?");
            type = scan.nextLine();

            list.addToList(name, color, type);
        }
        list.sort();
        System.out.println(list.toString());
    }
}
