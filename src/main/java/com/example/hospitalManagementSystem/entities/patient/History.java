package com.example.hospitalManagementSystem.entities.patient;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "patient_history")
public class History {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Registration patient;

    @Column(name = "uhid", unique = true, nullable = false)
    private String uniqueHealthId; // UHID

    @Column(name = "token_number", unique = true, nullable = false)
    private String tokenNumber;

    @OneToMany(mappedBy = "patientHistory", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<PreviousVisit> previousVisits;

    @OneToMany(mappedBy = "patientHistory", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Document> documents;

    @OneToMany(mappedBy = "patientHistory", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<DoctorConsultation> doctorConsultations;

    @OneToMany(mappedBy = "patientHistory", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Payment> payments;

    @OneToMany(mappedBy = "patientHistory", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<LabDetails> labDetails;
}

