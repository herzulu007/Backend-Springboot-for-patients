package com.hz.backend.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hz.backend.model.Doctor;

@Repository
public interface DoctorRepository extends CrudRepository<Doctor, Long> {
}
