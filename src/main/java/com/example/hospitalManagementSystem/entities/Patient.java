package com.example.hospitalManagementSystem.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import javax.xml.transform.Source;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "patient_table")
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull(message = "Name is mandatory")
    private String name;

    private String number;

    private String address;

    private String emergencyNo;


    @Column(unique = true, nullable = false)
    private String email;

    private String uhid;

    @NotNull(message = "Date of birth is mandatory")
    private String dob;

    @NotNull(message = "Choose gender")
    @Enumerated(EnumType.STRING)
    private Gender gender;

    @NotNull(message = "Doctor name is mandatory")
    private String doctorName;

    @NotNull(message = "Assign doctor name")
    private String department;


    }

