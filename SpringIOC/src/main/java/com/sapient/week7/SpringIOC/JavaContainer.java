package com.sapient.week7.SpringIOC;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaContainer {

	@Bean
	public Employee getEmployee() {
		return new Employee();
	}

	@Bean
	public EmployeeMap getEmployeeMap() {
		return new EmployeeMap();	}
}
