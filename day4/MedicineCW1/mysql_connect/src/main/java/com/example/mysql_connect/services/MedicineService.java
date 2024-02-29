package com.example.mysql_connect.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.mysql_connect.model.Medicine;
import com.example.mysql_connect.repositary.MedicineRepo;

@Service
public class MedicineService {
    
    private MedicineRepo medicineRepo;

    public MedicineService(MedicineRepo medicineRepo) {
        this.medicineRepo = medicineRepo;
    }

    public boolean savaMedicine(Medicine medicine){

        try{
            medicineRepo.save(medicine);
            
        }
        catch(Exception e){

            System.out.println(" \n exception \n");
            System.out.println(e.getMessage());
            System.out.println(" \n exception \n");

            return false;
        }

        return true;
    }

    public List<Medicine> getAllMedicine(){

        return medicineRepo.findAll();
    }

    public Optional<Medicine> getMedicineById(int id){
        return medicineRepo.findById(id);
    }
}
