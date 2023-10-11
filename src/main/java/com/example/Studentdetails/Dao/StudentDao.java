package com.example.Studentdetails.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.Studentdetails.Entity.Student;
import com.example.Studentdetails.Exception.Agebelowexception;
import com.example.Studentdetails.Repository.StudentRepository;

@Repository 
public class StudentDao {
@Autowired
StudentRepository sturepo;

public Student agecheck(Student a)  {
	return sturepo.save(a);
}
}

			
	

	
	
	
	
		


