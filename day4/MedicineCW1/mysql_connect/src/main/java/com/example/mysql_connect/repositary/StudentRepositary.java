package com.example.mysql_connect.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.mysql_connect.model.StudentDetail;

@Repository
public interface StudentRepositary extends JpaRepository<StudentDetail, Integer > {


} 
