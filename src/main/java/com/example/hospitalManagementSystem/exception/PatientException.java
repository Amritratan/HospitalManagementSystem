package com.example.hospitalManagementSystem.exception;

public class PatientException extends RuntimeException{

    public PatientException(){

    }

    public PatientException(String msg){
        super(msg);
    }
}
