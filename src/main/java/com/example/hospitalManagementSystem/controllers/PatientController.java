package com.example.hospitalManagementSystem.controllers;


import com.example.hospitalManagementSystem.entities.Patient;
import com.example.hospitalManagementSystem.services.PatientService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.xml.sax.SAXException;

import java.io.IOException;

@RestController
@RequestMapping("/patient")
public class PatientController {

    @Autowired
    private PatientService patientService;

    @PostMapping("/registration")
    public ResponseEntity<String> patientRegistration(@Valid @RequestBody Patient patient) throws IOException, SAXException {
        // The @Valid annotation will automatically trigger entity validation based on annotations in the Patient class
        // If the patient object is invalid, Spring will handle the validation and return a 400 Bad Request response

        String createdPatient = patientService.patientRegistration(patient);
        return new ResponseEntity<>(createdPatient, HttpStatus.CREATED);

    }

    @GetMapping
    public  String get(){
        return "welcome..";
    }
}
