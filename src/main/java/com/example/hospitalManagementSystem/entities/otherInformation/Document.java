package com.example.hospitalManagementSystem.entities.patient;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Document {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String documentType;

    @Column(nullable = false)
    private String title;


    @ManyToOne
    @JoinColumn(name = "patient_history_id")
    private History patientHistory;

}

