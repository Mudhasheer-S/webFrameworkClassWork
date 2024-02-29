package com.example.mysql_connect.services;

import org.springframework.stereotype.Service;

import com.example.mysql_connect.model.StudentDetail;
import com.example.mysql_connect.repositary.StudentRepositary;

@Service
public class StudentServices {
    
    private StudentRepositary studentRepositary;

    

    public StudentServices(StudentRepositary studentRepositary) {
        this.studentRepositary = studentRepositary;
    }

    public StudentDetail saveDetail(StudentDetail studentDetail){

        System.out.print(studentDetail.getName());
        
        return studentRepositary.save(studentDetail);
    }
}
