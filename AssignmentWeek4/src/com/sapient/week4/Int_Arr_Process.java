package com.sapient.week4;

import java.util.Arrays;
import java.util.Scanner;

public class Int_Arr_Process {
	
	private int arr[];
	
	public Int_Arr_Process(int size) {
		arr = new int[size];
	}
	
	public Int_Arr_Process() {
		arr = new int[10];
	}
	
	public void read_array()
	{
		System.out.println("Enter elements");
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		sc.close();
	}
	
	public void displayArrayHorizontally()
	{
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println(" \n");
	}
	
	public void displayArrayVertically()
	{
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
	}
	
	public void sortArray() {
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public int min() {
		int min = arr[0];
		for(int i=1; i<arr.length; i++)
		{
			if(arr[i]<min)
				min = arr[i];
		}
		return min;
	}
	
	public int max() {
		int max = arr[0];
		for(int i=1; i<arr.length; i++)
		{
			if(arr[i]>max)
				max = arr[i];
		}
		return max;
	}
	
	public void sum() {
		int sum = 0;
		for(int i=0; i<arr.length; i++)
		{
			sum+=arr[i];
		}
		System.out.println(sum);
	}
	
	public void second_biggest() {
		
		int max = max();
		int max_2 = arr[0];
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]>max_2 && arr[i]!=max)
				max_2 = arr[i];
		}
		System.out.println(max_2);
		
	}
}
