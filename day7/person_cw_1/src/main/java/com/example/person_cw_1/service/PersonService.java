package com.example.person_cw_1.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.person_cw_1.model.Person;
import com.example.person_cw_1.repository.PersonRepo;

@Service
public class PersonService {
    
    private PersonRepo personRepo;

    public PersonService(PersonRepo personRepo) {
        this.personRepo = personRepo;
    }

    public boolean savaPerson(Person person){

        try{
            personRepo.save(person);
            
        }
        catch(Exception e){

            System.out.println(" \n exception \n");
            System.out.println(e.getMessage());
            System.out.println(" \n exception \n");

            return false;
        }

        return true;
    }

    public List<Person> getAllPersons(){

        return personRepo.findAll();
    }

    public List<Person> getByAge(int age){
        return personRepo.findByAge(age);
    }
}
