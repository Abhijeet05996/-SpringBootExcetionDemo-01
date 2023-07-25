package com.abhijeet.Exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestController
@RestControllerAdvice
public class RestExceptionhandler {

	@ExceptionHandler(value = NoProductFoundException.class)
	public ResponseEntity<ApiError> handleNoProductFoundException() {

		ApiError error = new ApiError(400, "No prodcut by given id found", new Date());

		return new ResponseEntity<ApiError>(error, HttpStatus.BAD_REQUEST);

	}

}
