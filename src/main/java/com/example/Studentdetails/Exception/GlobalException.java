package com.example.Studentdetails.Exception;

import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalException {
	@ExceptionHandler(Agebelowexception.class)
	public ResponseEntity<Object>agehandle(Agebelowexception c){
		return new ResponseEntity<>(c.getMessage(),HttpStatus.NOT_FOUND);
		
	}
	

}
