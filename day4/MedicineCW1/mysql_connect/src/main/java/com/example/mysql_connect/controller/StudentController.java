package com.example.mysql_connect.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.mysql_connect.model.StudentDetail;
import com.example.mysql_connect.services.StudentServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class StudentController {
    
    private StudentServices studentServices;


    public StudentController(StudentServices studentServices) {
        this.studentServices = studentServices;
    }

    @PostMapping("/student")
    public StudentDetail postMethodName(@RequestBody StudentDetail studentDetail) {
        
        studentServices.saveDetail(studentDetail);

        return studentDetail;
    }
    
}
