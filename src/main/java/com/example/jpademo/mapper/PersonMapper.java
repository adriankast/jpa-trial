package com.example.jpademo.mapper;

import com.example.jpademo.entities.Person;
import com.example.jpademo.entities.PersonJpa;

public interface PersonMapper {
    public PersonJpa personEntityToJpa(Person person);
    public Person personJpaToEntity(PersonJpa personJpa);
}
