package com.questglobal.restcrud.advice;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.questglobal.restcrud.exception.ProductNotFoundException;

@RestControllerAdvice
public class ApplicationExceptionHandler {
	
	
	
	
	
	@ResponseStatus(HttpStatus.NOT_FOUND)
	@ExceptionHandler(ProductNotFoundException.class)
	public Map<String, String> handleBusinessExeption(ProductNotFoundException ex){
		Map<String, String> errorMap = new HashMap<>();
		errorMap.put("errorMessage", ex.getMessage());
		return errorMap;
		
	}
	
	
	@ExceptionHandler(NoSuchElementException.class)
	public ResponseEntity<String> handleNoSuchElementExcpetion(NoSuchElementException ex){
		return new ResponseEntity<String>("no value presnt in db, please change product id ", HttpStatus.NOT_FOUND);
		
	}
	
	
	
	

}
