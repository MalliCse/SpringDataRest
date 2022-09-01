package com.example.demo

import javax.validation.ConstraintViolation
import javax.validation.ConstraintViolationException

import org.springframework.data.rest.webmvc.ResourceNotFoundException
import org.springframework.http.*
import org.springframework.http.converter.HttpMessageNotReadableException
import org.springframework.validation.ObjectError
import org.springframework.web.bind.MethodArgumentNotValidException
import org.springframework.web.bind.annotation.*
import org.springframework.web.context.request.WebRequest
import org.springframework.web.server.ResponseStatusException
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler




@ControllerAdvice
class GlobalExceptions extends ResponseEntityExceptionHandler {
	@ExceptionHandler(NameValidationException)
	ResponseEntity<String> handleNameException() {
		return new ResponseEntity('Name Should Not Be Empty', HttpStatus.BAD_REQUEST)
	}

	/*@ExceptionHandler(HttpRequestMethodNotSupportedException)
	 ResponseEntity<String> handleDeleteException() {
	 return new ResponseEntity('Delete Operation can not be done', HttpStatus.BAD_REQUEST)
	 }*/

	@Override
	protected ResponseEntity<Object> handleHttpMessageNotReadable(HttpMessageNotReadableException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		//log.error("Request Body is Not received {}{}", ex.getMessage(), status);
		return new ResponseEntity<Object>("Request Body Is Not Received", status);
	}

	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
		List<String> details = new ArrayList<>();
		for(ObjectError error : ex.getBindingResult().getAllErrors()) {
			details.add(error.getDefaultMessage());
		}
		ErrorResponse error = new ErrorResponse("Validation Failed", details);
		return new ResponseEntity(error, HttpStatus.BAD_REQUEST);
	}


	@ExceptionHandler(ConstraintViolationException)
	public ResponseEntity<String> handleConstraintException(ConstraintViolationException ex,WebRequest request) {

		Set<ConstraintViolation<?>> violations=ex.getConstraintViolations();
		//ConstraintViolation<?> violation=violations.iterator().next();
		//violation.getProperties()
		Iterator<ConstraintViolation<?>> violation=violations.iterator();
		List<String> constraintfailuremessages=new ArrayList<String>();
		while(violation.hasNext()) {
			constraintfailuremessages.add(violation.next().getMessage().toString());
		}
		//return new ResponseEntity(violation.getMessage(),HttpStatus.BAD_REQUEST)
		return new ResponseEntity(constraintfailuremessages.toString(),HttpStatus.BAD_REQUEST)
	}

	@ExceptionHandler(ResponseStatusException.class)
	public ResponseEntity<Object> handleResponseStatusException(ResponseStatusException ex) {

		GlobalErrorResponse result=new GlobalErrorResponse(ex.getReason(), ex.getStatus());
		return new ResponseEntity<Object>(result, ex.getStatus());
	}


	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<Object> handleException(ResourceNotFoundException ex) {

		GlobalErrorResponse result=new GlobalErrorResponse("Details Are Not Found", HttpStatus.NOT_FOUND);
		return new ResponseEntity<Object>(result, HttpStatus.NOT_FOUND);
	}
}
