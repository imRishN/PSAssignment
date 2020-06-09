package com.sapient.week8;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.sapient.week8.Numbers;

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
	
	@Test(expected = IllegalArgumentException.class)
	public void isPrime_Negative() {
		number.isPrime(-19);
	}
	
    @Test
    public void isPrimeTest()
    {
    	boolean result = number.isPrime(13);
        assertTrue( result );
    }
    
    @Test(expected = IllegalArgumentException.class)
	public void isPallindrom_Negative() {
		number.checkPallindrom(-19);
	}
    
    @Test
    public void isPallindromTest()
    {
    	boolean result = number.checkPallindrom(131);
        assertTrue( result );
    }
    
    
    @Test(expected = IllegalArgumentException.class)
 	public void isArmstrong_Negative() {
 		number.checkArmstrong(-19);
 	}
    
    @Test
    public void isArmstrongTest()
    {
    	boolean result = number.checkArmstrong(153);
        assertTrue( result );
    }
}
