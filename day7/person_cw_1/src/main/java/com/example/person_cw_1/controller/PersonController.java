package com.example.person_cw_1.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.person_cw_1.model.Person;
import com.example.person_cw_1.service.PersonService;

@RestController
public class PersonController {

    private PersonService PersonService;

    public PersonController(PersonService personService) {
        this.PersonService = personService;
    }

    @PostMapping("/api/person")
    public ResponseEntity postMethodName(@RequestBody Person person) {

        if (PersonService.savaPerson(person) == true) {
            return new ResponseEntity<>(HttpStatus.CREATED);
        }
        return new ResponseEntity<>(HttpStatus.BAD_GATEWAY);
    }

    @GetMapping("/api/person")
    public List<Person> getAllDetail() {
        return PersonService.getAllPersons();
    }

    @GetMapping("/api/person/byAge")
    public List<Person> getDetailByAge(@RequestParam("age") int age) {
        return PersonService.getByAge(age);
    }
}
