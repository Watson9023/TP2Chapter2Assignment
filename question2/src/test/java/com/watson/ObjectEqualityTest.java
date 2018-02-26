package com.watson;

import junit.framework.Assert;
import junit.framework.TestCase;

public class ObjectEqualityTest extends TestCase {
    ObjectEquality object1;
    ObjectEquality object2;
    public void setUp() throws Exception {
        super.setUp();
    }


    public void testGetDetails() throws Exception {
        object1 = new ObjectEquality("Watson", "Matunhire");
        object2 = new ObjectEquality("Watson", "Matunhire");

        Assert.assertEquals(object1.getDetails(),object2.getDetails());
    }


}