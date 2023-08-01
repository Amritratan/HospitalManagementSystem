package com.example.hospitalManagementSystem.idGenerator;

import com.example.hospitalManagementSystem.entities.Patient;

import java.util.Calendar;



public class UHIDGenerator {


        public static String generateUHID(Patient patient) {
            // generate the formatted ID
            int currentYear = Calendar.getInstance().get(Calendar.YEAR);

            int sequence = patient.getId();

            // Format and return the generated ID
            String uhid=String.format("%s%02d%03d", patient.getName().substring(0,2).toUpperCase(), currentYear % 100,sequence);


           // patient.setUhid(uhid);
            return uhid;
        }
    }

