package com.example.hospitalManagementSystem.entities.patient;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class LabDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Define attributes related to lab details
    // For example, lab test name, results, date, etc.

    @ManyToOne
    @JoinColumn(name = "patient_history_id")
    private History patientHistory;
}

