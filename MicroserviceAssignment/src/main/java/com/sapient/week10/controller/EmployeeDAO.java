package com.sapient.week10.controller;

import java.util.*;

import org.springframework.stereotype.Service;

@Service
public class EmployeeDAO {

	Map<String, Employee> empMap = new HashMap<>();
	
	public EmployeeDAO() {
		empMap.put("1", new Employee("1", "Rishab"));
		empMap.put("2", new Employee("2", "Kavita"));
		empMap.put("3", new Employee("3", "Harsh"));
		empMap.put("4", new Employee("4", "Raunak"));
		empMap.put("5", new Employee("5", "Sameer"));
	}
	
	public String addEmployee(Employee e)
	{
		if(e!=null)
		{
			empMap.put(e.getId(), e);
			return "Employee Added";
		}
		else {
			return "Employee cannot be null";
		}
	}
	
	public String updateEmployee(Employee e)
	{
		if(e!=null)
		{
			if(!empMap.containsKey(e.getId()))
			{
				return "Employee doesn't exist";
			}
			
			else
			{
				empMap.replace(e.getId(), e);
				return "Employee Updated";
			}
		}
		else {
			return "Employee cannot be null";
		}
	}
	
	public String deleteEmployee(String id)
	{
		if(!empMap.containsKey(id))
		{
			return "Employee doesn't exist";
		}
		else
		{
			empMap.remove(id);
			return "Employee Succesfully Deleted";
		}
	}
	
	public List<Employee> getAllEmployee() {
		return new ArrayList<Employee>(empMap.values());
	}
	
	public Employee getOne(String id)
	{
		if(empMap.containsKey(id))
			return empMap.get(id);
		else return new Employee("Error", "Employee Does not Exist");
	}
}
