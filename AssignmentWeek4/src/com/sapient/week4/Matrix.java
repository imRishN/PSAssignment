package com.sapient.week4;

import java.util.Scanner;

public class Matrix {

	private int mat[][];
	Matrix(int m, int n)
	{
		mat = new int[m][n];
	}
	
	Matrix() {
		mat = new int[3][3];
	}
	
	public void readMatrix() {
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<mat.length; i++)
		{
			for(int j=0; j<mat[0].length; j++)
			{
				mat[i][j] = sc.nextInt();
			}
		}
		sc.close();
	}
	
	public void displayMatrix() {
		
		for(int i=0; i<mat.length; i++)
		{
			for(int j=0; j<mat[0].length; j++)
			{
				System.out.print(mat[i][j] + " ");
			}
			System.out.println("");
		}
	}
	
	public void add_matrix(int a[][], int b[][]) {
		int sum[][] = new int[a.length][a[0].length];
		for(int i=0; i<mat.length; i++)
		{
			for(int j=0; j<mat[0].length; j++)
			{
				sum[i][j] = a[i][j] + b[i][j];
			}
		}
		
	}
}
