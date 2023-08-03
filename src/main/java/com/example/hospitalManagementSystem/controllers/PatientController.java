package com.example.hospitalManagementSystem.controllers;


import com.example.hospitalManagementSystem.entities.patient.Registration;
import com.example.hospitalManagementSystem.services.PatientService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/patient")
public class PatientController {

    @Autowired
    private PatientService patientService;

    @PostMapping("/registration")
    public ResponseEntity<String> patientRegistration(@Valid @RequestBody Registration registration) {
        // The @Valid annotation will automatically trigger entity validation based on annotations in the Registration class
        // If the registration object is invalid, Spring will handle the validation and return a 400 Bad Request response

        String createdPatient = patientService.patientRegistration(registration);
        return new ResponseEntity<String>(createdPatient, HttpStatus.CREATED);

    }

    }
