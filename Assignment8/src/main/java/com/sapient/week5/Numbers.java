package com.sapient.week5;

public class Numbers {

	public boolean checkArmstrong(int n)
	{
		int s = 0;
		for(int i=n; i>0; i/=10)
		{
			int d = i%10;
			s = s + (int) Math.pow(d, 3);
		}
		if(n==s)
			return true;
		else 
			return false;
	}
	
	public boolean checkPallindrom(int n)
	{
		int r = 0;
		for(int i=n; i>0; i/=10)
		{
			int d = i%10;
			r = r*10 + d;
		}
		if(r==n)
			return true;
		else
			return false;
	}
	
	public boolean isPrime(int n)
	{
		int c=0;
		for(int i=1; i<=n; i++)
		{
			if(n%i == 0)
				c++;
		}
		if(c==2)
			return true;
		else return false;
	}

}
