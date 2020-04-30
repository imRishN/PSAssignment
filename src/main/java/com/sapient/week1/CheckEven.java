package com.sapient.week1;

public class CheckEven 
{
	public static void main(String[] args) 
	{
		System.out.println(check(3));	
	}
    public static boolean check(int n)
    {
    	if(n%2 == 0)
    	{
    		return true;
    	}
    	else
    	{
    		return false;
    	}
    }
}
