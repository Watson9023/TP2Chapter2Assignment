package com.watson;

import junit.framework.Assert;
import junit.framework.TestCase;

public class FailingTest extends TestCase {

    private  Failing ft;
    private boolean thrown = false;

    public void testDivByZero() throws Exception {
        ft = new Failing();
        ft.divByZero();
        fail("Exception not thrown");
        Assert.assertTrue(thrown);
    }
}