package com.example.cw_1.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.cw_1.model.AppConfig1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
public class ApiController1 {

    @Autowired
    public AppConfig1 configobj;
    
    @RequestMapping("/config")
    public String requestMethodName() {
    
        return  configobj.getAppName();
    }
    
}
