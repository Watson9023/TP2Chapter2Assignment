package com.watson.Multimodules;

import junit.framework.TestCase;

public class DivisionTest extends TestCase {

    private boolean IntegersAreValid = false;
    Division divObject = new Division();

    public void testIfNumbersAreValid() throws Exception {
        try {
            divObject.setInteger1(93);
            divObject.setInteger2(10);
            assertEquals(true, divObject.getInteger2() > 0);
            IntegersAreValid = true;
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public void testDivision() throws Exception
    {
        if (IntegersAreValid)
        {
            divObject.divide();
        }
    }

}