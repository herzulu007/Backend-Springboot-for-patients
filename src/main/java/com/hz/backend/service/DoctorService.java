package com.hz.backend.service;

import com.hz.backend.model.Doctor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface DoctorService {
    public Doctor addDoctor(Doctor doctor);
    public Doctor getDoctorById(long id);
    public List<Doctor> getDoctors();
    public void deleteDoctor(long id);
    public Doctor updateDoctor(Doctor patient);
}
