package com.sapient.week1;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.*;

public class CheckEvenTest {
    private CheckEven checkEven;
    
    @Before
    public void setup() {
        checkEven = new CheckEven();
    }
    
    
    @Test
    public void testEven() {
        boolean result = checkEven.check(10);
        assertTrue(result == true);
    }

    @Test
    public void testOdd() {
        boolean result = checkEven.check(3);
        assertTrue(result == false);
    }

    @Test
    public void testZero() {
        boolean result = checkEven.check(0);
        assertTrue(result == true);
    }

    @Test
    @Ignore
    public void testNegative() {
        boolean result = checkEven.check(-126);
        assertTrue(result == true);
    }
}