package com.example.Studentdetails.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Studentdetails.Entity.Student;

public interface StudentRepository extends  JpaRepository<Student,Integer>{

	
}
