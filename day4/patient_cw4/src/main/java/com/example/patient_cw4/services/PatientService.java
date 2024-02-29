package com.example.patient_cw4.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.patient_cw4.model.Patient;
import com.example.patient_cw4.repositary.PatientRepo;



@Service
public class PatientService {
    
    private PatientRepo medicineRepo;

    public PatientService(PatientRepo medicineRepo) {
        this.medicineRepo = medicineRepo;
    }

    public Patient savaPatient(Patient medicine){

        return medicineRepo.save(medicine);
    }

    public List<Patient> getAllMedicine(){

        return medicineRepo.findAll();
    }

    public Patient getMedicineById(int id){
        return medicineRepo.findById(id).orElse(null);
    }
}



