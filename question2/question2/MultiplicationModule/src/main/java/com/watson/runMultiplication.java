package com.watson;

public class runMultiplication {

    Multiplication multiObject = new Multiplication();

    public void testIntegerInput() throws Exception
    {
        multiObject.setInteger1(9);
        multiObject.setInteger2(7);

    }

    public void testMultiplication() throws Exception
    {
        multiObject.multiply();
    }
}
