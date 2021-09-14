package com.company;
import java.util.ArrayList;

public class ContactList
{
    ArrayList <Contact> contacts = new ArrayList  <Contact> ();

    public void addToList(String a, String b, String c, String d)
    {
        contacts.add(new Contact(a,b,c,d));
    }

    public String toString()
    {
        String output = "\nLast Name\t\tFirst Name\t\tPhone Number\t\temail\n";
        for(Contact contents: contacts)
        {
            output += contents.toString() + "\n";
        }
        return output;
    }

    public void sort()
    {
        for(int i = 0; i < contacts.size(); i++)
        {
            for(int c = i + 1; c < contacts.size(); c++)
            {
                if(contacts.get(i).getLastName().compareTo(contacts.get(c).getLastName()) > 0)
                {
                    Contact temp = contacts.get(i);
                    contacts.set(i, contacts.get(c));
                    contacts.set(c, temp);
                }
            }
        }
    }
}
