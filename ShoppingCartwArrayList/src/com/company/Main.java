package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Item item;
        String itemName;
        double itemPrice;
        int quantity;

        ArrayList <Item> cart = new ArrayList <>();
        Scanner scan = new Scanner(System.in);

        String keepShopping = "y";

        do
        {
            System.out.print ("Enter the name of the item: ");
            itemName = scan.nextLine();

            System.out.print ("Enter the unit price: ");
            itemPrice = scan.nextDouble();

            System.out.print ("Enter the quantity: ");
            quantity = scan.nextInt();

            // *** create a new item and add it to the cart
            item = new Item(itemName, itemPrice, quantity);
            cart.add(item);

            // *** print the contents of the cart object using println
            System.out.println(cart.toString());

            System.out.print ("Continue shopping (y/n)? ");
            keepShopping = scan.nextLine();
        }
        while (keepShopping.equals("y"));
    }
}
