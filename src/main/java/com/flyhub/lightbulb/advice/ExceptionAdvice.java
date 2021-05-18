package com.flyhub.lightbulb.advice;

import java.util.NoSuchElementException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.flyhub.lightbulb.exceptions.InvalidFieldsException;

@ControllerAdvice
public class ExceptionAdvice {
	
	@ExceptionHandler(InvalidFieldsException.class)
	public ResponseEntity<String> handleInvalidInputs(InvalidFieldsException invalidFieldException){
		
		
		return new ResponseEntity<String>("Please note that was an invalid input", HttpStatus.BAD_REQUEST);
	}
	
	
	@ExceptionHandler(NoSuchElementException.class)
	public ResponseEntity<String> handleNosuchElementException(NoSuchElementException noSuchElementException){
		
		return new ResponseEntity<String>("check your stuff", HttpStatus.NOT_FOUND);
	}
	

}
