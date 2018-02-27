package com.watson;

public class runMultiplicationi {

    Multiplicationi multiObject = new Multiplicationi();

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
