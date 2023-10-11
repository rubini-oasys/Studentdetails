package com.example.Studentdetails.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Studentdetails.Entity.Student;
import com.example.Studentdetails.Exception.Agebelowexception;
import com.example.Studentdetails.Service.StudentService;

@RestController
@RequestMapping(value="/students")

public class StudentController {
	@Autowired
	StudentService stuser;
	@PostMapping(value="/age")
	public Student agecheck(@RequestBody Student a) throws Agebelowexception  {
		return stuser.agecheck(a);
	}
	

}
