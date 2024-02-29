package com.example.person_cw_1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Person {
    
    @Id
    private int personId;

    private int age;
    private String firstName,LastName,gender;
    public Person() {
    }
    public Person(int personId, int age, String firstName, String lastName, String gender) {
        this.personId = personId;
        this.age = age;
        this.firstName = firstName;
        LastName = lastName;
        this.gender = gender;
    }
    public int getPersonId() {
        return personId;
    }
    public void setPersonId(int personId) {
        this.personId = personId;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return LastName;
    }
    public void setLastName(String lastName) {
        LastName = lastName;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    
}
