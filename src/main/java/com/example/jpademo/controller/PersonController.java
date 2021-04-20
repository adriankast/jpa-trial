package com.example.jpademo.controller;

import com.example.jpademo.entities.Person;
import com.example.jpademo.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class PersonController {
    private final PersonService personService;

    @PostMapping("createPerson/{name}")
    public void createPerson(@PathVariable String name) {
        Person person = new Person();
        person.setName(name);
        System.out.println("Received name: " + name);
        personService.createPerson(person);
    }

    @GetMapping("getPersonByName/{name}")
    public void getPerson(@PathVariable String name) {
        Person person = personService.getPerson(name);
        System.out.println("Get Person with name: " + name);
        System.out.println("age: " + person.getAge());
    }
}
