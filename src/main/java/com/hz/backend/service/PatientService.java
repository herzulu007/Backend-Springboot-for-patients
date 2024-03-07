package com.hz.backend.service;

import com.hz.backend.model.Patient;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PatientService {
    public Patient addPatient(Patient patient);
    public Patient getPatientById(long id);
    public List<Patient> getPatients();
    public void deletePatient(long id);
    public Patient updatePatient(Patient patient);
}
