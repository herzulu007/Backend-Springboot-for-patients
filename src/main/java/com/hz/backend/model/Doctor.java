package com.hz.backend.model;


import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="doctor_table")
public class Doctor {

    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    private String email;

    private String pNo;

    private String speciality;

    public Doctor() {
    }

    public Doctor(long id, String name, String email, String pNo, String speciality) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.pNo = pNo;
        this.speciality = speciality;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPNo() {
        return this.pNo;
    }

    public void setPNo(String pNo) {
        this.pNo = pNo;
    }

    public String getSpeciality() {
        return this.speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public Doctor id(long id) {
        setId(id);
        return this;
    }

    public Doctor name(String name) {
        setName(name);
        return this;
    }

    public Doctor email(String email) {
        setEmail(email);
        return this;
    }

    public Doctor pNo(String pNo) {
        setPNo(pNo);
        return this;
    }

    public Doctor speciality(String speciality) {
        setSpeciality(speciality);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Doctor)) {
            return false;
        }
        Doctor doctor = (Doctor) o;
        return id == doctor.id && Objects.equals(name, doctor.name) && Objects.equals(email, doctor.email) && Objects.equals(pNo, doctor.pNo) && Objects.equals(speciality, doctor.speciality);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, email, pNo, speciality);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", name='" + getName() + "'" +
            ", email='" + getEmail() + "'" +
            ", pNo='" + getPNo() + "'" +
            ", speciality='" + getSpeciality() + "'" +
            "}";
    }



}
