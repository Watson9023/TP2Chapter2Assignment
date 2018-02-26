package com.watson;

import junit.framework.Assert;
import junit.framework.TestCase;

public class ObjectIdentityTest extends TestCase {
    ObjectIdentity object1;
    public void setUp() throws Exception {
        super.setUp();
    }

    public void tearDown() throws Exception {
    }

    public void testMain() throws Exception {
        object1 = new ObjectIdentity("Watson");
        Assert.assertSame(object1,object1);
    }
}