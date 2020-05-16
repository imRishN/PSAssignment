package com.sapient.week5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class StudentRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		Student students[] = new Student[2];
		
		for(int i=0; i<students.length; i++)
		{
			System.out.println("Enter Student Name: ");
			String name = sc.next();
			
			System.out.println("Enter Student City: ");
			String city = sc.next();
			
			students[i] = new Student(i, name, city);
		}
		
		System.out.println("---------------------");
		for(int i=0; i<students.length; i++)
		{
			System.out.println(students[i].toString());
		}
		
		System.out.println("---------------------");
		System.out.println("Enter search city: ");
		String city = sc.next();
		
		for(int i=0; i<students.length; i++)
		{
			if(students[i].getCity().equals(city))
			{
				System.out.println(students[i].toString());
			}
		}
		
		Arrays.sort(students, new Comparator<Student>() {
			@Override
			public int compare(Student s1, Student s2) {
				return s1.getName().compareTo(s2.getName());
			}
			
		});
		
		System.out.println("---------------------");
		for(int i=0; i<students.length; i++)
		{
			System.out.println(students[i].toString());
		}
		
		Arrays.sort(students, new Comparator<Student>() {
			@Override
			public int compare(Student s1, Student s2) {
				return s2.getCity().compareTo(s1.getCity());
			}
			
		});
		
		System.out.println("---------------------");
		for(int i=0; i<students.length; i++)
		{
			System.out.println(students[i].toString());
		}
		
		
		
		sc.close();
		
		

	}

}
