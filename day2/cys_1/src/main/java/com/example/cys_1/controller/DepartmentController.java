package com.example.cys_1.controller;
import org.springframework.web.bind.annotation.RestController;

import com.example.cys_1.model.Department;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class DepartmentController {
    
    @PostMapping("/department")
    public Department postMethodName(@RequestBody Department entity) {
        
        System.out.print(entity);
        return entity;
    }
    
    
}
