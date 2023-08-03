package com.example.hospitalManagementSystem.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.NoHandlerFoundException;

import java.time.LocalDateTime;

@RestControllerAdvice
public class GlobalExceptionHandler {





    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorDetails> myAnyExpHandler(Exception ie, WebRequest req) {
        ErrorDetails err = new ErrorDetails();
        err.setTimestamp(LocalDateTime.now());
        err.setMessage(ie.getMessage());
        err.setDetails(req.getDescription(true));
        return new ResponseEntity<ErrorDetails>(err, HttpStatus.BAD_REQUEST);



    }

    @ExceptionHandler(PatientException.class)
    public ResponseEntity<ErrorDetails> myAnyExpHandler(PatientException ie, WebRequest req) {
        ErrorDetails err = new ErrorDetails();
        err.setTimestamp(LocalDateTime.now());
        err.setMessage(ie.getMessage());
        err.setDetails(req.getDescription(true));
        return new ResponseEntity<ErrorDetails>(err, HttpStatus.BAD_REQUEST);



    }





    @ExceptionHandler(NoHandlerFoundException.class)
    public ResponseEntity<ErrorDetails> mynotFoundHandler(NoHandlerFoundException nfe, WebRequest req) {



        ErrorDetails err = new ErrorDetails(LocalDateTime.now(), nfe.getMessage(), req.getDescription(false));



        return new ResponseEntity<>(err, HttpStatus.BAD_REQUEST);



    }



    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<ErrorDetails> myIllegalArgumentException(IllegalArgumentException me) {



        ErrorDetails err = new ErrorDetails();
        err.setTimestamp(LocalDateTime.now());
        err.setMessage("Validation Error");
        err.setDetails(me.getMessage());





        return new ResponseEntity<ErrorDetails>(err, HttpStatus.BAD_REQUEST);



    }



    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ErrorDetails> myInvalidDataExpHandler(MethodArgumentNotValidException me) {



        ErrorDetails err = new ErrorDetails();
        err.setTimestamp(LocalDateTime.now());
        err.setMessage("Validation Error");
        err.setDetails(me.getBindingResult().getFieldError().getDefaultMessage());



        return new ResponseEntity<ErrorDetails>(err, HttpStatus.BAD_REQUEST);



    }
}