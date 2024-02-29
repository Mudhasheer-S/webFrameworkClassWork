package com.example.jobservice_cw2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jobservice_cw2.model.Job;

public interface JobRepo extends JpaRepository<Job,Integer> {

    
} 
