//package com.example.hospitalManagementSystem.entities;
//
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.OneToMany;
//
//import java.util.List;
//
//public class Department {
//        @Id
//        @GeneratedValue(strategy = GenerationType.IDENTITY)
//        private Long department_id;
//
//        private String departmentName;
//        private String departmentAddress;
//
//        @OneToMany(mappedBy = "department")
//        private List<Registration> patients;
//
//    }
