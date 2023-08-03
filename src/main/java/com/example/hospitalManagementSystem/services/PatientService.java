package com.example.hospitalManagementSystem.services;

import com.example.hospitalManagementSystem.entities.patient.Registration;
import com.example.hospitalManagementSystem.idGenerator.UHIDGenerator;
import com.example.hospitalManagementSystem.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PatientService extends UHIDGenerator {

    @Autowired
    private PatientRepository patientRepository;


    public String patientRegistration(Registration registration) {


        patientRepository.save(registration);
        String uhid = UHIDGenerator.generateUHID(registration);
        registration.setUhid(uhid);
        patientRepository.save(registration);
        return "UHID No. - "+uhid;

    }
}
