package com.sapient.week10.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeDAO emp;
	
	@GetMapping("/")
	public String test() {
		return "Hello World";
	}
	
	@GetMapping(value = "/employee")
	public List<Employee> getAllEmployee()
	{
		return emp.getAllEmployee();
	}
	
	@GetMapping(value = "/employee/{id}")
	public Employee getOneEmployee(@PathVariable String id)
	{
		return emp.getOne(id);
	}
	
	@PostMapping(value = "/employee")
	public String addEmployee(@RequestBody Employee e)
	{
		return emp.addEmployee(e);
	}
	
	@PutMapping(value = "/employee")
	public String updateEmployee(@RequestBody Employee e)
	{
		return emp.updateEmployee(e);
	}
	
	@DeleteMapping(value = "/employee/{id}")
	public String deleteEmployee(@PathVariable String id)
	{
		return emp.deleteEmployee(id);
	}
}
