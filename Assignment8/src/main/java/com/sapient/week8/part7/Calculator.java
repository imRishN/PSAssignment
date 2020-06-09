package com.sapient.week8.part7;

public class Calculator extends UserInput {
	
	public Calculator() {
	}
	
	public void add()
	{
		setResult(getN1()+getN2());
	}
	
	public void subtract()
	{
		setResult(getN1()*getN2());
	}
	
	public void multiply()
	{
		setResult(getN1()*getN2());
	}
	
	public void divide()
	{
		setResult(getN1()/getN2());
	}

}
