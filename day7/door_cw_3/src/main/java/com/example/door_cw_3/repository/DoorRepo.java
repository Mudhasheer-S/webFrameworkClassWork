package com.example.door_cw_3.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.door_cw_3.model.Door;


@Repository
public interface DoorRepo extends JpaRepository<Door, Integer> {

    List<Door> findByAccessType(String accessType);
}
