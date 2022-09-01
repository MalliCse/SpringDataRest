package com.example.demo

import org.springframework.stereotype.Component

@Component
class ErrorResponse {
	
	private String message;
	
	 //Specific errors in API request processing
	 private List<String> details;
   
	 
   public ErrorResponse() {
	   super();
   }


   public String getMessage() {
	   return message;
   }


   public void setMessage(String message) {
	   this.message = message;
   }


   public List<String> getDetails() {
	   return details;
   }


   public void setDetails(List<String> details) {
	   this.details = details;
   }


   public ErrorResponse(String message, List<String> details) {
	   super();
	   this.message = message;
	   this.details = details;
	 }
	
}
