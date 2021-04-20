package com.example.jpademo.mapper.impl;

import com.example.jpademo.entities.Person;
import com.example.jpademo.entities.PersonJpa;
import com.example.jpademo.mapper.PersonMapper;
import org.springframework.stereotype.Component;

@Component
public class PersonMapperImpl implements PersonMapper {
    @Override
    public PersonJpa personEntityToJpa(Person person) {
        PersonJpa rv = new PersonJpa();
        rv.setName(person.getName());
        return rv;
    }

    @Override
    public Person personJpaToEntity(PersonJpa personJpa) {
        Person rv = new Person();
        rv.setName(personJpa.getName());
        rv.setAge(personJpa.getAge());
        return rv;
    }
}
