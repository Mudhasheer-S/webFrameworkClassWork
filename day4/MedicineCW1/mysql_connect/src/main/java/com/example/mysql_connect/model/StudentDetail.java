package com.example.mysql_connect.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class StudentDetail {

    @Id
    private int rollnum;

    private String name;
    private String email;

    public StudentDetail(){
        
    }

    public StudentDetail(int rollnum, String name, String email) {
        this.rollnum = rollnum;
        this.name = name;
        this.email = email;
    }

    public int getRollnum() {
        return rollnum;
    }

    public void setRollnum(int rollnum) {
        this.rollnum = rollnum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
