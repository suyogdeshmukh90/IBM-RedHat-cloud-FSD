package com.example.demo.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class MyExceptionHandler {
	
	@ExceptionHandler
	public ResponseEntity<IssueErrorModel> handleIssueNotFoundException(IssueNotFoundException e)
	{
		IssueErrorModel error=new IssueErrorModel();
		error.setMessage(e.getMessage());
		error.setErrprReportingTime(System.currentTimeMillis());
		error.setStatusCode(HttpStatus.NOT_FOUND.value());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
	}
	@ExceptionHandler
	public ResponseEntity<IssueErrorModel> handleGenericException(Exception e)
	{
		IssueErrorModel error=new IssueErrorModel();
		error.setMessage(e.getMessage());
		error.setErrprReportingTime(System.currentTimeMillis());
		error.setStatusCode(HttpStatus.NOT_FOUND.value());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
	}

}

