package com.example.hospitalManagementSystem.entities.patient;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class DoctorConsultation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Define attributes related to doctor consultations
    // For example, date, doctor name, diagnosis, etc.

    @ManyToOne
    @JoinColumn(name = "patient_history_id")
    private History patientHistory;
}
