//package com.example.hospitalManagementSystem.entities;
//
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.OneToMany;
//
//import java.util.List;
//
//public class Doctor {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Integer doctor_id;
//
//    private String doctorName;
//    private String doctorAddress;
//    private String doctorEmail;
//    private String doctorPhone;
//
//    @OneToMany(mappedBy = "doctor")
//    private List<Patient> patients;
//}
