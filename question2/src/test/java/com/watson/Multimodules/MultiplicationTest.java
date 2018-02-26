package com.watson.Multimodules;

import junit.framework.Assert;
import junit.framework.TestCase;

public class MultiplicationTest extends TestCase {

    Multiplication multiObject = new Multiplication();

    public void testIntegerInput() throws Exception
    {
        multiObject.setInteger1(9);
        multiObject.setInteger2(7);
        Assert.assertTrue(multiObject.getInteger1() != 0);
        Assert.assertTrue(multiObject.getInteger2() !=0);
    }

    public void testMultiplication() throws Exception
    {
        multiObject.multiply();
    }


}