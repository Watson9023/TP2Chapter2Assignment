package com.watson;

import jdk.nashorn.internal.ir.annotations.Ignore;
import junit.framework.Assert;
import junit.framework.TestCase;

public class DisableTest extends TestCase {

    private boolean testRun = false;
    private Disable dr = new Disable();

    @Test @Ignore
    public void testDivision() throws Exception
    {
        try {
            dr.divide();
            testRun = true;
        }catch (Exception e)
        {

        }
    }

    @After
    public void testDisabled() throws Exception {
        Assert.assertFalse(testRun);
    }
}