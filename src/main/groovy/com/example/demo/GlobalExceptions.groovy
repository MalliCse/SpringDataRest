package com.example.demo

import org.springframework.http.HttpStatus
import org.springframework.http.*
import org.springframework.http.ResponseEntity
import org.springframework.web.HttpRequestMethodNotSupportedException
import org.springframework.web.bind.annotation.*

@ControllerAdvice
class GlobalExceptions {
	@ExceptionHandler(NameValidationException)
	ResponseEntity<String> handleNameException() {
		return new ResponseEntity('Name Should Not Be Empty', HttpStatus.BAD_REQUEST)
	}
	/*@ExceptionHandler(HttpRequestMethodNotSupportedException)
	ResponseEntity<String> handleDeleteException() {
		return new ResponseEntity('Delete Operation can not be done', HttpStatus.BAD_REQUEST)
	}*/
}
