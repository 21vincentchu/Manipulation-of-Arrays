package com.company;
import java.util.Scanner;
public class Main
{
    static ContactList list = new ContactList();
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args)
    {
        int choice = -1;
        printMenu();
        choice = scan.nextInt();
        while(choice !=0)
        {
            dispatch(choice);
            printMenu();
            choice = scan.nextInt();
        }
    }
    public static void dispatch(int x)
    {
        switch(x)
        {
            case 0:
                System.out.println("Bye");
                break;
            case 1:
                System.out.println("What is your last name?");
                String lastName = scan.next();
                System.out.println("What is the first name?");
                String name = scan.next();
                System.out.println("What is the email?");
                String email = scan.next();
                System.out.println("What is the phone number?");
                String phoneNum = scan.next();
                list.addToList(lastName, name, phoneNum, email);
                break;
            case 2:
                System.out.println(list.toString());
                break;
            case 3:
                list.sort();
                System.out.println(list.toString());
        }
    }
    public static void printMenu()
    {
        System.out.println("Enter 0: End program");
        System.out.println("Enter 1: add new contact");
        System.out.println("Enter 2: print list");
        System.out.println("Enter 3: sort list by last name and print");
    }
}
