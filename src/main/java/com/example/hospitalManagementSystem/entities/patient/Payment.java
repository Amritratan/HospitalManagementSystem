package com.example.hospitalManagementSystem.entities.patient;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Define attributes related to payments
    // For example, amount, payment method, date, etc.

    @ManyToOne
    @JoinColumn(name = "patient_history_id")
    private History patientHistory;

}
