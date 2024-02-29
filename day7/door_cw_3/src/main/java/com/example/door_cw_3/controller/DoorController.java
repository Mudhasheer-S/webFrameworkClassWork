package com.example.door_cw_3.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.door_cw_3.model.Door;
import com.example.door_cw_3.service.DoorService;


@RestController
public class DoorController {

    private DoorService PersonService;

    public DoorController(DoorService personService) {
        this.PersonService = personService;
    }

    @PostMapping("/api/door")
    public ResponseEntity postMethodName(@RequestBody Door door) {

        Door c = PersonService.saveDoor(door);
        return new ResponseEntity<>(c,HttpStatus.CREATED);
    }

    @GetMapping("/api/door")
    public List<Door> getAllDetail() {
        return PersonService.getAllDoors();
    }

    @GetMapping("/api/door/{doorId}")
    public ResponseEntity getDetailByAge(@PathVariable int doorId) {
        Optional<Door> o = PersonService.getById(doorId);
        return new ResponseEntity<>(o,HttpStatus.OK);
    }

    @GetMapping("/api/door/accesstype/{accessType}")
    public List<Door> getDetailByAge(@PathVariable String accessType) {
        return PersonService.getByAccessType(accessType);
    }
}
