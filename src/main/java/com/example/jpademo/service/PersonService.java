package com.example.jpademo.service;

import com.example.jpademo.entities.Person;
import org.springframework.stereotype.Service;

@Service
public interface PersonService {
    void createPerson(Person person);
    Person getPerson(String name);
}
