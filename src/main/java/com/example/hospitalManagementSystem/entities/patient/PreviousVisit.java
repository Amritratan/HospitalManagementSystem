package com.example.hospitalManagementSystem.entities.patient;

import jakarta.persistence.*;

@Entity
public class PreviousVisit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Define attributes related to previous visits
    // For example, date, diagnosis, treatment, etc.

    @ManyToOne
    @JoinColumn(name = "patient_history_id")
    private History patientHistory;
}

