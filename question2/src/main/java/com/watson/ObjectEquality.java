package com.watson;

public class ObjectEquality {
    private  String name;
    private  String surname;
    public static void main(String[] args) {
    }

    public ObjectEquality(String name, String surname)
    {
        this.name = name;
        this.surname = surname;
    }

    public String getDetails()
    {
        return name + " " + surname;
    }
}
