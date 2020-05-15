package com.sapient.week3;

import java.util.Arrays;
import java.util.Scanner;

public class KeyRead_Line2 {
	
	int numbers[];
	
	public void read() {
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
	
	public void display() {
		
		for(int i=0; i<numbers.length; i++)
		{
			System.out.println(numbers[i]);
		}
	}
	
	public void sort() {
		Arrays.sort(numbers);
	}
	
	
	public void find(int k)
	{
		for(int i=0; i<numbers.length; i++)
		{
			if(numbers[i]==k)
			{
				System.out.println("Number Found!");
				break;
			}	
		}
		System.out.println("Number not found!");
	}

}
