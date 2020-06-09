package com.sapient.week9.Question3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StudentController {
	
	@Autowired
	private StudentDAO service;
	
	@PostMapping("/get-student")
	public String showStudentDetail(ModelMap map, @RequestParam String id)
	{
		int sid = Integer.parseInt(id);
		Student student = service.findOne(sid);
		if(student!=null)
		{
			map.put("name" , student.getName());
			map.put("detail" , student.getDetail());
			map.put("id" , student.getId());
		}
		else {
			map.put("name" , "Not available");
			map.put("detail" , "Not available");
			map.put("id" , sid);
		}
		return "student-detail";
	}
	
	@GetMapping("/get-student")
	public String getStudent(ModelMap map)
	{
		return "get-student";
	}

}
