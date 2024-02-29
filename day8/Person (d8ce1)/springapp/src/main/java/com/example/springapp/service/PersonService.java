package com.example.springapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springapp.model.Person;
import com.example.springapp.repository.PersonRepo;

@Service
public class PersonService {
    @Autowired
    private PersonRepo rep;

    public boolean post(List<Person> person)
    {
        try
        {
            rep.saveAll(person);
            return true;
        }
        catch (Exception e)
        {
            System.out.println("-----------------");
            System.out.println(e);

            return false;
        }
    }

    public List<Person> start(String value)
    {
        return rep.findByNameStartingWith(value);
    }

    public List<Person> end(String value)
    {
        return rep.findByNameEndingWith(value);
    }
    
}
