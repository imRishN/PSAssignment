package com.sapient.week7.SpringIOC;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeRunnerXML {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext appcontext = new ClassPathXmlApplicationContext("spring.xml");
		Scanner sc = new Scanner(System.in);
		EmployeeMap employeeMap = (EmployeeMap) appcontext.getBean("employeeMap");
		employeeMap.addMapping();
		
		System.out.println("Enter Employee id to search: ");

		int id = sc.nextInt();
		employeeMap.getEmployee(id);
		sc.close();

	}

}
