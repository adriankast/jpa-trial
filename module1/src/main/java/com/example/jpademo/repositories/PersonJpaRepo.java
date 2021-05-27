package com.example.jpademo.repositories;

import com.example.jpademo.entities.PersonJpa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonJpaRepo extends JpaRepository<PersonJpa, Long> {
    public PersonJpa findByName(String name);
}
