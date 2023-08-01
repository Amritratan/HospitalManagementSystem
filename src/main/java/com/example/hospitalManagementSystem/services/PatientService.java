package com.example.hospitalManagementSystem.services;

import com.example.hospitalManagementSystem.entities.Patient;
import com.example.hospitalManagementSystem.exception.PatientException;
import com.example.hospitalManagementSystem.idGenerator.UHIDGenerator;
import com.example.hospitalManagementSystem.repository.PatientRepository;
import jakarta.validation.ConstraintViolation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.xml.sax.SAXException;

import javax.xml.validation.Validator;
import java.io.IOException;
import java.util.Set;


@Service
public class PatientService extends UHIDGenerator {

    @Autowired
    private PatientRepository patientRepository;


    public String patientRegistration(Patient patient) {


        if(patient == null){
            throw new PatientException("patient can't be null");
        }

        patientRepository.save(patient);
        String uhid = UHIDGenerator.generateUHID(patient);
        patient.setUhid(uhid);
        patientRepository.save(patient);
        return "UHID No. - "+uhid;

    }
}
