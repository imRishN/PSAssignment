package com.sapient.week8;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class EmployeeTest {
	
	AddEmployee addEmp ;
	Employee emp, temp;
	
	@Before
	public void setup() {
		addEmp = new AddEmployee();
		temp = new Employee(1, "Rishab", "Bangalore");
		addEmp.addEmployee(temp);
		
	}
	
	@After
	public void teardown() {
		emp = null;
	}
	
	
	@Test(expected = IllegalArgumentException.class)	
	public void invalidID() {
		emp = new Employee(-2,"Kavita","Patna");
		addEmp.addEmployee(emp);
	}
	
	
	@Test(expected = NullPointerException.class)		
	public void addEmployee_NullCase() {
		addEmp.addEmployee(emp);
	}
	
	
	@Test
	public void addEmployee() {				
		emp = new Employee(2, "Kavita", "Patna");
		addEmp.addEmployee(emp);
		assertEquals(2, addEmp.list.size());
	}
	
	
	@Test
	public void getEmployee_getId() {			
		emp = addEmp.getEmployee(1);
		assertEquals(temp, emp);
	}

	@Test
	public void getEmployee_NullCase() {				//Employee not in list
		emp = addEmp.getEmployee(4);
		assertNull(emp);
	}
}
