package com.sapient.week7.SpringIOC;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EmployeeRunnerJava {

	public static void main(String[] args) {
		ApplicationContext appcontext = new AnnotationConfigApplicationContext(JavaContainer.class);
		EmployeeMap map = appcontext.getBean(EmployeeMap.class);

		Scanner sc = new Scanner(System.in);
		map.addMapping();

		System.out.println("Enter id to search Employee: ");
		int id = sc.nextInt();

		map.getEmployee(id);
		sc.close();
	}

}
