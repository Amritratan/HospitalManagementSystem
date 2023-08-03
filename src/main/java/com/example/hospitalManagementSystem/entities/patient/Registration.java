package com.example.hospitalManagementSystem.entities.patient;

import com.example.hospitalManagementSystem.enums.Gender;
import com.example.hospitalManagementSystem.enums.VisitType;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.*;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "patient_table")
public class Registration {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull(message = "Name is mandatory")
    private String name;

    @Pattern(regexp = "^[0-9]{10}$", message = "Invalid mobile number")
    private String number;

    private String address;

    private String emergencyNo;


    @Email
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

    @Enumerated(EnumType.STRING)
    @Column(name = "visit_type")
    private VisitType visitType;


    }

