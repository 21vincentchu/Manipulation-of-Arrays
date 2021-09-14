package com.company;
import java.util.ArrayList;

public class Pet
{
    String petName, petColor, petType;

    public Pet(String namePet, String colorPet, String typePet)
    {
        petName = namePet;
        petColor = colorPet;
        petType = typePet;
    }

    public String toString()
    {
        String contents;
        contents = petName + "\t\t" + petColor + "\t\t" + petType;
        return contents;
    }

    public String getName()
    {
        return petName;
    }
}
