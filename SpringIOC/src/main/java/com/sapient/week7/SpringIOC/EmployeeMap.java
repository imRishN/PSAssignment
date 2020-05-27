package com.sapient.week7.SpringIOC;

import java.util.HashMap;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeMap {
	private HashMap<Integer, Employee> map;
	
	public EmployeeMap(){
		map = new HashMap<Integer, Employee>();
	}
	
	public void addMapping() {
		Scanner sc = new Scanner(System.in);
		ApplicationContext appcontext = new ClassPathXmlApplicationContext("spring.xml"); 
		
		System.out.println("Enter Details of Employee:");
		for(int i = 0; i<2; i++) {
			System.out.println("Enter id: ");
			int id = sc.nextInt();
			System.out.println("Enter name: ");
			String name = sc.next();
			System.out.println("Enter city: ");
			String city = sc.next();
			
			Employee emp = (Employee) appcontext.getBean("employee");
			emp.setId(id);
			emp.setName(name);
			emp.setCity(city);
			
			map.put(id, emp);
		}
	
	}

	public void getEmployee(int id) {
		if(map.containsKey(id) == true) {
			System.out.println(map.get(id));
		}else {
			System.out.println("Employee Not Available");
		}
	}
}
