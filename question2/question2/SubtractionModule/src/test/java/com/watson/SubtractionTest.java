package com.watson;

import junit.framework.Assert;
import junit.framework.TestCase;

public class SubtractionTest extends TestCase {

    private boolean isValidInteger = false;
    Subtraction subObject= new Subtraction();

    public void testSetInteger() throws Exception
    {
        try
        {
            subObject.setInt1(93);
            subObject.setInt2(27);
            Assert.assertTrue(subObject.getInt1() >= subObject.getInt2());
            isValidInteger = true;
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public void testSubtraction() throws Exception
    {
        if(isValidInteger) {
            subObject.subtract();
        }
    }
}