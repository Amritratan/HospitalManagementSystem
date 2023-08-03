//package com.example.hospitalManagementSystem.entities;
//
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.OneToMany;
//
//import java.util.List;
//
//
//public class Sponsor {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Integer sponsor_id;
//
//    private String sponsorName;
//    private String sponsorAddress;
//    private String sponsorEmail;
//    private String sponsorPhone;
//
//    @OneToMany(mappedBy = "sponsor")
//    private List<Registration> patients;
//
//}