package com.example.Studentdetails.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Studentdetails.Dao.StudentDao;
import com.example.Studentdetails.Entity.Student;
import com.example.Studentdetails.Exception.Agebelowexception;

@Service
public class StudentService {
	@Autowired
	StudentDao studao;
	public Student agecheck(Student a) throws Agebelowexception {
		if (a.getAge()>=18) {

		return studao.agecheck(a);		
		} else {

					throw new Agebelowexception("not eligible");

				}
	}
	
	

}

