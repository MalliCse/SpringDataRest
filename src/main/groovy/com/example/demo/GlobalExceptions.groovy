package com.example.demo

import org.springframework.http.HttpStatus
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler

@ControllerAdvice
class GlobalExceptions {
	@ExceptionHandler(NameValidationException)
	ResponseEntity<String> handleNameException() {
		return new ResponseEntity('Name Should Not Be Empty', HttpStatus.BAD_REQUEST)
	}
	@ExceptionHandler(Exception)
	ResponseEntity<String> handleDeleteException() {
		return new ResponseEntity('Delete Operation can not be done', HttpStatus.BAD_REQUEST)
	}
}
