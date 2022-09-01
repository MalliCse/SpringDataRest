package com.example.demo

import org.springframework.beans.factory.annotation.Value
import org.springframework.http.HttpStatus

class GlobalErrorResponse {
	
	//@Value('${message}')
	String message;
	HttpStatus status;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public HttpStatus getStatus() {
		return status;
	}
	public void setStatus(HttpStatus status) {
		this.status = status;
	}
	public GlobalErrorResponse(String message, HttpStatus status) {
		super();
		this.message = message;
		this.status = status;
	}
	public GlobalErrorResponse() {
		super();
	}
	
}
