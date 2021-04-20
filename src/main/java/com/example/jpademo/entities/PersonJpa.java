package com.example.jpademo.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PersonTable")
@Data
public class PersonJpa {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private int age;
}
