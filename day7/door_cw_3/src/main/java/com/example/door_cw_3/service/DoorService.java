package com.example.door_cw_3.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.door_cw_3.model.Door;
import com.example.door_cw_3.repository.DoorRepo;

@Service
public class DoorService {

    private DoorRepo doorRepo;

    public DoorService(DoorRepo doorRepo) {
        this.doorRepo = doorRepo;
    }

    public Door saveDoor(Door door) {

        return doorRepo.save(door);

    }

    public List<Door> getAllDoors() {

        return doorRepo.findAll();
    }

    public Optional<Door> getById(int Id) {
        return doorRepo.findById(Id);
    }

    public List<Door> getByAccessType(String type) {
        return doorRepo.findByAccessType(type);
    }
}
