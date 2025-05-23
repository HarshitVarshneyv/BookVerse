package com.bookVerse.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(DuplicateBookExists.class)
	public ResponseEntity<String> handleDuplicateBookExists(DuplicateBookExists ex){
		return ResponseEntity.status(HttpStatus.CONFLICT).body(ex.getMessage());
	}
	
	@ExceptionHandler(BookNotFoundException.class)
	public ResponseEntity<String> handleBookNotFoundException(BookNotFoundException ex){
		return ResponseEntity.status(HttpStatus.CONFLICT).body(ex.getMessage());
	}
}
