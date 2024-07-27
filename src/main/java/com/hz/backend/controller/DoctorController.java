package com.hz.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hz.backend.model.Doctor;
import com.hz.backend.service.DoctorService;

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

    @PostMapping("/adddoctor")
    public String addDoctor(@RequestBody Doctor doctor){
        doctorService.addDoctor(doctor);
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
