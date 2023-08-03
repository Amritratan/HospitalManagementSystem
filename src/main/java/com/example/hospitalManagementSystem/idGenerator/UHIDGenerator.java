package com.example.hospitalManagementSystem.idGenerator;

import com.example.hospitalManagementSystem.entities.patient.Registration;

import java.util.Calendar;



public class UHIDGenerator {


        public static String generateUHID(Registration registration) {
            // generate the formatted ID
            int currentYear = Calendar.getInstance().get(Calendar.YEAR);

            int sequence = registration.getId();

            // Format and return the generated ID
            String uhid=String.format("%s%02d%03d", registration.getName().substring(0,2).toUpperCase(), currentYear % 100,sequence);


           // registration.setUhid(uhid);
            return uhid;
        }
    }

