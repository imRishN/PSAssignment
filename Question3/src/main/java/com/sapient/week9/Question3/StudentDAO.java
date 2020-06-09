package com.sapient.week9.Question3;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Service
public class StudentDAO {

	private static List<Student> students = new ArrayList<>();

	static {
		students.add(new Student(1, "Rishab", "IIT Kharagpur"));
		students.add(new Student(2, "Akash", "IIT Madras"));
		students.add(new Student(3, "Ayush", "MIT"));
		students.add(new Student(4, "Dev", "CMU"));
	}
	
	public Student findOne(int id)
	{
		for(Student student : students)
		{
			if(student.getId()==id)
			{
				return student;
			}
		}
		return null;
	}

}
