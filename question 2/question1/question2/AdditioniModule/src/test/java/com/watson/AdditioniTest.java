package com.watson;

import junit.framework.TestCase;

public class AdditioniTest extends TestCase {

    private boolean integersAreValid = false;
    Additioni add = new Additioni();

    public void testSetInteger() throws Exception {
        try
        {
            add.setInt1(93);
            add.setInt2(27);
            integersAreValid = true;
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public void testGetNumbers() throws Exception
    {
        add.getInt1();
        add.getInt2();
    }

    public void testAddition() throws Exception
    {
        if(  integersAreValid) {
            add.addition();
        }
    }


}