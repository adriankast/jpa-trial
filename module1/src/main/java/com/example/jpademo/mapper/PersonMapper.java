package com.example.jpademo.mapper;

import com.example.jpademo.entities.Person;
import com.example.jpademo.entities.PersonJpa;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PersonMapper {
    PersonMapper INSTANCE = Mappers.getMapper(PersonMapper.class);

    public PersonJpa personEntityToJpa(Person person);
    public Person personJpaToEntity(PersonJpa personJpa);
}
