package com.hz.backend.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.naming.Name;

@Entity
@Table(name="doctor_table")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Doctor {

    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    private String email;

    private String pNo;

    private String speciality;



}
