package com.example.hospitalManagementSystem.repository;

import com.example.hospitalManagementSystem.entities.patient.Registration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Registration,Integer> {

}
