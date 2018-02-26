package com.watson;

import junit.framework.TestCase;

public class TimeoutTest extends TestCase {

    private Timeout tt;
    @Test//(timeout = 100)
    public void testTimeout() throws Exception
    {
        tt = new Timeout();
        while(true)
        {
            System.out.println(tt.print());
        }

    }


}