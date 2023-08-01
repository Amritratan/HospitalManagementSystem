package com.example.hospitalManagementSystem.repository;

import com.example.hospitalManagementSystem.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient,Integer> {

}
