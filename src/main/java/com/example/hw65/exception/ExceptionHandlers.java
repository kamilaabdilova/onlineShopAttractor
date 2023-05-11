package com.example.hw65.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionHandlers {

    @ExceptionHandler({UserNotFoundException.class})
    public ResponseEntity<?> handler(UserNotFoundException ex) {
        return new ResponseEntity(ExceptionResponse.getErrorResponse(ex.getMessage()), HttpStatus.NOT_FOUND);
    }
}