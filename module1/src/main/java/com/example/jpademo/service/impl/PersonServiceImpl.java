package com.example.jpademo.service.impl;

import com.example.jpademo.entities.Person;
import com.example.jpademo.mapper.PersonMapper;
import com.example.jpademo.repositories.PersonJpaRepo;
import com.example.jpademo.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PersonServiceImpl implements PersonService {
    private final PersonJpaRepo personJpaRepo;
    private final PersonMapper personMapper;

    @Override
    public void createPerson(Person person) {
        personJpaRepo.save(personMapper.personEntityToJpa(person));
    }

    @Override
    public Person getPerson(String name) {
        return personMapper.personJpaToEntity(personJpaRepo.findByName(name));
    }
}
