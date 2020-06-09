package com.sapient.week8;

import java.util.*;

public class AddEmployee {
	List<Employee> list;

	public AddEmployee() {
		list = new ArrayList<Employee>();
	}

	private boolean empCheck(Employee emp) {
		if (emp == null)
			return true;
		return false;
	}
	
	private boolean idCheck(int id) {
		return (id<0)? true:false;
	}
	
	public void addEmployee(Employee emp) {
		
		if (idCheck(emp.getId()))
			throw new IllegalArgumentException();
			
		else if(empCheck(emp))
			throw new NullPointerException();
		
		list.add(emp);
	}


	public Employee getEmployee(int id) {
		Employee emp = null;

		for (Employee e : list) {
			if (e.getId() == id) {
				emp = e;
				break;
			}
		}
		return emp;
	}
}