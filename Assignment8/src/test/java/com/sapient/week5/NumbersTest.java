package com.sapient.week5;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class NumbersTest 
{
	Numbers number;
    /**
     * Rigorous Test :-)
     */
	@Before
	public void setup() {
		number = new Numbers();
	}
	
    @Test
    public void isPrimeTest()
    {
    	boolean result = number.isPrime(13);
        assertTrue( result );
    }
    @Test
    public void isPallindromTest()
    {
    	boolean result = number.checkPallindrom(131);
        assertTrue( result );
    }
    @Test
    public void isArmstrongTest()
    {
    	boolean result = number.checkArmstrong(153);
        assertTrue( result );
    }
}
