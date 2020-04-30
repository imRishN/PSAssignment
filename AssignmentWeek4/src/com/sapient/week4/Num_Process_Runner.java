package com.sapient.week4;

import java.util.Scanner;

public class Num_Process_Runner {
	
	public static void main(String args[]) {

	Num_Process np[] = {(a, b) -> (a+b), 
						(a, b) -> (a-b), 
						(a, b) -> (a*b), 
						(a, b) -> (a/b)};
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter two numbers and choice:\nAdd - 1\nSub - 2\nMultiply - 3\n"
			+ "Divide - 4 \n");
	int a = sc.nextInt();
	int b = sc.nextInt();
	int choice = sc.nextInt();
	choice--;
	System.out.println(np[choice].cal(a, b));
	sc.close();
	}
}
