package com.example.patient_cw4.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.patient_cw4.model.Patient;



@Repository
public interface PatientRepo extends JpaRepository<Patient , Integer >{

    
}
