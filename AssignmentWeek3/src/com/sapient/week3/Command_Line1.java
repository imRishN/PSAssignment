package com.sapient.week3;

import java.util.Scanner;

public class Command_Line1 {
	
	int numbers[];
	int sum, min, max;
	double avg;
	
	public void setData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of numbers:");
		int n = sc.nextInt();
		numbers = new int[n];
		System.out.println("Enter the numbers:");
		for(int i=0; i<n; i++)
		{
			numbers[i] = sc.nextInt();
		}
		sc.close();
	}
	
	public void calData() {
		min = numbers[0];
		max = numbers[0];
		sum=0; 
		for(int i=0; i<numbers.length; i++)
		{
			sum+=numbers[i];
			if(numbers[i]<min)
				min = numbers[i];
			if(numbers[i]>max)
				max = numbers[i];	
		}
		avg = (sum*1.0)/numbers.length;
		
	}
	
	public void displayData() {
		System.out.println("Sum: " + sum +", Mean: " + avg + "Max: " + max + "Min: " + min);
	}
}
