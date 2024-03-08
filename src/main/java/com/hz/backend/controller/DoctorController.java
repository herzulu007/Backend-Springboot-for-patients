package com.hz.backend.controller;

import com.hz.backend.model.Doctor;
import com.hz.backend.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
@RequestMapping(value = "/doctor")
public class DoctorController {

    @Autowired
    private DoctorService doctorService;

    @RequestMapping("/")
    public String hello_World(){
        return "hello world doctor";
    }

    //add Doctor

    @PostMapping("/add")
    public String addDoctor(@RequestBody Doctor Doctor){
        doctorService.addDoctor(Doctor);
        return "Doctor Added Succesfully";
    }

    //getDoctor

    @RequestMapping("/doctor/{id}")
    public Doctor getDoctorById(@PathVariable("id") long id){
        return doctorService.getDoctorById(id);

    }
    //getDoctors
    @RequestMapping("/doctors")
    public List<Doctor> getDoctors(){
        return doctorService.getDoctors();
    }

    // updateDoctors

    @PutMapping("/doctor")
    public Doctor updateDoctor(@RequestBody Doctor doctor){
        return doctorService.updateDoctor(doctor);
    }

    //deleteDoctorById
    @DeleteMapping("/doctor/{id}")
    public String deleteDoctor(@PathVariable("id") long id){
        doctorService.deleteDoctor(id);
        return "Doctor Deleted";
    }
    
    
}
