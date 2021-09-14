package com.company;
import java.util.ArrayList;
public class Contact
{
    String contactLastName;
    String contactName;
    String contactEmail;
    String contactNum;

    public Contact(String cLN, String cN, String cNum, String cE)
    {
        contactLastName = cLN;
        contactName = cN;
        contactEmail = cE;
        contactNum = cNum;
    }

    public String toString()
    {
        String contents;
        contents = contactLastName + "\t\t\t\t" + contactName + " \t-  " + contactNum + "\t\t" + contactEmail;
        return contents;
    }

    public String getLastName()
    {
        return contactLastName;
    }
}
