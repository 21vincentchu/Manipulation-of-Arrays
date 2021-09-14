package com.company;
import java.util.ArrayList;

public class PetsList
{
    ArrayList <Pet> pets = new ArrayList <Pet> ();

    public void addToList(String a, String b, String c)
    {
        pets.add(new Pet(a,b,c));
    }

    public String toString()
    {
        String output = "\nname\t\tcolor\t\ttype\n";
        for(Pet contents: pets)
        {
            output += contents.toString() + "\n";
        }
        return output;
    }

    public void sort()
    {
        for(int i = 0; i < pets.size(); i++)
        {
            for(int p = i + 1; p < pets.size(); p++)
            {
                if(pets.get(i).getName().compareTo(pets.get(p).getName()) > 0)
                {
                    Pet temp = pets.get(i);
                    pets.set (i, pets.get(p));
                    pets.set(p, temp);
                }
            }
        }
    }
}
